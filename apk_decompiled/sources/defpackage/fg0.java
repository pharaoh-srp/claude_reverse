package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.bell.api.b0;
import com.anthropic.claude.bell.tts.f;
import com.anthropic.claude.chat.input.files.i;
import com.anthropic.claude.types.strings.AccountId;
import com.anthropic.claude.types.strings.OrganizationId;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import okio.FileSystem;
import org.koin.android.error.MissingAndroidContextException;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fg0 implements pz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ fg0(int i) {
        this.E = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) throws MissingAndroidContextException {
        Object next;
        Set<String> stringSet;
        String string;
        Object obj3 = null;
        switch (this.E) {
            case 0:
                ((m7f) obj).getClass();
                ((bsc) obj2).getClass();
                return new b4e();
            case 1:
                m7f m7fVar = (m7f) obj;
                m7fVar.getClass();
                ((bsc) obj2).getClass();
                kce kceVar = jce.a;
                return new x89((fk0) m7fVar.a(kceVar.b(fk0.class), null, null), (b4e) m7fVar.a(kceVar.b(b4e.class), null, null));
            case 2:
                m7f m7fVar2 = (m7f) obj;
                m7fVar2.getClass();
                ((bsc) obj2).getClass();
                return ((ze0) m7fVar2.a(jce.a.b(ze0.class), null, null)).b;
            case 3:
                m7f m7fVar3 = (m7f) obj;
                m7fVar3.getClass();
                ((bsc) obj2).getClass();
                oqb oqbVar = fk0.K;
                fk0 fk0VarP0 = wd6.p0(yb5.g(m7fVar3));
                SharedPreferences sharedPreferences = fk0VarP0.a;
                String str = (String) ((Map) ze0.f.getValue()).get(fk0VarP0.b().a());
                if (str != null) {
                    ze0 ze0VarG = ez1.G(str);
                    String strD = fk0.d(fk0VarP0.b(), "app_last_account_id");
                    String strD2 = fk0.d(ze0VarG, "app_last_account_id");
                    if (!strD.equals(strD2) && (string = sharedPreferences.getString(strD, null)) != null) {
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.putString(strD2, string);
                        editorEdit.remove(strD);
                        editorEdit.apply();
                    }
                    String strD3 = fk0.d(fk0VarP0.b(), "app_known_account_ids");
                    String strD4 = fk0.d(ze0VarG, "app_known_account_ids");
                    if (!strD3.equals(strD4) && (stringSet = sharedPreferences.getStringSet(strD3, null)) != null) {
                        SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                        editorEdit2.putStringSet(strD4, stringSet);
                        editorEdit2.remove(strD3);
                        editorEdit2.apply();
                    }
                    fk0VarP0.e.setValue(ze0VarG);
                    SharedPreferences.Editor editorEdit3 = sharedPreferences.edit();
                    editorEdit3.putString("api_base_url", str);
                    editorEdit3.apply();
                }
                Set<String> stringSet2 = sharedPreferences.getStringSet(fk0.d(fk0VarP0.b(), "app_known_account_ids"), um6.E);
                stringSet2.getClass();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (String str2 : stringSet2) {
                    str2.getClass();
                    linkedHashSet.add(AccountId.m943boximpl(AccountId.m944constructorimpl(str2)));
                }
                fk0VarP0.b.setValue(linkedHashSet);
                String strE = fk0VarP0.e();
                if (strE != null && fk0VarP0.h().isEmpty()) {
                    fk0VarP0.w(sf5.f0(AccountId.m943boximpl(strE)));
                }
                String string2 = sharedPreferences.getString("theme_color_mode", null);
                zp3 zp3Var = ek0.F;
                gq6 gq6Var = ek0.I;
                if (string2 != null) {
                    Iterator<E> it = gq6Var.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            if (((ek0) next).E.equals(string2)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    ek0 ek0Var = (ek0) next;
                    if (ek0Var != null) {
                        SharedPreferences.Editor editorEdit4 = sharedPreferences.edit();
                        String strName = ek0Var.name();
                        zp3Var.getClass();
                        editorEdit4.putString("theme_color_mode", zp3.m(strName).E);
                        editorEdit4.apply();
                    }
                }
                String string3 = sharedPreferences.getString("theme_color_mode", null);
                if (string3 != null) {
                    Iterator<E> it2 = gq6Var.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Object next2 = it2.next();
                            if (((ek0) next2).E.equals(string3)) {
                                obj3 = next2;
                            }
                        }
                    }
                    ek0 ek0Var2 = (ek0) obj3;
                    if (ek0Var2 != null) {
                        SharedPreferences.Editor editorEdit5 = sharedPreferences.edit();
                        String strName2 = ek0Var2.name();
                        zp3Var.getClass();
                        editorEdit5.putString("theme_color_mode", zp3.m(strName2).E);
                        editorEdit5.apply();
                    }
                    String strD5 = fk0.d(fk0VarP0.b(), "app_last_anonymous_account_id");
                    SharedPreferences.Editor editorEdit6 = sharedPreferences.edit();
                    editorEdit6.remove(strD5);
                    editorEdit6.apply();
                    String strD6 = fk0.d(fk0VarP0.b(), "feature_anonymous");
                    SharedPreferences.Editor editorEdit7 = sharedPreferences.edit();
                    editorEdit7.remove(strD6);
                    editorEdit7.apply();
                }
                if (!sharedPreferences.contains("stt_language_explicitly_chosen")) {
                    fk0VarP0.u(sharedPreferences.contains("stt_language"));
                }
                SharedPreferences.Editor editorEdit8 = sharedPreferences.edit();
                editorEdit8.remove("beta_fonts_enabled");
                editorEdit8.remove("mcp_tooltip_seen");
                editorEdit8.remove("guest_mode_check_enabled");
                editorEdit8.remove("guest_mode_always_use");
                editorEdit8.remove("pika_ant_token");
                editorEdit8.apply();
                return fk0VarP0;
            case 4:
                m7f m7fVar4 = (m7f) obj;
                m7fVar4.getClass();
                ((bsc) obj2).getClass();
                kce kceVar2 = jce.a;
                return new b78((mn5) m7fVar4.a(kceVar2.b(mn5.class), null, null), (tf5) m7fVar4.a(kceVar2.b(tf5.class), null, null), (FileSystem) m7fVar4.a(kceVar2.b(FileSystem.class), null, null), (bg9) m7fVar4.a(kceVar2.b(bg9.class), null, null), (h86) m7fVar4.a(kceVar2.b(h86.class), null, null), (a78) m7fVar4.a(kceVar2.b(a78.class), nai.r, null));
            case 5:
                m7f m7fVar5 = (m7f) obj;
                m7fVar5.getClass();
                ((bsc) obj2).getClass();
                return new yjc(new ul0(m7fVar5, 0));
            case 6:
                ((m7f) obj).getClass();
                ((bsc) obj2).getClass();
                return new vl0(iuj.n(wl0.F));
            case 7:
                m7f m7fVar6 = (m7f) obj;
                m7fVar6.getClass();
                ((bsc) obj2).getClass();
                SharedPreferences sharedPreferences2 = yb5.g(m7fVar6).getSharedPreferences("app_stats", 0);
                sharedPreferences2.getClass();
                return new am0(sharedPreferences2);
            case 8:
                m7f m7fVar7 = (m7f) obj;
                m7fVar7.getClass();
                ((bsc) obj2).getClass();
                return new rr0(((ze0) m7fVar7.a(jce.a.b(ze0.class), null, null)).a());
            case 9:
                m7f m7fVar8 = (m7f) obj;
                m7fVar8.getClass();
                ((bsc) obj2).getClass();
                kce kceVar3 = jce.a;
                return new saj(((OrganizationId) m7fVar8.a(kceVar3.b(OrganizationId.class), null, null)).m1071unboximpl(), new ul0(m7fVar8, 1), (ze0) m7fVar8.a(kceVar3.b(ze0.class), null, null), (z74) m7fVar8.a(kceVar3.b(z74.class), null, null));
            case 10:
                m7f m7fVar9 = (m7f) obj;
                m7fVar9.getClass();
                ((bsc) obj2).getClass();
                kce kceVar4 = jce.a;
                return new akb((h86) m7fVar9.a(kceVar4.b(h86.class), null, null), (p41) m7fVar9.a(kceVar4.b(p41.class), null, null));
            case 11:
                m7f m7fVar10 = (m7f) obj;
                m7fVar10.getClass();
                ((bsc) obj2).getClass();
                Context contextG = yb5.g(m7fVar10);
                kce kceVar5 = jce.a;
                d2h d2hVar = (d2h) m7fVar10.a(kceVar5.b(d2h.class), null, null);
                h86 h86Var = (h86) m7fVar10.a(kceVar5.b(h86.class), null, null);
                qi3 qi3Var = (qi3) m7fVar10.a(kceVar5.b(qi3.class), null, null);
                um1 um1Var = (um1) m7fVar10.a(kceVar5.b(um1.class), null, null);
                e2h e2hVar = (e2h) m7fVar10.a(kceVar5.b(e2h.class), null, null);
                int i = ((Boolean) ((gj1) m7fVar10.a(kceVar5.b(gj1.class), null, null)).s.getValue()).booleanValue() ? 2 : 0;
                Integer num = (Integer) ((gj1) m7fVar10.a(kceVar5.b(gj1.class), null, null)).t.getValue();
                wd6.e0(num != null ? num.intValue() : 0, 0, 3);
                return new f(contextG, d2hVar, h86Var, qi3Var, um1Var, e2hVar, i);
            case 12:
                ((m7f) obj).getClass();
                ((bsc) obj2).getClass();
                return b0.a();
            case 13:
                m7f m7fVar11 = (m7f) obj;
                m7fVar11.getClass();
                ((bsc) obj2).getClass();
                SharedPreferences sharedPreferences3 = yb5.g(m7fVar11).getApplicationContext().getSharedPreferences("bell_prefs", 0);
                sharedPreferences3.getClass();
                um1 um1Var2 = new um1(sharedPreferences3);
                SharedPreferences.Editor editorEdit9 = sharedPreferences3.edit();
                editorEdit9.remove("bell_tooltip_shown");
                editorEdit9.remove("bell_onboarding_shown");
                editorEdit9.remove("bell_onboarding_force");
                editorEdit9.apply();
                return um1Var2;
            case 14:
                m7f m7fVar12 = (m7f) obj;
                m7fVar12.getClass();
                ((bsc) obj2).getClass();
                File cacheDir = yb5.g(m7fVar12).getCacheDir();
                cacheDir.getClass();
                return new x4j(cacheDir, (hdc) m7fVar12.a(jce.a.b(hdc.class), null, null));
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                m7f m7fVar13 = (m7f) obj;
                m7fVar13.getClass();
                ((bsc) obj2).getClass();
                Context contextG2 = yb5.g(m7fVar13);
                kce kceVar6 = jce.a;
                return new xm1(contextG2, (x4j) m7fVar13.a(kceVar6.b(x4j.class), null, null), (h86) m7fVar13.a(kceVar6.b(h86.class), null, null), (fn0) m7fVar13.a(kceVar6.b(fn0.class), null, null));
            case 16:
                m7f m7fVar14 = (m7f) obj;
                m7fVar14.getClass();
                ((bsc) obj2).getClass();
                lm1 lm1Var = new lm1(m7fVar14, 0);
                mrg mrgVar = nai.l;
                kce kceVar7 = jce.a;
                return new yh1(lm1Var, (String) m7fVar14.a(kceVar7.b(String.class), mrgVar, null), (bg9) m7fVar14.a(kceVar7.b(bg9.class), nai.q, null), (koi) m7fVar14.a(kceVar7.b(koi.class), null, null), (mn5) m7fVar14.a(kceVar7.b(mn5.class), null, null), (gj1) m7fVar14.a(kceVar7.b(gj1.class), null, null), (x89) m7fVar14.a(kceVar7.b(x89.class), null, null));
            case g.MAX_FIELD_NUMBER /* 17 */:
                m7f m7fVar15 = (m7f) obj;
                m7fVar15.getClass();
                ((bsc) obj2).getClass();
                ul0 ul0Var = new ul0(m7fVar15, 2);
                mrg mrgVar2 = nai.l;
                kce kceVar8 = jce.a;
                return new d2h(ul0Var, (String) m7fVar15.a(kceVar8.b(String.class), mrgVar2, null), (bg9) m7fVar15.a(kceVar8.b(bg9.class), null, null), (gj1) m7fVar15.a(kceVar8.b(gj1.class), null, null), (um1) m7fVar15.a(kceVar8.b(um1.class), null, null));
            case g.AVG_FIELD_NUMBER /* 18 */:
                m7f m7fVar16 = (m7f) obj;
                m7fVar16.getClass();
                ((bsc) obj2).getClass();
                return ((Boolean) ((gj1) m7fVar16.a(jce.a.b(gj1.class), null, null)).n.getValue()).booleanValue() ? mm1.E : new coa();
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                m7f m7fVar17 = (m7f) obj;
                m7fVar17.getClass();
                ((bsc) obj2).getClass();
                File file = new File(oq5.G(yb5.g(m7fVar17)), "uploads");
                file.mkdirs();
                bgj bgjVarD = bgj.d(yb5.g(m7fVar17));
                bgjVarD.getClass();
                kce kceVar9 = jce.a;
                return new i(file, bgjVarD, (bg9) m7fVar17.a(kceVar9.b(bg9.class), null, null), (h86) m7fVar17.a(kceVar9.b(h86.class), null, null), (rc8) m7fVar17.a(kceVar9.b(rc8.class), null, null));
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                m7f m7fVar18 = (m7f) obj;
                m7fVar18.getClass();
                ((bsc) obj2).getClass();
                return new p6e(yb5.g(m7fVar18), (h86) m7fVar18.a(jce.a.b(h86.class), null, null));
            case 21:
                m7f m7fVar19 = (m7f) obj;
                m7fVar19.getClass();
                ((bsc) obj2).getClass();
                kce kceVar10 = jce.a;
                return new pt2((yw2) m7fVar19.a(kceVar10.b(yw2.class), null, null), (koi) m7fVar19.a(kceVar10.b(koi.class), null, null), (g09) m7fVar19.a(kceVar10.b(g09.class), null, null), (qi3) m7fVar19.a(kceVar10.b(qi3.class), null, null), yb5.g(m7fVar19), (h86) m7fVar19.a(kceVar10.b(h86.class), null, null), (rc8) m7fVar19.a(kceVar10.b(rc8.class), null, null), (fn0) m7fVar19.a(kceVar10.b(fn0.class), null, null));
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ((m7f) obj).getClass();
                ((bsc) obj2).getClass();
                return aed.b;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                m7f m7fVar20 = (m7f) obj;
                m7fVar20.getClass();
                ((bsc) obj2).getClass();
                Object objB = ((qre) m7fVar20.a(jce.a.b(qre.class), null, null)).b(dl2.class);
                objB.getClass();
                return (dl2) objB;
            case 24:
                m7f m7fVar21 = (m7f) obj;
                m7fVar21.getClass();
                ((bsc) obj2).getClass();
                Object objB2 = ((qre) m7fVar21.a(jce.a.b(qre.class), null, null)).b(ok7.class);
                objB2.getClass();
                return (ok7) objB2;
            case BuildConfig.VERSION_CODE /* 25 */:
                m7f m7fVar22 = (m7f) obj;
                m7fVar22.getClass();
                ((bsc) obj2).getClass();
                Object objB3 = ((qre) m7fVar22.a(jce.a.b(qre.class), null, null)).b(swa.class);
                objB3.getClass();
                return (swa) objB3;
            case 26:
                m7f m7fVar23 = (m7f) obj;
                m7fVar23.getClass();
                ((bsc) obj2).getClass();
                Object objB4 = ((qre) m7fVar23.a(jce.a.b(qre.class), null, null)).b(haj.class);
                objB4.getClass();
                return (haj) objB4;
            case 27:
                m7f m7fVar24 = (m7f) obj;
                m7fVar24.getClass();
                ((bsc) obj2).getClass();
                return new oda(yb5.g(m7fVar24), (h86) m7fVar24.a(jce.a.b(h86.class), null, null));
            case 28:
                m7f m7fVar25 = (m7f) obj;
                m7fVar25.getClass();
                ((bsc) obj2).getClass();
                Context contextG3 = yb5.g(m7fVar25);
                kce kceVar11 = jce.a;
                return new sda(contextG3, (oda) m7fVar25.a(kceVar11.b(oda.class), null, null), (h86) m7fVar25.a(kceVar11.b(h86.class), null, null));
            default:
                m7f m7fVar26 = (m7f) obj;
                m7fVar26.getClass();
                ((bsc) obj2).getClass();
                Context contextG4 = yb5.g(m7fVar26);
                kce kceVar12 = jce.a;
                return new u6j(contextG4, (sda) m7fVar26.a(kceVar12.b(sda.class), null, null), (h86) m7fVar26.a(kceVar12.b(h86.class), null, null), (yw8) m7fVar26.a(kceVar12.b(yw8.class), null, null));
        }
    }
}
