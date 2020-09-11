package com.estate.realestate;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.annotation.StringRes;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity
{

    ImageView imageView1,imageView2,imageView3,imageView4,imageView5,imageView6,imageView7,imageView8,imageView9,imageView10,imageView11,imageView12,imageView13,imageView14,imageView15;
    ImageView imageView16,imageView17,imageView18,imageView19;
    TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10,textView11,textView12,textView13,textView14,textView15;
    TextView textView16,textView17,textView18,textView19;
    ImageView PimageView1,PimageView2,PimageView3,PimageView4,PimageView5,PimageView6,PimageView7,PimageView8,PimageView9,PimageView10;
    ImageView PimageView11,PimageView12,PimageView13,PimageView14,PimageView15,PimageView16,PimageView17,PimageView18,PimageView19;

    ImageView s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17,s18,s19;
    TextView aba3price,aba4price,abaaddress,ace2price,ace3price,ace4price,acead,atsadd,ats3price,ats4price,aceGadd,aceG2price,aceG3price,abd,ab3price,ab4price,AGCaddre,AGC2P,AGC3P;
    TextView awca,awc2,awc3,awc4,csadd,cs3p,cs4p,gsa,gs3,gs4,gs5,gnadd,gn2pr,gn3pr,gn4pr,gia,gi2,gi3,lbca,lbc2p,lbc3p,lbc4p,lbc5p,lbga,lbg2p,lbg3p,lbg4p,ltsca,ltsc2p,ltsc3pt,mmad,mm3,mm4,mm5;
    TextView sctadd,sct2,sct3,sct4,sct5,snea,sne2,sne3,sne4,sne5,orbadd,orb3,orb4,strad,str2p,str3p,str5p;

    FirebaseDatabase firebaseDatabase=FirebaseDatabase.getInstance();
    DatabaseReference abaadd=firebaseDatabase.getReference("ABA Cleo County/Address");
    DatabaseReference aba3=firebaseDatabase.getReference("ABA Cleo County/ThreePrice");
    DatabaseReference aba4=firebaseDatabase.getReference("ABA Cleo County/FourPrice");


    DatabaseReference aceaddd=firebaseDatabase.getReference("ACE Parkway/Address");
    DatabaseReference ace2=firebaseDatabase.getReference("ACE Parkway/TwoPrice");
    DatabaseReference ace3=firebaseDatabase.getReference("ACE Parkway/ThreePrice");
    DatabaseReference ace4=firebaseDatabase.getReference("ACE Parkway/FourPrice");


    DatabaseReference atsaddress=firebaseDatabase.getReference("ATS Nobility/Address");
    DatabaseReference ats3=firebaseDatabase.getReference("ATS Nobility/ThreePrice");
    DatabaseReference ats4=firebaseDatabase.getReference("ATS Nobility/FourPrice");


    DatabaseReference atsGa=firebaseDatabase.getReference("Ace GolfshireCompleted/Address");
    DatabaseReference atsG2=firebaseDatabase.getReference("Ace GolfshireCompleted/TwoPrice");
    DatabaseReference atsG3=firebaseDatabase.getReference("Ace GolfshireCompleted/ThreePrice");


    DatabaseReference abaddress=firebaseDatabase.getReference("Ajnara Belvedere/Address");
    DatabaseReference ab4=firebaseDatabase.getReference("Ajnara Belvedere/FourPrice");
    DatabaseReference ab3=firebaseDatabase.getReference("Ajnara Belvedere/ThreePrice");


    DatabaseReference AGC=firebaseDatabase.getReference("Antriksh Golf CityCompleted/Address");
    DatabaseReference AGC2=firebaseDatabase.getReference("Antriksh Golf CityCompleted/TwoPrice");
    DatabaseReference AGC3=firebaseDatabase.getReference("Antriksh Golf CityCompleted/ThreePrice");


    DatabaseReference AWCADD=firebaseDatabase.getReference("Assotech Windsor Court/Address");
    DatabaseReference AWC2=firebaseDatabase.getReference("Assotech Windsor Court/TwoPrice");
    DatabaseReference AWC3=firebaseDatabase.getReference("Assotech Windsor Court/ThreePrice");
    DatabaseReference AWC4=firebaseDatabase.getReference("Assotech Windsor Court/FourPrice");


    DatabaseReference CS=firebaseDatabase.getReference("Civitech Stadia/Address");
    DatabaseReference CS3=firebaseDatabase.getReference("Civitech Stadia/ThreePrice");
    DatabaseReference CS4=firebaseDatabase.getReference("Civitech Stadia/FourPrice");


    DatabaseReference GS=firebaseDatabase.getReference("Gaur Sportswood/Address");
    DatabaseReference GS3=firebaseDatabase.getReference("Gaur Sportswood/ThreePrice");
    DatabaseReference GS4=firebaseDatabase.getReference("Gaur Sportswood/FourPrice");
    DatabaseReference GS5=firebaseDatabase.getReference("Gaur Sportswood/FivePrice");


    DatabaseReference GN=firebaseDatabase.getReference("Godrej Nurture/Address");
    DatabaseReference GN2=firebaseDatabase.getReference("Godrej Nurture/TwoPrice");
    DatabaseReference GN3=firebaseDatabase.getReference("Godrej Nurture/ThreePrice");
    DatabaseReference GN4=firebaseDatabase.getReference("Godrej Nurture/FourPrice");


    DatabaseReference GIADD=firebaseDatabase.getReference("Gulshan IkebanaCompleted/Address");
    DatabaseReference GI2=firebaseDatabase.getReference("Gulshan IkebanaCompleted/TwoPrice");
    DatabaseReference GI3=firebaseDatabase.getReference("Gulshan IkebanaCompleted/ThreePrice");



    DatabaseReference LBCADD=firebaseDatabase.getReference("Logix Blossom County/Address");
    DatabaseReference LBC2=firebaseDatabase.getReference("Logix Blossom County/TwoPrice");
    DatabaseReference LBC3=firebaseDatabase.getReference("Logix Blossom County/ThreePrice");
    DatabaseReference LBC4=firebaseDatabase.getReference("Logix Blossom County/FourPrice");
    DatabaseReference LBC5=firebaseDatabase.getReference("Logix Blossom County/FivePrice");



    DatabaseReference LBGADD=firebaseDatabase.getReference("Logix Blossom Greens/Address");
    DatabaseReference LBG2=firebaseDatabase.getReference("Logix Blossom Greens/TwoPrice");
    DatabaseReference LBG3=firebaseDatabase.getReference("Logix Blossom Greens/ThreePrice");
    DatabaseReference LBG4=firebaseDatabase.getReference("Logix Blossom Greens/FourPrice");



    DatabaseReference LTSC=firebaseDatabase.getReference("Lotus Tulip Sports City/Address");
    DatabaseReference LTSC2=firebaseDatabase.getReference("Lotus Tulip Sports City/TwoPrice");
    DatabaseReference LTSC3=firebaseDatabase.getReference("Lotus Tulip Sports City/ThreePrice");



    DatabaseReference MMADD=firebaseDatabase.getReference("Mahagun Mezzaria/Address");
    DatabaseReference MM3=firebaseDatabase.getReference("Mahagun Mezzaria/ThreePrice");
    DatabaseReference MM4=firebaseDatabase.getReference("Mahagun Mezzaria/FourPrice");
    DatabaseReference MM5=firebaseDatabase.getReference("Mahagun Mezzaria/FivePrice");



    DatabaseReference SCTADDD=firebaseDatabase.getReference("Supertech Cape Town/Address");
    DatabaseReference SCT2=firebaseDatabase.getReference("Supertech Cape Town/TwoPrice");
    DatabaseReference SCT3=firebaseDatabase.getReference("Supertech Cape Town/ThreePrice");
    DatabaseReference SCT4=firebaseDatabase.getReference("Supertech Cape Town/FourPrice");
    DatabaseReference SCT5=firebaseDatabase.getReference("Supertech Cape Town/FivePrice");


    DatabaseReference SNEADDD=firebaseDatabase.getReference("Supertech North Eye/Address");
    DatabaseReference SNE2=firebaseDatabase.getReference("Supertech North Eye/TwoPrice");
    DatabaseReference SNE3=firebaseDatabase.getReference("Supertech North Eye/TwoPrice");
    DatabaseReference SNE4=firebaseDatabase.getReference("Supertech North Eye/ThreePrice");
    DatabaseReference SNE5=firebaseDatabase.getReference("Supertech North Eye/FourPrice");



    DatabaseReference ORBADD=firebaseDatabase.getReference("Supertech ORB/Address");
    DatabaseReference ORB3=firebaseDatabase.getReference("Supertech ORB/ThreePrice");
    DatabaseReference ORB4=firebaseDatabase.getReference("Supertech ORB/FourPrice");


    DatabaseReference STRADD=firebaseDatabase.getReference("Supertech The Romano/Address");
    DatabaseReference STR2=firebaseDatabase.getReference("Supertech The Romano/TwoPrice");
    DatabaseReference STR3=firebaseDatabase.getReference("Supertech The Romano/ThreePrice");
    DatabaseReference STR5=firebaseDatabase.getReference("Supertech The Romano/FivePrice");


    ProgressDialog progressDialog;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(final Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //Process dialog coding
        progressDialog = new ProgressDialog(this);
        progressDialog=new ProgressDialog(this);
        progressDialog.setTitle("Please Wait");
        progressDialog.setMessage("Data is being Loading");
        progressDialog.show();


        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        //id's of textview
        aba3price=findViewById(R.id.idabathreeprice);
        aba4price=findViewById(R.id.abafiveprice);
        abaaddress=findViewById(R.id.abaaddress);
        acead=findViewById(R.id.aceadd);
        ace2price=findViewById(R.id.acetwoprice);
        ace3price=findViewById(R.id.acethreeprice);
        ace4price=findViewById(R.id.acefourprice);
        atsadd=findViewById(R.id.idatsad);
        ats3price=findViewById(R.id.atsthreeprice);
        ats4price=findViewById(R.id.atsfourprice);
        aceG2price=findViewById(R.id.aceGtwoprice);
        aceGadd=findViewById(R.id.aceGad);
        aceG3price=findViewById(R.id.aceGthreeprice);
        abd=findViewById(R.id.Abadd);
        ab3price=findViewById(R.id.Abthreeprice);
        ab4price=findViewById(R.id.Abfourprice);
        AGCaddre=findViewById(R.id.AGCadd);
        AGC2P=findViewById(R.id.AGCtwo);
        AGC3P=findViewById(R.id.AGCthree);
        awca=findViewById(R.id.AWCadd);
        awc2=findViewById(R.id.AWCtwoPrice);
        awc3=findViewById(R.id.AWCthreePrice);
        awc4=findViewById(R.id.AWCtfourPrice);
        cs3p=findViewById(R.id.csthreep);
        csadd=findViewById(R.id.csadd);
        cs4p=findViewById(R.id.csfourp);
        gsa=findViewById(R.id.gsadd);
        gs3=findViewById(R.id.gsthreep);
        gs4=findViewById(R.id.gsfourp);
        gs5=findViewById(R.id.gsfivep);
        gnadd=findViewById(R.id.gnadd);
        gn2pr=findViewById(R.id.gntwop);
        gn3pr=findViewById(R.id.gnthreep);
        gn4pr=findViewById(R.id.gnfourep);
        gia=findViewById(R.id.giad);
        gi2=findViewById(R.id.gitwop);
        gi3=findViewById(R.id.githreep);
        lbca=findViewById(R.id.lbcadd);
        lbc2p=findViewById(R.id.lbctwop);
        lbc3p=findViewById(R.id.lbcthreep);
        lbc4p=findViewById(R.id.lbcfourp);
        lbc5p=findViewById(R.id.lbcfivep);
        lbga=findViewById(R.id.lbgadd);
        lbg2p=findViewById(R.id.lbgtwop);
        lbg3p=findViewById(R.id.lbgthreep);
        lbg4p=findViewById(R.id.lbgfourp);
        ltsca=findViewById(R.id.ltscad);
        ltsc2p=findViewById(R.id.ltsctwop);
        ltsc3pt=findViewById(R.id.ltsc3p);
        mmad=findViewById(R.id.mmad);
        mm3=findViewById(R.id.mmthree);
        mm4=findViewById(R.id.mmfourp);
        mm5=findViewById(R.id.mmfivep);
        sctadd=findViewById(R.id.sctad);
        sct2=findViewById(R.id.scttwop);
        sct3=findViewById(R.id.sctthreep);
        sct4=findViewById(R.id.sctfourp);
        sct5=findViewById(R.id.sctfivep);
        snea=findViewById(R.id.snead);
        sne2=findViewById(R.id.snetwop);
        sne3=findViewById(R.id.snethreep);
        sne4=findViewById(R.id.snefourp);
        sne5=findViewById(R.id.snefivep);
        orbadd=findViewById(R.id.orbad);
        orb3=findViewById(R.id.orbthreep);
        orb4=findViewById(R.id.orbfourp);
        strad=findViewById(R.id.strad);
        str2p=findViewById(R.id.strtwop);
        str3p=findViewById(R.id.strthree);
        str5p=findViewById(R.id.strfivep);




        //Property Photo's id's
        PimageView1=findViewById(R.id.property1);
        PimageView2=findViewById(R.id.property2);
        PimageView3=findViewById(R.id.property3);
        PimageView4=findViewById(R.id.property4);
        PimageView5=findViewById(R.id.property5);
        PimageView6=findViewById(R.id.property6);
        PimageView7=findViewById(R.id.property7);
        PimageView8=findViewById(R.id.property8);
        PimageView9=findViewById(R.id.property9);
        PimageView10=findViewById(R.id.property10);
        PimageView11=findViewById(R.id.property11);
        PimageView12=findViewById(R.id.property12);
        PimageView13=findViewById(R.id.property13);
        PimageView14=findViewById(R.id.property14);
        PimageView15=findViewById(R.id.property15);
        PimageView16=findViewById(R.id.property16);
        PimageView17=findViewById(R.id.property17);
        PimageView18=findViewById(R.id.property18);
        PimageView19=findViewById(R.id.property19);

        //FACILITIES ACTIVITIES
        textView1=findViewById(R.id.t1);
        textView2=findViewById(R.id.t2);
        textView3=findViewById(R.id.t3);
        textView4=findViewById(R.id.t4);
        textView5=findViewById(R.id.t5);
        textView6=findViewById(R.id.t6);
        textView7=findViewById(R.id.t7);
        textView8=findViewById(R.id.t8);
        textView9=findViewById(R.id.t9);
        textView10=findViewById(R.id.t10);
        textView11=findViewById(R.id.t11);
        textView12=findViewById(R.id.t12);
        textView13=findViewById(R.id.t13);
        textView14=findViewById(R.id.t14);
        textView15=findViewById(R.id.t15);
        textView16=findViewById(R.id.t16);
        textView17=findViewById(R.id.t17);
        textView18=findViewById(R.id.t18);
        textView19=findViewById(R.id.t19);

        //CALL ID'S
        imageView1=findViewById(R.id.image1);
        imageView2=findViewById(R.id.image2);
        imageView3=findViewById(R.id.image3);
        imageView4=findViewById(R.id.image4);
        imageView5=findViewById(R.id.image5);
        imageView6=findViewById(R.id.image6);
        imageView7=findViewById(R.id.image7);
        imageView8=findViewById(R.id.image8);
        imageView9=findViewById(R.id.image9);
        imageView10=findViewById(R.id.image10);
        imageView11=findViewById(R.id.image11);
        imageView12=findViewById(R.id.image12);
        imageView13=findViewById(R.id.image13);
        imageView14=findViewById(R.id.image14);
        imageView15=findViewById(R.id.image15);
        imageView16=findViewById(R.id.image16);
        imageView17=findViewById(R.id.image17);
        imageView18=findViewById(R.id.image18);
        imageView19=findViewById(R.id.image19);


        //SHARE ID'S
        s1=findViewById(R.id.share1);
        s2=findViewById(R.id.share2);
        s3=findViewById(R.id.share3);
        s4=findViewById(R.id.share4);
        s5=findViewById(R.id.share5);
        s6=findViewById(R.id.share6);
        s7=findViewById(R.id.share7);
        s8=findViewById(R.id.share8);
        s9=findViewById(R.id.share9);
        s10=findViewById(R.id.share10);
        s11=findViewById(R.id.share11);
        s12=findViewById(R.id.share12);
        s13=findViewById(R.id.share13);
        s14=findViewById(R.id.share14);
        s15=findViewById(R.id.share15);
        s16=findViewById(R.id.share16);
        s17=findViewById(R.id.share17);
        s18=findViewById(R.id.share18);
        s19=findViewById(R.id.share19);





        //THIS WILL SEND THE DETAAILS
        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                share();
            }
        });
        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                share2();
            }
        });
        s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                share3();
            }
        });
        s4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                share4();
            }
        });
        s5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                share5();
            }
        });
        s6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                share6();
            }
        });
        s7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                share7();
            }
        });
        s8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                share8();
            }
        });
        s9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                share9();
            }
        });
        s10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                share10();
            }
        });
        s11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                share11();
            }
        });
        s12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                share12();
            }
        });
            s13.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    share13();
                }
            });
            s14.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    share14();
                }
            });
            s15.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    share15();
                }
            });
            s16.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    share16();
                }
            });
            s17.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    share17();
                }
            });
            s18.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    share18();
                }
            });
            s19.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    share19();
                }
            });




            //On Click on property's photo's

        PimageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                faci();

                //faci();
            }
        });
        PimageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                faci1();
            }
        });
        PimageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                faci3();
            }
        });




        PimageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               faci();
            }
        });
        PimageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               faci1();
            }
        });
        PimageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                faci3();
            }
        });





        PimageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                faci();
            }
        });
        PimageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                faci1();
            }
        });
        PimageView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                faci3();
            }
        });



        PimageView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                faci();
            }
        });
        PimageView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                faci1();
            }
        });
        PimageView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               faci3();
            }
        });
        PimageView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                faci();
            }
        });
        PimageView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                faci1();
            }
        });
        PimageView15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                faci3();

            }
        });


        PimageView16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               faci();
            }
        });
            PimageView17.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    faci1();
                }
            });
            PimageView18.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    faci1();
                }
            });

            PimageView19.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    faci3();
                }
            });












        //THIS WILL START FACILITIES ACTIVIVTY
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                faci();

              // faci();

            }
        });
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                faci1();
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               faci3();
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                faci();

            }
        });
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               faci1();
            }
        });
        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                faci3();
            }
        });
        textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               faci();
            }
        });
        textView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               faci1();
            }
        });
        textView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                faci3();
            }
        });
        textView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                faci();
            }
        });
        textView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                faci1();
            }
        });
        textView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               faci3();
            }
        });
        textView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
               faci();
            }
        });
        textView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                faci1();
            }
        });
        textView15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               faci3();
            }
        });
        textView16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                faci();
            }
        });
        textView17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                faci1();
            }
        });
        textView18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                faci();
            }
        });
        textView19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               faci3();

                }

        });








            //This will make call onclick
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makecall();
            }
        });
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makecall();
            }
        });
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makecall();
            }
        });
        imageView7.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               makecall();
           }
       });
        imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makecall();
            }
        });
        imageView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makecall();
            }
        });
        imageView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makecall();
            }
        });
        imageView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makecall();
            }
        });
        imageView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makecall();
            }
        });
        imageView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makecall();
            }
        });
        imageView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makecall();
            }
        });
        imageView15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makecall();
            }
        });
        imageView16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makecall();
            }
        });
        imageView17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makecall();
            }
        });
        imageView18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makecall();
            }
        });
        imageView19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makecall();
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makecall();
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makecall();
            }
        });
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makecall();
            }
        });






            //To GET DATA FROM FIREBASE
        STRADD.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                strad.setText(s);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        STR2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class) ;
                str2p.setText(s);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        STR3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                str3p.setText(s);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        STR5.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                str5p.setText(s);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        ORBADD.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                orbadd.setText(s);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        ORB3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                orb3.setText(s);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        ORB4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                orb4.setText(s);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        SNEADDD.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                snea.setText(s);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        SNE2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                sne2.setText(s);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        SNE3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                sne3.setText(s);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        SNE4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                sne4.setText(s);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        SNE5.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                sne5.setText(s);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        SCTADDD.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                sctadd.setText(s);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        SCT2.addValueEventListener(new ValueEventListener()
        {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                sct2.setText(s);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        SCT3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {
                String s=dataSnapshot.getValue(String.class);
                sct3.setText(s);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        SCT4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                sct4.setText(s);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        SCT5.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                sct5.setText(s);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        MMADD.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                mmad.setText(s);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        MM3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                mm3.setText(s);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        MM4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                mm4.setText(s);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        MM5.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                mm5.setText(s);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        LTSC.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                ltsca.setText(s);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        LTSC2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                ltsc2p.setText(s);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        LTSC3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                ltsc3pt.setText(s);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        LBGADD.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                lbga.setText(s);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        LBG2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                lbg2p.setText(s);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        LBG3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                lbg3p.setText(s);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        LBG4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                lbg4p.setText(s);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
       LBCADD.addValueEventListener(new ValueEventListener() {
           @Override
           public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
               String s=dataSnapshot.getValue(String.class);
               lbca.setText(s);

           }

           @Override
           public void onCancelled(@NonNull DatabaseError databaseError) {

           }
       });
       LBC2.addValueEventListener(new ValueEventListener() {
           @Override
           public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
               String s=dataSnapshot.getValue(String.class);
               lbc2p.setText(s);
           }

           @Override
           public void onCancelled(@NonNull DatabaseError databaseError) {

           }
       });
       LBC3.addValueEventListener(new ValueEventListener() {
           @Override
           public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
               String s=dataSnapshot.getValue(String.class);
               lbc3p.setText(s);
           }

           @Override
           public void onCancelled(@NonNull DatabaseError databaseError) {

           }
       });
       LBC4.addValueEventListener(new ValueEventListener() {
           @Override
           public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
               String s=dataSnapshot.getValue(String.class);
               lbc4p.setText(s);
           }

           @Override
           public void onCancelled(@NonNull DatabaseError databaseError) {

           }
       });
       LBC5.addValueEventListener(new ValueEventListener() {
           @Override
           public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
               String s=dataSnapshot.getValue(String.class);
               lbc5p.setText(s);
           }

           @Override
           public void onCancelled(@NonNull DatabaseError databaseError) {

           }
       });
        GIADD.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                gia.setText(s);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        GI2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                gi2.setText(s);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        GI3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                gi3.setText(s);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        GN.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                gnadd.setText(s);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        GN2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                gn2pr.setText(s);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        GN3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                gn3pr.setText(s);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        GN4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                gn4pr.setText(s);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        GS.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {
                String s=dataSnapshot.getValue(String.class);
                gsa.setText(s);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        GS3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                gs3.setText(s);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        GS4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                gs4.setText(s);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        GS5.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                gs5.setText(s);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        CS.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                csadd.setText(s);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        CS4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                cs4p.setText(s);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        CS3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                cs3p.setText(s);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        AWCADD.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                awca.setText(s);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        AWC2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                awc2.setText(s);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        AWC3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                awc3.setText(s);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        AWC4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                awc4.setText(s);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        AGC.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                AGCaddre.setText(s);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        AGC2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {
                String s=dataSnapshot.getValue(String.class);
                AGC2P.setText(s);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        AGC3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                AGC3P.setText(s);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        ab4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                ab3price.setText(s);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        ab3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                ab4price.setText(s);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        abaddress.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                abd.setText(s);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError)
            {
                Toast.makeText(MainActivity.this, "No Internet", Toast.LENGTH_SHORT).show();

            }
        });
        atsGa.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {
                String s=dataSnapshot.getValue(String.class);
                aceGadd.setText(s);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        atsG2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {
                String s=dataSnapshot.getValue(String.class);
                aceG2price.setText(s);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        atsG3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                aceG3price.setText(s);
                progressDialog.dismiss();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        atsaddress.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                atsadd.setText(s);
                progressDialog.dismiss();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        ats4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                ats4price.setText(s);
                progressDialog.dismiss();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        ats3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                ats3price.setText(s);
                progressDialog.dismiss();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        aceaddd.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                acead.setText(s);
                progressDialog.dismiss();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError)
            {
                Toast.makeText(MainActivity.this, "No Internet", Toast.LENGTH_SHORT).show();

            }
        });
        ace2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {
                String s=dataSnapshot.getValue(String.class);
                ace2price.setText(s);
                progressDialog.dismiss();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        ace3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                ace3price.setText(s);
                progressDialog.dismiss();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        ace4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                ace4price.setText(s);
                progressDialog.dismiss();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        abaadd.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {
                String s=dataSnapshot.getValue(String.class);
                abaaddress.setText(s);
                progressDialog.dismiss();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError)
            {

            }
        });
        aba3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String s=dataSnapshot.getValue(String.class);
                aba3price.setText(s);
                progressDialog.dismiss();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        aba4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot)
            {
                String s=dataSnapshot.getValue(String.class);
                aba4price.setText(s);
                progressDialog.dismiss();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }

    private void faci3()
    {
        Intent intent=new Intent(MainActivity.this,Facility3.class);
        startActivity(intent);
    }

    private void faci1()
    {
        Intent intent=new Intent(MainActivity.this,Facility2.class);
        startActivity(intent);
    }

    private void faci()
    {
        Intent intent=new Intent(MainActivity.this,Facility1.class);
        startActivity(intent);
    }

    private void makecall()
    {
        Intent i=new Intent(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel:9811079213"));
        startActivity(i);

    }
    public void onBackPressed()
    {

            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("CONFRIM EXIT");
            builder.setIcon(R.drawable.cross);
            builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });
            builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            builder.show();
        }


    private void share()
    {
        Intent intent=new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        String v="ABA Cleo County \nABA Builders Limited In Sector-121 \n3 BHK Apartment(1350 - 2070 Sq. Ft.) (70.88L - 1.21Cr)\n4 BHK Apartment(2448 Sq. Ft.) (1.53Cr)";
        intent.putExtra(Intent.EXTRA_TEXT,v);
        startActivity(Intent.createChooser(intent,"Share Via"));
    }
    private void share2()
    {
        Intent intent=new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        String v="ACE Parkway \n2 BHK Apartment(1085 - 1395 Sq. Ft.) (52.00L - 69.75L) \n3 BHK Apartment(1750 - 2460 Sq. Ft.) (67.00L - 1.23Cr) \n4 BHK Apartment(3220 Sq. Ft.) (1.54Cr - 1.61Cr)";
        intent.putExtra(Intent.EXTRA_TEXT,v);
        startActivity(Intent.createChooser(intent,"Share Via"));
    }

    private void share3()
{
    Intent intent=new Intent(Intent.ACTION_SEND);
    intent.setType("text/plain");
    String v="ATS Nobility\nATS Infrastructure Ltd In Sector-150 \n3 BHK Apartment(1600 sq.ft) (75.20 L) \n4 BHK Apartment(3200 sq.ft) (1.50 Cr)";
    intent.putExtra(Intent.EXTRA_TEXT,v);
    startActivity(Intent.createChooser(intent,"Share Via"));
}

private void share4()
{
    Intent intent=new Intent(Intent.ACTION_SEND);
    intent.setType("text/plain");
    String v="Ace Golfshire \nACE Group India In Sector-150 \n2 BHK Apartment(1195 Sq. Ft.) (74.19L) \n3 BHK Apartment(1675 - 2095 Sq. Ft.) (1.04Cr - 1.30Cr)";
    intent.putExtra(Intent.EXTRA_TEXT,v);
    startActivity(Intent.createChooser(intent,"Share Via"));
}

private void share5()
{
    Intent intent=new Intent(Intent.ACTION_SEND);
    intent.setType("text/plain");
    String v="Ajnara Belvedere \nAjnara India Ltd. In Sector-79 \n3 BHK Apartment(1435 - 1795 Sq. Ft.) (65.29L - 88.31L) \n4 BHK Apartment(2575 Sq. Ft.) (1.17Cr)";
    intent.putExtra(Intent.EXTRA_TEXT,v);
    startActivity(Intent.createChooser(intent,"Share Via"));
}

private void share6()
{
    Intent intent=new Intent(Intent.ACTION_SEND);
    intent.setType("text/plain");
    String v="Antriksh Golf City \nAntriksh Group In Sector-150 \n2 BHK Apartment(1050 Sq. Ft.) (52.48L) \n2.5 BHK Apartment(1260 Sq. Ft.) (62.98L) \n3 BHK Apartment(1475 - 1665 Sq. Ft.) (73.73L - 83.23L)";
    intent.putExtra(Intent.EXTRA_TEXT,v);
    startActivity(Intent.createChooser(intent,"Share Via"));
}

private void share7()
{
    Intent intent=new Intent(Intent.ACTION_SEND);
    intent.setType("text/plain");
    String v="Assotech Windsor Court \nAssotech Limited In Sector-78 \n2 BHK Apartment(990 Sq. Ft.) (49.50L) \n3 BHK Apartment(1390 - 1645 Sq. Ft.) (69.50L - 82.25L) \n4 BHK Apartment(2550 Sq. Ft.) (1.27Cr)  ";
    intent.putExtra(Intent.EXTRA_TEXT,v);
    startActivity(Intent.createChooser(intent,"Share Via"));
}

private void share8()
{
    Intent intent=new Intent(Intent.ACTION_SEND);
    intent.setType("text/plain");
    String v="Civitech Stadia \nCivitech Developers Pvt. Ltd In Sector-79 \n3 BHK Apartment(1495 - 1735 Sq. Ft.) (86.00L - 9.00Cr)\n 4 BHK Apartment(2890 Sq. Ft.) (1.67Cr)";
    intent.putExtra(Intent.EXTRA_TEXT,v);
    startActivity(Intent.createChooser(intent,"Share Via"));
}

private void share9()
{
    Intent intent=new Intent(Intent.ACTION_SEND);
    intent.setType("text/plain");
    String v="Gaur Sportswood \nGaurs Group In Sector-79 \n3 BHK Apartment(1690 - 1850 Sq. Ft.)(50.00L - 1.01Cr) \n4 BHK Apartment(4020 Sq. Ft.) (2.75Cr) \n5 BHK Apartment(6010 Sq. Ft.) (3.75Cr)";
    intent.putExtra(Intent.EXTRA_TEXT,v);
    startActivity(Intent.createChooser(intent,"Share Via"));
}

private void share10()
{
    Intent intent=new Intent(Intent.ACTION_SEND);
    intent.setType("text/plain");
    String v="Godrej Nurture \nGodrej Properties Limited In Sector-150 \n 2 BHK Apartment(1225 - 1640 Sq. Ft.)(1.04Cr - 1.39Cr) \n3 BHK Apartment(1860 - 2570 Sq. Ft.) (1.58Cr - 2.18Cr) \n4 BHK Apartment(3480 Sq. Ft.) (2.95Cr)";
    intent.putExtra(Intent.EXTRA_TEXT,v);
    startActivity(Intent.createChooser(intent,"Share Via"));
}

private void share11()
{
    Intent intent=new Intent(Intent.ACTION_SEND);
    intent.setType("text/plain");
    String v="Gulshan Ikebana \nGulshan Homz In Sector-143 \n2 BHK Apartment(1315 - 1380 Sq. Ft.) (77.60L - 82.57L) \n3 BHK Apartment(1495 Sq. Ft.) (66.00L - 1.05Cr)";
    intent.putExtra(Intent.EXTRA_TEXT,v);
    startActivity(Intent.createChooser(intent,"Share Via"));
}

private void share12()
{
    Intent intent=new Intent(Intent.ACTION_SEND);
    intent.setType("text/plain");
    String v="Logix Blossom County \nLogix Group in Sector-137 \n2 BHK Apartment(900 - 1350 Sq. Ft.) (47.70L - 71.55L) \n3 BHK Apartment(1575 - 1675 Sq. Ft.) (83.47L - 88.77L) \n4 BHK Apartment(1875 - 2375 Sq. Ft.) (99.37L - 1.25Cr) \n5 BHK Apartment(4485 Sq. Ft.) (1.26Cr)";
    intent.putExtra(Intent.EXTRA_TEXT,v);
    startActivity(Intent.createChooser(intent,"Share Via"));
}

private void share13()
{
    Intent intent=new Intent(Intent.ACTION_SEND);
    intent.setType("text/plain");
    String v="Logix Blossom Greens \nLogix Group In Sector-143 \n2 BHK Apartment(860 Sq. Ft.) (42.91L) \n3 BHK Apartment(1350 - 1675 Sq. Ft.) (67.36L - 83.58L) \n4 BHK Apartment(3515 Sq. Ft.) (1.75Cr)";
    intent.putExtra(Intent.EXTRA_TEXT,v);
    startActivity(Intent.createChooser(intent,"Share Via"));
}

private void share14()
{
    Intent intent=new Intent(Intent.ACTION_SEND);
    intent.setType("text/plain");
    String v="Lotus Tulip Sports City \nLotus Greens In Sector-150 \n2 BHK Apartment(1100 Sq. Ft.) (44.99L) \n3 BHK Apartment(1285 - 1575 Sq. Ft.) (52.55L - 64.41L)";
    intent.putExtra(Intent.EXTRA_TEXT,v);
    startActivity(Intent.createChooser(intent,"Share Via"));
}

private void share15()
{
    Intent intent=new Intent(Intent.ACTION_SEND);
    intent.setType("text/plain");
    String v="Mahagun Mezzaria \nMahagun Group In Sector-78 \n3 BHK Apartment(2500 - 3475 Sq. Ft.) (2.05Cr - 2.84Cr) \n4 BHK Apartment(2800 - 6000 Sq. Ft.) (2.29Cr - 4.92Cr) \n5 BHK Apartment(3775 - 6200 Sq. Ft.) (3.09Cr - 5.08Cr)";
    intent.putExtra(Intent.EXTRA_TEXT,v);
    startActivity(Intent.createChooser(intent,"Share Via"));
} private void share16()
{
    Intent intent=new Intent(Intent.ACTION_SEND);
    intent.setType("text/plain");
    String v="Supertech Cape Town \nSupertech Limited In Sector-74 \n2 BHK Apartment(930 - 1082 Sq. Ft)( 55.00L - 65.55L) \n3 BHK Apartment(1295 - 1625 Sq. Ft) (52.00L - 98.45L) \n4 BHK Apartment(1945 Sq. Ft.) (1.17Cr) \n5 BHK Apartment(2385 Sq. Ft.) (1.11Cr - 1.44Cr)";
    intent.putExtra(Intent.EXTRA_TEXT,v);
    startActivity(Intent.createChooser(intent,"Share Via"));
}

private void share17()
{
    Intent intent=new Intent(Intent.ACTION_SEND);
    intent.setType("text/plain");
    String v="Supertech North Eye \nSupertech Limited In Sector-74 \n1 BHK Apartment(520 Sq. Ft.) (36.00L) \n2 BHK Apartment(1225 - 1640 Sq. Ft.) (1.04Cr - 1.39Cr) \n3 BHK Apartment(1860 - 2570 Sq. Ft.) (1.58Cr - 2.18Cr) \n4 BHK Apartment(3480 Sq. Ft.) (2.95Cr)";
    intent.putExtra(Intent.EXTRA_TEXT,v);
    startActivity(Intent.createChooser(intent,"Share Via"));
}
private void share18()
{
    Intent intent=new Intent(Intent.ACTION_SEND);
    intent.setType("text/plain");
    String v="Supertech ORB \n3 BHK Apartment(2223 - 2685 Sq. Ft.) (1.38Cr - 1.67Cr) \n4 BHK Apartment(4210 - 4270 Sq. Ft.) (1.68cr - 2.02cr)";
    intent.putExtra(Intent.EXTRA_TEXT,v);
    startActivity(Intent.createChooser(intent,"Share Via"));
}

private void share19()
{
    Intent intent=new Intent(Intent.ACTION_SEND);
    intent.setType("text/plain");
    String v="Supertech The Romano \nSupertech Limited In Sector-118 \n2 BHK Apartment(1020 Sq. Ft.) (45.39L) \n3 BHK Apartment(1260 Sq. Ft.) (56.07L) \n5 BHK Apartment(1425 - 1900 Sq. Ft.) (63.41L - 84.55L)";
    intent.putExtra(Intent.EXTRA_TEXT,v);
    startActivity(Intent.createChooser(intent,"Share Via"));
}


    }

