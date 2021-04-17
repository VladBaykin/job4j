package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class EasyStream {
    private List<Integer> list;

    private EasyStream(List<Integer> list) {
        this.list = list;
    }

    public static EasyStream of(List<Integer> source) {
        return new EasyStream(source);
    }

    public EasyStream map(Function<Integer, Integer> fun) {
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer num : list) {
            result.add(fun.apply(num));
        }
        return EasyStream.of(result);
    }

    public EasyStream filter(Predicate<Integer> fun) {
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer num : list) {
            if (fun.test(num)) {
                result.add(num);
            }
        }
        return EasyStream.of(result);
    }

    public List<Integer> collect() {
        return list;
    }
}
