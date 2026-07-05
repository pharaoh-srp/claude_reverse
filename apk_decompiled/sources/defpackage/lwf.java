package defpackage;

import android.content.Context;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.types.strings.OrganizationId;
import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.koin.android.error.MissingAndroidContextException;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lwf implements pz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ lwf(int i) {
        this.E = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) throws MissingAndroidContextException {
        String absolutePath;
        switch (this.E) {
            case 0:
                m7f m7fVar = (m7f) obj;
                m7fVar.getClass();
                ((bsc) obj2).getClass();
                kce kceVar = jce.a;
                return new jwf((nwf) m7fVar.a(kceVar.b(nwf.class), null, null), ((OrganizationId) m7fVar.a(kceVar.b(OrganizationId.class), null, null)).m1071unboximpl(), (owf) m7fVar.a(kceVar.b(owf.class), null, null), (so3) m7fVar.a(kceVar.b(so3.class), null, null));
            case 1:
                m7f m7fVar2 = (m7f) obj;
                m7fVar2.getClass();
                ((bsc) obj2).getClass();
                mrg mrgVar = iv1.d;
                kce kceVar2 = jce.a;
                gdc gdcVarB = ((hdc) m7fVar2.a(kceVar2.b(hdc.class), mrgVar, null)).b();
                Duration durationOfSeconds = Duration.ofSeconds(90L);
                durationOfSeconds.getClass();
                long millis = durationOfSeconds.toMillis();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                timeUnit.getClass();
                gdcVarB.y = blj.b(millis, timeUnit);
                return new tvf((nwf) m7fVar2.a(kceVar2.b(nwf.class), null, null), new s17(new hdc(gdcVarB)), (bg9) m7fVar2.a(kceVar2.b(bg9.class), null, null), (h86) m7fVar2.a(kceVar2.b(h86.class), null, null));
            case 2:
                m7f m7fVar3 = (m7f) obj;
                m7fVar3.getClass();
                ((bsc) obj2).getClass();
                kce kceVar3 = jce.a;
                return new jrf((jwf) m7fVar3.a(kceVar3.b(jwf.class), null, null), (hdc) m7fVar3.a(kceVar3.b(hdc.class), iv1.d, null), kgh.o(bsg.n1(d7j.a(((ze0) m7fVar3.a(kceVar3.b(ze0.class), null, null)).a()), '/'), "/"), ((OrganizationId) m7fVar3.a(kceVar3.b(OrganizationId.class), null, null)).m1071unboximpl(), (bg9) m7fVar3.a(kceVar3.b(bg9.class), null, null), (h86) m7fVar3.a(kceVar3.b(h86.class), null, null), (owf) m7fVar3.a(kceVar3.b(owf.class), null, null), (mn5) m7fVar3.a(kceVar3.b(mn5.class), null, null), (loi) m7fVar3.a(kceVar3.b(loi.class), null, null));
            case 3:
                return ((v4g) obj2).c();
            case 4:
                m7f m7fVar4 = (m7f) obj;
                m7fVar4.getClass();
                ((bsc) obj2).getClass();
                return new g6g(new ul0(m7fVar4, 5), !((fk0) m7fVar4.a(jce.a.b(fk0.class), null, null)).o());
            case 5:
                m7f m7fVar5 = (m7f) obj;
                m7fVar5.getClass();
                ((bsc) obj2).getClass();
                kce kceVar4 = jce.a;
                return new ysg((Context) m7fVar5.a(kceVar4.b(Context.class), null, null), (fk0) m7fVar5.a(kceVar4.b(fk0.class), null, null), (rc8) m7fVar5.a(kceVar4.b(rc8.class), null, null), (y31) m7fVar5.a(kceVar4.b(y31.class), null, null));
            case 6:
                m7f m7fVar6 = (m7f) obj;
                m7fVar6.getClass();
                ((bsc) obj2).getClass();
                kce kceVar5 = jce.a;
                return new b0f((hdc) m7fVar6.a(kceVar5.b(hdc.class), null, null), (String) m7fVar6.a(kceVar5.b(String.class), nai.l, null), (bg9) m7fVar6.a(kceVar5.b(bg9.class), null, null), (h86) m7fVar6.a(kceVar5.b(h86.class), null, null));
            case 7:
                m7f m7fVar7 = (m7f) obj;
                m7fVar7.getClass();
                ((bsc) obj2).getClass();
                kw9 kw9VarW = yb5.w(w1a.E, new hk5(m7fVar7, 4));
                kce kceVar6 = jce.a;
                return new whg(kw9VarW, (akb) m7fVar7.a(kceVar6.b(akb.class), null, null), (y31) m7fVar7.a(kceVar6.b(y31.class), null, null), (fk0) m7fVar7.a(kceVar6.b(fk0.class), null, null), (ysg) m7fVar7.a(kceVar6.b(ysg.class), null, null), (h86) m7fVar7.a(kceVar6.b(h86.class), null, null));
            case 8:
                m7f m7fVar8 = (m7f) obj;
                m7fVar8.getClass();
                ((bsc) obj2).getClass();
                return new mjg(new File(yb5.g(m7fVar8).getFilesDir(), "sse_transcripts"), new wof(7));
            case 9:
                k4h k4hVar = (k4h) obj2;
                ((y4f) obj).getClass();
                k4hVar.getClass();
                File file = (File) k4hVar.c.getValue();
                return (file == null || (absolutePath = file.getAbsolutePath()) == null) ? "" : absolutePath;
            case 10:
                m7f m7fVar9 = (m7f) obj;
                m7fVar9.getClass();
                ((bsc) obj2).getClass();
                kce kceVar7 = jce.a;
                return new x5h((n9h) m7fVar9.a(kceVar7.b(n9h.class), null, null), (koi) m7fVar9.a(kceVar7.b(koi.class), null, null), (r17) m7fVar9.a(kceVar7.b(r17.class), null, null), (bg9) m7fVar9.a(kceVar7.b(bg9.class), null, null), (h86) m7fVar9.a(kceVar7.b(h86.class), null, null));
            case 11:
                m7f m7fVar10 = (m7f) obj;
                m7fVar10.getClass();
                ((bsc) obj2).getClass();
                kce kceVar8 = jce.a;
                return new f8h((n9h) m7fVar10.a(kceVar8.b(n9h.class), null, null), (koi) m7fVar10.a(kceVar8.b(koi.class), null, null), (r17) m7fVar10.a(kceVar8.b(r17.class), null, null), (bg9) m7fVar10.a(kceVar8.b(bg9.class), null, null), (h86) m7fVar10.a(kceVar8.b(h86.class), null, null));
            case 12:
                m7f m7fVar11 = (m7f) obj;
                m7fVar11.getClass();
                ((bsc) obj2).getClass();
                kce kceVar9 = jce.a;
                return new e8h((kah) m7fVar11.a(kceVar9.b(kah.class), null, null), (x5h) m7fVar11.a(kceVar9.b(x5h.class), null, null));
            case 13:
                m7f m7fVar12 = (m7f) obj;
                m7fVar12.getClass();
                ((bsc) obj2).getClass();
                return new e9h((x5h) m7fVar12.a(jce.a.b(x5h.class), null, null));
            case 14:
                rhh rhhVar = (rhh) obj2;
                return x44.X(Float.valueOf(rhhVar.a.h()), Boolean.valueOf(((ukc) rhhVar.f.getValue()) == ukc.E));
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                y4f y4fVar = (y4f) obj;
                cjh cjhVar = (cjh) obj2;
                return x44.s(c6f.a(cjhVar.a, c6f.a, y4fVar), c6f.a(new kkh(cjhVar.b), c6f.p, y4fVar));
            case 16:
                a45 a45Var = (a45) obj2;
                if (!(a45Var instanceof unh)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? a45Var : Integer.valueOf(iIntValue + 1);
            case g.MAX_FIELD_NUMBER /* 17 */:
                unh unhVar = (unh) obj;
                a45 a45Var2 = (a45) obj2;
                if (unhVar != null) {
                    return unhVar;
                }
                if (a45Var2 instanceof unh) {
                    return (unh) a45Var2;
                }
                return null;
            case g.AVG_FIELD_NUMBER /* 18 */:
                aoh aohVar = (aoh) obj;
                a45 a45Var3 = (a45) obj2;
                if (a45Var3 instanceof unh) {
                    unh unhVar2 = (unh) a45Var3;
                    c45 c45Var = aohVar.a;
                    Object objB = unhVar2.b();
                    Object[] objArr = aohVar.b;
                    int i = aohVar.d;
                    objArr[i] = objB;
                    unh[] unhVarArr = aohVar.c;
                    aohVar.d = i + 1;
                    unhVarArr[i] = unhVar2;
                }
                return aohVar;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                m7f m7fVar13 = (m7f) obj;
                m7fVar13.getClass();
                ((bsc) obj2).getClass();
                ul0 ul0Var = new ul0(m7fVar13, 7);
                kce kceVar10 = jce.a;
                return new k1d(ul0Var, (ze0) m7fVar13.a(kceVar10.b(ze0.class), null, null), ((OrganizationId) m7fVar13.a(kceVar10.b(OrganizationId.class), null, null)).m1071unboximpl());
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                m7f m7fVar14 = (m7f) obj;
                m7fVar14.getClass();
                ((bsc) obj2).getClass();
                kce kceVar11 = jce.a;
                return new l0b((swa) m7fVar14.a(kceVar11.b(swa.class), null, null), (r17) m7fVar14.a(kceVar11.b(r17.class), null, null), (bg9) m7fVar14.a(kceVar11.b(bg9.class), null, null), (h86) m7fVar14.a(kceVar11.b(h86.class), null, null), (cj3) m7fVar14.a(kceVar11.b(cj3.class), null, null));
            case 21:
                m7f m7fVar15 = (m7f) obj;
                m7fVar15.getClass();
                ((bsc) obj2).getClass();
                kce kceVar12 = jce.a;
                return new v72((Context) m7fVar15.a(kceVar12.b(Context.class), null, null), (h86) m7fVar15.a(kceVar12.b(h86.class), null, null), (mn5) m7fVar15.a(kceVar12.b(mn5.class), null, null), new ul0(m7fVar15, 6));
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                m7f m7fVar16 = (m7f) obj;
                m7fVar16.getClass();
                ((bsc) obj2).getClass();
                return new oi8((Context) m7fVar16.a(jce.a.b(Context.class), null, null));
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                m7f m7fVar17 = (m7f) obj;
                m7fVar17.getClass();
                ((bsc) obj2).getClass();
                return new dyh(((doi) m7fVar17.a(jce.a.b(doi.class), null, null)).a("tool_permissions"));
            case 24:
                m7f m7fVar18 = (m7f) obj;
                m7fVar18.getClass();
                ((bsc) obj2).getClass();
                Context contextG = yb5.g(m7fVar18);
                kce kceVar13 = jce.a;
                return new xm8(contextG, (fn0) m7fVar18.a(kceVar13.b(fn0.class), null, null), (h86) m7fVar18.a(kceVar13.b(h86.class), null, null));
            case BuildConfig.VERSION_CODE /* 25 */:
                m7f m7fVar19 = (m7f) obj;
                m7fVar19.getClass();
                ((bsc) obj2).getClass();
                kce kceVar14 = jce.a;
                return new oke((Context) m7fVar19.a(kceVar14.b(Context.class), null, null), (l45) m7fVar19.a(kceVar14.b(fn0.class), null, null), (fk0) m7fVar19.a(kceVar14.b(fk0.class), null, null), (b4e) m7fVar19.a(kceVar14.b(b4e.class), null, null), (mn5) m7fVar19.a(kceVar14.b(mn5.class), null, null));
            case 26:
                m7f m7fVar20 = (m7f) obj;
                m7fVar20.getClass();
                ((bsc) obj2).getClass();
                kce kceVar15 = jce.a;
                return new ike(((ze0) m7fVar20.a(kceVar15.b(ze0.class), null, null)).a(), new u0h(new ul0(m7fVar20, 8)), (cj3) m7fVar20.a(kceVar15.b(cj3.class), null, null));
            case 27:
                ((av9) obj).L = true;
                return iei.a;
            case 28:
                m7f m7fVar21 = (m7f) obj;
                m7fVar21.getClass();
                ((bsc) obj2).getClass();
                kce kceVar16 = jce.a;
                vl0 vl0Var = (vl0) m7fVar21.a(kceVar16.b(vl0.class), null, null);
                String strM1071unboximpl = ((OrganizationId) m7fVar21.a(kceVar16.b(OrganizationId.class), null, null)).m1071unboximpl();
                strM1071unboximpl.getClass();
                return (wbb) vl0Var.a.invoke(OrganizationId.m1065boximpl(strM1071unboximpl));
            default:
                m7f m7fVar22 = (m7f) obj;
                m7fVar22.getClass();
                ((bsc) obj2).getClass();
                kce kceVar17 = jce.a;
                return new f9((o7) m7fVar22.a(kceVar17.b(o7.class), null, null), (kab) m7fVar22.a(kceVar17.b(kab.class), null, null), (q7) m7fVar22.a(kceVar17.b(q7.class), null, null), (wbb) m7fVar22.a(kceVar17.b(wbb.class), null, null), ((OrganizationId) m7fVar22.a(kceVar17.b(OrganizationId.class), null, null)).m1071unboximpl(), (n8) m7fVar22.c(kceVar17.b(n8.class)));
        }
    }
}
