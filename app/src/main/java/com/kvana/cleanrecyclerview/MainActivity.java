package com.kvana.cleanrecyclerview;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    GridLayoutManager gridLayoutManager;
    CustomAdapter adapter;
    List<MydData> data_list = new ArrayList<>();;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);


        loadDataFromServer(0);



        gridLayoutManager = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(gridLayoutManager);

        adapter = new CustomAdapter(this,data_list);
        recyclerView.setAdapter(adapter);


    }

    private void loadDataFromServer(int i) {


        AsyncTask<Integer, Void, Void> task = new AsyncTask<Integer, Void, Void>() {


            @Override
            protected Void doInBackground(Integer... integers) {

                data_list.add(0,new MydData(1, "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. ", "https://upload.wikimedia.org/wikipedia/commons/8/8a/Kaiseradler_Aquila_heliaca_e_amk.jpg"));
                data_list.add(1,new MydData(2, "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. ", "https://upload.wikimedia.org/wikipedia/commons/e/e7/Winter-Tiger-Wild-Cat-Images.jpg"));
                data_list.add(2,new MydData(3, "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. ", "https://upload.wikimedia.org/wikipedia/commons/8/8a/Kaiseradler_Aquila_heliaca_e_amk.jpg"));
                data_list.add(3,new MydData(4, "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. ", "https://upload.wikimedia.org/wikipedia/commons/e/e7/Winter-Tiger-Wild-Cat-Images.jpg"));
//                data_list.add(4,new MydData(5, "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. ", "https://upload.wikimedia.org/wikipedia/commons/8/8a/Kaiseradler_Aquila_heliaca_e_amk.jpg"));
//                data_list.add(5,new MydData(6, "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. ", "https://upload.wikimedia.org/wikipedia/commons/8/8a/Kaiseradler_Aquila_heliaca_e_amk.jpg"));
//                data_list.add(6,new MydData(7, "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. ", "https://upload.wikimedia.org/wikipedia/commons/8/8a/Kaiseradler_Aquila_heliaca_e_amk.jpg"));
//                data_list.add(7,new MydData(8, "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. ", "https://upload.wikimedia.org/wikipedia/commons/8/8a/Kaiseradler_Aquila_heliaca_e_amk.jpg"));
//                data_list.add(8,new MydData(9, "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. ", "https://upload.wikimedia.org/wikipedia/commons/8/8a/Kaiseradler_Aquila_heliaca_e_amk.jpg"));
//                data_list.add(9,new MydData(10, "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. ", "https://upload.wikimedia.org/wikipedia/commons/8/8a/Kaiseradler_Aquila_heliaca_e_amk.jpg"));
//                data_list.add(10,new MydData(11, "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. ", "https://upload.wikimedia.org/wikipedia/commons/8/8a/Kaiseradler_Aquila_heliaca_e_amk.jpg"));
//                data_list.add(11,new MydData(12, "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. ", "https://upload.wikimedia.org/wikipedia/commons/8/8a/Kaiseradler_Aquila_heliaca_e_amk.jpg"));
//                data_list.add(12,new MydData(13, "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. ", "https://upload.wikimedia.org/wikipedia/commons/8/8a/Kaiseradler_Aquila_heliaca_e_amk.jpg"));
//                data_list.add(13,new MydData(14, "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. ", "https://upload.wikimedia.org/wikipedia/commons/8/8a/Kaiseradler_Aquila_heliaca_e_amk.jpg"));
//                data_list.add(14,new MydData(15, "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. ", "https://upload.wikimedia.org/wikipedia/commons/8/8a/Kaiseradler_Aquila_heliaca_e_amk.jpg"));



                return null;
            }


        };

        task.execute(0);


    }

    /*
    Data to load from server
    (1, 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. ', 'https://upload.wikimedia.org/wikipedia/commons/8/8a/Kaiseradler_Aquila_heliaca_e_amk.jpg'),
(2, 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. ', 'https://upload.wikimedia.org/wikipedia/commons/e/e7/Winter-Tiger-Wild-Cat-Images.jpg'),
(3, 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. ', 'https://static.pexels.com/photos/8700/wall-animal-dog-pet.jpg'),
(4, 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. ', 'http://www.public-domain-image.com/plants/flowers/daisies/slides/daisy-white-flower.jpg'),
(5, 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. ', 'https://pixabay.com/static/uploads/photo/2016/03/28/12/35/cat-1285634_960_720.png'),
(6, 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. ', 'https://pixabay.com/static/uploads/photo/2015/08/14/08/29/images-888133_960_720.jpg'),
(7, 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. ', 'https://upload.wikimedia.org/wikipedia/commons/9/9a/Gull_portrait_ca_usa.jpg'),
(8, 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. ', 'http://www.publicdomainpictures.net/pictures/120000/velka/owl-eyes.jpg'),
(9, 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. ', 'http://www.public-domain-image.com/plants/flowers/slides/detailed-image-of-rose-flower-2.jpg'),
(10, 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. ', 'http://www.public-domain-image.com/plants/flowers/slides/beautiful-purple-flower.jpg'),
(11, 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. ', 'http://www.publicdomainpictures.net/pictures/30000/velka/evening-landscape-13530956185Aw.jpg'),
(12, 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. ', 'http://www.publicdomainpictures.net/pictures/60000/velka/autumn-landscape-1379696322ccb.jpg'),
(13, 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. ', 'http://www.publicdomainpictures.net/pictures/170000/velka/landscape-1463681739ToM.jpg'),
(14, 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. ', 'http://www.publicdomainpictures.net/pictures/30000/velka/landscape-1330955616LHF.jpg'),
(15, 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.', 'http://www.publicdomainpictures.net/pictures/130000/velka/nature-1436732866NMV.jpg'),
(16, 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.', 'https://pixabay.com/static/uploads/photo/2014/03/19/13/38/sunflower-290496_960_720.jpg'),
(17, 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.', 'http://www.publicdomainpictures.net/pictures/50000/velka/way-to-nature.jpg'),
(18, 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry''s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.', 'https://pixabay.com/static/uploads/photo/2015/06/03/14/24/ladybug-796481_960_720.jpg');

--
     */
}
