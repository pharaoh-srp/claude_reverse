package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import androidx.health.platform.client.proto.g;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.anthropic.claude.api.account.GrowthBookExperimentResult;
import com.anthropic.claude.core.telemetry.SilentException;
import com.anthropic.claude.types.environment.AppEnvironment;
import com.anthropic.claude.types.strings.AccountId;
import com.anthropic.claude.types.strings.AppSessionId;
import com.anthropic.claude.types.strings.OrganizationId;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import okio.FileSystem;
import org.koin.android.error.MissingAndroidContextException;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z35 implements pz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ z35(int i) {
        this.E = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) throws MissingAndroidContextException {
        a74 a74Var;
        GrowthBookExperimentResult experimentResult;
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = 0;
        switch (i) {
            case 0:
                c45 c45Var = (c45) obj;
                a45 a45Var = (a45) obj2;
                c45Var.getClass();
                a45Var.getClass();
                c45 c45VarS = c45Var.S(a45Var.getKey());
                im6 im6Var = im6.E;
                if (c45VarS == im6Var) {
                    return a45Var;
                }
                a5 a5Var = a5.G;
                e45 e45Var = (e45) c45VarS.x0(a5Var);
                if (e45Var == null) {
                    a74Var = new a74(a45Var, c45VarS);
                } else {
                    c45 c45VarS2 = c45VarS.S(a5Var);
                    if (c45VarS2 == im6Var) {
                        return new a74(e45Var, a45Var);
                    }
                    a74Var = new a74(e45Var, new a74(a45Var, c45VarS2));
                }
                return a74Var;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 2:
                return ((c45) obj).r0((a45) obj2);
            case 3:
                return ((c45) obj).r0((a45) obj2);
            case 4:
                ((m7f) obj).getClass();
                ((bsc) obj2).getClass();
                return new fed();
            case 5:
                m7f m7fVar = (m7f) obj;
                m7fVar.getClass();
                ((bsc) obj2).getClass();
                return (h86) m7fVar.a(jce.a.b(fed.class), null, null);
            case 6:
                ((m7f) obj).getClass();
                ((bsc) obj2).getClass();
                h86.a.getClass();
                return sq5.b;
            case 7:
                m7f m7fVar2 = (m7f) obj;
                m7fVar2.getClass();
                ((bsc) obj2).getClass();
                Context contextG = yb5.g(m7fVar2);
                kce kceVar = jce.a;
                return new nb5(contextG, (fk0) m7fVar2.a(kceVar.b(fk0.class), null, null), (pb5) m7fVar2.a(kceVar.b(pb5.class), null, null), (h86) m7fVar2.a(kceVar.b(h86.class), null, null));
            case 8:
                ((m7f) obj).getClass();
                ((bsc) obj2).getClass();
                return FileSystem.E;
            case 9:
                m7f m7fVar3 = (m7f) obj;
                m7fVar3.getClass();
                ((bsc) obj2).getClass();
                kce kceVar2 = jce.a;
                return new v4d((FileSystem) m7fVar3.a(kceVar2.b(FileSystem.class), null, null), (tf5) m7fVar3.a(kceVar2.b(tf5.class), null, null), (h86) m7fVar3.a(kceVar2.b(h86.class), null, null));
            case 10:
                ((m7f) obj).getClass();
                ((bsc) obj2).getClass();
                return new yg5();
            case 11:
                m7f m7fVar4 = (m7f) obj;
                m7fVar4.getClass();
                ((bsc) obj2).getClass();
                kce kceVar3 = jce.a;
                return new cm4((v4d) m7fVar4.a(kceVar3.b(v4d.class), null, null), ((AccountId) m7fVar4.a(kceVar3.b(AccountId.class), null, null)).m949unboximpl(), ((OrganizationId) m7fVar4.a(kceVar3.b(OrganizationId.class), null, null)).m1071unboximpl());
            case 12:
                m7f m7fVar5 = (m7f) obj;
                m7fVar5.getClass();
                ((bsc) obj2).getClass();
                return new m10(yb5.g(m7fVar5));
            case 13:
                keb kebVar = (keb) obj;
                Throwable cancellationException = (Throwable) obj2;
                kebVar.getClass();
                v84 v84Var = kebVar.b;
                if (cancellationException == null) {
                    cancellationException = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                v84Var.c0(new e94(cancellationException, false));
                return ieiVar;
            case 14:
                m7f m7fVar6 = (m7f) obj;
                m7fVar6.getClass();
                ((bsc) obj2).getClass();
                return new bl5(yb5.w(w1a.E, new hk5(m7fVar6, i2)));
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                m7f m7fVar7 = (m7f) obj;
                m7fVar7.getClass();
                ((bsc) obj2).getClass();
                SharedPreferences sharedPreferences = yb5.g(m7fVar7).getSharedPreferences("device_id_prefs", 0);
                sharedPreferences.getClass();
                return new m26(sharedPreferences);
            case 16:
                return (og6) ((of6) obj2).b.p();
            case g.MAX_FIELD_NUMBER /* 17 */:
                m7f m7fVar8 = (m7f) obj;
                m7fVar8.getClass();
                ((bsc) obj2).getClass();
                return new zf6((v4d) m7fVar8.a(jce.a.b(v4d.class), null, null));
            case g.AVG_FIELD_NUMBER /* 18 */:
                ((Integer) obj).intValue();
                rf6 rf6Var = (rf6) obj2;
                rf6Var.getClass();
                return rf6Var.a;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                m7f m7fVar9 = (m7f) obj;
                m7fVar9.getClass();
                ((bsc) obj2).getClass();
                kce kceVar4 = jce.a;
                return new x97((o7) m7fVar9.a(kceVar4.b(o7.class), null, null), (q7) m7fVar9.a(kceVar4.b(q7.class), null, null), (i8) m7fVar9.a(kceVar4.b(i8.class), null, null), (mn5) m7fVar9.a(kceVar4.b(mn5.class), null, null), (p87) m7fVar9.a(kceVar4.b(p87.class), null, null), (koi) m7fVar9.a(kceVar4.b(koi.class), null, null), (rc8) m7fVar9.a(kceVar4.b(rc8.class), null, null), ((doi) m7fVar9.a(kceVar4.b(doi.class), null, null)).a("experience"));
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                String str = (String) obj;
                Throwable th = (Throwable) obj2;
                str.getClass();
                SilentException.a(th != null ? new SilentException(str, th) : new SilentException(str), ozf.F, false, 2);
                return ieiVar;
            case 21:
                m7f m7fVar10 = (m7f) obj;
                m7fVar10.getClass();
                ((bsc) obj2).getClass();
                return new kg7((cd8) m7fVar10.a(jce.a.b(cd8.class), null, null));
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ((m7f) obj).getClass();
                ((bsc) obj2).getClass();
                return new lg7();
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                m7f m7fVar11 = (m7f) obj;
                m7fVar11.getClass();
                ((bsc) obj2).getClass();
                return (rc8) m7fVar11.a(jce.a.b(cd8.class), null, null);
            case 24:
                ((m7f) obj).getClass();
                ((bsc) obj2).getClass();
                return new rf7();
            case BuildConfig.VERSION_CODE /* 25 */:
                m7f m7fVar12 = (m7f) obj;
                m7fVar12.getClass();
                ((bsc) obj2).getClass();
                kce kceVar5 = jce.a;
                m26 m26Var = (m26) m7fVar12.a(kceVar5.b(m26.class), null, null);
                String strM1071unboximpl = ((OrganizationId) m7fVar12.a(kceVar5.b(OrganizationId.class), null, null)).m1071unboximpl();
                return new bg7(((tf5) m7fVar12.a(kceVar5.b(tf5.class), null, null)).a().e("exposures").e("org_".concat(strM1071unboximpl)).toFile(), (bg9) m7fVar12.a(kceVar5.b(bg9.class), null, null), (uz6) m7fVar12.a(kceVar5.b(uz6.class), null, null), (h86) m7fVar12.a(kceVar5.b(h86.class), null, null), m26Var.a(), ((AppSessionId) m7fVar12.a(kceVar5.b(AppSessionId.class), null, null)).m956unboximpl(), strM1071unboximpl, true, (AppEnvironment) m7fVar12.a(kceVar5.b(AppEnvironment.class), null, null), ProcessLifecycleOwner.M.J, (ConnectivityManager) yb5.g(m7fVar12).getSystemService(ConnectivityManager.class), (l45) m7fVar12.a(kceVar5.b(fn0.class), null, null), new eg7(((sc8) m7fVar12.a(kceVar5.b(sc8.class), null, null)).a(strM1071unboximpl), 0));
            case 26:
                m7f m7fVar13 = (m7f) obj;
                m7fVar13.getClass();
                ((bsc) obj2).getClass();
                kce kceVar6 = jce.a;
                rc8 rc8VarA = ((sc8) m7fVar13.a(kceVar6.b(sc8.class), null, null)).a(((OrganizationId) m7fVar13.a(kceVar6.b(OrganizationId.class), null, null)).m1071unboximpl());
                rc8VarA.r((bg7) m7fVar13.a(kceVar6.b(bg7.class), null, null));
                Iterator it = w44.p1(w44.s1(m7fVar13.b(kceVar6.b(k4i.class)))).iterator();
                while (it.hasNext()) {
                    rc8VarA.r((k4i) it.next());
                }
                if (rc8VarA.b()) {
                    pg7 pg7VarN = rc8VarA.n("mobile-aa");
                    List list = xah.a;
                    xah.e(6, "GrowthBook a/a: " + (pg7VarN != null ? pg7VarN.a : null) + ", variant: " + ((pg7VarN == null || (experimentResult = pg7VarN.b.getExperimentResult()) == null) ? null : experimentResult.getVariationId()), null, null);
                }
                return rc8VarA;
            case 27:
                m7f m7fVar14 = (m7f) obj;
                m7fVar14.getClass();
                ((bsc) obj2).getClass();
                kce kceVar7 = jce.a;
                return ((of7) m7fVar14.a(kceVar7.b(of7.class), null, null)).a(((OrganizationId) m7fVar14.a(kceVar7.b(OrganizationId.class), null, null)).m1071unboximpl());
            case 28:
                m7f m7fVar15 = (m7f) obj;
                m7fVar15.getClass();
                ((bsc) obj2).getClass();
                kce kceVar8 = jce.a;
                return new hg7(iuj.n(new ig7((bg9) m7fVar15.a(kceVar8.b(bg9.class), null, null), (vg5) m7fVar15.a(kceVar8.b(vg5.class), mg7.a, null), (fn0) m7fVar15.a(kceVar8.b(fn0.class), null, null), m7fVar15, ((fk0) m7fVar15.a(kceVar8.b(fk0.class), null, null)).m())));
            default:
                ((m7f) obj).getClass();
                ((bsc) obj2).getClass();
                return new jg7(iuj.n(wl0.G));
        }
    }
}
