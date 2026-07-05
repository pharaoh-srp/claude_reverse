package defpackage;

import android.content.Context;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.chat.input.files.a;
import com.anthropic.claude.chat.input.files.i;
import com.anthropic.claude.connector.auth.b;
import com.anthropic.claude.types.strings.OrganizationId;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class dx2 implements pz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ dx2(int i) {
        this.E = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        switch (this.E) {
            case 0:
                m7f m7fVar = (m7f) obj;
                m7fVar.getClass();
                ((bsc) obj2).getClass();
                kce kceVar = jce.a;
                Object objA = m7fVar.a(kceVar.b(q7.class), null, null);
                Object objA2 = m7fVar.a(kceVar.b(qi3.class), null, null);
                Object objA3 = m7fVar.a(kceVar.b(oda.class), null, null);
                Object objA4 = m7fVar.a(kceVar.b(bi7.class), null, null);
                Object objA5 = m7fVar.a(kceVar.b(k21.class), null, null);
                Object objA6 = m7fVar.a(kceVar.b(ck7.class), null, null);
                Object objA7 = m7fVar.a(kceVar.b(bj0.class), null, null);
                Object objA8 = m7fVar.a(kceVar.b(fn0.class), null, null);
                return new a((q7) objA, (qi3) objA2, (oda) objA3, (bi7) objA4, (k21) objA5, (ck7) objA6, (bj0) objA7, (fn0) objA8, (i) m7fVar.a(kceVar.b(i.class), null, null), (koi) m7fVar.a(kceVar.b(koi.class), null, null));
            case 1:
                m7f m7fVar2 = (m7f) obj;
                m7fVar2.getClass();
                ((bsc) obj2).getClass();
                kce kceVar2 = jce.a;
                Object objA9 = m7fVar2.a(kceVar2.b(Context.class), null, null);
                Object objA10 = m7fVar2.a(kceVar2.b(koi.class), null, null);
                Object objA11 = m7fVar2.a(kceVar2.b(doi.class), null, null);
                Object objA12 = m7fVar2.a(kceVar2.b(h86.class), null, null);
                return new fb6((Context) objA9, (koi) objA10, (doi) objA11, (h86) objA12, (mn5) m7fVar2.a(kceVar2.b(mn5.class), null, null), (bg9) m7fVar2.a(kceVar2.b(bg9.class), null, null));
            case 2:
                m7f m7fVar3 = (m7f) obj;
                m7fVar3.getClass();
                ((bsc) obj2).getClass();
                kce kceVar3 = jce.a;
                return new oy2((rc8) m7fVar3.a(kceVar3.b(rc8.class), null, null), (vpd) m7fVar3.a(kceVar3.b(vpd.class), null, null));
            case 3:
                m7f m7fVar4 = (m7f) obj;
                m7fVar4.getClass();
                ((bsc) obj2).getClass();
                kce kceVar4 = jce.a;
                Object objA13 = m7fVar4.a(kceVar4.b(fb6.class), null, null);
                return new z93((fb6) objA13, (vd3) m7fVar4.a(kceVar4.b(vd3.class), null, null), (zkg) m7fVar4.a(kceVar4.b(zkg.class), null, null));
            case 4:
                m7f m7fVar5 = (m7f) obj;
                m7fVar5.getClass();
                ((bsc) obj2).getClass();
                kce kceVar5 = jce.a;
                return new uz2((nz2) m7fVar5.a(kceVar5.b(nz2.class), null, null), (h86) m7fVar5.a(kceVar5.b(h86.class), null, null));
            case 5:
                m7f m7fVar6 = (m7f) obj;
                m7fVar6.getClass();
                ((bsc) obj2).getClass();
                return new f93((h86) m7fVar6.a(jce.a.b(h86.class), null, null));
            case 6:
                m7f m7fVar7 = (m7f) obj;
                m7fVar7.getClass();
                ((bsc) obj2).getClass();
                return new oa3(((doi) m7fVar7.a(jce.a.b(doi.class), null, null)).a("chat_screen_upsells"));
            case 7:
                m7f m7fVar8 = (m7f) obj;
                m7fVar8.getClass();
                ((bsc) obj2).getClass();
                return new cr9(((doi) m7fVar8.a(jce.a.b(doi.class), null, null)).a("chat_known_terminal_error_conversations"));
            case 8:
                m7f m7fVar9 = (m7f) obj;
                m7fVar9.getClass();
                ((bsc) obj2).getClass();
                kce kceVar6 = jce.a;
                Object objA14 = m7fVar9.a(kceVar6.b(qi3.class), null, null);
                Object objA15 = m7fVar9.a(kceVar6.b(koi.class), null, null);
                return new na3((qi3) objA14, (koi) objA15, (oa3) m7fVar9.a(kceVar6.b(oa3.class), null, null), (i8c) m7fVar9.a(kceVar6.b(i8c.class), null, null));
            case 9:
                m7f m7fVar10 = (m7f) obj;
                m7fVar10.getClass();
                ((bsc) obj2).getClass();
                kce kceVar7 = jce.a;
                Object objA16 = m7fVar10.a(kceVar7.b(qi3.class), null, null);
                Object objA17 = m7fVar10.a(kceVar7.b(id.class), null, null);
                Object objA18 = m7fVar10.a(kceVar7.b(bj0.class), null, null);
                Object objA19 = m7fVar10.a(kceVar7.b(mn5.class), null, null);
                Object objA20 = m7fVar10.a(kceVar7.b(rc8.class), null, null);
                Object objA21 = m7fVar10.a(kceVar7.b(md9.class), null, null);
                Object objA22 = m7fVar10.a(kceVar7.b(h86.class), null, null);
                return new fm2((qi3) objA16, (id) objA17, (bj0) objA18, (mn5) objA19, (rc8) objA20, (md9) objA21, (h86) objA22, (myh) m7fVar10.a(kceVar7.b(myh.class), null, null), (hl8) m7fVar10.a(kceVar7.b(hl8.class), null, null));
            case 10:
                m7f m7fVar11 = (m7f) obj;
                m7fVar11.getClass();
                ((bsc) obj2).getClass();
                kce kceVar8 = jce.a;
                Object objA23 = m7fVar11.a(kceVar8.b(dl2.class), null, null);
                Object objA24 = m7fVar11.a(kceVar8.b(qs2.class), null, null);
                Object objA25 = m7fVar11.a(kceVar8.b(vd3.class), null, null);
                return new h0e((dl2) objA23, (qs2) objA24, (vd3) objA25, (fb6) m7fVar11.a(kceVar8.b(fb6.class), null, null), (mn5) m7fVar11.a(kceVar8.b(mn5.class), null, null));
            case 11:
                m7f m7fVar12 = (m7f) obj;
                m7fVar12.getClass();
                ((bsc) obj2).getClass();
                kce kceVar9 = jce.a;
                Object objA26 = m7fVar12.a(kceVar9.b(dl2.class), null, null);
                Object objA27 = m7fVar12.a(kceVar9.b(qs2.class), null, null);
                Object objA28 = m7fVar12.a(kceVar9.b(sm2.class), null, null);
                Object objA29 = m7fVar12.a(kceVar9.b(iib.class), null, null);
                return new nm2((dl2) objA26, (qs2) objA27, (sm2) objA28, (iib) objA29, (loi) m7fVar12.a(kceVar9.b(loi.class), null, null), (mn5) m7fVar12.a(kceVar9.b(mn5.class), null, null));
            case 12:
                m7f m7fVar13 = (m7f) obj;
                m7fVar13.getClass();
                ((bsc) obj2).getClass();
                kce kceVar10 = jce.a;
                Object objA30 = m7fVar13.a(kceVar10.b(h86.class), null, null);
                Object objA31 = m7fVar13.a(kceVar10.b(cj3.class), null, null);
                Object objA32 = m7fVar13.a(kceVar10.b(nib.class), null, null);
                return new sm2((h86) objA30, (cj3) objA31, (nib) objA32, (r17) m7fVar13.a(kceVar10.b(r17.class), null, null), (mjg) m7fVar13.a(kceVar10.b(mjg.class), null, null));
            case 13:
                m7f m7fVar14 = (m7f) obj;
                m7fVar14.getClass();
                ((bsc) obj2).getClass();
                kce kceVar11 = jce.a;
                return new nib((bg9) m7fVar14.a(kceVar11.b(bg9.class), null, null), (cj3) m7fVar14.a(kceVar11.b(cj3.class), null, null));
            case 14:
                m7f m7fVar15 = (m7f) obj;
                m7fVar15.getClass();
                ((bsc) obj2).getClass();
                kce kceVar12 = jce.a;
                Object objA33 = m7fVar15.a(kceVar12.b(Context.class), null, null);
                return new sc3((Context) objA33, (h86) m7fVar15.a(kceVar12.b(h86.class), null, null), (bg9) m7fVar15.a(kceVar12.b(bg9.class), null, null));
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                m7f m7fVar16 = (m7f) obj;
                m7fVar16.getClass();
                ((bsc) obj2).getClass();
                kce kceVar13 = jce.a;
                return new gl2((h86) m7fVar16.a(kceVar13.b(h86.class), null, null), (ny2) m7fVar16.a(kceVar13.b(ny2.class), null, null));
            case 16:
                m7f m7fVar17 = (m7f) obj;
                m7fVar17.getClass();
                ((bsc) obj2).getClass();
                kce kceVar14 = jce.a;
                return new ny2((z74) m7fVar17.a(kceVar14.b(z74.class), null, null), (h86) m7fVar17.a(kceVar14.b(h86.class), null, null));
            case g.MAX_FIELD_NUMBER /* 17 */:
                m7f m7fVar18 = (m7f) obj;
                m7fVar18.getClass();
                ((bsc) obj2).getClass();
                kce kceVar15 = jce.a;
                Object objA34 = m7fVar18.a(kceVar15.b(gl2.class), null, null);
                Object objA35 = m7fVar18.a(kceVar15.b(ny2.class), null, null);
                Object objA36 = m7fVar18.a(kceVar15.b(sc3.class), null, null);
                Object objA37 = m7fVar18.a(kceVar15.b(myh.class), null, null);
                Object objA38 = m7fVar18.a(kceVar15.b(b1i.class), null, null);
                return new nz2((gl2) objA34, (ny2) objA35, (sc3) objA36, (myh) objA37, (b1i) objA38, (qs2) m7fVar18.a(kceVar15.b(qs2.class), null, null), (yle) m7fVar18.a(kceVar15.b(yle.class), null, null));
            case g.AVG_FIELD_NUMBER /* 18 */:
                m7f m7fVar19 = (m7f) obj;
                m7fVar19.getClass();
                ((bsc) obj2).getClass();
                kce kceVar16 = jce.a;
                Object objA39 = m7fVar19.a(kceVar16.b(dl2.class), null, null);
                Object objA40 = m7fVar19.a(kceVar16.b(koi.class), null, null);
                Object objA41 = m7fVar19.a(kceVar16.b(b1i.class), null, null);
                Object objA42 = m7fVar19.a(kceVar16.b(qi3.class), null, null);
                return new vd3((dl2) objA39, (koi) objA40, (b1i) objA41, (qi3) objA42, (hq4) m7fVar19.a(kceVar16.b(hq4.class), null, null), (loi) m7fVar19.a(kceVar16.b(loi.class), null, null));
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                m7f m7fVar20 = (m7f) obj;
                m7fVar20.getClass();
                ((bsc) obj2).getClass();
                kce kceVar17 = jce.a;
                Object objA43 = m7fVar20.a(kceVar17.b(vd3.class), null, null);
                Object objA44 = m7fVar20.a(kceVar17.b(hq4.class), null, null);
                Object objA45 = m7fVar20.a(kceVar17.b(rc8.class), null, null);
                return new oq4((vd3) objA43, (hq4) objA44, (rc8) objA45, (qi3) m7fVar20.a(kceVar17.b(qi3.class), null, null), (loi) m7fVar20.a(kceVar17.b(loi.class), null, null));
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                m7f m7fVar21 = (m7f) obj;
                m7fVar21.getClass();
                ((bsc) obj2).getClass();
                kce kceVar18 = jce.a;
                return new bcb((kab) m7fVar21.a(kceVar18.b(kab.class), null, null), (koi) m7fVar21.a(kceVar18.b(koi.class), null, null));
            case 21:
                ((m7f) obj).getClass();
                ((bsc) obj2).getClass();
                return new led();
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                m7f m7fVar22 = (m7f) obj;
                m7fVar22.getClass();
                ((bsc) obj2).getClass();
                kce kceVar19 = jce.a;
                Object objA46 = m7fVar22.a(kceVar19.b(hdc.class), null, null);
                Object objA47 = m7fVar22.a(kceVar19.b(ze0.class), null, null);
                Object objA48 = m7fVar22.a(kceVar19.b(koi.class), null, null);
                return new ned((hdc) objA46, (ze0) objA47, (koi) objA48, (h86) m7fVar22.a(kceVar19.b(h86.class), null, null), (led) m7fVar22.a(kceVar19.b(led.class), null, null));
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                m7f m7fVar23 = (m7f) obj;
                m7fVar23.getClass();
                ((bsc) obj2).getClass();
                kce kceVar20 = jce.a;
                Object objA49 = m7fVar23.a(kceVar20.b(dl2.class), null, null);
                return new xa3((dl2) objA49, (vd3) m7fVar23.a(kceVar20.b(vd3.class), null, null), (koi) m7fVar23.a(kceVar20.b(koi.class), null, null));
            case 24:
                ((m7f) obj).getClass();
                ((bsc) obj2).getClass();
                return new y48();
            case BuildConfig.VERSION_CODE /* 25 */:
                m7f m7fVar24 = (m7f) obj;
                m7fVar24.getClass();
                ((bsc) obj2).getClass();
                kce kceVar21 = jce.a;
                Object objA50 = m7fVar24.a(kceVar21.b(hdc.class), null, null);
                Object objA51 = m7fVar24.a(kceVar21.b(ze0.class), null, null);
                Object objA52 = m7fVar24.a(kceVar21.b(OrganizationId.class), null, null);
                return new ue2((hdc) objA50, (ze0) objA51, ((OrganizationId) objA52).m1071unboximpl(), (h86) m7fVar24.a(kceVar21.b(h86.class), null, null));
            case 26:
                m7f m7fVar25 = (m7f) obj;
                m7fVar25.getClass();
                ((bsc) obj2).getClass();
                return new vx3((jwf) m7fVar25.a(jce.a.b(jwf.class), null, null));
            case 27:
                m7f m7fVar26 = (m7f) obj;
                m7fVar26.getClass();
                ((bsc) obj2).getClass();
                kce kceVar22 = jce.a;
                Object objA53 = m7fVar26.a(kceVar22.b(qi3.class), null, null);
                Object objA54 = m7fVar26.a(kceVar22.b(swa.class), null, null);
                return new b((qi3) objA53, (swa) objA54, (q0i) m7fVar26.a(kceVar22.b(q0i.class), null, null), (koi) m7fVar26.a(kceVar22.b(koi.class), null, null));
            case 28:
                m7f m7fVar27 = (m7f) obj;
                m7fVar27.getClass();
                ((bsc) obj2).getClass();
                return new fn0((h86) m7fVar27.a(jce.a.b(h86.class), null, null));
            default:
                m7f m7fVar28 = (m7f) obj;
                m7fVar28.getClass();
                ((bsc) obj2).getClass();
                return new fn0((h86) m7fVar28.a(jce.a.b(h86.class), null, null));
        }
    }
}
