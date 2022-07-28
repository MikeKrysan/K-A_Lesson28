package com.example.ka_lesson28

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

//4.Создали меню main_menu.xml

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)    //1.Активируем стрелку назад на toolbar. supportActionBar может быть null, поэтому мы указываем безопасный доступ к его функции через знак вопроса
        supportActionBar?.title = "Admin"   //3.Изменяем название toolBar
    }

    //2. Чтобы прослушать нажатие для стрелки (стандартных средств toolbar), нужно вызвать специальную функцию, которая есть у activity:
    override fun onOptionsItemSelected(item: MenuItem): Boolean {   //функция будет запускаться, и она будет выдавать item, на который я нажал
        //if(item.itemId == android.R.id.home) finish()  //идентификатор кнопки homeButton панели toolBar прописан в пакете android и называется "home"
        when(item.itemId) {     //7. Теперь у нас больше одного проверяемого элемента, поэтому используем when
            //Прослушиваем нажатия элементов из toolBar
            android.R.id.home -> finish()
            R.id.sync -> {
                Toast.makeText(this, "Sync", Toast.LENGTH_SHORT).show()
            }
            R.id.save -> {
                Toast.makeText(this, "Save", Toast.LENGTH_SHORT).show()
            }
            R.id.delete -> {
                Toast.makeText(this, "Delete", Toast.LENGTH_SHORT).show()
            }
            R.id.search -> {
                Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show()
            }

        }
        return true
    }

    //5.Чтобы добавить разметку меню в toolbar используем функцию:
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)//6.Чтобы взять наше созданное меню, и запихнуть в toolBar, делаем это с помощью inflater
        return true
    }

}