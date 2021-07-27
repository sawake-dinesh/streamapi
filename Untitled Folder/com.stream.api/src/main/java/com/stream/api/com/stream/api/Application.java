package com.stream.api.com.stream.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);


        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");

        memberNames.stream().sorted()
                .map(String::toUpperCase)
                .forEach(System.out::println);


        //we are creating a stream of a fixed number of integers.

        /*Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
           stream.forEach(p -> System.out.println(p));



        //we are creating a stream from the array. The elements in the stream are taken from the array.
        {
        	Stream<Integer> stream = Stream.of( new Integer[]{1,2,3,4,5,6,7,8,9} );
        	stream.forEach(p -> System.out.println(p));
        }


        //we are creating a stream from the List. The elements in the stream are taken from the List.
		{
			List<Integer> list = new ArrayList<Integer>();

			for(int i = 1; i< 25; i++){
				list.add(i);
		}

			Stream<Integer> stream = list.stream();
			stream.forEach(p -> System.out.println(p));


         //we are creating a stream from generated elements. This will produce a stream of 9 random numbers. We have restricted the elements count using limit() function.
		{
		Stream<Integer> randomNumbers = Stream
					.generate(() -> (new Random()).nextInt(10));

			randomNumbers.limit(9)
					.forEach(System.out::println);
		}


        //first, we are creating a stream on integers 1 to 10. Then we are processing the stream elements to find all even numbers.
        //At last, we are collecting all even numbers into a List
		{
			List<Integer> list = new ArrayList<Integer>();

			for(int i = 1; i< 20; i++)
		    	{
         				    list.add(i);
			    }

			Stream<Integer> stream = list.stream();
			List<Integer> evenNumbersList = stream.filter(i -> i%2 == 0)
					.collect(Collectors.toList());
			System.out.print("Even Numbers :"+ evenNumbersList);
		}

        // we converts each string into an UPPERCASE string. But we can use map() to transform an object into another type as well

        memberNames.stream().filter((s) -> s.startsWith("A"))
        		.map(String::toUpperCase)
        		.forEach(System.out::println);

        }*/
    }


}
