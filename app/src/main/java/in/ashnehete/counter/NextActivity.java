package in.ashnehete.counter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        List<Integer> list = new ArrayList<Integer>();
        list.add(10);

        LinkedList<Integer> ll = new LinkedList<>();

        Map<String, Integer> map = new HashMap<>();
        map.put("age", 20);
        map.get("age");

        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(10);
        set.remove(10);

        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(10);
        int el1 = queue.peek();
        int el2 = queue.poll();

        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.pop();
    }
}
