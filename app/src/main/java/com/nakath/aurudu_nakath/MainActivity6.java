package com.nakath.aurudu_nakath;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.nakath.aurudu_nakath.R;

public class MainActivity6 extends AppCompatActivity {
    CardView mesha,wushaba,mithuna,kataka,sinha,kanya,thula,wushika,danu,makara,kumba,meena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        mesha = findViewById(R.id.mesha);
        wushaba = findViewById(R.id.wushaba);
        mithuna = findViewById(R.id.mithuna);
        kataka = findViewById(R.id.kataka);
        sinha = findViewById(R.id.sinha);
        kanya = findViewById(R.id.kanya);
        thula = findViewById(R.id.thula);
        wushika = findViewById(R.id.wushika);
        danu = findViewById(R.id.daanu);
        makara = findViewById(R.id.makara);
        kumba = findViewById(R.id.kumba);
        meena = findViewById(R.id.meena);

        mesha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myValue = "fïY ,.akh"; // the value you want to pass
                String arc = "ch Èk - b¾od\" wÕyrejdod\" fikiqrdod YqN ueKsla - r;= fldr,a\" r;= ueKsla\n" +
                        "wh -02 jeh - 14\n" +
                        "fïI ,.ak ysñhkag Wodjk kj jir blauka úfoaY .uka fhfok jirls¡ /lshdfõ m%idoh ysñ fõ¡ fmr jif¾ w;miq jQ id¾:l;ajh fjkqfjka uykais ù jev lrhs¡ tfy;a uykaisfha ;rug m%;sM, fkd,efnkq we;¡ uqo,a .,d tafï Yla;sh ySk fõ¡ Wiia /lshd újr jqjo jegqma ,nd .ekSfï ÿIalr;d u;= fõ¡ ksjila iE§ug fyda mÈxÑh fjkia lsÍug lreKq fhfoa¡ jeäysáhkaf.a wjjdo wvqjla ke;sj ,efnk ld,hls¡ .Dy Ôú;h .egqï wdrjq,a ueo f.fjhs¡ iel lsÍï ksid wdorfhka ys;a fõokd ksh;hs¡ iu jhia újdy fhfoa¡ mskaj;a orejka ,efnk jirls¡ wOHdmkhg ch.%yK ,nk ld,hls¡ fi!LHh ;;a;ajfha iq¿ wk;=re yerekq fldg n,m;, .eg¨ fkdfmkajhs¡ ol=Kq w;\" l| l,jd\" ol=Kq fmky¿ frda.ldrl ia:dk fõ¡";

                Intent intent = new Intent(MainActivity6.this, MainActivity9.class);
                intent.putExtra("MY_VALUE", myValue);
                intent.putExtra("My_con",arc);
                startActivity(intent);
            }
        });
        wushaba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myValue1 = "jDYN ,.akh"; // the value you want to pass
                String arc1 = "jDIN\n" +
                        "w;ñg ire fõ - fudav jev jeä fõ\n" +
                        "ch wxl - 6 | ch j¾K - iqÿ\" l%Sï ch Èk - nodod\" isl=rdod\" bßod YqN ueKsla - Èhuka;s\" iqÿ ueKsla\n" +
                        "wh - 11 jeh - 05\n" +
                        "jDIN ,.ak lrejkag t<fUkafka Okh\" jdikdj lekaok fi!Nd.Hu;a kj jirls¡ kj /lshd\" Wiia ùï ,efí¡ ieuf.a f.!rjhg md;% fõ¡ yÈis Ok,dN Wreuhs¡ kS;s úfrdaë l%u u.ska Okh jeäfhka bmhSfï keUqrejla fmkajhs¡ tkhska fndfyda fudav jev j,g w;.ikq we;¡ wka;¾cd,h yd iïnkaO jHdmdr j,ska id¾:l úh yel¡ .Dy Ôú;fha wdorh jeä j¾Okh fõ¡ mjqf,a idudðlfhl=f.a lghq;a;la fjkqfjka fjfyi ùug isÿjkq we;¡ wka;su leu;s m;% u.ska Wreu ysñlï foam, ysñ fõ¡ újdy wfmala\u200DIdfjka isáhd kï mskaj;a iylrejka iyldßhka ,efí¡ kj;d ;snQ wOHdmk lghq;= weröug fyd| ld,hls¡ wOHdmk YsIH;aj ,eîï fmkajhs¡ wOHdmkh i|yd úfoaY .; ùfuka id¾:l úh yel¡ ol=Kq wei\" ol=Kq ndyqfõ hg\" ol=Kq wKav fldaIh YÍrh mSvdjg m;a lrk ia:dk fõ¡";

                Intent intent = new Intent(MainActivity6.this, MainActivity9.class);
                intent.putExtra("MY_VALUE", myValue1);
                intent.putExtra("My_con",arc1);
                startActivity(intent);
            }
        });
        mithuna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myValue2 = "ñ:qk ,.akh"; // the value you want to pass
                String arc2 = "ch wxl - 3\" 5|ch j¾K - fld<\" ly wh - 02 ch Èk - nodod\" n%yiam;skaod\" isl=rdod jeh - 05 YqN ueKsla - mÉp\n" +
                        "ñ:qk ,.ak lrejka fï jif¾ ;u n,h ySk lr .kS¡ ;ukag fkdiß foa lrkakg hdfuka foaj,a wjq,a lr.kS¡ kshu isysfhka jev l< hq;= jirls¡ úhoï wêlj fhfoa¡ úhoug iß,k kj wdodhï ud¾. mdod .ekSug fjfyi fõ¡ yjq,a jHdmdr j,ska jdis w;a fõ¡ úfoia /lshd wfmala\u200DId u,aM, ke;afjk ld,hls¡ /lshdfõ Wiiaùï ;rula m%udo lrhs¡ mÈxÑfha fjkia ùula fmkajhs¡ .Dy Ôú;h\" fkdfhl=;a u; .egqï ueo f.jk ld,hls¡ jeä uhia újdy isÿùug kshuhs¡ wvq nr ore Wm;a fmkajk neúka fmdaIKh ms<sn| ie,ls,su;a jkak¡ úoHd\" ;dlaIK wxYfhka wOHdmkh yodrK whg fyd| ld,hls¡ jerÈ ;SrK ksid jákd wOHdmk wjia:d wysñ lr.kq we;¡ úúO fi!LH ixl+,;d fmkajhs¡ ysfia ;o nr .;sh\" fn,af,a fiu\" ol=Kq wefia fmkSu ySk ùu¡ há nfâ wudre iEÈh yels neúka m%fõYï jkak¡";

                Intent intent = new Intent(MainActivity6.this, MainActivity9.class);
                intent.putExtra("MY_VALUE", myValue2);
                intent.putExtra("My_con",arc2);
                startActivity(intent);
            }
        });
        kataka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myValue3 = "lgl ,.akh"; // the value you want to pass
                String arc3 = "ch wxl - 2\"7\"9 ch j¾k - iqÿ \"l%Sï ch Èk - i÷od\"wÕyrejdod\"nodod YqN ueKsla - uq;=\n" +
                        "lgl ,.ak ysñhkag fï jir iïm;a ,efnk\" fmr mska M,fok jihls¡ hyñka uqo,a ,efí¡ ,eîï blaujd úhoï fhfoa¡ wmkhkh iïnkaO kj ¾\u200DXftr weröfuka id¾:l úh yel¡ /lshdfõ Wiiaùï kshuhs¡ iudcfha ms<s.ekSu\" f;aci j¾Okh fõ¡ ´kEu ;ekl lemS fmfkk wfhl= fõ¡ wêl lh nyq,;ajh ksid udkisl mSvdjkag ,laùug kshuhs¡ .Dy Ôú;fha iduh we;s fõ¡ wd& ieñhka w;r iqr;,a wඬonr yd ldu fNda.S;ajh jeä fõ¡ jeä nr ore Wm;a isÿ fõ¡ úfoaY ixpdr\" úfkdao .uka fhfoa¡ wOHdmk Wkkaÿj ySk jk ld,hls¡ wOHdmk lghq;= blauKska yudr fldg jHdmdrj,g fhduqùug is;hs¡ tksid wOHdmkh ms<sn| wjOdkh ì| fkd.; hq;=h\" m;, fi!LH msßySï fkdfmkajhs¡ YÍrfha f,a úI ùï fmkajhs¡ jï we;¡ jï w;\" .=oh hk YÍrdx. wdY%s;j frda. mSvd f.k fokq we;¡";

                Intent intent = new Intent(MainActivity6.this, MainActivity9.class);
                intent.putExtra("MY_VALUE", myValue3);
                intent.putExtra("My_con",arc3);
                startActivity(intent);
            }
        });
        sinha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myValue4 = "isxy ,.akh"; // the value you want to pass
                String arc4 = "ch Èy wÕyrejdod\" nodod\" isl=rdod jeh - 11\n" +
                        "ch wxl - 1\" 4 | ch j¾Kh - r;=\n" +
                        "Yqy ueKsla - moaurd.\n" +
                        "f.!rj iy wmydi tl f,i meñfKk jirls¡ l< fyd| ;uka miqmi meñKSug kshñ;h¡ /lshdfõ ÈhqKqj we;s fõ¡ ;k;=re\" Wiia ùï ,efí¡ miq.sh jif¾ Kh;=reia mshùu fyda Kh iyk ,eîug kshñ;hs¡ jHdmdr j,ska by< wodhï w;alr .ekSug iu;a fõ¡ is;d u;d ;SrK .; hq;= ld,hls¡ wkq;a yd ksYaM, l;dj,g hdfuka ;ukagu ydks isÿlr .kq we;¡ iSudj blaujd wkqkag Woõ lsÍfuka ;uka wudrefõ jefgkq we;¡ .Dy Ôú;fha i;=g\" m%S;sh W;=rk iuhls¡ jeämqr w¨;a we÷ï ñ<§ .ekSug m%sh fõ¡ ux., isysk ienE fõ¡ wUq ieñhka w;r iu.sh jeä j¾Okh fõ¡ oreM, wysñj isáhd kï mskaj;a orejka ,efí¡ wOHdmkhg fyd| ld,hls¡ ksula ke;s jHdmD;s\" ksnkaOk lghq;= fya;=fjka wd;a;shg m;ajkq we;¡ jï w;\" jï l| l,jd\" jï wKav fldaIh ks;r YdÍßl mSvd we;s lrk ia:dk fõ¡";

                Intent intent = new Intent(MainActivity6.this, MainActivity9.class);
                intent.putExtra("MY_VALUE", myValue4);
                intent.putExtra("My_con",arc4);
                startActivity(intent);
            }
        });
//        sinha lagnaya
        kanya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myValue5 = "lkHd ,.akh"; // the value you want to pass
                String arc5 = "ch Èk - nodod\" n%yiam;skaod\" isl=rdod YqN ueKsla - mÉp\" f.dafïo\n" +
                        "wh - 02 jeh - 05\n" +
                        "wd.u oyug <eÈ fjk\" fl!;=l foa /ialsÍug wdYd olajk kj jirls lkHd ,.ak ysñhkag t<fUkqfha¡ Wmhk foa jeämqr okg mskg jeh lrhs¡ /lshd Wiia ùï\" ;k;=re ,eîï m%udo fjhs¡ /lshd iïnkaO kS;suh .eg¨ j,g uqyqK §ug isÿjkq we;¡ jHdmdr i|yd ;u ;ekam;a Okh wdfhdackh lrhs¡ iNdjg m%sh fõ¡ wkqkaf.a ksjdij, f.dia mÈxÑ ù úfkdao ùug leue;a;la olajhs¡ .Dy Ôú;h idufhka iu.sfhka f.fõ¡ wUqieñ wd,h ;r fõ¡ újdy wfmala\u200DIs;hkaf.a isysk ienEfjhs¡ miq.sh jif¾ w;miq jQ ksjdi wjYH;d imqrd .ekSug uykais fõ¡ mshdf.ka fuf;la ,o wkq.%y yS; jkq we;¡ wOHdmk lghq;= ;u W;aidyh\" Wkkaÿj u; id¾:l jkq we;¡ fiï frda. iy f,a frda.j,g ks;r f.dÿre ùug kshñ;hs¡ jï kdia mqvqj\" jï jl=.vqj\" Worfha jï me;a; frda. mSvd we;s lrk YÍria:dk fõ¡";

                Intent intent = new Intent(MainActivity6.this, MainActivity9.class);
                intent.putExtra("MY_VALUE", myValue5);
                intent.putExtra("My_con",arc5);
                startActivity(intent);
            }
        });
        thula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myValue6 = ";=,d ,.akh"; // the value you want to pass
                String arc6 = "ch wxl - 6  ch j¾K - iqÿ\" l%Sï ch Èk - wÕyrejdod\" nodod\" isl=rdod YqN ueKsla - Èhuka;s\" iqÿ ueKsla\n" +
                        "wh - 11 jeh - 05\n" +
                        ";=,d ,.ak ysñhka wdor iïnkaO;dj,g uq,a ;ek § lghq;= lrk jirls¡ fyd| Okh .,d tafï ;;a;ajhla mj;S¡ Okh Wmhk úúO l%u w;ayod n,hs¡ tajdhska id¾:l ùug o mq¿jk¡ /lshd ia:dkfha ;ukaf.a ;;a;ajh ;yjqre fõ¡ ieuf.a Woõ Wmldr\" f.!rjh ,efí¡ nqoaêh fufyhjd /lshd lrk whg iqúfYaI jdis w;a fõ¡ ksjdi w,xlrKh i|yd fjfyi jk ld,hls¡ mjqf,a idudðlhka w;r ne£ï Yla;su;a fõ¡ jeäysáhkaf.a Woõ Wmldr ysñ fõ¡ ksjfia isák úg ksÈnr .;sfhka w,ilñka l,a f.ùug is;hs¡ újdy .súi .ekSï l,ahdu;a\" §¾>ld,Sk fmï in|;d ìfËk ,l=Kq;a fmkajhs¡ wOHdmkh i|yd úfoaY .; ùug wjia:d újr fõ¡ fi!LH ;;a;ajfha msßySï fmkakqï lrhs¡ yDoh\" jï yKqj\" jï l| l,jd wdY%s;j úúO frda. mSvd we;s lrkq we;¡";

                Intent intent = new Intent(MainActivity6.this, MainActivity9.class);
                intent.putExtra("MY_VALUE", myValue6);
                intent.putExtra("My_con",arc6);
                startActivity(intent);
            }
        });
        wushika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myValue7 = "jDYaúl ,.akh"; // the value you want to pass
                String arc7 = "ch wxl - 1\"2\"4\"5\"7  ch j¾Kh - r;=\n" +
                        "wh 02 jeh - 14\n" +
                        "ch Èk - bßod\" n%yiam;skaod YqN ueKsla - r;= fldr,a\" r;= ueKsla\n" +
                        "w¨;a we÷ï me<÷ïj,g m%sh lrk\" lEug îug uq,a ;ek fok kj jirls¡ ;ekam;a Okh kslrefKa úhmeyeoï lr.kq we;¡ Kh;=reia ùug isÿ fõ¡ /lshdfõ l,lsÍï we;sjk iuhls¡ ;ukag ysñ Wiiaùï l=uKa;%K u.ska wkqka w;g m;ajkq we;¡ jHdmdrhkag uqo,a .,d tkafka b;d fiñks¡ lrk lshk /lshd\" jHdmdr i|yd mjqf,a whf.a n,mEï t,a, jk iuhls¡ .Dy w,xlrK lghq;= i|yd jeämqr ld,h jeh lrhs¡ mjqf,a wh yd i;=fgka l,a f.jhs¡ fhdað; újdy fmkajhs¡ wOHdmkfhka Wiia idud¾: ysñ fõ¡ OdrK Yla;sh ÈhqKq fõ¡ tfy;a >DKd;aul wdl,am ksid jákd wOHdmk wjia:d wysñ lrf.k miqj miq;efjkq we;¡ YÍr fi!LHhg fyd| ld,hla fkdfõ¡ isrer uy;a fõ¡ wikSm jeä fõ¡ lg úhf<k .;sh\" nv mqrjd oeóu iy ll=,a lelal=ï ksrka;rfhka YÍrhg jo fokq we;¡";

                Intent intent = new Intent(MainActivity6.this, MainActivity9.class);
                intent.putExtra("MY_VALUE", myValue7);
                intent.putExtra("My_con",arc7);
                startActivity(intent);
            }
        });
        danu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myValue8 = "Okq ,.akh"; // the value you want to pass
                String arc8 = "ch wxl - 3\" 5\" 6\" 8 ch j¾Kh - ly ch Èk - bßod\" nodod\" isl=rdod YqN ueKsla - mqIamrd.\n" +
                        "wh - 14 jeh - 02\n" +
                        "Okq ,.ak ysñhka fï jif¾ fndfyda wd¾:sl jdis w;a lr.kq we;¡ miq.sh jif¾ ;ukag wysñ jQ wdodhï Wmhd .ekSug ;rï jdikdjka; fõ¡ wd¾Òl ;;a;ajh ia:djr fõ¡ ;k;=re kïnqkdu\" /lshd Wiia ùï Wreuhs¡ jHdmdrfha lS¾;sh m;< fõ¡ iudc udOH u.ska jHdmdr lrk whg úfYaI jdis w;a fõ¡ ñ<§ .ekSï wêl j¾Ihls¡ hdkjdyk\" bv lvï ñ<§ .ekSug Wkkaÿ fõ¡ ksjila w¨;ska iE§ug uykais .kS¡ .Dy Ôú;fha u; .egqï iukh fõ¡ wdorh jeä j¾Okh fõ¡ ux., fhda. l%shd;aul jirla neúka iemj;a újdy we;s fõ¡ ìkak újdy fyda wi,ajeis mjq,a j,ska újdy isÿ ùug kshuhs¡ mskaj;a ore ms<sis| .ekSï fmkajhs¡ wOHdmk ch.%yK Wreu jirls¡ j,ska ch w;a fõ¡ fi!LH ;;a;ajfha nrm;, .eg¨ fkdfmkajhs¡ ;rÕ úNd. lg ksid nv\" ÿ¾j, jk neúka lEfuka îfuka m%fõYï jkak¡";

                Intent intent = new Intent(MainActivity6.this, MainActivity9.class);
                intent.putExtra("MY_VALUE", myValue8);
                intent.putExtra("My_con",arc8);
                startActivity(intent);
            }
        });
        makara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myValue9 = "ulr ,.akh"; // the value you want to pass
                String arc9 = "ch wxl - 6\" 8\" 9  ch j¾Kh - ks,a ch Èk - wÕyrejdod\" nodod\" isl=rdod - YqN ueKsla - ks,a ueKsla\n" +
                        "wh - 08 jeh - 05\n" +
                        "ulr ,.ak ysñhkag fï jir l,d;aul foag we¨ï lrk wdorKSh kj jirla jkq we;¡ n,;, ysñjk ld,hls¡ lS¾;sh me;sf¾¡ fuf;la m%udo jQ /lshd Wiiaùï ksh;j Wreu fõ¡ /lshd ia:dkfha iuyr whf.a ishqï m,s.ekSïj,g ,laúh yels neúka l,amkdldÍ jkak¡ jHdmdr ÈhqKqj we;s jk jirls¡ l,d la\u200DfIa;%fha whf.a wdodhï m%lD;su;a jkq we;¡ wka wh fjkqfjka is; WKqjk ld,hls¡ mß;Hd. i|yd uqo,a úh meyeoï lrhs¡ .Dy Ôú;h t;rï i;=gq odhl fkdfõ¡ ks;r u; .egqï\" is;a ;ejq,a kshuhs¡ újdy ndOd fhfoa¡ fmr újdy .súi .ekSï wfydais ùug bv we;¡ úNd. j,ska ch.%yK w;a fõ¡ wOHdmkh iïnkaO ;SrKd;aul ;eklg meñKsho foudmsh wkq.%yh ySk jkq we;¡ YÍrfha f,a ms<sn| .eg¨ we;s lrhs¡ ol=Kq yKqj\" ol=Kq nv\" ol=Kq flKav frda.dndO we;s lrk YÍrdx. fõ¡";

                Intent intent = new Intent(MainActivity6.this, MainActivity9.class);
                intent.putExtra("MY_VALUE", myValue9);
                intent.putExtra("My_con",arc9);
                startActivity(intent);
            }
        });
        kumba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myValue10 = "l=ïN ,.akh"; // the value you want to pass
                String arc10 = "ch wxl - 3\" 8\" 9 | ch j¾K - r;=\" ks,a\n" +
                        "ch Èk - n%yiam;skaod\" isl=rdod YqN ueKsla - ldl ks,\n" +
                        "wh - 08 jeh - 05\n" +
                        "l=ïN ,.ak ysñhkag t<fUkqfha ish¨ foa w¨;a jk kj jirls¡ wdY%hg w¨;a {d;s ys;ñ;=rka ,efí¡ w¨;a we÷ï me<÷ï ,efí¡ w¨;a .uka ìuka fhfoa¡ ;uka i;= wOHd;añl Yla;sh msìfok iuhls¡ udkisl tald.%;dj fyd¢ka mj;S¡ Okh .,d tkq we;¡ jHdmdrj,ska jeä ,dN w;a fõ¡ mdvqmsg jid oeuQ jHdmdr m%lD;su;a lrhs¡ /lshdfõ .eg¨ldÍ ;;a;ajhka ks¾udKh jqjo kqjKska ;u n,h ;yjqre lr.kS¡ mjqf,a ióm;uhkaf.a .eg¨j,g ueÈy;a ùug isÿ fõ¡ wvq jhia wdor in|;d we;s fõ¡ .Dy Ôú;h m%sh fõ¡ jeäysáhkaf.a wdorhg md;% fõ¡ ore ms<sis| .ekSïj,g ndOd we;s jk iuhls¡ wdl%uKYS,S bf.kqï yelshdj ksid wOHdmkfha lemS fmfkk wfhl= fõ¡ ;rÕ úNd.j,ska ch\" úfoaY YsIH;aj jrï ysñlr .kS¡ fiï frda. nyq,j iEfoa¡ fmky¿\" ol=Kq lK YÍrfha mSvd we;s lrk ia:dk fõ¡";

                Intent intent = new Intent(MainActivity6.this, MainActivity9.class);
                intent.putExtra("MY_VALUE", myValue10);
                intent.putExtra("My_con",arc10);
                startActivity(intent);
            }
        });
        meena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myValue11 = "ók ,.akh"; // the value you want to pass
                String arc11 = "ch wxl -3\" 9  ch j¾K - r;=\" ly ch Èk - wÕyrejdod\" n%yiam;skaod - YqN ueKsla - mqIamrd.\" ffjfrdaä\n" +
                        "wh - 14 jeh - 02\n" +
                        "jkaokd pdßld\" wOHd;añl wd.ñl jevigyka i|yd jeämqr fhduqjk jirls¡ fyd| uqo,a .,d taula fmkajhs¡ w;sf¾l wu;r wdodhïo újr jkq we;¡ fuf;la wysñ jQ wdodhï mshjd .ekSug fjfyi ù lghq;= lrhs¡ /lshd m%OdkSkaf.a iydh ysñ fõ¡ by< f.ùï iys; /lshd i|yd udre ùug wjldY ie,fia¡ f.or fodf¾ wjYH;d i|yd wkjYH ñ,§ .ekSï jeä jirls¡ .Dy jdih m%sh fõ¡ újdy isysk ienE lr .ekSug jdikd uysuh we;s jirls¡ {d;s Wmldr ,efí¡ jeäysá úfrdaOh u; m%udo jQ fyda lvdlmam,a wdor in|;d h<s werfò¡ wOHdmkfhka id¾:l úh yel¡ úfoaY wOHdmk .uka fhfoa¡ uqyqfKa me,a,ula we;s ùug lreKq fhfok neúka m%fõYï jkak¡ ol=Kq kdia mqvqj\" WKavql mqÉPh\" ol=Kq l| l,jd ksr;=re frda.dndO we;s lrk YÍria:dk fõ¡";

                Intent intent = new Intent(MainActivity6.this, MainActivity9.class);
                intent.putExtra("MY_VALUE", myValue11);
                intent.putExtra("My_con",arc11);
                startActivity(intent);
            }
        });
    }
}
