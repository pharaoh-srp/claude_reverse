package defpackage;

import android.content.Context;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.types.strings.AccountId;
import com.anthropic.claude.types.strings.AppSessionId;
import com.anthropic.claude.types.strings.OrganizationId;
import java.util.UUID;
import okio.FileSystem;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class d8 implements pz7 {
    public static final d8 F = new d8(0);
    public static final d8 G = new d8(1);
    public static final d8 H = new d8(2);
    public static final d8 I = new d8(3);
    public static final d8 J = new d8(4);
    public final /* synthetic */ int E;

    public /* synthetic */ d8(int i) {
        this.E = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        switch (this.E) {
            case 0:
                m7f m7fVar = (m7f) obj;
                m7fVar.getClass();
                ((bsc) obj2).getClass();
                Object obj3 = m7fVar.g;
                if (!(obj3 instanceof AccountId)) {
                    obj3 = null;
                }
                AccountId accountId = (AccountId) obj3;
                if (accountId != null) {
                    return AccountId.m943boximpl(accountId.m949unboximpl());
                }
                sz6.j("Required value was null.");
                return null;
            case 1:
                ((m7f) obj).getClass();
                ((bsc) obj2).getClass();
                String string = UUID.randomUUID().toString();
                string.getClass();
                return AppSessionId.m950boximpl(AppSessionId.m951constructorimpl(string));
            case 2:
                long j = ((d54) obj2).a;
                return j == 16 ? Boolean.FALSE : Integer.valueOf(d4c.n0(j));
            case 3:
                m7f m7fVar2 = (m7f) obj;
                m7fVar2.getClass();
                ((bsc) obj2).getClass();
                return AccountId.m943boximpl(((koi) m7fVar2.a(jce.a.b(koi.class), null, null)).d);
            case 4:
                m7f m7fVar3 = (m7f) obj;
                m7fVar3.getClass();
                ((bsc) obj2).getClass();
                return OrganizationId.m1065boximpl(((koi) m7fVar3.a(jce.a.b(koi.class), null, null)).e);
            case 5:
                ((m7f) obj).getClass();
                ((bsc) obj2).getClass();
                return new w7();
            case 6:
                m7f m7fVar4 = (m7f) obj;
                m7fVar4.getClass();
                ((bsc) obj2).getClass();
                kce kceVar = jce.a;
                return new v88((Context) m7fVar4.a(kceVar.b(Context.class), null, null), (h86) m7fVar4.a(kceVar.b(h86.class), null, null));
            case 7:
                m7f m7fVar5 = (m7f) obj;
                m7fVar5.getClass();
                ((bsc) obj2).getClass();
                kce kceVar2 = jce.a;
                return new w59((fn0) m7fVar5.a(kceVar2.b(fn0.class), null, null), (h86) m7fVar5.a(kceVar2.b(h86.class), null, null), (fk0) m7fVar5.a(kceVar2.b(fk0.class), null, null), (qi3) m7fVar5.a(kceVar2.b(qi3.class), null, null), (v88) m7fVar5.a(kceVar2.b(v88.class), null, null));
            case 8:
                m7f m7fVar6 = (m7f) obj;
                m7fVar6.getClass();
                ((bsc) obj2).getClass();
                return new ud5((m26) m7fVar6.a(jce.a.b(m26.class), null, null));
            case 9:
                m7f m7fVar7 = (m7f) obj;
                m7fVar7.getClass();
                ((bsc) obj2).getClass();
                kce kceVar3 = jce.a;
                return new a8f((qi3) m7fVar7.a(kceVar3.b(qi3.class), null, null), (mn5) m7fVar7.a(kceVar3.b(mn5.class), null, null));
            case 10:
                m7f m7fVar8 = (m7f) obj;
                m7fVar8.getClass();
                ((bsc) obj2).getClass();
                return new bj0((mn5) m7fVar8.a(jce.a.b(mn5.class), null, null));
            case 11:
                m7f m7fVar9 = (m7f) obj;
                m7fVar9.getClass();
                ((bsc) obj2).getClass();
                kce kceVar4 = jce.a;
                return new ok0((mn5) m7fVar9.a(kceVar4.b(mn5.class), null, null), (tf5) m7fVar9.a(kceVar4.b(tf5.class), null, null), (FileSystem) m7fVar9.a(kceVar4.b(FileSystem.class), null, null), (bg9) m7fVar9.a(kceVar4.b(bg9.class), null, null), (h86) m7fVar9.a(kceVar4.b(h86.class), null, null), (xjc) m7fVar9.a(kceVar4.b(xjc.class), null, null), (lea) m7fVar9.a(kceVar4.b(lea.class), null, null));
            case 12:
                m7f m7fVar10 = (m7f) obj;
                m7fVar10.getClass();
                ((bsc) obj2).getClass();
                return new vob((lea) m7fVar10.a(jce.a.b(lea.class), null, null));
            case 13:
                m7f m7fVar11 = (m7f) obj;
                m7fVar11.getClass();
                ((bsc) obj2).getClass();
                kce kceVar5 = jce.a;
                return new tl0((ok0) m7fVar11.a(kceVar5.b(ok0.class), null, null), (q7) m7fVar11.a(kceVar5.b(q7.class), null, null), (vob) m7fVar11.a(kceVar5.b(vob.class), null, null), (qi3) m7fVar11.a(kceVar5.b(qi3.class), null, null), (yjc) m7fVar11.a(kceVar5.b(yjc.class), null, null), (sc8) m7fVar11.a(kceVar5.b(sc8.class), null, null), (of7) m7fVar11.a(kceVar5.b(of7.class), null, null), (vl0) m7fVar11.a(kceVar5.b(vl0.class), null, null), (h86) m7fVar11.a(kceVar5.b(h86.class), null, null));
            case 14:
                m7f m7fVar12 = (m7f) obj;
                m7fVar12.getClass();
                ((bsc) obj2).getClass();
                kce kceVar6 = jce.a;
                return new c78((m78) m7fVar12.a(kceVar6.b(m78.class), null, null), (b78) m7fVar12.a(kceVar6.b(b78.class), null, null));
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                m7f m7fVar13 = (m7f) obj;
                m7fVar13.getClass();
                ((bsc) obj2).getClass();
                kce kceVar7 = jce.a;
                return new g78((b78) m7fVar13.a(kceVar7.b(b78.class), null, null), (m78) m7fVar13.a(kceVar7.b(m78.class), null, null), (vn5) m7fVar13.a(kceVar7.b(vn5.class), null, null), (h86) m7fVar13.a(kceVar7.b(h86.class), null, null));
            case 16:
                m7f m7fVar14 = (m7f) obj;
                m7fVar14.getClass();
                ((bsc) obj2).getClass();
                kce kceVar8 = jce.a;
                return new jk0((koi) m7fVar14.a(kceVar8.b(koi.class), null, null), (tl0) m7fVar14.a(kceVar8.b(tl0.class), null, null));
            case g.MAX_FIELD_NUMBER /* 17 */:
                ((m7f) obj).getClass();
                ((bsc) obj2).getClass();
                return new lq0();
            case g.AVG_FIELD_NUMBER /* 18 */:
                m7f m7fVar15 = (m7f) obj;
                m7fVar15.getClass();
                ((bsc) obj2).getClass();
                return new y31((h86) m7fVar15.a(jce.a.b(h86.class), null, null));
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                m7f m7fVar16 = (m7f) obj;
                m7fVar16.getClass();
                ((bsc) obj2).getClass();
                return new dkb((akb) m7fVar16.a(jce.a.b(akb.class), null, null));
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                m7f m7fVar17 = (m7f) obj;
                m7fVar17.getClass();
                ((bsc) obj2).getClass();
                kce kceVar9 = jce.a;
                m7fVar17.a(kceVar9.b(Integer.class), null, null);
                m7fVar17.a(kceVar9.b(Integer.class), null, null);
                y6a.r(m7fVar17.a(kceVar9.b(g51.class), null, null));
                throw null;
            case 21:
                m7f m7fVar18 = (m7f) obj;
                m7fVar18.getClass();
                ((bsc) obj2).getClass();
                return new p41((h86) m7fVar18.a(jce.a.b(h86.class), null, null));
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                m7f m7fVar19 = (m7f) obj;
                m7fVar19.getClass();
                ((bsc) obj2).getClass();
                kce kceVar10 = jce.a;
                return new gj1((rc8) m7fVar19.a(kceVar10.b(rc8.class), null, null), (um1) m7fVar19.a(kceVar10.b(um1.class), null, null), (y31) m7fVar19.a(kceVar10.b(y31.class), null, null));
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                m7f m7fVar20 = (m7f) obj;
                m7fVar20.getClass();
                ((bsc) obj2).getClass();
                kce kceVar11 = jce.a;
                return new u4j((q7) m7fVar20.a(kceVar11.b(q7.class), null, null), (f9) m7fVar20.a(kceVar11.b(f9.class), null, null), (um1) m7fVar20.a(kceVar11.b(um1.class), null, null), (fk0) m7fVar20.a(kceVar11.b(fk0.class), null, null), (ysg) m7fVar20.a(kceVar11.b(ysg.class), null, null), (fn0) m7fVar20.a(kceVar11.b(fn0.class), null, null));
            case 24:
                ((m7f) obj).getClass();
                ((bsc) obj2).getClass();
                return new f4j();
            case BuildConfig.VERSION_CODE /* 25 */:
                ((m7f) obj).getClass();
                ((bsc) obj2).getClass();
                return new nmi();
            case 26:
                m7f m7fVar21 = (m7f) obj;
                m7fVar21.getClass();
                ((bsc) obj2).getClass();
                kce kceVar12 = jce.a;
                return new my8((oda) m7fVar21.a(kceVar12.b(oda.class), null, null), (sda) m7fVar21.a(kceVar12.b(sda.class), null, null), (h86) m7fVar21.a(kceVar12.b(h86.class), null, null));
            case 27:
                m7f m7fVar22 = (m7f) obj;
                m7fVar22.getClass();
                ((bsc) obj2).getClass();
                kce kceVar13 = jce.a;
                return new bi7((oda) m7fVar22.a(kceVar13.b(oda.class), null, null), (my8) m7fVar22.a(kceVar13.b(my8.class), null, null), (u6j) m7fVar22.a(kceVar13.b(u6j.class), null, null));
            case 28:
                m7f m7fVar23 = (m7f) obj;
                m7fVar23.getClass();
                ((bsc) obj2).getClass();
                kce kceVar14 = jce.a;
                return new k21((dl2) m7fVar23.a(kceVar14.b(dl2.class), null, null), (h86) m7fVar23.a(kceVar14.b(h86.class), null, null), (oda) m7fVar23.a(kceVar14.b(oda.class), null, null), (koi) m7fVar23.a(kceVar14.b(koi.class), null, null));
            default:
                m7f m7fVar24 = (m7f) obj;
                m7fVar24.getClass();
                ((bsc) obj2).getClass();
                kce kceVar15 = jce.a;
                return new ck7((dl2) m7fVar24.a(kceVar15.b(dl2.class), null, null), (haj) m7fVar24.a(kceVar15.b(haj.class), null, null), (ok7) m7fVar24.a(kceVar15.b(ok7.class), null, null), ((OrganizationId) m7fVar24.a(kceVar15.b(OrganizationId.class), null, null)).m1071unboximpl(), (qi3) m7fVar24.a(kceVar15.b(qi3.class), null, null), (b1i) m7fVar24.a(kceVar15.b(b1i.class), null, null), (abj) m7fVar24.a(kceVar15.b(abj.class), null, null), (vd3) m7fVar24.a(kceVar15.b(vd3.class), null, null), (f1c) m7fVar24.a(kceVar15.b(f1c.class), null, null), (rc8) m7fVar24.a(kceVar15.b(rc8.class), null, null), (bg9) m7fVar24.a(kceVar15.b(bg9.class), null, null), (bj0) m7fVar24.a(kceVar15.b(bj0.class), null, null));
        }
    }
}
