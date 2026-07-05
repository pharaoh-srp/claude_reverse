package defpackage;

import android.content.Context;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.sessions.api.b;
import com.anthropic.claude.types.strings.AccountId;
import com.anthropic.claude.types.strings.OrganizationId;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.KSerializer;
import org.koin.android.error.MissingAndroidContextException;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z5f implements pz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ z5f(int i) {
        this.E = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) throws MissingAndroidContextException {
        qc0 qc0Var;
        Object objA;
        switch (this.E) {
            case 0:
                return Integer.valueOf(((wu7) obj2).a);
            case 1:
                return Integer.valueOf(((xu7) obj2).a);
            case 2:
                clh clhVar = (clh) obj2;
                return clhVar != null ? clh.a(clhVar.a, clh.c) : false ? Boolean.FALSE : x44.s(Float.valueOf(clh.c(clhVar.a)), c6f.a(new dlh(clh.b(clhVar.a)), c6f.y, (y4f) obj));
            case 3:
                m6a m6aVar = (m6a) obj2;
                return x44.s(m6aVar.d(), c6f.a(m6aVar.b(), c6f.j, (y4f) obj));
            case 4:
                long j = ((dlh) obj2).a;
                if (dlh.a(j, 8589934592L)) {
                    return 0;
                }
                if (dlh.a(j, 4294967296L)) {
                    return 1;
                }
                return Boolean.FALSE;
            case 5:
                fcc fccVar = (fcc) obj2;
                return fccVar != null ? fcc.c(fccVar.a, 9205357640488583168L) : false ? Boolean.FALSE : x44.s(Float.valueOf(Float.intBitsToFloat((int) (fccVar.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (fccVar.a & 4294967295L))));
            case 6:
                y4f y4fVar = (y4f) obj;
                yb0 yb0Var = (yb0) obj2;
                Object obj3 = yb0Var.a;
                if (obj3 instanceof jrc) {
                    qc0Var = qc0.E;
                } else if (obj3 instanceof egg) {
                    qc0Var = qc0.F;
                } else if (obj3 instanceof wsi) {
                    qc0Var = qc0.G;
                } else if (obj3 instanceof hli) {
                    qc0Var = qc0.H;
                } else if (obj3 instanceof n6a) {
                    qc0Var = qc0.I;
                } else if (obj3 instanceof m6a) {
                    qc0Var = qc0.J;
                } else {
                    if (!(obj3 instanceof erg)) {
                        mr9.x();
                        return null;
                    }
                    qc0Var = qc0.K;
                }
                switch (qc0Var.ordinal()) {
                    case 0:
                        obj3.getClass();
                        objA = c6f.a((jrc) obj3, c6f.h, y4fVar);
                        break;
                    case 1:
                        obj3.getClass();
                        objA = c6f.a((egg) obj3, c6f.i, y4fVar);
                        break;
                    case 2:
                        obj3.getClass();
                        objA = c6f.a((wsi) obj3, c6f.d, y4fVar);
                        break;
                    case 3:
                        obj3.getClass();
                        objA = c6f.a((hli) obj3, c6f.e, y4fVar);
                        break;
                    case 4:
                        obj3.getClass();
                        objA = c6f.a((n6a) obj3, c6f.f, y4fVar);
                        break;
                    case 5:
                        obj3.getClass();
                        objA = c6f.a((m6a) obj3, c6f.g, y4fVar);
                        break;
                    case 6:
                        obj3.getClass();
                        objA = ((erg) obj3).b();
                        break;
                    default:
                        mr9.b();
                        return null;
                }
                return x44.s(qc0Var, objA, Integer.valueOf(yb0Var.b), Integer.valueOf(yb0Var.c), yb0Var.d);
            case 7:
                y4f y4fVar2 = (y4f) obj;
                List list = ((gea) obj2).E;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(c6f.a((eea) list.get(i), c6f.B, y4fVar2));
                }
                return arrayList;
            case 8:
                return ((eea) obj2).a.toLanguageTag();
            case 9:
                y4f y4fVar3 = (y4f) obj;
                d6a d6aVar = (d6a) obj2;
                return x44.s(c6f.a(new a6a(d6aVar.a), c6f.D, y4fVar3), c6f.a(new c6a(d6aVar.b), c6f.E, y4fVar3), c6f.a(new b6a(d6aVar.c), c6f.F, y4fVar3));
            case 10:
                return Float.valueOf(((a6a) obj2).a);
            case 11:
                return Integer.valueOf(((c6a) obj2).a);
            case 12:
                return Integer.valueOf(((b6a) obj2).a);
            case 13:
                return ((wsi) obj2).a();
            case 14:
                y4f y4fVar4 = (y4f) obj;
                jrc jrcVar = (jrc) obj2;
                Object objA2 = c6f.a(new fdh(jrcVar.a), c6f.s, y4fVar4);
                Object objA3 = c6f.a(new weh(jrcVar.b), c6f.t, y4fVar4);
                Object objA4 = c6f.a(new clh(jrcVar.c), c6f.x, y4fVar4);
                hjh hjhVar = jrcVar.d;
                hjh hjhVar2 = hjh.c;
                Object objA5 = c6f.a(hjhVar, c6f.m, y4fVar4);
                Object objA6 = c6f.a(jrcVar.e, tvj.b, y4fVar4);
                d6a d6aVar2 = jrcVar.f;
                d6a d6aVar3 = d6a.d;
                return x44.s(objA2, objA3, objA4, objA5, objA6, c6f.a(d6aVar2, c6f.C, y4fVar4), c6f.a(new e5a(jrcVar.g), tvj.d, y4fVar4), c6f.a(new et8(jrcVar.h), c6f.u, y4fVar4), c6f.a(jrcVar.i, tvj.e, y4fVar4));
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return ((hli) obj2).a();
            case 16:
                y4f y4fVar5 = (y4f) obj;
                egg eggVar = (egg) obj2;
                d54 d54Var = new d54(eggVar.a.b());
                b6f b6fVar = c6f.r;
                Object objA7 = c6f.a(d54Var, b6fVar, y4fVar5);
                clh clhVar2 = new clh(eggVar.b);
                b6f b6fVar2 = c6f.x;
                Object objA8 = c6f.a(clhVar2, b6fVar2, y4fVar5);
                dv7 dv7Var = eggVar.c;
                dv7 dv7Var2 = dv7.F;
                Object objA9 = c6f.a(dv7Var, c6f.n, y4fVar5);
                Object objA10 = c6f.a(eggVar.d, c6f.v, y4fVar5);
                Object objA11 = c6f.a(eggVar.e, c6f.w, y4fVar5);
                String str = eggVar.g;
                Object objA12 = c6f.a(new clh(eggVar.h), b6fVar2, y4fVar5);
                Object objA13 = c6f.a(eggVar.i, c6f.o, y4fVar5);
                Object objA14 = c6f.a(eggVar.j, c6f.l, y4fVar5);
                gea geaVar = eggVar.k;
                gea geaVar2 = gea.G;
                Object objA15 = c6f.a(geaVar, c6f.A, y4fVar5);
                Object objA16 = c6f.a(new d54(eggVar.l), b6fVar, y4fVar5);
                Object objA17 = c6f.a(eggVar.m, c6f.k, y4fVar5);
                uzf uzfVar = eggVar.n;
                uzf uzfVar2 = uzf.d;
                return x44.s(objA7, objA8, objA9, objA10, objA11, -1, str, objA12, objA13, objA14, objA15, objA16, objA17, c6f.a(uzfVar, c6f.q, y4fVar5));
            case g.MAX_FIELD_NUMBER /* 17 */:
                y4f y4fVar6 = (y4f) obj;
                ekh ekhVar = (ekh) obj2;
                egg eggVar2 = ekhVar.a;
                y5f y5fVar = c6f.i;
                return x44.s(c6f.a(eggVar2, y5fVar, y4fVar6), c6f.a(ekhVar.b, y5fVar, y4fVar6), c6f.a(ekhVar.c, y5fVar, y4fVar6), c6f.a(ekhVar.d, y5fVar, y4fVar6));
            case g.AVG_FIELD_NUMBER /* 18 */:
                return Integer.valueOf(((j9f) obj2).a.h());
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                pl9 pl9Var = (pl9) obj;
                List list2 = (List) obj2;
                pl9Var.getClass();
                list2.getClass();
                ArrayList arrayListN = iv1.N(hof.a, list2, true);
                arrayListN.getClass();
                return iv1.A(pl9Var, arrayListN, new ws5(list2, 2));
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                pl9 pl9Var2 = (pl9) obj;
                List list3 = (List) obj2;
                pl9Var2.getClass();
                list3.getClass();
                ArrayList arrayListN2 = iv1.N(hof.a, list3, true);
                arrayListN2.getClass();
                KSerializer kSerializerA = iv1.A(pl9Var2, arrayListN2, new ws5(list3, 3));
                if (kSerializerA != null) {
                    return d4c.S(kSerializerA);
                }
                return null;
            case 21:
                m7f m7fVar = (m7f) obj;
                m7fVar.getClass();
                ((bsc) obj2).getClass();
                kce kceVar = jce.a;
                return new uof((Context) m7fVar.a(kceVar.b(Context.class), null, null), (v4d) m7fVar.a(kceVar.b(v4d.class), null, null));
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                m7f m7fVar2 = (m7f) obj;
                m7fVar2.getClass();
                ((bsc) obj2).getClass();
                kce kceVar2 = jce.a;
                return new b((jwf) m7fVar2.a(kceVar2.b(jwf.class), null, null), (hdc) m7fVar2.a(kceVar2.b(hdc.class), iv1.d, null), kgh.o(bsg.n1(d7j.a(((ze0) m7fVar2.a(kceVar2.b(ze0.class), null, null)).a()), '/'), "/"), ((OrganizationId) m7fVar2.a(kceVar2.b(OrganizationId.class), null, null)).m1071unboximpl(), (bg9) m7fVar2.a(kceVar2.b(bg9.class), null, null), (h86) m7fVar2.a(kceVar2.b(h86.class), null, null));
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                m7f m7fVar3 = (m7f) obj;
                m7fVar3.getClass();
                ((bsc) obj2).getClass();
                Context contextG = yb5.g(m7fVar3);
                return new k8i(contextG);
            case 24:
                m7f m7fVar4 = (m7f) obj;
                m7fVar4.getClass();
                ((bsc) obj2).getClass();
                return new u5e(yb5.g(m7fVar4));
            case BuildConfig.VERSION_CODE /* 25 */:
                m7f m7fVar5 = (m7f) obj;
                m7fVar5.getClass();
                ((bsc) obj2).getClass();
                kce kceVar3 = jce.a;
                return new j8i((v7i) m7fVar5.a(kceVar3.b(v7i.class), null, null), (ptf) m7fVar5.a(kceVar3.b(ptf.class), null, null), (k8i) m7fVar5.a(kceVar3.b(k8i.class), null, null), (u5e) m7fVar5.a(kceVar3.b(u5e.class), null, null), (owf) m7fVar5.a(kceVar3.b(owf.class), null, null), (x4f) m7fVar5.a(kceVar3.b(x4f.class), null, null), (qi3) m7fVar5.a(kceVar3.b(qi3.class), null, null), ((AccountId) m7fVar5.a(kceVar3.b(AccountId.class), null, null)).m949unboximpl(), ((OrganizationId) m7fVar5.a(kceVar3.b(OrganizationId.class), null, null)).m1071unboximpl(), (mn5) m7fVar5.a(kceVar3.b(mn5.class), null, null), (loi) m7fVar5.a(kceVar3.b(loi.class), null, null), (h86) m7fVar5.a(kceVar3.b(h86.class), null, null));
            case 26:
                m7f m7fVar6 = (m7f) obj;
                m7fVar6.getClass();
                ((bsc) obj2).getClass();
                kce kceVar4 = jce.a;
                gdc gdcVarB = ((hdc) m7fVar6.a(kceVar4.b(hdc.class), null, null)).b();
                gdcVarB.c.add((f89) m7fVar6.a(kceVar4.b(kwf.class), null, null));
                return new hdc(gdcVarB);
            case 27:
                m7f m7fVar7 = (m7f) obj;
                m7fVar7.getClass();
                ((bsc) obj2).getClass();
                mrg mrgVar = iv1.d;
                kce kceVar5 = jce.a;
                hdc hdcVar = (hdc) m7fVar7.a(kceVar5.b(hdc.class), mrgVar, null);
                ze0 ze0Var = (ze0) m7fVar7.a(kceVar5.b(ze0.class), null, null);
                el5 el5Var = new el5((qre) m7fVar7.a(kceVar5.b(qre.class), null, null));
                el5Var.E = hdcVar;
                el5Var.q(ze0Var.a());
                return el5Var.r();
            case 28:
                m7f m7fVar8 = (m7f) obj;
                m7fVar8.getClass();
                ((bsc) obj2).getClass();
                Object objB = ((qre) m7fVar8.a(jce.a.b(qre.class), iv1.c, null)).b(nwf.class);
                objB.getClass();
                return (nwf) objB;
            default:
                m7f m7fVar9 = (m7f) obj;
                m7fVar9.getClass();
                ((bsc) obj2).getClass();
                kce kceVar6 = jce.a;
                return new so3((u5e) m7fVar9.a(kceVar6.b(u5e.class), null, null), (k8i) m7fVar9.a(kceVar6.b(k8i.class), null, null), (owf) m7fVar9.a(kceVar6.b(owf.class), null, null), (bg9) m7fVar9.a(kceVar6.b(bg9.class), null, null), (h86) m7fVar9.a(kceVar6.b(h86.class), null, null));
        }
    }
}
