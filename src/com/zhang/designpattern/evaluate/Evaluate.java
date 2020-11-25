package com.zhang.designpattern.evaluate;

import edu.princeton.cs.algs4.Stack;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


/**
 * @Author: zhangwei
 * @Description:
 * @Date:Create：2020/11/25 下午5:06
 */
public class Evaluate {

    public static void main(String[] args) {
        String raw="( average(1,2) + 2 + 3 )";
        String mature = parseString(raw);
        String target = mature.replaceAll("average(1,2)", String.valueOf(callFunction("average",Arrays.asList("1","2"))));
        System.out.println(target);
        List<String> formulas = Arrays.asList(target.split(" "));
        System.out.println(formulas);
        Stack<String> ops = new Stack<>();
        Stack<Double> vals = new Stack<>();
        formulas.forEach(item->{
            if(item.equals("(")){

            }else if(item.equals("+")){
                ops.push(item);
            }else if(item.equals(")")){
                while (!ops.isEmpty()){
                    String op = ops.pop();
                    Double v = vals.pop();
                    if(op.equals("+")){
                        v=vals.pop()+v;
                    }
                    vals.push(v);
                }
            }else{
                vals.push(Double.valueOf(item));
            }
        });
        System.out.println(vals.pop());
    }

    private static String parseString(String targetString) {
        return targetString;
    }


    public static Double callFunction(String funcName,List<String> args){
        List<Double> doubles = args.stream().map(Double::valueOf).collect(Collectors.toList());
        if(funcName.equals("average")){
           return average(doubles);
        }        
        return 0.0;
    }


    public static Double average(List<Double> list){
        double sum = list.stream().mapToDouble(i -> i).sum();
        return sum/list.size();
    }

}
