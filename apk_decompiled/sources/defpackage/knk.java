package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import android.os.UserManager;
import androidx.compose.foundation.layout.b;
import com.anthropic.claude.api.chat.ChatConversationWithProjectReference;
import com.anthropic.claude.api.result.ApiResult;
import com.anthropic.claude.login.SSOIntentData;
import com.anthropic.claude.login.WelcomeNotice;
import com.anthropic.claude.types.strings.ChatId;
import com.pvporbit.freetype.FreeTypeConstants;
import io.sentry.t4;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class knk {
    public static UserManager a = null;
    public static volatile boolean b = false;
    public static final ta4 c = new ta4(88686980, false, new xe3(7));
    public static final float[] d = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};
    public static final long[] e = {-6499023860262858360L, -3512093806901185046L, -9112587656954322510L, -6779048552765515233L, -3862124672529506138L, -215969822234494768L, -7052510166537641086L, -4203951689744663454L, -643253593753441413L, -7319562523736982739L, -4537767136243840520L, -1060522901877412746L, -7580355841314464822L, -4863758783215693124L, -1468012460592228501L, -7835036815511224669L, -5182110000961642932L, -1865951482774665761L, -8083748704375247957L, -5492999862041672042L, -2254563809124702148L, -8326631408344020699L, -5796603242002637969L, -2634068034075909558L, -8563821548938525330L, -6093090917745768758L, -3004677628754823043L, -8795452545612846258L, -6382629663588669919L, -3366601061058449494L, -9021654690802612790L, -6665382345075878084L, -3720041912917459700L, -38366372719436721L, -6941508010590729807L, -4065198994811024355L, -469812725086392539L, -7211161980820077193L, -4402266457597708587L, -891147053569747830L, -7474495936122174250L, -4731433901725329908L, -1302606358729274481L, -7731658001846878407L, -5052886483881210105L, -1704422086424124727L, -7982792831656159810L, -5366805021142811859L, -2096820258001126919L, -8228041688891786181L, -5673366092687344822L, -2480021597431793123L, -8467542526035952558L, -5972742139117552794L, -2854241655469553088L, -8701430062309552536L, -6265101559459552766L, -3219690930897053053L, -8929835859451740015L, -6550608805887287114L, -3576574988931720989L, -9152888395723407474L, -6829424476226871438L, -3925094576856201394L, -294682202642863838L, -7101705404292871755L, -4265445736938701790L, -720121152745989333L, -7367604748107325189L, -4597819916706768583L, -1135588877456072824L, -7627272076051127371L, -4922404076636521310L, -1541319077368263733L, -7880853450996246689L, -5239380795317920458L, -1937539975720012668L, -8128491512466089774L, -5548928372155224313L, -2324474446766642487L, -8370325556870233411L, -5851220927660403859L, -2702340141148116920L, -8606491615858654931L, -6146428501395930760L, -3071349608317525546L, -8837122532839535322L, -6434717147622031249L, -3431710416100151157L, -9062348037703676329L, -6716249028702207507L, -3783625267450371480L, -117845565885576446L, -6991182506319567135L, -4127292114472071014L, -547429124662700864L, -7259672230555269896L, -4462904269766699466L, -966944318780986428L, -7521869226879198374L, -4790650515171610063L, -1376627125537124675L, -7777920981101784778L, -5110715207949843068L, -1776707991509915931L, -8027971522334779313L, -5423278384491086237L, -2167411962186469893L, -8272161504007625539L, -5728515861582144020L, -2548958808550292121L, -8510628282985014432L, -6026599335303880135L, -2921563150702462265L, -8743505996830120772L, -6317696477610263061L, -3285434578585440922L, -8970925639256982432L, -6601971030643840136L, -3640777769877412266L, -9193015133814464522L, -6879582898840692749L, -3987792605123478032L, -373054737976959636L, -7150688238876681629L, -4326674280168464132L, -796656831783192261L, -7415439547505577019L, -4657613415954583370L, -1210330751515841308L, -7673985747338482674L, -4980796165745715438L, -1614309188754756393L, -7926472270612804602L, -5296404319838617848L, -2008819381370884406L, -8173041140997884610L, -5604615407819967859L, -2394083241347571919L, -8413831053483314306L, -5905602798426754978L, -2770317479606055818L, -8648977452394866743L, -6199535797066195524L, -3137733727905356501L, -8878612607581929669L, -6486579741050024183L, -3496538657885142324L, -9102865688819295809L, -6766896092596731857L, -3846934097318526917L, -196981603220770742L, -7040642529654063570L, -4189117143640191558L, -624710411122851544L, -7307973034592864071L, -4523280274813692185L, -1042414325089727327L, -7569037980822161435L, -4849611457600313890L, -1450328303573004458L, -7823984217374209643L, -5168294253290374149L, -1848681798185579782L, -8072955151507069220L, -5479507920956448621L, -2237698882768172872L, -8316090829371189901L, -5783427518286599473L, -2617598379430861437L, -8553528014785370254L, -6080224000054324913L, -2988593981640518238L, -8785400266166405755L, -6370064314280619289L, -3350894374423386208L, -9011838011655698236L, -6653111496142234891L, -3704703351750405709L, -19193171260619233L, -6929524759678968877L, -4050219931171323192L, -451088895536766085L, -7199459587351560659L, -4387638465762062920L, -872862063775190746L, -7463067817500576073L, -4717148753448332187L, -1284749923383027329L, -7720497729755473937L, -5038936143766954517L, -1686984161281305242L, -7971894128441897632L, -5353181642124984136L, -2079791034228842266L, -8217398424034108273L, -5660062011615247437L, -2463391496091671392L, -8457148712698376476L, -5959749872445582691L, -2838001322129590460L, -8691279853972075893L, -6252413799037706963L, -3203831230369745799L, -8919923546622172981L, -6538218414850328322L, -3561087000135522498L, -9143208402725783417L, -6817324484979841368L, -3909969587797413806L, -275775966319379353L, -7089889006590693952L, -4250675239810979535L, -701658031336336515L, -7356065297226292178L, -4583395603105477319L, -1117558485454458744L, -7616003081050118571L, -4908317832885260310L, -1523711272679187483L, -7869848573065574033L, -5225624697904579637L, -1920344853953336643L, -8117744561361917258L, -5535494683275008668L, -2307682335666372931L, -8359830487432564938L, -5838102090863318269L, -2685941595151759932L, -8596242524610931813L, -6133617137336276863L, -3055335403242958174L, -8827113654667930715L, -6422206049907525490L, -3416071543957018958L, -9052573742614218705L, -6704031159840385477L, -3768352931373093942L, -98755145788979524L, -6979250993759194058L, -4112377723771604669L, -528786136287117932L, -7248020362820530564L, -4448339435098275301L, -948738275445456222L, -7510490449794491995L, -4776427043815727089L, -1358847786342270957L, -7766808894105001205L, -5096825099203863602L, -1759345355577441598L, -8017119874876982855L, -5409713825168840664L, -2150456263033662926L, -8261564192037121185L, -5715269221619013577L, -2532400508596379068L, -8500279345513818773L, -6013663163464885563L, -2905392935903719049L, -8733399612580906262L, -6305063497298744923L, -3269643353196043250L, -8961056123388608887L, -6589634135808373205L, -3625356651333078602L, -9183376934724255983L, -6867535149977932074L, -3972732919045027189L, -354230130378896082L, -7138922859127891907L, -4311967555482476980L, -778273425925708321L, -7403949918844649557L, -4643251380128424042L, -1192378206733142148L, -7662765406849295699L, -4966770740134231719L, -1596777406740401745L, -7915514906853832947L, -5282707615139903279L, -1991698500497491195L, -8162340590452013853L, -5591239719637629412L, -2377363631119648861L, -8403381297090862394L, -5892540602936190089L, -2753989735242849707L, -8638772612167862923L, -6186779746782440750L, -3121788665050663033L, -8868646943297746252L, -6474122660694794911L, -3480967307441105734L, -9093133594791772940L, -6754730975062328271L, -3831727700400522434L, -177973607073265139L, -7028762532061872568L, -4174267146649952806L, -606147914885053103L, -7296371474444240046L, -4508778324627912153L, -1024286887357502287L, -7557708332239520786L, -4835449396872013078L, -1432625727662628443L, -7812920107430224633L, -5154464115860392887L, -1831394126398103205L, -8062150356639896359L, -5466001927372482545L, -2220816390788215277L, -8305539271883716405L, -5770238071427257602L, -2601111570856684098L, -8543223759426509417L, -6067343680855748868L, -2972493582642298180L, -8775337516792518219L, -6357485877563259869L, -3335171328526686933L, -9002011107970261189L, -6640827866535438582L, -3689348814741910324L, Long.MIN_VALUE, -6917529027641081856L, -4035225266123964416L, -432345564227567616L, -7187745005283311616L, -4372995238176751616L, -854558029293551616L, -7451627795949551616L, -4702848726509551616L, -1266874889709551616L, -7709325833709551616L, -5024971273709551616L, -1669528073709551616L, -7960984073709551616L, -5339544073709551616L, -2062744073709551616L, -8206744073709551616L, -5646744073709551616L, -2446744073709551616L, -8446744073709551616L, -5946744073709551616L, -2821744073709551616L, -8681119073709551616L, -6239712823709551616L, -3187955011209551616L, -8910000909647051616L, -6525815118631426616L, -3545582879861895366L, -9133518327554766460L, -6805211891016070171L, -3894828845342699810L, -256850038250986858L, -7078060301547948643L, -4235889358507547899L, -683175679707046970L, -7344513827457986212L, -4568956265895094861L, -1099509313941480672L, -7604722348854507276L, -4894216917640746191L, -1506085128623544835L, -7858832233030797378L, -5211854272861108819L, -1903131822648998119L, -8106986416796705681L, -5522047002568494197L, -2290872734783229842L, -8349324486880600507L, -5824969590173362730L, -2669525969289315508L, -8585982758446904049L, -6120792429631242157L, -3039304518611664792L, -8817094351773372351L, -6409681921289327535L, -3400416383184271515L, -9042789267131251553L, -6691800565486676537L, -3753064688430957767L, -79644842111309304L, -6967307053960650171L, -4097447799023424810L, -510123730351893109L, -7236356359111015049L, -4433759430461380907L, -930513269649338230L, -7499099821171918250L, -4762188758037509908L, -1341049929119499481L, -7755685233340769032L, -5082920523248573386L, -1741964635633328828L, -8006256924911912374L, -5396135137712502563L, -2133482903713240300L, -8250955842461857044L, -5702008784649933400L, -2515824962385028846L, -8489919629131724885L, -6000713517987268202L, -2889205879056697349L, -8723282702051517699L, -6292417359137009220L, -3253835680493873621L, -8951176327949752869L, -6577284391509803182L, -3609919470959866074L, -9173728696990998152L, -6855474852811359786L, -3957657547586811828L, -335385916056126881L, -7127145225176161157L, -4297245513042813542L, -759870872876129024L, -7392448323188662496L, -4628874385558440216L, -1174406963520662366L, -7651533379841495835L, -4952730706374481889L, -1579227364540714458L, -7904546130479028392L, -5268996644671397586L, -1974559787411859078L, -8151628894773493780L, -5577850100039479321L, -2360626606621961247L, -8392920656779807636L, -5879464802547371641L, -2737644984756826647L, -8628557143114098510L, -6174010410465235234L, -3105826994654156138L, -8858670899299929442L, -6461652605697523899L, -3465379738694516970L, -9083391364325154962L, -6742553186979055799L, -3816505465296431844L, -158945813193151901L, -7016870160886801794L, -4159401682681114339L, -587566084924005019L, -7284757830718584993L, -4494261269970843337L, -1006140569036166268L, -7546366883288685774L, -4821272585683469313L, -1414904713676948737L, -7801844473689174817L, -5140619573684080617L, -1814088448677712867L, -8051334308064652398L, -5452481866653427593L, -2203916314889396588L, -8294976724446954723L, -5757034887131305500L, -2584607590486743971L, -8532908771695296838L, -6054449946191733143L, -2956376414312278525L, -8765264286586255934L, -6344894339805432014L, -3319431906329402113L, -8992173969096958177L, -6628531442943809817L, -3673978285252374367L, -9213765455923815836L, -6905520801477381891L, -4020214983419339459L, -413582710846786420L, -7176018221920323369L, -4358336758973016307L, -836234930288882479L, -7440175859071633406L, -4688533805412153853L, -1248981238337804412L, -7698142301602209614L, -5010991858575374113L, -1652053804791829737L, -7950062655635975442L, -5325892301117581398L, -2045679357969588844L, -8196078626372074883L, -5633412264537705700L, -2430079312244744221L, -8436328597794046994L, -5933724728815170839L, -2805469892591575644L, -8670947710510816634L, -6226998619711132888L, -3172062256211528206L, -8900067937773286985L, -6513398903789220827L, -3530062611309138130L, -9123818159709293187L, -6793086681209228580L, -3879672333084147821L, -237904397927796872L, -7066219276345954901L, -4221088077005055722L, -664674077828931749L, -7332950326284164199L, -4554501889427817345L, -1081441343357383777L, -7593429867239446717L, -4880101315621920492L, -1488440626100012711L, -7847804418953589800L, -5198069505264599346L, -1885900863153361279L, -8096217067111932656L, -5508585315462527915L, -2274045625900771990L, -8338807543829064350L, -5811823411358942533L, -2653093245771290262L, -8575712306248138270L, -6107954364382784934L, -3023256937051093263L, -8807064613298015146L, -6397144748195131028L, -3384744916816525881L, -9032994600651410532L, -6679557232386875260L, -3737760522056206171L, -60514634142869810L, -6955350673980375487L, -4082502324048081455L, -491441886632713915L, -7224680206786528053L, -4419164240055772162L, -912269281642327298L, -7487697328667536418L, -4747935642407032618L, -1323233534581402868L, -7744549986754458649L, -5069001465015685407L, -1724565812842218855L, -7995382660667468640L, -5382542307406947896L, -2116491865831296966L, -8240336443785642460L, -5688734536304665171L, -2499232151953443560L, -8479549122611984081L, -5987750384837592197L, -2873001962619602342L, -8713155254278333320L, -6279758049420528746L, -3238011543348273028L, -8941286242233752499L, -6564921784364802720L, -3594466212028615495L, -9164070410158966541L, -6843401994271320272L, -3942566474411762436L, -316522074587315140L, -7115355324258153819L, -4282508136895304370L, -741449152691742558L, -7380934748073420955L, -4614482416664388289L, -1156417002403097458L, -7640289654143017767L, -4938676049251384305L, -1561659043136842477L, -7893565929601608404L, -5255271393574622601L, -1957403223540890347L, -8140906042354138323L, -5564446534515285000L, -2343872149716718346L, -8382449121214030822L, -5866375383090150624L, -2721283210435300376L, -8618331034163144591L, -6161227774276542835L, -3089848699418290639L, -8848684464777513506L, -6449169562544503978L, -3449775934753242068L, -9073638986861858149L, -6730362715149934782L, -3801267375510030573L, -139898200960150313L, -7004965403241175802L, -4144520735624081848L, -568964901102714406L, -7273132090830278360L, -4479729095110460046L, -987975350460687153L, -7535013621679011327L, -4807081008671376254L, -1397165242411832414L, -7790757304148477115L, -5126760611758208489L, -1796764746270372707L, -8040506994060064798L, -5438947724147693094L, -2186998636757228463L, -8284403175614349646L, -5743817951090549153L, -2568086420435798537L, -8522583040413455942L, -6041542782089432023L, -2940242459184402125L, -8755180564631333184L, -6332289687361778576L, -3303676090774835316L, -8982326584375353929L, -6616222212041804507L, -3658591746624867729L, -9204148869281624187L, -6893500068174642330L, -4005189066790915008L, -394800315061255856L, -7164279224554366766L, -4343663012265570553L, -817892746904575288L, -7428711994456441411L, -4674203974643163860L, -1231068949876566920L, -7686947121313936181L, -4996997883215032323L, -1634561335591402499L, -7939129862385708418L, -5312226309554747619L, -2028596868516046619L, -8185402070463610993L};
    public static final bz9[] f = new bz9[0];
    public static final o54 g = o54.R;
    public static final float h = 24.0f;
    public static final float i = 24.0f;
    public static boolean j = true;

    public static y86 A(lf9 lf9Var, nf9 nf9Var) {
        return lf9Var instanceof vf9 ? ((vf9) lf9Var).Y(true, nf9Var) : lf9Var.j(nf9Var.r(), true, new ty4(nf9Var));
    }

    public static final boolean B(c45 c45Var) {
        lf9 lf9Var = (lf9) c45Var.x0(dd8.J);
        if (lf9Var != null) {
            return lf9Var.c();
        }
        return true;
    }

    public static nyg C(nyg nygVar) {
        return ((nygVar instanceof qyg) || (nygVar instanceof oyg)) ? nygVar : nygVar instanceof Serializable ? new oyg(nygVar) : new qyg(nygVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x020a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long D(int r32, int r33, java.lang.String r34) {
        /*
            Method dump skipped, instruction units count: 814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.knk.D(int, int, java.lang.String):long");
    }

    public static final iqb E(iqb iqbVar, bz7 bz7Var) {
        return iqbVar.B(new em4(bz7Var));
    }

    public static kqi F() {
        byte[] bArr = new byte[16];
        tef.a.nextBytes(bArr);
        byte b2 = (byte) (bArr[6] & 15);
        bArr[6] = b2;
        bArr[6] = (byte) (b2 | 64);
        byte b3 = (byte) (bArr[8] & 63);
        bArr[8] = b3;
        bArr[8] = (byte) (b3 | 128);
        long jK = mpk.K(bArr, 0);
        long jK2 = mpk.K(bArr, 8);
        return (jK == 0 && jK2 == 0) ? kqi.G : new kqi(jK, jK2);
    }

    public static final eae G(Object obj, ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        Object objN = e18Var.N();
        Object obj2 = objN;
        if (objN == jd4.a) {
            eae eaeVar = new eae();
            eaeVar.a = obj;
            e18Var.k0(eaeVar);
            obj2 = eaeVar;
        }
        return (eae) obj2;
    }

    public static final void H(ApiResult apiResult, kie kieVar) {
        if (apiResult instanceof of0) {
            return;
        }
        if (apiResult instanceof mf0) {
            I(((mf0) apiResult).a(), kieVar);
            return;
        }
        if (!(apiResult instanceof lf0)) {
            mr9.b();
            return;
        }
        String strA = s9e.a(kieVar);
        zfa.a.getClass();
        if (yfa.b()) {
            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : copyOnWriteArrayList) {
                ((n30) ((zfa) obj)).getClass();
                arrayList.add(obj);
            }
            if (arrayList.isEmpty()) {
                return;
            }
            zfa.a.getClass();
            String strK = vb7.k(((lf0) apiResult).a(), "HTTP ", " ", strA);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((n30) ((zfa) it.next())).b(sfa.ERROR, "SentryCaptureIfNecessary", strK);
            }
        }
    }

    public static final void I(Throwable th, kie kieVar) {
        th.getClass();
        if ((th instanceof Exception) && r0c.b(th)) {
            return;
        }
        t4.b(th, new u95(kieVar, 12, th));
    }

    public static final s52 J(ChatConversationWithProjectReference chatConversationWithProjectReference, bg9 bg9Var) {
        chatConversationWithProjectReference.getClass();
        return new s52(chatConversationWithProjectReference.m209getUuidRjYBDck(), chatConversationWithProjectReference.getUpdated_at(), bg9Var.d(chatConversationWithProjectReference, ChatConversationWithProjectReference.Companion.serializer()));
    }

    public static final ArrayList K(List list, bg9 bg9Var) {
        ChatConversationWithProjectReference chatConversationWithProjectReference;
        list.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            s52 s52Var = (s52) it.next();
            try {
                s52Var.getClass();
                chatConversationWithProjectReference = (ChatConversationWithProjectReference) bg9Var.b(s52Var.c, ChatConversationWithProjectReference.Companion.serializer());
            } catch (Exception e2) {
                List list2 = xah.a;
                xah.f(e2, ij0.i("Failed to deserialize conversation ", s52Var.a), ozf.F, null, 24);
                chatConversationWithProjectReference = null;
            }
            if (chatConversationWithProjectReference != null) {
                arrayList.add(chatConversationWithProjectReference);
            }
        }
        return arrayList;
    }

    public static final void L(gg8 gg8Var, cv9 cv9Var) {
        boolean z = Build.VERSION.SDK_INT >= 31 && jz.b(cv9Var.E.F.p()).isHardwareAccelerated();
        boolean zB = ig8.b(gg8Var);
        if (zB && z) {
            zs1 wfeVar = gg8Var.m0;
            if (!(wfeVar instanceof wfe)) {
                wfeVar = new wfe(gg8Var);
            }
            gg8Var.s1(wfeVar);
            return;
        }
        if (zB) {
            zs1 zs1VarD = gg8Var.m0;
            if (!(zs1VarD instanceof dge)) {
                zs1VarD = dmk.d(gg8Var);
            }
            if (zs1VarD != null) {
                gg8Var.s1(zs1VarD);
                return;
            }
        }
        if (gg8Var.m0 instanceof n8f) {
            return;
        }
        gg8Var.s1(new n8f(gg8Var));
    }

    public static final iqb M(iqb iqbVar, wbj wbjVar) {
        return iqbVar.B(new k59(wbjVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0048, code lost:
    
        r1 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean N(android.content.Context r7) {
        /*
            boolean r0 = defpackage.knk.b
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            java.lang.Class<knk> r0 = defpackage.knk.class
            monitor-enter(r0)
            boolean r2 = defpackage.knk.b     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r1
        Lf:
            r7 = move-exception
            goto L53
        L11:
            r2 = r1
        L12:
            r3 = 2
            r4 = 0
            r5 = 0
            if (r2 > r3) goto L48
            android.os.UserManager r3 = defpackage.knk.a     // Catch: java.lang.Throwable -> Lf
            if (r3 != 0) goto L25
            java.lang.Class<android.os.UserManager> r3 = android.os.UserManager.class
            java.lang.Object r3 = r7.getSystemService(r3)     // Catch: java.lang.Throwable -> Lf
            android.os.UserManager r3 = (android.os.UserManager) r3     // Catch: java.lang.Throwable -> Lf
            defpackage.knk.a = r3     // Catch: java.lang.Throwable -> Lf
        L25:
            android.os.UserManager r3 = defpackage.knk.a     // Catch: java.lang.Throwable -> Lf
            if (r3 != 0) goto L2a
            goto L4d
        L2a:
            boolean r6 = r3.isUserUnlocked()     // Catch: java.lang.Throwable -> Lf java.lang.NullPointerException -> L3b
            if (r6 != 0) goto L49
            android.os.UserHandle r6 = android.os.Process.myUserHandle()     // Catch: java.lang.Throwable -> Lf java.lang.NullPointerException -> L3b
            boolean r7 = r3.isUserRunning(r6)     // Catch: java.lang.Throwable -> Lf java.lang.NullPointerException -> L3b
            if (r7 != 0) goto L48
            goto L49
        L3b:
            r3 = move-exception
            java.lang.String r5 = "DirectBootUtils"
            java.lang.String r6 = "Failed to check if user is unlocked."
            android.util.Log.w(r5, r6, r3)     // Catch: java.lang.Throwable -> Lf
            defpackage.knk.a = r4     // Catch: java.lang.Throwable -> Lf
            int r2 = r2 + 1
            goto L12
        L48:
            r1 = r5
        L49:
            if (r1 == 0) goto L4d
            defpackage.knk.a = r4     // Catch: java.lang.Throwable -> Lf
        L4d:
            if (r1 == 0) goto L51
            defpackage.knk.b = r1     // Catch: java.lang.Throwable -> Lf
        L51:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r1
        L53:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.knk.N(android.content.Context):boolean");
    }

    public static p60 a(zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3, bz7 bz7Var, bz7 bz7Var2, w3c w3cVar, zy7 zy7Var4, xzh xzhVar, bz7 bz7Var3, int i2) {
        return new p60(w3cVar, zy7Var, zy7Var2, zy7Var4, new zcd(15), bz7Var2, (i2 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : xzhVar, bz7Var, zy7Var3, bz7Var3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v64 */
    public static final void b(final k3g k3gVar, final boolean z, final zy7 zy7Var, final bz7 bz7Var, final rz7 rz7Var, final zy7 zy7Var2, final ybg ybgVar, final iqb iqbVar, qi3 qi3Var, m9j m9jVar, final WelcomeNotice welcomeNotice, final mnc mncVar, ld4 ld4Var, final int i2) {
        final qi3 qi3Var2;
        final m9j m9jVar2;
        qi3 qi3Var3;
        m9j m9jVar3;
        int i3;
        int i4;
        Object obj;
        Context context;
        ?? r3;
        Object obj2;
        int i5;
        Object obj3;
        tp4 tp4Var;
        Object obj4;
        kja kjaVar;
        int i6;
        lz1 lz1Var = jd4.a;
        zy7Var.getClass();
        bz7Var.getClass();
        rz7Var.getClass();
        zy7Var2.getClass();
        ybgVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1598082754);
        int i7 = i2 | (e18Var.f(k3gVar) ? 4 : 2) | (e18Var.g(z) ? 32 : 16) | (e18Var.h(bz7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.h(rz7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var.h(zy7Var2) ? 131072 : 65536) | (e18Var.f(ybgVar) ? FreeTypeConstants.FT_LOAD_COLOR : 524288) | (e18Var.f(iqbVar) ? 8388608 : 4194304) | 301989888;
        if (e18Var.Q(i7 & 1, ((i7 & 306783379) == 306783378 && ((((e18Var.d(welcomeNotice == null ? -1 : welcomeNotice.ordinal()) ? (char) 4 : (char) 2) | (e18Var.f(mncVar) ? ' ' : (char) 16)) == true ? 1 : 0) & 19) == 18) ? false : true)) {
            e18Var.V();
            tp4 tp4Var2 = null;
            if ((i2 & 1) == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(qi3.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                qi3Var3 = (qi3) objN;
                m7f m7fVarB = gr9.b(e18Var);
                boolean zH = e18Var.h(m7fVarB);
                Object objN2 = e18Var.N();
                Object obj5 = objN2;
                if (zH || objN2 == lz1Var) {
                    g03 g03Var = new g03(m7fVarB, 5);
                    e18Var.k0(g03Var);
                    obj5 = g03Var;
                }
                kce kceVar = jce.a;
                m9jVar3 = (m9j) fd9.r0(kceVar.b(m9j.class), oq5.B(kceVar.b(m9j.class)), (bz7) obj5, e18Var);
                i3 = i7 & (-2113929217);
            } else {
                e18Var.T();
                i3 = i7 & (-2113929217);
                qi3Var3 = qi3Var;
                m9jVar3 = m9jVar;
            }
            e18Var.q();
            boolean zH2 = e18Var.h(qi3Var3);
            Object objN3 = e18Var.N();
            if (zH2 || objN3 == lz1Var) {
                i4 = 0;
                ya0 ya0Var = new ya0(qi3Var3, tp4Var2, i4);
                e18Var.k0(ya0Var);
                obj = ya0Var;
            } else {
                i4 = 0;
                obj = objN3;
            }
            csg.g((bz7) obj, e18Var, i4, 1);
            final long j2 = ((gwa) e18Var.j(jwa.a)).a.n;
            umg umgVar = w00.b;
            Context context2 = (Context) e18Var.j(umgVar);
            zy1 zy1Var = m9jVar3.n;
            qi3 qi3Var4 = qi3Var3;
            int i8 = i3;
            boolean zF2 = ((i3 & 7168) == 2048) | e18Var.f(m9jVar3) | e18Var.e(j2) | e18Var.h(context2) | ((i8 & 57344) == 16384) | ((i8 & 458752) == 131072);
            Object objN4 = e18Var.N();
            if (zF2 || objN4 == lz1Var) {
                objN4 = new za0(bz7Var, m9jVar3, j2, context2, rz7Var, zy7Var2, null);
                context = context2;
                e18Var.k0(objN4);
            } else {
                context = context2;
            }
            x44.b(zy1Var, (pz7) objN4, e18Var, 0);
            zni.g(m9jVar3.o, ybgVar, e18Var, (i8 >> 15) & 112);
            SSOIntentData.Companion.getClass();
            gh2 gh2Var = SSOIntentData.channel;
            boolean zF3 = e18Var.f(m9jVar3);
            Object objN5 = e18Var.N();
            if (zF3 || objN5 == lz1Var) {
                r3 = 0;
                ab0 ab0Var = new ab0((Object) m9jVar3, (tp4) null, (int) (false ? 1 : 0));
                e18Var.k0(ab0Var);
                obj2 = ab0Var;
            } else {
                r3 = 0;
                obj2 = objN5;
            }
            x44.b(gh2Var, (pz7) obj2, e18Var, r3);
            final q9j q9jVar = (q9j) m9jVar3.v.getValue();
            if (q9jVar == null) {
                e18Var.a0(-1227366486);
                e18Var.p(r3);
                i5 = 1;
            } else {
                e18Var.a0(-1227366485);
                boolean zF4 = e18Var.f(m9jVar3);
                Object objN6 = e18Var.N();
                Object obj6 = objN6;
                if (zF4 || objN6 == lz1Var) {
                    ta0 ta0Var = new ta0(m9jVar3, 0);
                    e18Var.k0(ta0Var);
                    obj6 = ta0Var;
                }
                zy7 zy7Var3 = (zy7) obj6;
                boolean zF5 = e18Var.f(m9jVar3) | e18Var.f(q9jVar) | e18Var.e(j2) | e18Var.h(context);
                Object objN7 = e18Var.N();
                if (zF5 || objN7 == lz1Var) {
                    final Context context3 = context;
                    final m9j m9jVar4 = m9jVar3;
                    objN7 = new zy7() { // from class: ua0
                        @Override // defpackage.zy7
                        public final Object a() {
                            m9j m9jVar5 = m9jVar4;
                            m9jVar5.v.setValue(null);
                            m9jVar5.S(j2, context3, q9jVar.b);
                            return iei.a;
                        }
                    };
                    e18Var.k0(objN7);
                }
                zy7 zy7Var4 = (zy7) objN7;
                boolean zF6 = e18Var.f(m9jVar3) | e18Var.f(q9jVar);
                Object objN8 = e18Var.N();
                if (zF6 || objN8 == lz1Var) {
                    i5 = 1;
                    l80 l80Var = new l80(m9jVar3, i5, q9jVar);
                    e18Var.k0(l80Var);
                    obj3 = l80Var;
                } else {
                    i5 = 1;
                    obj3 = objN8;
                }
                j(zy7Var3, zy7Var4, (zy7) obj3, e18Var, 0);
                e18Var.p(false);
            }
            e18Var.a0(-693128715);
            Context context4 = (Context) e18Var.j(umgVar);
            if (((Boolean) e18Var.j(p59.a)).booleanValue()) {
                e18Var.a0(1205346602);
                Object objN9 = e18Var.N();
                if (objN9 == lz1Var) {
                    objN9 = kja.i;
                    if (objN9 == null) {
                        objN9 = ez1.N(context4);
                    }
                    e18Var.k0(objN9);
                }
                kjaVar = (kja) objN9;
                i6 = 0;
                e18Var.p(false);
                e18Var.p(false);
                tp4Var = null;
            } else {
                e18Var.a0(1205441741);
                e18Var.p(false);
                e18Var.a0(-1168520582);
                m7f m7fVarB2 = gr9.b(e18Var);
                e18Var.a0(-1633490746);
                boolean zF7 = e18Var.f(null) | e18Var.f(m7fVarB2);
                Object objN10 = e18Var.N();
                if (zF7 || objN10 == lz1Var) {
                    objN10 = m7fVarB2.a(jce.a.b(h86.class), null, null);
                    e18Var.k0(objN10);
                }
                e18Var.p(false);
                e18Var.p(false);
                h86 h86Var = (h86) objN10;
                kja kjaVar2 = kja.i;
                boolean zH3 = e18Var.h(h86Var) | e18Var.h(context4);
                Object objN11 = e18Var.N();
                if (zH3 || objN11 == lz1Var) {
                    tp4Var = null;
                    zw zwVar = new zw(h86Var, context4, tp4Var, 17);
                    e18Var.k0(zwVar);
                    obj4 = zwVar;
                } else {
                    tp4Var = null;
                    obj4 = objN11;
                }
                kjaVar = (kja) mpk.R(e18Var, (pz7) obj4, kjaVar2).getValue();
                i6 = 0;
                e18Var.p(false);
            }
            kja kjaVar3 = kjaVar;
            if ((i8 & 112) != 32) {
                i5 = i6;
            }
            int i9 = (e18Var.f(kjaVar3) ? 1 : 0) | i5;
            Object objN12 = e18Var.N();
            if (i9 != 0 || objN12 == lz1Var) {
                bb0 bb0Var = new bb0(z, kjaVar3, zy7Var, tp4Var, 0);
                e18Var.k0(bb0Var);
                objN12 = bb0Var;
            }
            fd9.i(e18Var, (pz7) objN12, kjaVar3);
            Boolean boolValueOf = Boolean.valueOf(z);
            Object objN13 = e18Var.N();
            Object obj7 = objN13;
            if (objN13 == lz1Var) {
                b8 b8Var = new b8(12);
                e18Var.k0(b8Var);
                obj7 = b8Var;
            }
            m9j m9jVar5 = m9jVar3;
            xn5.G(boolValueOf, iqbVar, (bz7) obj7, null, "animatedWelcomeStage", null, fd9.q0(-2033364513, new va0(k3gVar, m9jVar5, kjaVar3, welcomeNotice, mncVar, context, 0), e18Var), e18Var, ((i8 >> 3) & 14) | 1597824 | ((i8 >> 18) & 112), 40);
            qi3Var2 = qi3Var4;
            m9jVar2 = m9jVar5;
        } else {
            e18Var.T();
            qi3Var2 = qi3Var;
            m9jVar2 = m9jVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7(z, zy7Var, bz7Var, rz7Var, zy7Var2, ybgVar, iqbVar, qi3Var2, m9jVar2, welcomeNotice, mncVar, i2) { // from class: wa0
                public final /* synthetic */ boolean F;
                public final /* synthetic */ zy7 G;
                public final /* synthetic */ bz7 H;
                public final /* synthetic */ rz7 I;
                public final /* synthetic */ zy7 J;
                public final /* synthetic */ ybg K;
                public final /* synthetic */ iqb L;
                public final /* synthetic */ qi3 M;
                public final /* synthetic */ m9j N;
                public final /* synthetic */ WelcomeNotice O;
                public final /* synthetic */ mnc P;

                @Override // defpackage.pz7
                public final Object invoke(Object obj8, Object obj9) {
                    ((Integer) obj9).getClass();
                    int iP0 = x44.p0(385);
                    knk.b(this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, (ld4) obj8, iP0);
                    return iei.a;
                }
            };
        }
    }

    public static g5c c(zy7 zy7Var, zy7 zy7Var2, bz7 bz7Var, zy7 zy7Var3, bz7 bz7Var2, w3c w3cVar, nlh nlhVar, xzh xzhVar, bz7 bz7Var3, tzh tzhVar, int i2) {
        return new g5c(w3cVar, zy7Var, zy7Var2, (i2 & 64) != 0 ? new nlh(13) : nlhVar, bz7Var2, xzhVar, bz7Var, zy7Var3, bz7Var3, (i2 & 512) != 0 ? new oob(19) : tzhVar, 2);
    }

    public static final void d(a6i a6iVar, iqb iqbVar, kl7 kl7Var, bz7 bz7Var, ta4 ta4Var, ld4 ld4Var, int i2) {
        bz7 bz7Var2;
        rok rokVar = a6iVar.a;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1877370462);
        int i3 = (i2 & 6) == 0 ? (e18Var.f(a6iVar) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 |= e18Var.f(iqbVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= e18Var.h(kl7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        int i4 = i3 | 3072;
        if ((i2 & 24576) == 0) {
            i4 |= e18Var.h(ta4Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if (e18Var.Q(i4 & 1, (i4 & 9363) != 9362)) {
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = bx.b0;
                e18Var.k0(objN);
            }
            bz7Var2 = (bz7) objN;
            Object objN2 = e18Var.N();
            Object obj = objN2;
            if (objN2 == lz1Var) {
                kdg kdgVar = new kdg();
                kdgVar.add(rokVar.q0());
                e18Var.k0(kdgVar);
                obj = kdgVar;
            }
            kdg kdgVar2 = (kdg) obj;
            Object objN3 = e18Var.N();
            if (objN3 == lz1Var) {
                long[] jArr = u6f.a;
                objN3 = new ewb();
                e18Var.k0(objN3);
            }
            ewb ewbVar = (ewb) objN3;
            lsc lscVar = a6iVar.d;
            if (x44.r(rokVar.q0(), lscVar.getValue())) {
                e18Var.a0(321145192);
                if (kdgVar2.size() == 1 && x44.r(kdgVar2.get(0), lscVar.getValue())) {
                    e18Var.a0(321469824);
                    e18Var.p(false);
                } else {
                    e18Var.a0(321279546);
                    boolean z = (i4 & 14) == 4;
                    Object objN4 = e18Var.N();
                    if (z || objN4 == lz1Var) {
                        objN4 = new e0(12, a6iVar);
                        e18Var.k0(objN4);
                    }
                    b54.w0((bz7) objN4, kdgVar2);
                    ewbVar.a();
                    e18Var.p(false);
                }
                e18Var.p(false);
            } else {
                e18Var.a0(321475776);
                e18Var.p(false);
            }
            if (ewbVar.b(lscVar.getValue())) {
                e18Var.a0(322279296);
                e18Var.p(false);
            } else {
                e18Var.a0(321536443);
                ListIterator listIterator = kdgVar2.listIterator();
                int i5 = 0;
                while (true) {
                    c8a c8aVar = (c8a) listIterator;
                    if (!c8aVar.hasNext()) {
                        i5 = -1;
                        break;
                    } else if (x44.r(bz7Var2.invoke(c8aVar.next()), bz7Var2.invoke(lscVar.getValue()))) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (i5 == -1) {
                    kdgVar2.add(lscVar.getValue());
                } else {
                    kdgVar2.set(i5, lscVar.getValue());
                }
                ewbVar.a();
                int size = kdgVar2.size();
                for (int i6 = 0; i6 < size; i6++) {
                    Object obj2 = kdgVar2.get(i6);
                    ewbVar.m(obj2, fd9.q0(-934471669, new lc5(a6iVar, kl7Var, obj2, ta4Var), e18Var));
                }
                e18Var.p(false);
            }
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVar);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, o5bVarD);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.V(e18Var, Integer.valueOf(iHashCode), cd4.g);
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            e18Var.a0(-1312707512);
            int size2 = kdgVar2.size();
            for (int i7 = 0; i7 < size2; i7++) {
                Object obj3 = kdgVar2.get(i7);
                e18Var.X(1171574969, bz7Var2.invoke(obj3));
                pz7 pz7Var = (pz7) ewbVar.g(obj3);
                if (pz7Var == null) {
                    e18Var.a0(1959122128);
                } else {
                    e18Var.a0(1171576145);
                    pz7Var.invoke(e18Var, 0);
                }
                e18Var.p(false);
                e18Var.p(false);
            }
            e18Var.p(false);
            e18Var.p(true);
        } else {
            e18Var.T();
            bz7Var2 = bz7Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new mc5(a6iVar, iqbVar, kl7Var, bz7Var2, ta4Var, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(java.lang.Object r14, defpackage.iqb r15, defpackage.kl7 r16, java.lang.String r17, defpackage.ta4 r18, defpackage.ld4 r19, int r20, int r21) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.knk.e(java.lang.Object, iqb, kl7, java.lang.String, ta4, ld4, int, int):void");
    }

    public static final void f(String str, mkf mkfVar, sa6 sa6Var, ld4 ld4Var, int i2) {
        sa6 sa6Var2;
        sa6 sa6Var3;
        int i3;
        Object zwVar;
        m4a m4aVar;
        str.getClass();
        mkfVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(900943376);
        int i4 = i2 | (e18Var.f(str) ? 4 : 2) | (e18Var.f(mkfVar) ? 32 : 16) | FreeTypeConstants.FT_LOAD_PEDANTIC;
        if (e18Var.Q(i4 & 1, (i4 & 147) != 146)) {
            e18Var.V();
            int i5 = i2 & 1;
            tp4 tp4Var = null;
            lz1 lz1Var = jd4.a;
            if (i5 == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(sa6.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                sa6Var3 = (sa6) objN;
                i3 = i4 & (-897);
            } else {
                e18Var.T();
                i3 = i4 & (-897);
                sa6Var3 = sa6Var;
            }
            e18Var.q();
            Context context = (Context) e18Var.j(w00.b);
            boolean zH = ((i3 & 112) == 32) | e18Var.h(sa6Var3);
            Object objN2 = e18Var.N();
            if (zH || objN2 == lz1Var) {
                objN2 = new dx(sa6Var3, mkfVar, tp4Var, 24);
                e18Var.k0(objN2);
            }
            fd9.j(sa6Var3, mkfVar, (pz7) objN2, e18Var);
            m4a m4aVar2 = (m4a) e18Var.j(tda.a);
            ChatId chatIdM978boximpl = ChatId.m978boximpl(str);
            boolean zH2 = e18Var.h(m4aVar2) | e18Var.h(sa6Var3) | ((i3 & 14) == 4) | e18Var.h(context);
            Object objN3 = e18Var.N();
            if (zH2 || objN3 == lz1Var) {
                m4aVar = m4aVar2;
                zwVar = new zw(m4aVar, sa6Var3, str, context, null, 10);
                e18Var.k0(zwVar);
            } else {
                zwVar = objN3;
                m4aVar = m4aVar2;
            }
            fd9.k(sa6Var3, m4aVar, chatIdM978boximpl, (pz7) zwVar, e18Var);
            sa6Var2 = sa6Var3;
        } else {
            e18Var.T();
            sa6Var2 = sa6Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new m63(str, mkfVar, sa6Var2, i2, 9);
        }
    }

    public static mf9 g() {
        return new mf9(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(defpackage.iqb r29, defpackage.x0a r30, defpackage.mnc r31, boolean r32, defpackage.jo0 r33, defpackage.qt r34, defpackage.eo7 r35, boolean r36, defpackage.b20 r37, final defpackage.bz7 r38, defpackage.ld4 r39, final int r40, final int r41) {
        /*
            Method dump skipped, instruction units count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.knk.h(iqb, x0a, mnc, boolean, jo0, qt, eo7, boolean, b20, bz7, ld4, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(defpackage.iqb r28, defpackage.x0a r29, defpackage.mnc r30, defpackage.go0 r31, defpackage.wo1 r32, defpackage.eo7 r33, boolean r34, defpackage.b20 r35, defpackage.bz7 r36, defpackage.ld4 r37, int r38, int r39) {
        /*
            Method dump skipped, instruction units count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.knk.i(iqb, x0a, mnc, go0, wo1, eo7, boolean, b20, bz7, ld4, int, int):void");
    }

    public static final void j(zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3, ld4 ld4Var, int i2) {
        e18 e18Var;
        zy7Var.getClass();
        zy7Var2.getClass();
        zy7Var3.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-12939066);
        int i3 = 2;
        int i4 = i2 | (e18Var2.h(zy7Var) ? 4 : 2) | (e18Var2.h(zy7Var2) ? 32 : 16) | (e18Var2.h(zy7Var3) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var2.Q(i4 & 1, (i4 & 147) != 146)) {
            e18Var = e18Var2;
            trk.b(zy7Var, fd9.q0(-1845357309, new wh(i3, zy7Var2), e18Var2), null, fd9.q0(-2110004799, new wh(3, zy7Var3), e18Var2), yuj.c, null, null, 0L, 0L, 0L, 0L, null, e18Var, (i4 & 14) | 199728, 0, 16340);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xa0(zy7Var, zy7Var2, zy7Var3, i2, 0);
        }
    }

    public static final void k(w1i w1iVar, zy7 zy7Var, String str, bz7 bz7Var, bz7 bz7Var2, bz7 bz7Var3, iqb iqbVar, ta4 ta4Var, ld4 ld4Var, int i2) {
        iqb iqbVar2;
        zy7Var.getClass();
        str.getClass();
        bz7Var.getClass();
        bz7Var2.getClass();
        bz7Var3.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1086035460);
        int i3 = 1572864 | i2 | (e18Var.f(w1iVar) ? 4 : 2) | (e18Var.h(zy7Var) ? 32 : 16) | (e18Var.f(str) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(bz7Var) ? 2048 : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.h(bz7Var2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var.h(bz7Var3) ? 131072 : 65536);
        if (!e18Var.Q(i3 & 1, (4793491 & i3) != 4793490)) {
            e18Var.T();
            iqbVar2 = iqbVar;
        } else {
            if (w1iVar == null) {
                e18Var.a0(94346518);
                ta4Var.invoke(e18Var, 6);
                e18Var.p(false);
                r7e r7eVarS = e18Var.s();
                if (r7eVarS != null) {
                    r7eVarS.d = new hx2(w1iVar, zy7Var, str, bz7Var, bz7Var2, bz7Var3, ta4Var, i2);
                    return;
                }
                return;
            }
            e18Var.a0(94384958);
            e18Var.p(false);
            boolean zF = e18Var.f(w1iVar.a());
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (zF || objN == lz1Var) {
                objN = mpk.P(Boolean.FALSE);
                e18Var.k0(objN);
            }
            nwb nwbVar = (nwb) objN;
            String strA = w1iVar.a();
            int i4 = i3 & 14;
            boolean zF2 = e18Var.f(nwbVar) | ((i3 & 7168) == 2048) | (i4 == 4);
            Object objN2 = e18Var.N();
            if (zF2 || objN2 == lz1Var) {
                ba9 ba9Var = new ba9(bz7Var, w1iVar, nwbVar, null, 7);
                e18Var.k0(ba9Var);
                objN2 = ba9Var;
            }
            fd9.i(e18Var, (pz7) objN2, strA);
            boolean zBooleanValue = ((Boolean) nwbVar.getValue()).booleanValue();
            long j2 = gm3.a(e18Var).M;
            long j3 = gm3.a(e18Var).M;
            ta4 ta4VarQ0 = fd9.q0(-1745573372, new ka0(w1iVar, str, nwbVar, zy7Var, bz7Var3, bz7Var2), e18Var);
            boolean zF3 = e18Var.f(nwbVar) | ((57344 & i3) == 16384) | (i4 == 4);
            Object objN3 = e18Var.N();
            if (zF3 || objN3 == lz1Var) {
                objN3 = new ka1(bz7Var2, w1iVar, nwbVar, 23);
                e18Var.k0(objN3);
            }
            fqb fqbVar = fqb.E;
            bik.a(zBooleanValue, ta4Var, ta4VarQ0, (zy7) objN3, fqbVar, j2, j3, 8.0f, e18Var, 100688304, 32);
            iqbVar2 = fqbVar;
        }
        r7e r7eVarS2 = e18Var.s();
        if (r7eVarS2 != null) {
            r7eVarS2.d = new j03(w1iVar, zy7Var, str, bz7Var, bz7Var2, bz7Var3, iqbVar2, ta4Var, i2);
        }
    }

    public static final void l(String str, String str2, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i2) {
        iqb iqbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(108855891);
        int i3 = i2 | (e18Var.f(str) ? 4 : 2) | (e18Var.f(str2) ? 32 : 16) | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | 3072;
        if (e18Var.Q(i3 & 1, (i3 & 1171) != 1170)) {
            vve vveVarB = xve.b(16.0f);
            fqb fqbVar = fqb.E;
            iqb iqbVarU = b.u(gb9.J(androidx.compose.foundation.b.c(xn5.V(fqbVar, vveVarB), false, str2, null, null, zy7Var, 13), 16.0f), 40.0f, 230.0f);
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarU);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, o5bVarD);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            tjh.b(str, null, gm3.a(e18Var).n, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).e, e18Var, i3 & 14, 0, 131066);
            e18Var = e18Var;
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new eob(str, str2, zy7Var, iqbVar2, i2, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m(java.io.File r4, defpackage.bz7 r5, defpackage.vp4 r6) throws java.io.IOException {
        /*
            boolean r0 = r6 instanceof defpackage.oj7
            if (r0 == 0) goto L13
            r0 = r6
            oj7 r0 = (defpackage.oj7) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            oj7 r0 = new oj7
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.F
            int r1 = r0.G
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            java.io.File r4 = r0.E
            defpackage.sf5.h0(r6)     // Catch: java.io.IOException -> L27
            return r6
        L27:
            r5 = move-exception
            goto L41
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L30:
            defpackage.sf5.h0(r6)
            r0.E = r4     // Catch: java.io.IOException -> L27
            r0.G = r2     // Catch: java.io.IOException -> L27
            java.lang.Object r4 = r5.invoke(r0)     // Catch: java.io.IOException -> L27
            m45 r5 = defpackage.m45.E
            if (r4 != r5) goto L40
            return r5
        L40:
            return r4
        L41:
            boolean r6 = r5 instanceof androidx.datastore.core.CorruptionException
            if (r6 == 0) goto L46
            throw r5
        L46:
            java.io.IOException r4 = defpackage.flk.e(r4, r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.knk.m(java.io.File, bz7, vp4):java.lang.Object");
    }

    public static final int n(long[] jArr, long j2) {
        int length = jArr.length - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (i2 + length) >>> 1;
            long j3 = jArr[i3];
            if (j2 > j3) {
                i2 = i3 + 1;
            } else {
                if (j2 >= j3) {
                    return i3;
                }
                length = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final void o(c45 c45Var, CancellationException cancellationException) {
        lf9 lf9Var = (lf9) c45Var.x0(dd8.J);
        if (lf9Var != null) {
            lf9Var.d(cancellationException);
        }
    }

    public static final Object p(lf9 lf9Var, tp4 tp4Var) {
        lf9Var.d(null);
        Object objN = lf9Var.n(tp4Var);
        return objN == m45.E ? objN : iei.a;
    }

    public static void q(String str, Object obj) {
        if (obj != null) {
            return;
        }
        mr9.h(str);
    }

    public static jq5 r(bb1 bb1Var, int i2) {
        int i3 = (i2 & 2) != 0 ? 0 : 1;
        bb1Var.getClass();
        jq5 jq5Var = new jq5(bb1Var, false, i3);
        jq5Var.d.a(jq5Var, jq5.e[0], true);
        jq5Var.d();
        return jq5Var;
    }

    public static final iqb s(iqb iqbVar, mnc mncVar) {
        return iqbVar.B(new nnc(mncVar));
    }

    public static final iqb t(iqb iqbVar, c5g c5gVar) {
        return iqbVar.B(new gei(c5gVar));
    }

    public static final void u(c45 c45Var) {
        lf9 lf9Var = (lf9) c45Var.x0(dd8.J);
        if (lf9Var != null && !lf9Var.c()) {
            throw lf9Var.H();
        }
    }

    public static oa v(qh9 qh9Var) {
        String strM;
        String strM2;
        try {
            bh9 bh9VarS = qh9Var.s("plan");
            wa waVarD = (bh9VarS == null || (strM2 = bh9VarS.m()) == null) ? null : tlk.d(strM2);
            bh9 bh9VarS2 = qh9Var.s("session_precondition");
            int i2 = 0;
            if (bh9VarS2 != null && (strM = bh9VarS2.m()) != null) {
                int[] iArrH = sq6.H(7);
                int length = iArrH.length;
                while (i2 < length) {
                    int i3 = iArrH[i2];
                    if (sq6.i(i3).equals(strM)) {
                        i2 = i3;
                    } else {
                        i2++;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            return new oa(waVarD, i2);
        } catch (IllegalStateException e2) {
            pmf.j("Unable to parse json into type DdSession", e2);
            return null;
        } catch (NullPointerException e3) {
            pmf.j("Unable to parse json into type DdSession", e3);
            return null;
        } catch (NumberFormatException e4) {
            pmf.j("Unable to parse json into type DdSession", e4);
            return null;
        }
    }

    public static Locale x(ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        Configuration configuration = (Configuration) e18Var.j(w00.a);
        boolean zF = e18Var.f(configuration);
        Object objN = e18Var.N();
        if (zF || objN == jd4.a) {
            LocaleList locales = configuration.getLocales();
            locales.getClass();
            objN = (Locale) w44.L0(mpk.f0(locales));
            e18Var.k0(objN);
        }
        return (Locale) objN;
    }

    public static Map y(jye jyeVar) {
        Map mapB;
        jye jyeVarA = jyeVar.a();
        return (jyeVarA == null || (mapB = jyeVarA.b()) == null) ? nm6.E : mapB;
    }

    public static final lf9 z(c45 c45Var) {
        lf9 lf9Var = (lf9) c45Var.x0(dd8.J);
        if (lf9Var != null) {
            return lf9Var;
        }
        xh6.d("Current context doesn't contain Job in it: ", c45Var);
        return null;
    }

    public abstract l9e w();
}
