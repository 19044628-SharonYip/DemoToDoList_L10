package sg.edu.rp.c346.id19044628.demotodolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvToDo;
    ArrayList<ToDoItem> alToDo;
    CustomAdapter caToDo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvToDo = findViewById(R.id.lvToDo);

        alToDo = new ArrayList<>();
        Calendar date1 = Calendar.getInstance();
        date1.set(2020,8,1);
        Calendar date2 = Calendar.getInstance();
        date2.set(2020,8,2);
        Calendar date3 = Calendar.getInstance();
        date3.set(2021,8,1);
        Calendar date4 = Calendar.getInstance();
        date4.set(2021,8,2);
        ToDoItem item1 = new ToDoItem("Go for movie", date1);
        ToDoItem item2 = new ToDoItem("Go for haircut", date2);
        ToDoItem item3 = new ToDoItem("Go for swim", date3);
        ToDoItem item4 = new ToDoItem("Go for sleep", date4);
        alToDo.add(item1);
        alToDo.add(item2);
        alToDo.add(item3);
        alToDo.add(item4);

        caToDo = new CustomAdapter(this, R.layout.row, alToDo);
        lvToDo.setAdapter(caToDo);


    }
}