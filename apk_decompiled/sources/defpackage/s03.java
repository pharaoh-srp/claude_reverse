package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.b;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.R;
import com.anthropic.claude.db.ClaudeDatabase;
import com.anthropic.claude.design.icon.a;
import com.anthropic.router.panes.Panes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.koin.android.error.MissingAndroidContextException;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s03 implements pz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ s03(int i) {
        this.E = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) throws MissingAndroidContextException {
        int i = this.E;
        int i2 = 2;
        iei ieiVar = iei.a;
        int i3 = 1;
        switch (i) {
            case 0:
                m7f m7fVar = (m7f) obj;
                m7fVar.getClass();
                ((bsc) obj2).getClass();
                kce kceVar = jce.a;
                koi koiVar = (koi) m7fVar.a(kceVar.b(koi.class), null, null);
                String str = koiVar.d;
                String str2 = koiVar.e;
                str.getClass();
                str2.getClass();
                StringBuilder sb = new StringBuilder("acc_");
                sb.append(str);
                sb.append("_org_");
                String strM = ij0.m(sb, str2, "_claude_cache");
                Context contextG = yb5.g(m7fVar);
                String absolutePath = contextG.getDatabasePath(strM.concat(".db")).getAbsolutePath();
                absolutePath.getClass();
                if (bsg.I0(absolutePath)) {
                    sz6.p("Cannot build a database with empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder().");
                } else if (!absolutePath.equals(":memory:")) {
                    zue zueVar = new zue(kceVar.b(ClaudeDatabase.class), absolutePath, contextG);
                    zueVar.t = new k02(0);
                    zueVar.q = false;
                    zueVar.r = true;
                    zueVar.s = true;
                    ClaudeDatabase claudeDatabase = (ClaudeDatabase) zueVar.b();
                    ((loi) m7fVar.a(kceVar.b(loi.class), null, null)).H.add(new dm(0, claudeDatabase, ClaudeDatabase.class, "close", "close()V", 0, 4));
                } else {
                    sz6.p("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder().");
                }
                break;
            case 1:
                m7f m7fVar2 = (m7f) obj;
                m7fVar2.getClass();
                ((bsc) obj2).getClass();
                kce kceVar2 = jce.a;
                if (!((rc8) m7fVar2.a(kceVar2.b(rc8.class), null, null)).o("mobile_offline_cache_enabled")) {
                }
                break;
            case 2:
                m7f m7fVar3 = (m7f) obj;
                m7fVar3.getClass();
                ((bsc) obj2).getClass();
                break;
            case 3:
                ((Panes) obj).getClass();
                break;
            case 4:
                uqc uqcVar = (uqc) obj;
                vqc vqcVar = (vqc) obj2;
                uqcVar.getClass();
                vqcVar.getClass();
                break;
            case 5:
                uqc uqcVar2 = (uqc) obj;
                List list = (List) obj2;
                uqcVar2.getClass();
                list.getClass();
                List list2 = list;
                ArrayList arrayList = new ArrayList();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    Object objA = ((ke3) it.next()).a();
                    hpc hpcVar = objA instanceof hpc ? (hpc) objA : null;
                    ie3 ie3Var = hpcVar != null ? new ie3(hpcVar.a, hpcVar.b) : null;
                    if (ie3Var != null) {
                        arrayList.add(ie3Var);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    Object objA2 = ((ke3) it2.next()).a();
                    fpc fpcVar = objA2 instanceof fpc ? (fpc) objA2 : null;
                    ie3 ie3Var2 = fpcVar != null ? new ie3(fpcVar.a, fpcVar.b) : null;
                    if (ie3Var2 != null) {
                        arrayList2.add(ie3Var2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    Object objA3 = ((ke3) it3.next()).a();
                    gpc gpcVar = objA3 instanceof gpc ? (gpc) objA3 : null;
                    ie3 ie3Var3 = gpcVar != null ? new ie3(gpcVar.a, gpcVar.b) : null;
                    if (ie3Var3 != null) {
                        arrayList3.add(ie3Var3);
                    }
                }
                break;
            case 6:
                tjg tjgVar = (tjg) obj;
                ujg ujgVar = (ujg) obj2;
                tjgVar.getClass();
                ujgVar.getClass();
                break;
            case 7:
                List list3 = (List) obj2;
                ((tjg) obj).getClass();
                list3.getClass();
                break;
            case 8:
                ((jyb) obj).getClass();
                break;
            case 9:
                m7f m7fVar4 = (m7f) obj;
                m7fVar4.getClass();
                ((bsc) obj2).getClass();
                kce kceVar3 = jce.a;
                break;
            case 10:
                m7f m7fVar5 = (m7f) obj;
                m7fVar5.getClass();
                ((bsc) obj2).getClass();
                kce kceVar4 = jce.a;
                break;
            case 11:
                m7f m7fVar6 = (m7f) obj;
                m7fVar6.getClass();
                ((bsc) obj2).getClass();
                kce kceVar5 = jce.a;
                break;
            case 12:
                m7f m7fVar7 = (m7f) obj;
                m7fVar7.getClass();
                ((bsc) obj2).getClass();
                kce kceVar6 = jce.a;
                break;
            case 13:
                m7f m7fVar8 = (m7f) obj;
                m7fVar8.getClass();
                ((bsc) obj2).getClass();
                kce kceVar7 = jce.a;
                break;
            case 14:
                m7f m7fVar9 = (m7f) obj;
                m7fVar9.getClass();
                ((bsc) obj2).getClass();
                kce kceVar8 = jce.a;
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                m7f m7fVar10 = (m7f) obj;
                m7fVar10.getClass();
                ((bsc) obj2).getClass();
                kce kceVar9 = jce.a;
                break;
            case 16:
                m7f m7fVar11 = (m7f) obj;
                m7fVar11.getClass();
                ((bsc) obj2).getClass();
                kce kceVar10 = jce.a;
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ((m7f) obj).getClass();
                ((bsc) obj2).getClass();
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                m7f m7fVar12 = (m7f) obj;
                m7fVar12.getClass();
                ((bsc) obj2).getClass();
                mrg mrgVar = w34.a;
                kce kceVar11 = jce.a;
                jk5 jk5Var = new jk5(((r4e) ((yw8) m7fVar12.a(kceVar11.b(yw8.class), mrgVar, null))).a);
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                arrayList7.add(new l80(eve.v(new lm1(m7fVar12, i3)), 24, kceVar11.b(dli.class)));
                jk5Var.K = new na4(mwa.U(arrayList4), mwa.U(arrayList5), mwa.U(arrayList6), mwa.U(arrayList7), mwa.U(arrayList8));
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                m7f m7fVar13 = (m7f) obj;
                m7fVar13.getClass();
                ((bsc) obj2).getClass();
                h86 h86Var = (h86) m7fVar13.a(jce.a.b(h86.class), null, null);
                jk5 jk5Var2 = new jk5(yb5.g(m7fVar13));
                e45 e45VarB = h86Var.b();
                jk5Var2.F = hx8.a((hx8) jk5Var2.F, e45VarB, e45VarB, e45VarB, null, 16369);
                hx8 hx8VarA = hx8.a((hx8) jk5Var2.F, h86Var.a(), null, null, null, 16381);
                jk5Var2.F = hx8VarA;
                jk5Var2.I = new t29(null);
                jk5Var2.F = hx8.a(hx8VarA, null, null, null, null, 16351);
                ArrayList arrayList9 = new ArrayList();
                ArrayList arrayList10 = new ArrayList();
                ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = new ArrayList();
                ArrayList arrayList13 = new ArrayList();
                arrayList13.add(new ma4(new gui(), 0));
                jk5Var2.K = new na4(mwa.U(arrayList9), mwa.U(arrayList10), mwa.U(arrayList11), mwa.U(arrayList12), mwa.U(arrayList13));
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                m7f m7fVar14 = (m7f) obj;
                m7fVar14.getClass();
                ((bsc) obj2).getClass();
                gmf gmfVar = new gmf(20, false);
                gmf.H(gmfVar, yb5.g(m7fVar14));
                break;
            case 21:
                m7f m7fVar15 = (m7f) obj;
                m7fVar15.getClass();
                ((bsc) obj2).getClass();
                kce kceVar12 = jce.a;
                w4e w4eVar = (w4e) m7fVar15.a(kceVar12.b(w4e.class), null, null);
                jk5 jk5Var3 = new jk5(((r4e) ((yw8) m7fVar15.a(kceVar12.b(yw8.class), w34.a, null))).a);
                jk5Var3.H = new t29(w4eVar);
                ArrayList arrayList14 = new ArrayList();
                ArrayList arrayList15 = new ArrayList();
                ArrayList arrayList16 = new ArrayList();
                ArrayList arrayList17 = new ArrayList();
                ArrayList arrayList18 = new ArrayList();
                arrayList17.add(new l80(eve.v(new ul0(m7fVar15, 3)), 24, kceVar12.b(dli.class)));
                arrayList14.add(new yv8(((ze0) m7fVar15.a(kceVar12.b(ze0.class), null, null)).a()));
                arrayList14.add(new br1(yb5.g(m7fVar15), w4eVar, (qi3) m7fVar15.a(kceVar12.b(qi3.class), null, null)));
                arrayList18.add(new ma4(new h0h(), 0));
                jk5Var3.K = new na4(mwa.U(arrayList14), mwa.U(arrayList15), mwa.U(arrayList16), mwa.U(arrayList17), mwa.U(arrayList18));
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                m7f m7fVar16 = (m7f) obj;
                m7fVar16.getClass();
                ((bsc) obj2).getClass();
                mrg mrgVar2 = w34.a;
                kce kceVar13 = jce.a;
                jk5 jk5Var4 = new jk5(((r4e) ((yw8) m7fVar16.a(kceVar13.b(yw8.class), mrgVar2, null))).a);
                ArrayList arrayList19 = new ArrayList();
                ArrayList arrayList20 = new ArrayList();
                ArrayList arrayList21 = new ArrayList();
                ArrayList arrayList22 = new ArrayList();
                ArrayList arrayList23 = new ArrayList();
                arrayList22.add(new l80(eve.v(new lm1(m7fVar16, i2)), 24, kceVar13.b(dli.class)));
                jk5Var4.K = new na4(mwa.U(arrayList19), mwa.U(arrayList20), mwa.U(arrayList21), mwa.U(arrayList22), mwa.U(arrayList23));
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                }
                break;
            case 24:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                }
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                ld4 ld4Var3 = (ld4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    e18Var3.T();
                }
                break;
            case 26:
                ld4 ld4Var4 = (ld4) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                e18 e18Var4 = (e18) ld4Var4;
                if (!e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    e18Var4.T();
                }
                break;
            case 27:
                ld4 ld4Var5 = (ld4) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                e18 e18Var5 = (e18) ld4Var5;
                if (!e18Var5.Q(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    e18Var5.T();
                }
                break;
            case 28:
                ld4 ld4Var6 = (ld4) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                e18 e18Var6 = (e18) ld4Var6;
                if (!e18Var6.Q(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    e18Var6.T();
                } else {
                    cv8.b(a.a(ud0.G1, e18Var6), d4c.j0(R.string.chat_input_voice_mode_button_content_description, e18Var6), b.o(fqb.E, 20.0f), 0L, e18Var6, 392, 8);
                }
                break;
            default:
                ld4 ld4Var7 = (ld4) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                e18 e18Var7 = (e18) ld4Var7;
                if (!e18Var7.Q(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    e18Var7.T();
                }
                break;
        }
        return ieiVar;
    }
}
