# AndroidCleanRecyclerView
Simple RecyclerView Activity
Steps to Add RecyclerView:

1. Add the libraries in Module:app build.gradle

    compile 'com.android.support:cardview-v7:24.0.+'
    compile 'com.android.support:recyclerview-v7:24.0.+'
    compile 'com.github.bumptech.glide:glide:3.7.0'


2. Add RecyclerView inside activity_main.xml

     <android.support.v7.widget.RecyclerView
            android:id="@+id/recycler_view"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            card_view:cardUseCompatPadding="true"
            card_view:cardElevation="5dp"
            card_view:cardCornerRadius="5dp"
            android:scrollbars="vertical"
            android:layout_marginLeft="6dp"
            android:layout_marginRight="6dp"
            android:layout_marginTop="6dp" />

3. Create a new layout for card view itself

card.xml

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:card_view="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="wrap_content">

    <android.support.v7.widget.CardView
        android:id="@+id/card_view"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_gravity="center"
        android:elevation="3dp"
        card_view:cardUseCompatPadding="true"
        card_view:cardElevation="4dp"
        card_view:cardCornerRadius="1dp"
       >

        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent">

            <ImageView
                android:id="@+id/image"
                android:layout_width="match_parent"
                android:layout_height="100dp"
                android:background="?attr/selectableItemBackgroundBorderless"
                android:clickable="true"
                android:scaleType="centerCrop" />

            <TextView
                android:id="@+id/description"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_below="@id/image"
                android:paddingLeft="5dp"
                android:paddingRight="5dp"
                android:paddingTop="5dp"
                android:textColor="@color/cardview_dark_background"
                android:text="test"
                android:textSize="12sp"
                android:textStyle="normal"
                android:typeface="sans" />



        </RelativeLayout>

    </android.support.v7.widget.CardView>

</LinearLayout>


4. In MainActivity.java add
    1. RecyclerView
    2. CustomeAdapter to bind Data for RecyclerView
    3. Grid Layout Manager to order
    4. MyData list for data from server
