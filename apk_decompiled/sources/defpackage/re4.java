package defpackage;

import androidx.health.platform.client.proto.g;
import com.segment.analytics.kotlin.core.EventType;
import java.lang.annotation.Annotation;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class re4 extends ts9 implements zy7 {
    public static final re4 G;
    public static final re4 H;
    public static final re4 I;
    public static final re4 J;
    public static final re4 K;
    public static final re4 L;
    public static final re4 M;
    public static final re4 N;
    public static final re4 O;
    public static final re4 P;
    public static final re4 Q;
    public static final re4 R;
    public static final re4 S;
    public static final re4 T;
    public static final re4 U;
    public static final re4 V;
    public static final re4 W;
    public static final re4 X;
    public static final re4 Y;
    public static final re4 Z;
    public static final re4 a0;
    public static final re4 b0;
    public static final re4 c0;
    public static final re4 d0;
    public static final re4 e0;
    public static final re4 f0;
    public static final re4 g0;
    public static final re4 h0;
    public final /* synthetic */ int F;

    static {
        int i = 0;
        G = new re4(i, 0);
        H = new re4(i, 1);
        I = new re4(i, 2);
        J = new re4(i, 3);
        K = new re4(i, 4);
        L = new re4(i, 5);
        M = new re4(i, 6);
        N = new re4(i, 7);
        O = new re4(i, 8);
        P = new re4(i, 9);
        Q = new re4(i, 10);
        R = new re4(i, 11);
        S = new re4(i, 12);
        T = new re4(i, 13);
        U = new re4(i, 14);
        V = new re4(i, 15);
        W = new re4(i, 16);
        X = new re4(i, 17);
        Y = new re4(i, 18);
        Z = new re4(i, 19);
        a0 = new re4(i, 20);
        b0 = new re4(i, 21);
        c0 = new re4(i, 22);
        d0 = new re4(i, 23);
        e0 = new re4(i, 24);
        f0 = new re4(i, 25);
        g0 = new re4(i, 26);
        h0 = new re4(i, 27);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ re4(int i, int i2) {
        super(i);
        this.F = i2;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.F;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                return null;
            case 1:
                ve4.b("LocalTextToolbar");
                throw null;
            case 2:
                ve4.b("LocalUriHandler");
                throw null;
            case 3:
                ve4.b("LocalViewConfiguration");
                throw null;
            case 4:
                ve4.b("LocalWindowInfo");
                throw null;
            case 5:
                return ieiVar;
            case 6:
                return "Build ID is not found in the application assets. If you are using obfuscation, please use Datadog Gradle Plugin 1.13.0 or above to be able to de-obfuscate stacktraces.";
            case 7:
                return ieiVar;
            case 8:
                String property = System.getProperty("os.arch");
                return property == null ? "unknown" : property;
            case 9:
                return Integer.valueOf(Runtime.getRuntime().availableProcessors());
            case 10:
                return TimeZone.getDefault().getID();
            case 11:
                return Boolean.TRUE;
            case 12:
                EventType[] eventTypeArrValues = EventType.values();
                String[] strArr = {"track", "screen", "alias", "identify", "group"};
                Annotation[][] annotationArr = {null, null, null, null, null};
                eventTypeArrValues.getClass();
                eq6 eq6Var = new eq6("com.segment.analytics.kotlin.core.EventType", eventTypeArrValues.length);
                int length = eventTypeArrValues.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    EventType eventType = eventTypeArrValues[i2];
                    int i4 = i3 + 1;
                    String strName = (String) mp0.I0(i3, strArr);
                    if (strName == null) {
                        strName = eventType.name();
                    }
                    eq6Var.j(strName, false);
                    Annotation[] annotationArr2 = (Annotation[]) mp0.I0(i3, annotationArr);
                    if (annotationArr2 != null) {
                        for (Annotation annotation : annotationArr2) {
                            annotation.getClass();
                            int i5 = eq6Var.d;
                            List[] listArr = eq6Var.f;
                            List arrayList = listArr[i5];
                            if (arrayList == null) {
                                arrayList = new ArrayList(1);
                                listArr[eq6Var.d] = arrayList;
                            }
                            arrayList.add(annotation);
                        }
                    }
                    i2++;
                    i3 = i4;
                }
                lq6 lq6Var = new lq6("com.segment.analytics.kotlin.core.EventType", (Enum[]) eventTypeArrValues);
                lq6Var.c = eq6Var;
                return lq6Var;
            case 13:
                return Boolean.FALSE;
            case 14:
                return new av9(3);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return new av9(2);
            case 16:
                return "[ViewNetworkSettledMetric] Not all the initial resources were stopped for this view";
            case g.MAX_FIELD_NUMBER /* 17 */:
                return dqk.d();
            case g.AVG_FIELD_NUMBER /* 18 */:
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return null;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return new SecureRandom();
            case 21:
                return "[Mobile Metric] App Launch TTID";
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return "Slow frames monitoring enabled.";
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new lja(21);
            case 24:
                return null;
            case BuildConfig.VERSION_CODE /* 25 */:
                String property2 = System.getProperty("os.version");
                Pattern patternCompile = Pattern.compile("android[0-9][0-9]");
                patternCompile.getClass();
                property2.getClass();
                Matcher matcher = patternCompile.matcher(property2);
                matcher.getClass();
                ova ovaVarL = dgj.l(matcher, 0, property2);
                if (ovaVarL != null) {
                    property2 = ovaVarL.c();
                } else {
                    Pattern patternCompile2 = Pattern.compile("[0-9]+");
                    patternCompile2.getClass();
                    Matcher matcher2 = patternCompile2.matcher(property2);
                    matcher2.getClass();
                    ova ovaVarL2 = dgj.l(matcher2, 0, property2);
                    if (ovaVarL2 != null) {
                        property2 = ovaVarL2.c();
                    }
                }
                return sta.h0(new cpc("os", System.getProperty("os.name") + '-' + property2), new cpc("interpreter", System.getProperty("java.vendor") + '-' + System.getProperty("java.version")), new cpc("library", "analytics.kotlin"), new cpc("library_version", "1.19.2"));
            case 26:
                return ieiVar;
            default:
                return "[Mobile Metric] RUM View Ended";
        }
    }
}
