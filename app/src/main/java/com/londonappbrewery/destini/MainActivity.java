package com.londonappbrewery.destini;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity
    {
        Button Answer_1_Top;
        Button Answer_2_Bottom;
        TextView Story;
        int index_story = 0;
        int index_answers_1_top = 1;
        int index_answers_2_bottom = 2;

        private int[] Step =
            {
                R.string.T1_Story, //0
                R.string.T1_Ans1,  //1
                R.string.T1_Ans2,  //2
                R.string.T2_Story, //3
                R.string.T2_Ans1,  //4
                R.string.T2_Ans2,  //5
                R.string.T3_Story, //6
                R.string.T3_Ans1,  //7
                R.string.T3_Ans2,  //8
                R.string.T4_End,   //9
                R.string.T5_End,   //10
                R.string.T6_End,   //11
                R.string.app_name  //12
            };

         @Override
         protected void onCreate(Bundle savedInstanceState)
            {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                Answer_1_Top = (Button)findViewById(R.id.buttonTop);
                Answer_2_Bottom = (Button)findViewById(R.id.buttonBottom);
                Story = (TextView)findViewById(R.id.storyTextView);

                Answer_1_Top.setText(Step[index_answers_1_top]);
                Answer_2_Bottom.setText(Step[index_answers_2_bottom]);
                Story.setText(Step[index_story]);

                Answer_1_Top.setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View view)
                            {
                                Update_Story(index_answers_1_top);
                            }
                    });

                Answer_2_Bottom.setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View view)
                            {
                                Update_Story(index_answers_2_bottom);
                            }
                    });

            }

        private void Update_Story(int index)
            {
                if(index == 1)
                    {
                        index_story = 6;
                        index_answers_1_top = 7;
                        index_answers_2_bottom = 8;
                    }
                else if ( index == 2)
                    {
                        index_story = 3;
                        index_answers_1_top = 4;
                        index_answers_2_bottom = 5;
                    }
                else if ( index == 4)
                    {
                        index_story = 6;
                        index_answers_1_top = 7;
                        index_answers_2_bottom = 8;
                    }
                else if ( index == 5)
                    {
                        index_story = 9;
                        index_answers_1_top = 12;
                        index_answers_2_bottom = 12;
                    }
                else if ( index == 7)
                    {
                        index_story = 11;
                        index_answers_1_top = 12;
                        index_answers_2_bottom = 12;
                    }
                else if( index == 8)
                    {
                        index_story = 8;
                        index_answers_1_top = 12;
                        index_answers_2_bottom = 12;
                    }
                else
                    {
                        index_story = 0;
                        index_answers_1_top = 1;
                        index_answers_2_bottom = 2;
                    }

                Answer_1_Top.setText(Step[index_answers_1_top]);
                Answer_2_Bottom.setText(Step[index_answers_2_bottom]);
                Story.setText(Step[index_story]);

                if (index_answers_1_top == 12)
                    {
                        Answer_1_Top.setVisibility(View.GONE);
                        Answer_2_Bottom.setVisibility(View.GONE);
                    }

            }

    }
