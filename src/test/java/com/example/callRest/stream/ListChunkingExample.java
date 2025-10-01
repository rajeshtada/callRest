package com.example.callRest.stream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListChunkingExample {
    public static void main(String[] args) {
        // Sample list with 950 elements
        List<String> mNameList = IntStream.rangeClosed(1, 950)
                                          .mapToObj(i -> "Name" + i)
                                          .collect(Collectors.toList());

        int chunkSize = 100;

        // Split into sublists
        List<List<String>> partitioned = IntStream.range(0, (mNameList.size() + chunkSize - 1) / chunkSize)
                .mapToObj(i -> mNameList.subList(i * chunkSize,
                        Math.min((i + 1) * chunkSize, mNameList.size())))
                .collect(Collectors.toList());

        // Print chunk sizes for verification
        partitioned.forEach(sub -> System.out.println("Chunk size: " + sub.size()));

        // Example: Access first and last chunk
        System.out.println("First chunk: " + partitioned.get(0).subList(0, 5)); // print first 5
        System.out.println("Last chunk size: " + partitioned.get(partitioned.size() - 1).size());
    }
}