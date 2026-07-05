package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.LocaleList;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.sessions.api.b;
import com.anthropic.claude.types.environment.AppEnvironment;
import com.anthropic.claude.types.strings.AccountId;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.koin.android.error.MissingAndroidContextException;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b8 implements bz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ b8(int i) {
        this.E = i;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        String value;
        String value2;
        int i = this.E;
        final int i2 = 12;
        final int i3 = 11;
        final int i4 = 16;
        final int i5 = 17;
        final int i6 = 9;
        final int i7 = 21;
        final int i8 = 20;
        final int i9 = 19;
        final int i10 = 10;
        final int i11 = 18;
        final int i12 = 5;
        final int i13 = 7;
        final int i14 = 8;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                oqb oqbVar = (oqb) obj;
                oqbVar.getClass();
                kce kceVar = jce.a;
                xai xaiVar = new xai(kceVar.b(j8.class));
                d8 d8Var = d8.F;
                pl9 pl9VarB = kceVar.b(AccountId.class);
                kq9 kq9Var = kq9.G;
                oqbVar.a(new w7f(new qh1(xaiVar, pl9VarB, null, d8Var, kq9Var)));
                final int i15 = 0;
                sq6.E(new qh1(xaiVar, kceVar.b(f8.class), null, new pz7() { // from class: c8
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) throws MissingAndroidContextException {
                        int i16 = 1;
                        switch (i15) {
                            case 0:
                                m7f m7fVar = (m7f) obj2;
                                m7fVar.getClass();
                                ((bsc) obj3).getClass();
                                Context contextG = yb5.g(m7fVar);
                                String strM949unboximpl = ((AccountId) m7fVar.a(jce.a.b(AccountId.class), null, null)).m949unboximpl();
                                strM949unboximpl.getClass();
                                SharedPreferences sharedPreferences = contextG.getApplicationContext().getSharedPreferences("account_prefs".concat(strM949unboximpl), 0);
                                sharedPreferences.getClass();
                                return new f8(sharedPreferences);
                            case 1:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                if (v40.a == null) {
                                    synchronized (v40.b) {
                                        if (v40.a == null) {
                                            pl7 pl7VarC = pl7.c();
                                            pl7VarC.a();
                                            v40.a = FirebaseAnalytics.getInstance(pl7VarC.a);
                                        }
                                        break;
                                    }
                                }
                                FirebaseAnalytics firebaseAnalytics = v40.a;
                                firebaseAnalytics.getClass();
                                return firebaseAnalytics;
                            case 2:
                                m7f m7fVar2 = (m7f) obj2;
                                m7fVar2.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar2 = jce.a;
                                return new ll7((FirebaseAnalytics) m7fVar2.a(kceVar2.b(FirebaseAnalytics.class), null, null), (am0) m7fVar2.a(kceVar2.b(am0.class), null, null));
                            case 3:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new kd();
                            case 4:
                                m7f m7fVar3 = (m7f) obj2;
                                m7fVar3.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar3 = jce.a;
                                return new hj((qi3) m7fVar3.a(kceVar3.b(qi3.class), null, null), (fk0) m7fVar3.a(kceVar3.b(fk0.class), null, null), new w9h(new cfk((Context) m7fVar3.a(kceVar3.b(Context.class), null, null))), (g78) m7fVar3.a(kceVar3.b(g78.class), null, null), (h86) m7fVar3.a(kceVar3.b(h86.class), null, null));
                            case 5:
                                m7f m7fVar4 = (m7f) obj2;
                                m7fVar4.getClass();
                                ((bsc) obj3).getClass();
                                return new pl(((doi) m7fVar4.a(jce.a.b(doi.class), null, null)).a("agent_chat"));
                            case 6:
                                m7f m7fVar5 = (m7f) obj2;
                                m7fVar5.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar4 = jce.a;
                                return new fq((dl2) m7fVar5.a(kceVar4.b(dl2.class), null, null), (h86) m7fVar5.a(kceVar4.b(h86.class), null, null), (oda) m7fVar5.a(kceVar4.b(oda.class), null, null), (koi) m7fVar5.a(kceVar4.b(koi.class), null, null));
                            case 7:
                                m7f m7fVar6 = (m7f) obj2;
                                m7fVar6.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar5 = jce.a;
                                return new vm((jwf) m7fVar6.a(kceVar5.b(jwf.class), null, null), (b) m7fVar6.a(kceVar5.b(b.class), null, null), (qzb) m7fVar6.a(kceVar5.b(qzb.class), null, null), (i8c) m7fVar6.a(kceVar5.b(i8c.class), null, null), (pl) m7fVar6.a(kceVar5.b(pl.class), null, null), yb5.g(m7fVar6), (ze0) m7fVar6.a(kceVar5.b(ze0.class), null, null), (koi) m7fVar6.a(kceVar5.b(koi.class), null, null), (i25) m7fVar6.a(kceVar5.b(i25.class), null, null), (hdc) m7fVar6.a(kceVar5.b(hdc.class), null, null), (fq) m7fVar6.a(kceVar5.b(fq.class), null, null), (oda) m7fVar6.a(kceVar5.b(oda.class), null, null), (h86) m7fVar6.a(kceVar5.b(h86.class), null, null), (qi3) m7fVar6.a(kceVar5.b(qi3.class), null, null), (z8c) m7fVar6.a(kceVar5.b(z8c.class), null, null), (j8i) m7fVar6.a(kceVar5.b(j8i.class), null, null), (rc8) m7fVar6.a(kceVar5.b(rc8.class), null, null));
                            case 8:
                                m7f m7fVar7 = (m7f) obj2;
                                m7fVar7.getClass();
                                ((bsc) obj3).getClass();
                                int i17 = lx.a[((AppEnvironment) m7fVar7.a(jce.a.b(AppEnvironment.class), null, null)).ordinal()];
                                if (i17 == 1) {
                                    return "LKJN8LsLERHEOXkw487o7qCTFOrGPimI";
                                }
                                if (i17 == 2 || i17 == 3) {
                                    return "b64sf1kxwDGe1PiSAlv5ixuH0f509RKK";
                                }
                                mr9.b();
                                return null;
                            case 9:
                                m7f m7fVar8 = (m7f) obj2;
                                m7fVar8.getClass();
                                ((bsc) obj3).getClass();
                                mrg mrgVar = mx.a;
                                kce kceVar6 = jce.a;
                                return new nff((String) m7fVar8.a(kceVar6.b(String.class), mrgVar, null), (Context) m7fVar8.a(kceVar6.b(Context.class), null, null), (h86) m7fVar8.a(kceVar6.b(h86.class), null, null), (ud5) m7fVar8.a(kceVar6.b(ud5.class), null, null), (qk5) m7fVar8.a(kceVar6.b(qk5.class), null, null));
                            case 10:
                                m7f m7fVar9 = (m7f) obj2;
                                m7fVar9.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar7 = jce.a;
                                nff nffVar = (nff) m7fVar9.a(kceVar7.b(nff.class), null, null);
                                yw ywVar = gx.Companion;
                                ql8 ql8Var = new ql8(12);
                                ywVar.getClass();
                                gx.K = ql8Var;
                                String str = nffVar.a;
                                if (bsg.I0(str)) {
                                    sz6.p("writeKey cannot be blank ");
                                    return null;
                                }
                                mff mffVar = new mff(new eg4(nffVar.b, str), new el5(nffVar));
                                mffVar.b().a(new e10());
                                mffVar.b().a(new k30());
                                String strA = nffVar.d.a.a();
                                String languageTag = LocaleList.getDefault().get(0).toLanguageTag();
                                languageTag.getClass();
                                mffVar.b().a(new vd5(strA, languageTag));
                                mffVar.b().a(new nk5(i16));
                                mffVar.b().a(new nk5(nffVar.e));
                                boolean z = !((fk0) m7fVar9.a(kceVar7.b(fk0.class), null, null)).o();
                                mffVar.J = z;
                                el5 el5Var = mffVar.F;
                                gb9.D((mp4) el5Var.I, (e45) el5Var.F, null, new ax(mffVar, z, (tp4) null), 2);
                                return mffVar;
                            case 11:
                                m7f m7fVar10 = (m7f) obj2;
                                m7fVar10.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar8 = jce.a;
                                return new com.anthropic.claude.analytics.b((gx) m7fVar10.a(kceVar8.b(gx.class), null, null), (bg9) m7fVar10.a(kceVar8.b(bg9.class), null, null), (qk5) m7fVar10.a(kceVar8.b(qk5.class), null, null));
                            case 12:
                                m7f m7fVar11 = (m7f) obj2;
                                m7fVar11.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar11.a(jce.a.b(com.anthropic.claude.analytics.b.class), null, null);
                            case 13:
                                m7f m7fVar12 = (m7f) obj2;
                                m7fVar12.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar9 = jce.a;
                                fk0 fk0Var = (fk0) m7fVar12.a(kceVar9.b(fk0.class), null, null);
                                t29 t29Var = new t29(m7fVar12.a(kceVar9.b(gx.class), null, null));
                                t29 t29Var2 = new t29(m7fVar12.a(kceVar9.b(FirebaseAnalytics.class), null, null));
                                ((fk0) m7fVar12.a(kceVar9.b(fk0.class), null, null)).o();
                                return new smh(fk0Var, t29Var, t29Var2);
                            case 14:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new ti3();
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7f m7fVar13 = (m7f) obj2;
                                m7fVar13.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar13.a(jce.a.b(ti3.class), null, null);
                            case 16:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new hl8(new wg6(14), new rl7(6));
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7f m7fVar14 = (m7f) obj2;
                                m7fVar14.getClass();
                                ((bsc) obj3).getClass();
                                return new smh((fk0) m7fVar14.a(jce.a.b(fk0.class), null, null), new u0h(bw.G), new u0h(bw.H));
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7f m7fVar15 = (m7f) obj2;
                                m7fVar15.getClass();
                                ((bsc) obj3).getClass();
                                Object objB = ((qre) m7fVar15.a(jce.a.b(qre.class), null, null)).b(tja.class);
                                objB.getClass();
                                return (tja) objB;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7f m7fVar16 = (m7f) obj2;
                                m7fVar16.getClass();
                                ((bsc) obj3).getClass();
                                Object objB2 = ((qre) m7fVar16.a(jce.a.b(qre.class), null, null)).b(t8b.class);
                                objB2.getClass();
                                return (t8b) objB2;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7f m7fVar17 = (m7f) obj2;
                                m7fVar17.getClass();
                                ((bsc) obj3).getClass();
                                Object objB3 = ((qre) m7fVar17.a(jce.a.b(qre.class), null, null)).b(kab.class);
                                objB3.getClass();
                                return (kab) objB3;
                            case 21:
                                m7f m7fVar18 = (m7f) obj2;
                                m7fVar18.getClass();
                                ((bsc) obj3).getClass();
                                Object objB4 = ((qre) m7fVar18.a(jce.a.b(qre.class), null, null)).b(npb.class);
                                objB4.getClass();
                                return (npb) objB4;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7f m7fVar19 = (m7f) obj2;
                                m7fVar19.getClass();
                                ((bsc) obj3).getClass();
                                Object objB5 = ((qre) m7fVar19.a(jce.a.b(qre.class), null, null)).b(b7c.class);
                                objB5.getClass();
                                return (b7c) objB5;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7f m7fVar20 = (m7f) obj2;
                                m7fVar20.getClass();
                                ((bsc) obj3).getClass();
                                Object objB6 = ((qre) m7fVar20.a(jce.a.b(qre.class), null, null)).b(swa.class);
                                objB6.getClass();
                                return (swa) objB6;
                            case 24:
                                m7f m7fVar21 = (m7f) obj2;
                                m7fVar21.getClass();
                                ((bsc) obj3).getClass();
                                Object objB7 = ((qre) m7fVar21.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB7.getClass();
                                return (j2d) objB7;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7f m7fVar22 = (m7f) obj2;
                                m7fVar22.getClass();
                                ((bsc) obj3).getClass();
                                Object objB8 = ((qre) m7fVar22.a(jce.a.b(qre.class), null, null)).b(mkd.class);
                                objB8.getClass();
                                return (mkd) objB8;
                            case 26:
                                m7f m7fVar23 = (m7f) obj2;
                                m7fVar23.getClass();
                                ((bsc) obj3).getClass();
                                Object objB9 = ((qre) m7fVar23.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB9.getClass();
                                return (i8) objB9;
                            case 27:
                                m7f m7fVar24 = (m7f) obj2;
                                m7fVar24.getClass();
                                ((bsc) obj3).getClass();
                                Object objB10 = ((qre) m7fVar24.a(jce.a.b(qre.class), null, null)).b(omd.class);
                                objB10.getClass();
                                return (omd) objB10;
                            case 28:
                                m7f m7fVar25 = (m7f) obj2;
                                m7fVar25.getClass();
                                ((bsc) obj3).getClass();
                                Object objB11 = ((qre) m7fVar25.a(jce.a.b(qre.class), null, null)).b(pxd.class);
                                objB11.getClass();
                                return (pxd) objB11;
                            default:
                                m7f m7fVar26 = (m7f) obj2;
                                m7fVar26.getClass();
                                ((bsc) obj3).getClass();
                                Object objB12 = ((qre) m7fVar26.a(jce.a.b(qre.class), null, null)).b(r0h.class);
                                objB12.getClass();
                                return (r0h) objB12;
                        }
                    }
                }, kq9Var), oqbVar);
                oqbVar.d.add(xaiVar);
                break;
            case 1:
                oqb oqbVar2 = (oqb) obj;
                oqbVar2.getClass();
                final int i16 = 1;
                pz7 pz7Var = new pz7() { // from class: c8
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) throws MissingAndroidContextException {
                        int i162 = 1;
                        switch (i16) {
                            case 0:
                                m7f m7fVar = (m7f) obj2;
                                m7fVar.getClass();
                                ((bsc) obj3).getClass();
                                Context contextG = yb5.g(m7fVar);
                                String strM949unboximpl = ((AccountId) m7fVar.a(jce.a.b(AccountId.class), null, null)).m949unboximpl();
                                strM949unboximpl.getClass();
                                SharedPreferences sharedPreferences = contextG.getApplicationContext().getSharedPreferences("account_prefs".concat(strM949unboximpl), 0);
                                sharedPreferences.getClass();
                                return new f8(sharedPreferences);
                            case 1:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                if (v40.a == null) {
                                    synchronized (v40.b) {
                                        if (v40.a == null) {
                                            pl7 pl7VarC = pl7.c();
                                            pl7VarC.a();
                                            v40.a = FirebaseAnalytics.getInstance(pl7VarC.a);
                                        }
                                        break;
                                    }
                                }
                                FirebaseAnalytics firebaseAnalytics = v40.a;
                                firebaseAnalytics.getClass();
                                return firebaseAnalytics;
                            case 2:
                                m7f m7fVar2 = (m7f) obj2;
                                m7fVar2.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar2 = jce.a;
                                return new ll7((FirebaseAnalytics) m7fVar2.a(kceVar2.b(FirebaseAnalytics.class), null, null), (am0) m7fVar2.a(kceVar2.b(am0.class), null, null));
                            case 3:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new kd();
                            case 4:
                                m7f m7fVar3 = (m7f) obj2;
                                m7fVar3.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar3 = jce.a;
                                return new hj((qi3) m7fVar3.a(kceVar3.b(qi3.class), null, null), (fk0) m7fVar3.a(kceVar3.b(fk0.class), null, null), new w9h(new cfk((Context) m7fVar3.a(kceVar3.b(Context.class), null, null))), (g78) m7fVar3.a(kceVar3.b(g78.class), null, null), (h86) m7fVar3.a(kceVar3.b(h86.class), null, null));
                            case 5:
                                m7f m7fVar4 = (m7f) obj2;
                                m7fVar4.getClass();
                                ((bsc) obj3).getClass();
                                return new pl(((doi) m7fVar4.a(jce.a.b(doi.class), null, null)).a("agent_chat"));
                            case 6:
                                m7f m7fVar5 = (m7f) obj2;
                                m7fVar5.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar4 = jce.a;
                                return new fq((dl2) m7fVar5.a(kceVar4.b(dl2.class), null, null), (h86) m7fVar5.a(kceVar4.b(h86.class), null, null), (oda) m7fVar5.a(kceVar4.b(oda.class), null, null), (koi) m7fVar5.a(kceVar4.b(koi.class), null, null));
                            case 7:
                                m7f m7fVar6 = (m7f) obj2;
                                m7fVar6.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar5 = jce.a;
                                return new vm((jwf) m7fVar6.a(kceVar5.b(jwf.class), null, null), (b) m7fVar6.a(kceVar5.b(b.class), null, null), (qzb) m7fVar6.a(kceVar5.b(qzb.class), null, null), (i8c) m7fVar6.a(kceVar5.b(i8c.class), null, null), (pl) m7fVar6.a(kceVar5.b(pl.class), null, null), yb5.g(m7fVar6), (ze0) m7fVar6.a(kceVar5.b(ze0.class), null, null), (koi) m7fVar6.a(kceVar5.b(koi.class), null, null), (i25) m7fVar6.a(kceVar5.b(i25.class), null, null), (hdc) m7fVar6.a(kceVar5.b(hdc.class), null, null), (fq) m7fVar6.a(kceVar5.b(fq.class), null, null), (oda) m7fVar6.a(kceVar5.b(oda.class), null, null), (h86) m7fVar6.a(kceVar5.b(h86.class), null, null), (qi3) m7fVar6.a(kceVar5.b(qi3.class), null, null), (z8c) m7fVar6.a(kceVar5.b(z8c.class), null, null), (j8i) m7fVar6.a(kceVar5.b(j8i.class), null, null), (rc8) m7fVar6.a(kceVar5.b(rc8.class), null, null));
                            case 8:
                                m7f m7fVar7 = (m7f) obj2;
                                m7fVar7.getClass();
                                ((bsc) obj3).getClass();
                                int i17 = lx.a[((AppEnvironment) m7fVar7.a(jce.a.b(AppEnvironment.class), null, null)).ordinal()];
                                if (i17 == 1) {
                                    return "LKJN8LsLERHEOXkw487o7qCTFOrGPimI";
                                }
                                if (i17 == 2 || i17 == 3) {
                                    return "b64sf1kxwDGe1PiSAlv5ixuH0f509RKK";
                                }
                                mr9.b();
                                return null;
                            case 9:
                                m7f m7fVar8 = (m7f) obj2;
                                m7fVar8.getClass();
                                ((bsc) obj3).getClass();
                                mrg mrgVar = mx.a;
                                kce kceVar6 = jce.a;
                                return new nff((String) m7fVar8.a(kceVar6.b(String.class), mrgVar, null), (Context) m7fVar8.a(kceVar6.b(Context.class), null, null), (h86) m7fVar8.a(kceVar6.b(h86.class), null, null), (ud5) m7fVar8.a(kceVar6.b(ud5.class), null, null), (qk5) m7fVar8.a(kceVar6.b(qk5.class), null, null));
                            case 10:
                                m7f m7fVar9 = (m7f) obj2;
                                m7fVar9.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar7 = jce.a;
                                nff nffVar = (nff) m7fVar9.a(kceVar7.b(nff.class), null, null);
                                yw ywVar = gx.Companion;
                                ql8 ql8Var = new ql8(12);
                                ywVar.getClass();
                                gx.K = ql8Var;
                                String str = nffVar.a;
                                if (bsg.I0(str)) {
                                    sz6.p("writeKey cannot be blank ");
                                    return null;
                                }
                                mff mffVar = new mff(new eg4(nffVar.b, str), new el5(nffVar));
                                mffVar.b().a(new e10());
                                mffVar.b().a(new k30());
                                String strA = nffVar.d.a.a();
                                String languageTag = LocaleList.getDefault().get(0).toLanguageTag();
                                languageTag.getClass();
                                mffVar.b().a(new vd5(strA, languageTag));
                                mffVar.b().a(new nk5(i162));
                                mffVar.b().a(new nk5(nffVar.e));
                                boolean z = !((fk0) m7fVar9.a(kceVar7.b(fk0.class), null, null)).o();
                                mffVar.J = z;
                                el5 el5Var = mffVar.F;
                                gb9.D((mp4) el5Var.I, (e45) el5Var.F, null, new ax(mffVar, z, (tp4) null), 2);
                                return mffVar;
                            case 11:
                                m7f m7fVar10 = (m7f) obj2;
                                m7fVar10.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar8 = jce.a;
                                return new com.anthropic.claude.analytics.b((gx) m7fVar10.a(kceVar8.b(gx.class), null, null), (bg9) m7fVar10.a(kceVar8.b(bg9.class), null, null), (qk5) m7fVar10.a(kceVar8.b(qk5.class), null, null));
                            case 12:
                                m7f m7fVar11 = (m7f) obj2;
                                m7fVar11.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar11.a(jce.a.b(com.anthropic.claude.analytics.b.class), null, null);
                            case 13:
                                m7f m7fVar12 = (m7f) obj2;
                                m7fVar12.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar9 = jce.a;
                                fk0 fk0Var = (fk0) m7fVar12.a(kceVar9.b(fk0.class), null, null);
                                t29 t29Var = new t29(m7fVar12.a(kceVar9.b(gx.class), null, null));
                                t29 t29Var2 = new t29(m7fVar12.a(kceVar9.b(FirebaseAnalytics.class), null, null));
                                ((fk0) m7fVar12.a(kceVar9.b(fk0.class), null, null)).o();
                                return new smh(fk0Var, t29Var, t29Var2);
                            case 14:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new ti3();
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7f m7fVar13 = (m7f) obj2;
                                m7fVar13.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar13.a(jce.a.b(ti3.class), null, null);
                            case 16:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new hl8(new wg6(14), new rl7(6));
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7f m7fVar14 = (m7f) obj2;
                                m7fVar14.getClass();
                                ((bsc) obj3).getClass();
                                return new smh((fk0) m7fVar14.a(jce.a.b(fk0.class), null, null), new u0h(bw.G), new u0h(bw.H));
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7f m7fVar15 = (m7f) obj2;
                                m7fVar15.getClass();
                                ((bsc) obj3).getClass();
                                Object objB = ((qre) m7fVar15.a(jce.a.b(qre.class), null, null)).b(tja.class);
                                objB.getClass();
                                return (tja) objB;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7f m7fVar16 = (m7f) obj2;
                                m7fVar16.getClass();
                                ((bsc) obj3).getClass();
                                Object objB2 = ((qre) m7fVar16.a(jce.a.b(qre.class), null, null)).b(t8b.class);
                                objB2.getClass();
                                return (t8b) objB2;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7f m7fVar17 = (m7f) obj2;
                                m7fVar17.getClass();
                                ((bsc) obj3).getClass();
                                Object objB3 = ((qre) m7fVar17.a(jce.a.b(qre.class), null, null)).b(kab.class);
                                objB3.getClass();
                                return (kab) objB3;
                            case 21:
                                m7f m7fVar18 = (m7f) obj2;
                                m7fVar18.getClass();
                                ((bsc) obj3).getClass();
                                Object objB4 = ((qre) m7fVar18.a(jce.a.b(qre.class), null, null)).b(npb.class);
                                objB4.getClass();
                                return (npb) objB4;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7f m7fVar19 = (m7f) obj2;
                                m7fVar19.getClass();
                                ((bsc) obj3).getClass();
                                Object objB5 = ((qre) m7fVar19.a(jce.a.b(qre.class), null, null)).b(b7c.class);
                                objB5.getClass();
                                return (b7c) objB5;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7f m7fVar20 = (m7f) obj2;
                                m7fVar20.getClass();
                                ((bsc) obj3).getClass();
                                Object objB6 = ((qre) m7fVar20.a(jce.a.b(qre.class), null, null)).b(swa.class);
                                objB6.getClass();
                                return (swa) objB6;
                            case 24:
                                m7f m7fVar21 = (m7f) obj2;
                                m7fVar21.getClass();
                                ((bsc) obj3).getClass();
                                Object objB7 = ((qre) m7fVar21.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB7.getClass();
                                return (j2d) objB7;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7f m7fVar22 = (m7f) obj2;
                                m7fVar22.getClass();
                                ((bsc) obj3).getClass();
                                Object objB8 = ((qre) m7fVar22.a(jce.a.b(qre.class), null, null)).b(mkd.class);
                                objB8.getClass();
                                return (mkd) objB8;
                            case 26:
                                m7f m7fVar23 = (m7f) obj2;
                                m7fVar23.getClass();
                                ((bsc) obj3).getClass();
                                Object objB9 = ((qre) m7fVar23.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB9.getClass();
                                return (i8) objB9;
                            case 27:
                                m7f m7fVar24 = (m7f) obj2;
                                m7fVar24.getClass();
                                ((bsc) obj3).getClass();
                                Object objB10 = ((qre) m7fVar24.a(jce.a.b(qre.class), null, null)).b(omd.class);
                                objB10.getClass();
                                return (omd) objB10;
                            case 28:
                                m7f m7fVar25 = (m7f) obj2;
                                m7fVar25.getClass();
                                ((bsc) obj3).getClass();
                                Object objB11 = ((qre) m7fVar25.a(jce.a.b(qre.class), null, null)).b(pxd.class);
                                objB11.getClass();
                                return (pxd) objB11;
                            default:
                                m7f m7fVar26 = (m7f) obj2;
                                m7fVar26.getClass();
                                ((bsc) obj3).getClass();
                                Object objB12 = ((qre) m7fVar26.a(jce.a.b(qre.class), null, null)).b(r0h.class);
                                objB12.getClass();
                                return (r0h) objB12;
                        }
                    }
                };
                kce kceVar2 = jce.a;
                pl9 pl9VarB2 = kceVar2.b(FirebaseAnalytics.class);
                mrg mrgVar = dpf.K;
                oqbVar2.a(new ge7(new qh1(mrgVar, pl9VarB2, null, pz7Var, kq9.F)));
                d8 d8Var2 = new d8(6);
                pl9 pl9VarB3 = kceVar2.b(v88.class);
                kq9 kq9Var2 = kq9.E;
                oqbVar2.a(new t7g(new qh1(mrgVar, pl9VarB3, null, d8Var2, kq9Var2)));
                oqbVar2.a(new t7g(new qh1(mrgVar, kceVar2.b(w59.class), null, new d8(i13), kq9Var2)));
                final int i17 = 2;
                sq6.C(new qh1(mrgVar, kceVar2.b(id.class), null, new pz7() { // from class: c8
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) throws MissingAndroidContextException {
                        int i162 = 1;
                        switch (i17) {
                            case 0:
                                m7f m7fVar = (m7f) obj2;
                                m7fVar.getClass();
                                ((bsc) obj3).getClass();
                                Context contextG = yb5.g(m7fVar);
                                String strM949unboximpl = ((AccountId) m7fVar.a(jce.a.b(AccountId.class), null, null)).m949unboximpl();
                                strM949unboximpl.getClass();
                                SharedPreferences sharedPreferences = contextG.getApplicationContext().getSharedPreferences("account_prefs".concat(strM949unboximpl), 0);
                                sharedPreferences.getClass();
                                return new f8(sharedPreferences);
                            case 1:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                if (v40.a == null) {
                                    synchronized (v40.b) {
                                        if (v40.a == null) {
                                            pl7 pl7VarC = pl7.c();
                                            pl7VarC.a();
                                            v40.a = FirebaseAnalytics.getInstance(pl7VarC.a);
                                        }
                                        break;
                                    }
                                }
                                FirebaseAnalytics firebaseAnalytics = v40.a;
                                firebaseAnalytics.getClass();
                                return firebaseAnalytics;
                            case 2:
                                m7f m7fVar2 = (m7f) obj2;
                                m7fVar2.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar22 = jce.a;
                                return new ll7((FirebaseAnalytics) m7fVar2.a(kceVar22.b(FirebaseAnalytics.class), null, null), (am0) m7fVar2.a(kceVar22.b(am0.class), null, null));
                            case 3:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new kd();
                            case 4:
                                m7f m7fVar3 = (m7f) obj2;
                                m7fVar3.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar3 = jce.a;
                                return new hj((qi3) m7fVar3.a(kceVar3.b(qi3.class), null, null), (fk0) m7fVar3.a(kceVar3.b(fk0.class), null, null), new w9h(new cfk((Context) m7fVar3.a(kceVar3.b(Context.class), null, null))), (g78) m7fVar3.a(kceVar3.b(g78.class), null, null), (h86) m7fVar3.a(kceVar3.b(h86.class), null, null));
                            case 5:
                                m7f m7fVar4 = (m7f) obj2;
                                m7fVar4.getClass();
                                ((bsc) obj3).getClass();
                                return new pl(((doi) m7fVar4.a(jce.a.b(doi.class), null, null)).a("agent_chat"));
                            case 6:
                                m7f m7fVar5 = (m7f) obj2;
                                m7fVar5.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar4 = jce.a;
                                return new fq((dl2) m7fVar5.a(kceVar4.b(dl2.class), null, null), (h86) m7fVar5.a(kceVar4.b(h86.class), null, null), (oda) m7fVar5.a(kceVar4.b(oda.class), null, null), (koi) m7fVar5.a(kceVar4.b(koi.class), null, null));
                            case 7:
                                m7f m7fVar6 = (m7f) obj2;
                                m7fVar6.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar5 = jce.a;
                                return new vm((jwf) m7fVar6.a(kceVar5.b(jwf.class), null, null), (b) m7fVar6.a(kceVar5.b(b.class), null, null), (qzb) m7fVar6.a(kceVar5.b(qzb.class), null, null), (i8c) m7fVar6.a(kceVar5.b(i8c.class), null, null), (pl) m7fVar6.a(kceVar5.b(pl.class), null, null), yb5.g(m7fVar6), (ze0) m7fVar6.a(kceVar5.b(ze0.class), null, null), (koi) m7fVar6.a(kceVar5.b(koi.class), null, null), (i25) m7fVar6.a(kceVar5.b(i25.class), null, null), (hdc) m7fVar6.a(kceVar5.b(hdc.class), null, null), (fq) m7fVar6.a(kceVar5.b(fq.class), null, null), (oda) m7fVar6.a(kceVar5.b(oda.class), null, null), (h86) m7fVar6.a(kceVar5.b(h86.class), null, null), (qi3) m7fVar6.a(kceVar5.b(qi3.class), null, null), (z8c) m7fVar6.a(kceVar5.b(z8c.class), null, null), (j8i) m7fVar6.a(kceVar5.b(j8i.class), null, null), (rc8) m7fVar6.a(kceVar5.b(rc8.class), null, null));
                            case 8:
                                m7f m7fVar7 = (m7f) obj2;
                                m7fVar7.getClass();
                                ((bsc) obj3).getClass();
                                int i172 = lx.a[((AppEnvironment) m7fVar7.a(jce.a.b(AppEnvironment.class), null, null)).ordinal()];
                                if (i172 == 1) {
                                    return "LKJN8LsLERHEOXkw487o7qCTFOrGPimI";
                                }
                                if (i172 == 2 || i172 == 3) {
                                    return "b64sf1kxwDGe1PiSAlv5ixuH0f509RKK";
                                }
                                mr9.b();
                                return null;
                            case 9:
                                m7f m7fVar8 = (m7f) obj2;
                                m7fVar8.getClass();
                                ((bsc) obj3).getClass();
                                mrg mrgVar2 = mx.a;
                                kce kceVar6 = jce.a;
                                return new nff((String) m7fVar8.a(kceVar6.b(String.class), mrgVar2, null), (Context) m7fVar8.a(kceVar6.b(Context.class), null, null), (h86) m7fVar8.a(kceVar6.b(h86.class), null, null), (ud5) m7fVar8.a(kceVar6.b(ud5.class), null, null), (qk5) m7fVar8.a(kceVar6.b(qk5.class), null, null));
                            case 10:
                                m7f m7fVar9 = (m7f) obj2;
                                m7fVar9.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar7 = jce.a;
                                nff nffVar = (nff) m7fVar9.a(kceVar7.b(nff.class), null, null);
                                yw ywVar = gx.Companion;
                                ql8 ql8Var = new ql8(12);
                                ywVar.getClass();
                                gx.K = ql8Var;
                                String str = nffVar.a;
                                if (bsg.I0(str)) {
                                    sz6.p("writeKey cannot be blank ");
                                    return null;
                                }
                                mff mffVar = new mff(new eg4(nffVar.b, str), new el5(nffVar));
                                mffVar.b().a(new e10());
                                mffVar.b().a(new k30());
                                String strA = nffVar.d.a.a();
                                String languageTag = LocaleList.getDefault().get(0).toLanguageTag();
                                languageTag.getClass();
                                mffVar.b().a(new vd5(strA, languageTag));
                                mffVar.b().a(new nk5(i162));
                                mffVar.b().a(new nk5(nffVar.e));
                                boolean z = !((fk0) m7fVar9.a(kceVar7.b(fk0.class), null, null)).o();
                                mffVar.J = z;
                                el5 el5Var = mffVar.F;
                                gb9.D((mp4) el5Var.I, (e45) el5Var.F, null, new ax(mffVar, z, (tp4) null), 2);
                                return mffVar;
                            case 11:
                                m7f m7fVar10 = (m7f) obj2;
                                m7fVar10.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar8 = jce.a;
                                return new com.anthropic.claude.analytics.b((gx) m7fVar10.a(kceVar8.b(gx.class), null, null), (bg9) m7fVar10.a(kceVar8.b(bg9.class), null, null), (qk5) m7fVar10.a(kceVar8.b(qk5.class), null, null));
                            case 12:
                                m7f m7fVar11 = (m7f) obj2;
                                m7fVar11.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar11.a(jce.a.b(com.anthropic.claude.analytics.b.class), null, null);
                            case 13:
                                m7f m7fVar12 = (m7f) obj2;
                                m7fVar12.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar9 = jce.a;
                                fk0 fk0Var = (fk0) m7fVar12.a(kceVar9.b(fk0.class), null, null);
                                t29 t29Var = new t29(m7fVar12.a(kceVar9.b(gx.class), null, null));
                                t29 t29Var2 = new t29(m7fVar12.a(kceVar9.b(FirebaseAnalytics.class), null, null));
                                ((fk0) m7fVar12.a(kceVar9.b(fk0.class), null, null)).o();
                                return new smh(fk0Var, t29Var, t29Var2);
                            case 14:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new ti3();
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7f m7fVar13 = (m7f) obj2;
                                m7fVar13.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar13.a(jce.a.b(ti3.class), null, null);
                            case 16:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new hl8(new wg6(14), new rl7(6));
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7f m7fVar14 = (m7f) obj2;
                                m7fVar14.getClass();
                                ((bsc) obj3).getClass();
                                return new smh((fk0) m7fVar14.a(jce.a.b(fk0.class), null, null), new u0h(bw.G), new u0h(bw.H));
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7f m7fVar15 = (m7f) obj2;
                                m7fVar15.getClass();
                                ((bsc) obj3).getClass();
                                Object objB = ((qre) m7fVar15.a(jce.a.b(qre.class), null, null)).b(tja.class);
                                objB.getClass();
                                return (tja) objB;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7f m7fVar16 = (m7f) obj2;
                                m7fVar16.getClass();
                                ((bsc) obj3).getClass();
                                Object objB2 = ((qre) m7fVar16.a(jce.a.b(qre.class), null, null)).b(t8b.class);
                                objB2.getClass();
                                return (t8b) objB2;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7f m7fVar17 = (m7f) obj2;
                                m7fVar17.getClass();
                                ((bsc) obj3).getClass();
                                Object objB3 = ((qre) m7fVar17.a(jce.a.b(qre.class), null, null)).b(kab.class);
                                objB3.getClass();
                                return (kab) objB3;
                            case 21:
                                m7f m7fVar18 = (m7f) obj2;
                                m7fVar18.getClass();
                                ((bsc) obj3).getClass();
                                Object objB4 = ((qre) m7fVar18.a(jce.a.b(qre.class), null, null)).b(npb.class);
                                objB4.getClass();
                                return (npb) objB4;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7f m7fVar19 = (m7f) obj2;
                                m7fVar19.getClass();
                                ((bsc) obj3).getClass();
                                Object objB5 = ((qre) m7fVar19.a(jce.a.b(qre.class), null, null)).b(b7c.class);
                                objB5.getClass();
                                return (b7c) objB5;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7f m7fVar20 = (m7f) obj2;
                                m7fVar20.getClass();
                                ((bsc) obj3).getClass();
                                Object objB6 = ((qre) m7fVar20.a(jce.a.b(qre.class), null, null)).b(swa.class);
                                objB6.getClass();
                                return (swa) objB6;
                            case 24:
                                m7f m7fVar21 = (m7f) obj2;
                                m7fVar21.getClass();
                                ((bsc) obj3).getClass();
                                Object objB7 = ((qre) m7fVar21.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB7.getClass();
                                return (j2d) objB7;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7f m7fVar22 = (m7f) obj2;
                                m7fVar22.getClass();
                                ((bsc) obj3).getClass();
                                Object objB8 = ((qre) m7fVar22.a(jce.a.b(qre.class), null, null)).b(mkd.class);
                                objB8.getClass();
                                return (mkd) objB8;
                            case 26:
                                m7f m7fVar23 = (m7f) obj2;
                                m7fVar23.getClass();
                                ((bsc) obj3).getClass();
                                Object objB9 = ((qre) m7fVar23.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB9.getClass();
                                return (i8) objB9;
                            case 27:
                                m7f m7fVar24 = (m7f) obj2;
                                m7fVar24.getClass();
                                ((bsc) obj3).getClass();
                                Object objB10 = ((qre) m7fVar24.a(jce.a.b(qre.class), null, null)).b(omd.class);
                                objB10.getClass();
                                return (omd) objB10;
                            case 28:
                                m7f m7fVar25 = (m7f) obj2;
                                m7fVar25.getClass();
                                ((bsc) obj3).getClass();
                                Object objB11 = ((qre) m7fVar25.a(jce.a.b(qre.class), null, null)).b(pxd.class);
                                objB11.getClass();
                                return (pxd) objB11;
                            default:
                                m7f m7fVar26 = (m7f) obj2;
                                m7fVar26.getClass();
                                ((bsc) obj3).getClass();
                                Object objB12 = ((qre) m7fVar26.a(jce.a.b(qre.class), null, null)).b(r0h.class);
                                objB12.getClass();
                                return (r0h) objB12;
                        }
                    }
                }, kq9Var2), oqbVar2);
                break;
            case 2:
                oqb oqbVar3 = (oqb) obj;
                oqbVar3.getClass();
                final int i18 = 3;
                sq6.C(new qh1(dpf.K, jce.a.b(id.class), null, new pz7() { // from class: c8
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) throws MissingAndroidContextException {
                        int i162 = 1;
                        switch (i18) {
                            case 0:
                                m7f m7fVar = (m7f) obj2;
                                m7fVar.getClass();
                                ((bsc) obj3).getClass();
                                Context contextG = yb5.g(m7fVar);
                                String strM949unboximpl = ((AccountId) m7fVar.a(jce.a.b(AccountId.class), null, null)).m949unboximpl();
                                strM949unboximpl.getClass();
                                SharedPreferences sharedPreferences = contextG.getApplicationContext().getSharedPreferences("account_prefs".concat(strM949unboximpl), 0);
                                sharedPreferences.getClass();
                                return new f8(sharedPreferences);
                            case 1:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                if (v40.a == null) {
                                    synchronized (v40.b) {
                                        if (v40.a == null) {
                                            pl7 pl7VarC = pl7.c();
                                            pl7VarC.a();
                                            v40.a = FirebaseAnalytics.getInstance(pl7VarC.a);
                                        }
                                        break;
                                    }
                                }
                                FirebaseAnalytics firebaseAnalytics = v40.a;
                                firebaseAnalytics.getClass();
                                return firebaseAnalytics;
                            case 2:
                                m7f m7fVar2 = (m7f) obj2;
                                m7fVar2.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar22 = jce.a;
                                return new ll7((FirebaseAnalytics) m7fVar2.a(kceVar22.b(FirebaseAnalytics.class), null, null), (am0) m7fVar2.a(kceVar22.b(am0.class), null, null));
                            case 3:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new kd();
                            case 4:
                                m7f m7fVar3 = (m7f) obj2;
                                m7fVar3.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar3 = jce.a;
                                return new hj((qi3) m7fVar3.a(kceVar3.b(qi3.class), null, null), (fk0) m7fVar3.a(kceVar3.b(fk0.class), null, null), new w9h(new cfk((Context) m7fVar3.a(kceVar3.b(Context.class), null, null))), (g78) m7fVar3.a(kceVar3.b(g78.class), null, null), (h86) m7fVar3.a(kceVar3.b(h86.class), null, null));
                            case 5:
                                m7f m7fVar4 = (m7f) obj2;
                                m7fVar4.getClass();
                                ((bsc) obj3).getClass();
                                return new pl(((doi) m7fVar4.a(jce.a.b(doi.class), null, null)).a("agent_chat"));
                            case 6:
                                m7f m7fVar5 = (m7f) obj2;
                                m7fVar5.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar4 = jce.a;
                                return new fq((dl2) m7fVar5.a(kceVar4.b(dl2.class), null, null), (h86) m7fVar5.a(kceVar4.b(h86.class), null, null), (oda) m7fVar5.a(kceVar4.b(oda.class), null, null), (koi) m7fVar5.a(kceVar4.b(koi.class), null, null));
                            case 7:
                                m7f m7fVar6 = (m7f) obj2;
                                m7fVar6.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar5 = jce.a;
                                return new vm((jwf) m7fVar6.a(kceVar5.b(jwf.class), null, null), (b) m7fVar6.a(kceVar5.b(b.class), null, null), (qzb) m7fVar6.a(kceVar5.b(qzb.class), null, null), (i8c) m7fVar6.a(kceVar5.b(i8c.class), null, null), (pl) m7fVar6.a(kceVar5.b(pl.class), null, null), yb5.g(m7fVar6), (ze0) m7fVar6.a(kceVar5.b(ze0.class), null, null), (koi) m7fVar6.a(kceVar5.b(koi.class), null, null), (i25) m7fVar6.a(kceVar5.b(i25.class), null, null), (hdc) m7fVar6.a(kceVar5.b(hdc.class), null, null), (fq) m7fVar6.a(kceVar5.b(fq.class), null, null), (oda) m7fVar6.a(kceVar5.b(oda.class), null, null), (h86) m7fVar6.a(kceVar5.b(h86.class), null, null), (qi3) m7fVar6.a(kceVar5.b(qi3.class), null, null), (z8c) m7fVar6.a(kceVar5.b(z8c.class), null, null), (j8i) m7fVar6.a(kceVar5.b(j8i.class), null, null), (rc8) m7fVar6.a(kceVar5.b(rc8.class), null, null));
                            case 8:
                                m7f m7fVar7 = (m7f) obj2;
                                m7fVar7.getClass();
                                ((bsc) obj3).getClass();
                                int i172 = lx.a[((AppEnvironment) m7fVar7.a(jce.a.b(AppEnvironment.class), null, null)).ordinal()];
                                if (i172 == 1) {
                                    return "LKJN8LsLERHEOXkw487o7qCTFOrGPimI";
                                }
                                if (i172 == 2 || i172 == 3) {
                                    return "b64sf1kxwDGe1PiSAlv5ixuH0f509RKK";
                                }
                                mr9.b();
                                return null;
                            case 9:
                                m7f m7fVar8 = (m7f) obj2;
                                m7fVar8.getClass();
                                ((bsc) obj3).getClass();
                                mrg mrgVar2 = mx.a;
                                kce kceVar6 = jce.a;
                                return new nff((String) m7fVar8.a(kceVar6.b(String.class), mrgVar2, null), (Context) m7fVar8.a(kceVar6.b(Context.class), null, null), (h86) m7fVar8.a(kceVar6.b(h86.class), null, null), (ud5) m7fVar8.a(kceVar6.b(ud5.class), null, null), (qk5) m7fVar8.a(kceVar6.b(qk5.class), null, null));
                            case 10:
                                m7f m7fVar9 = (m7f) obj2;
                                m7fVar9.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar7 = jce.a;
                                nff nffVar = (nff) m7fVar9.a(kceVar7.b(nff.class), null, null);
                                yw ywVar = gx.Companion;
                                ql8 ql8Var = new ql8(12);
                                ywVar.getClass();
                                gx.K = ql8Var;
                                String str = nffVar.a;
                                if (bsg.I0(str)) {
                                    sz6.p("writeKey cannot be blank ");
                                    return null;
                                }
                                mff mffVar = new mff(new eg4(nffVar.b, str), new el5(nffVar));
                                mffVar.b().a(new e10());
                                mffVar.b().a(new k30());
                                String strA = nffVar.d.a.a();
                                String languageTag = LocaleList.getDefault().get(0).toLanguageTag();
                                languageTag.getClass();
                                mffVar.b().a(new vd5(strA, languageTag));
                                mffVar.b().a(new nk5(i162));
                                mffVar.b().a(new nk5(nffVar.e));
                                boolean z = !((fk0) m7fVar9.a(kceVar7.b(fk0.class), null, null)).o();
                                mffVar.J = z;
                                el5 el5Var = mffVar.F;
                                gb9.D((mp4) el5Var.I, (e45) el5Var.F, null, new ax(mffVar, z, (tp4) null), 2);
                                return mffVar;
                            case 11:
                                m7f m7fVar10 = (m7f) obj2;
                                m7fVar10.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar8 = jce.a;
                                return new com.anthropic.claude.analytics.b((gx) m7fVar10.a(kceVar8.b(gx.class), null, null), (bg9) m7fVar10.a(kceVar8.b(bg9.class), null, null), (qk5) m7fVar10.a(kceVar8.b(qk5.class), null, null));
                            case 12:
                                m7f m7fVar11 = (m7f) obj2;
                                m7fVar11.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar11.a(jce.a.b(com.anthropic.claude.analytics.b.class), null, null);
                            case 13:
                                m7f m7fVar12 = (m7f) obj2;
                                m7fVar12.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar9 = jce.a;
                                fk0 fk0Var = (fk0) m7fVar12.a(kceVar9.b(fk0.class), null, null);
                                t29 t29Var = new t29(m7fVar12.a(kceVar9.b(gx.class), null, null));
                                t29 t29Var2 = new t29(m7fVar12.a(kceVar9.b(FirebaseAnalytics.class), null, null));
                                ((fk0) m7fVar12.a(kceVar9.b(fk0.class), null, null)).o();
                                return new smh(fk0Var, t29Var, t29Var2);
                            case 14:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new ti3();
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7f m7fVar13 = (m7f) obj2;
                                m7fVar13.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar13.a(jce.a.b(ti3.class), null, null);
                            case 16:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new hl8(new wg6(14), new rl7(6));
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7f m7fVar14 = (m7f) obj2;
                                m7fVar14.getClass();
                                ((bsc) obj3).getClass();
                                return new smh((fk0) m7fVar14.a(jce.a.b(fk0.class), null, null), new u0h(bw.G), new u0h(bw.H));
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7f m7fVar15 = (m7f) obj2;
                                m7fVar15.getClass();
                                ((bsc) obj3).getClass();
                                Object objB = ((qre) m7fVar15.a(jce.a.b(qre.class), null, null)).b(tja.class);
                                objB.getClass();
                                return (tja) objB;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7f m7fVar16 = (m7f) obj2;
                                m7fVar16.getClass();
                                ((bsc) obj3).getClass();
                                Object objB2 = ((qre) m7fVar16.a(jce.a.b(qre.class), null, null)).b(t8b.class);
                                objB2.getClass();
                                return (t8b) objB2;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7f m7fVar17 = (m7f) obj2;
                                m7fVar17.getClass();
                                ((bsc) obj3).getClass();
                                Object objB3 = ((qre) m7fVar17.a(jce.a.b(qre.class), null, null)).b(kab.class);
                                objB3.getClass();
                                return (kab) objB3;
                            case 21:
                                m7f m7fVar18 = (m7f) obj2;
                                m7fVar18.getClass();
                                ((bsc) obj3).getClass();
                                Object objB4 = ((qre) m7fVar18.a(jce.a.b(qre.class), null, null)).b(npb.class);
                                objB4.getClass();
                                return (npb) objB4;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7f m7fVar19 = (m7f) obj2;
                                m7fVar19.getClass();
                                ((bsc) obj3).getClass();
                                Object objB5 = ((qre) m7fVar19.a(jce.a.b(qre.class), null, null)).b(b7c.class);
                                objB5.getClass();
                                return (b7c) objB5;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7f m7fVar20 = (m7f) obj2;
                                m7fVar20.getClass();
                                ((bsc) obj3).getClass();
                                Object objB6 = ((qre) m7fVar20.a(jce.a.b(qre.class), null, null)).b(swa.class);
                                objB6.getClass();
                                return (swa) objB6;
                            case 24:
                                m7f m7fVar21 = (m7f) obj2;
                                m7fVar21.getClass();
                                ((bsc) obj3).getClass();
                                Object objB7 = ((qre) m7fVar21.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB7.getClass();
                                return (j2d) objB7;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7f m7fVar22 = (m7f) obj2;
                                m7fVar22.getClass();
                                ((bsc) obj3).getClass();
                                Object objB8 = ((qre) m7fVar22.a(jce.a.b(qre.class), null, null)).b(mkd.class);
                                objB8.getClass();
                                return (mkd) objB8;
                            case 26:
                                m7f m7fVar23 = (m7f) obj2;
                                m7fVar23.getClass();
                                ((bsc) obj3).getClass();
                                Object objB9 = ((qre) m7fVar23.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB9.getClass();
                                return (i8) objB9;
                            case 27:
                                m7f m7fVar24 = (m7f) obj2;
                                m7fVar24.getClass();
                                ((bsc) obj3).getClass();
                                Object objB10 = ((qre) m7fVar24.a(jce.a.b(qre.class), null, null)).b(omd.class);
                                objB10.getClass();
                                return (omd) objB10;
                            case 28:
                                m7f m7fVar25 = (m7f) obj2;
                                m7fVar25.getClass();
                                ((bsc) obj3).getClass();
                                Object objB11 = ((qre) m7fVar25.a(jce.a.b(qre.class), null, null)).b(pxd.class);
                                objB11.getClass();
                                return (pxd) objB11;
                            default:
                                m7f m7fVar26 = (m7f) obj2;
                                m7fVar26.getClass();
                                ((bsc) obj3).getClass();
                                Object objB12 = ((qre) m7fVar26.a(jce.a.b(qre.class), null, null)).b(r0h.class);
                                objB12.getClass();
                                return (r0h) objB12;
                        }
                    }
                }, kq9.E), oqbVar3);
                break;
            case 3:
                oqb oqbVar4 = (oqb) obj;
                oqbVar4.getClass();
                final int i19 = 4;
                sq6.C(new qh1(dpf.K, jce.a.b(hj.class), null, new pz7() { // from class: c8
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) throws MissingAndroidContextException {
                        int i162 = 1;
                        switch (i19) {
                            case 0:
                                m7f m7fVar = (m7f) obj2;
                                m7fVar.getClass();
                                ((bsc) obj3).getClass();
                                Context contextG = yb5.g(m7fVar);
                                String strM949unboximpl = ((AccountId) m7fVar.a(jce.a.b(AccountId.class), null, null)).m949unboximpl();
                                strM949unboximpl.getClass();
                                SharedPreferences sharedPreferences = contextG.getApplicationContext().getSharedPreferences("account_prefs".concat(strM949unboximpl), 0);
                                sharedPreferences.getClass();
                                return new f8(sharedPreferences);
                            case 1:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                if (v40.a == null) {
                                    synchronized (v40.b) {
                                        if (v40.a == null) {
                                            pl7 pl7VarC = pl7.c();
                                            pl7VarC.a();
                                            v40.a = FirebaseAnalytics.getInstance(pl7VarC.a);
                                        }
                                        break;
                                    }
                                }
                                FirebaseAnalytics firebaseAnalytics = v40.a;
                                firebaseAnalytics.getClass();
                                return firebaseAnalytics;
                            case 2:
                                m7f m7fVar2 = (m7f) obj2;
                                m7fVar2.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar22 = jce.a;
                                return new ll7((FirebaseAnalytics) m7fVar2.a(kceVar22.b(FirebaseAnalytics.class), null, null), (am0) m7fVar2.a(kceVar22.b(am0.class), null, null));
                            case 3:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new kd();
                            case 4:
                                m7f m7fVar3 = (m7f) obj2;
                                m7fVar3.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar3 = jce.a;
                                return new hj((qi3) m7fVar3.a(kceVar3.b(qi3.class), null, null), (fk0) m7fVar3.a(kceVar3.b(fk0.class), null, null), new w9h(new cfk((Context) m7fVar3.a(kceVar3.b(Context.class), null, null))), (g78) m7fVar3.a(kceVar3.b(g78.class), null, null), (h86) m7fVar3.a(kceVar3.b(h86.class), null, null));
                            case 5:
                                m7f m7fVar4 = (m7f) obj2;
                                m7fVar4.getClass();
                                ((bsc) obj3).getClass();
                                return new pl(((doi) m7fVar4.a(jce.a.b(doi.class), null, null)).a("agent_chat"));
                            case 6:
                                m7f m7fVar5 = (m7f) obj2;
                                m7fVar5.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar4 = jce.a;
                                return new fq((dl2) m7fVar5.a(kceVar4.b(dl2.class), null, null), (h86) m7fVar5.a(kceVar4.b(h86.class), null, null), (oda) m7fVar5.a(kceVar4.b(oda.class), null, null), (koi) m7fVar5.a(kceVar4.b(koi.class), null, null));
                            case 7:
                                m7f m7fVar6 = (m7f) obj2;
                                m7fVar6.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar5 = jce.a;
                                return new vm((jwf) m7fVar6.a(kceVar5.b(jwf.class), null, null), (b) m7fVar6.a(kceVar5.b(b.class), null, null), (qzb) m7fVar6.a(kceVar5.b(qzb.class), null, null), (i8c) m7fVar6.a(kceVar5.b(i8c.class), null, null), (pl) m7fVar6.a(kceVar5.b(pl.class), null, null), yb5.g(m7fVar6), (ze0) m7fVar6.a(kceVar5.b(ze0.class), null, null), (koi) m7fVar6.a(kceVar5.b(koi.class), null, null), (i25) m7fVar6.a(kceVar5.b(i25.class), null, null), (hdc) m7fVar6.a(kceVar5.b(hdc.class), null, null), (fq) m7fVar6.a(kceVar5.b(fq.class), null, null), (oda) m7fVar6.a(kceVar5.b(oda.class), null, null), (h86) m7fVar6.a(kceVar5.b(h86.class), null, null), (qi3) m7fVar6.a(kceVar5.b(qi3.class), null, null), (z8c) m7fVar6.a(kceVar5.b(z8c.class), null, null), (j8i) m7fVar6.a(kceVar5.b(j8i.class), null, null), (rc8) m7fVar6.a(kceVar5.b(rc8.class), null, null));
                            case 8:
                                m7f m7fVar7 = (m7f) obj2;
                                m7fVar7.getClass();
                                ((bsc) obj3).getClass();
                                int i172 = lx.a[((AppEnvironment) m7fVar7.a(jce.a.b(AppEnvironment.class), null, null)).ordinal()];
                                if (i172 == 1) {
                                    return "LKJN8LsLERHEOXkw487o7qCTFOrGPimI";
                                }
                                if (i172 == 2 || i172 == 3) {
                                    return "b64sf1kxwDGe1PiSAlv5ixuH0f509RKK";
                                }
                                mr9.b();
                                return null;
                            case 9:
                                m7f m7fVar8 = (m7f) obj2;
                                m7fVar8.getClass();
                                ((bsc) obj3).getClass();
                                mrg mrgVar2 = mx.a;
                                kce kceVar6 = jce.a;
                                return new nff((String) m7fVar8.a(kceVar6.b(String.class), mrgVar2, null), (Context) m7fVar8.a(kceVar6.b(Context.class), null, null), (h86) m7fVar8.a(kceVar6.b(h86.class), null, null), (ud5) m7fVar8.a(kceVar6.b(ud5.class), null, null), (qk5) m7fVar8.a(kceVar6.b(qk5.class), null, null));
                            case 10:
                                m7f m7fVar9 = (m7f) obj2;
                                m7fVar9.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar7 = jce.a;
                                nff nffVar = (nff) m7fVar9.a(kceVar7.b(nff.class), null, null);
                                yw ywVar = gx.Companion;
                                ql8 ql8Var = new ql8(12);
                                ywVar.getClass();
                                gx.K = ql8Var;
                                String str = nffVar.a;
                                if (bsg.I0(str)) {
                                    sz6.p("writeKey cannot be blank ");
                                    return null;
                                }
                                mff mffVar = new mff(new eg4(nffVar.b, str), new el5(nffVar));
                                mffVar.b().a(new e10());
                                mffVar.b().a(new k30());
                                String strA = nffVar.d.a.a();
                                String languageTag = LocaleList.getDefault().get(0).toLanguageTag();
                                languageTag.getClass();
                                mffVar.b().a(new vd5(strA, languageTag));
                                mffVar.b().a(new nk5(i162));
                                mffVar.b().a(new nk5(nffVar.e));
                                boolean z = !((fk0) m7fVar9.a(kceVar7.b(fk0.class), null, null)).o();
                                mffVar.J = z;
                                el5 el5Var = mffVar.F;
                                gb9.D((mp4) el5Var.I, (e45) el5Var.F, null, new ax(mffVar, z, (tp4) null), 2);
                                return mffVar;
                            case 11:
                                m7f m7fVar10 = (m7f) obj2;
                                m7fVar10.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar8 = jce.a;
                                return new com.anthropic.claude.analytics.b((gx) m7fVar10.a(kceVar8.b(gx.class), null, null), (bg9) m7fVar10.a(kceVar8.b(bg9.class), null, null), (qk5) m7fVar10.a(kceVar8.b(qk5.class), null, null));
                            case 12:
                                m7f m7fVar11 = (m7f) obj2;
                                m7fVar11.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar11.a(jce.a.b(com.anthropic.claude.analytics.b.class), null, null);
                            case 13:
                                m7f m7fVar12 = (m7f) obj2;
                                m7fVar12.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar9 = jce.a;
                                fk0 fk0Var = (fk0) m7fVar12.a(kceVar9.b(fk0.class), null, null);
                                t29 t29Var = new t29(m7fVar12.a(kceVar9.b(gx.class), null, null));
                                t29 t29Var2 = new t29(m7fVar12.a(kceVar9.b(FirebaseAnalytics.class), null, null));
                                ((fk0) m7fVar12.a(kceVar9.b(fk0.class), null, null)).o();
                                return new smh(fk0Var, t29Var, t29Var2);
                            case 14:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new ti3();
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7f m7fVar13 = (m7f) obj2;
                                m7fVar13.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar13.a(jce.a.b(ti3.class), null, null);
                            case 16:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new hl8(new wg6(14), new rl7(6));
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7f m7fVar14 = (m7f) obj2;
                                m7fVar14.getClass();
                                ((bsc) obj3).getClass();
                                return new smh((fk0) m7fVar14.a(jce.a.b(fk0.class), null, null), new u0h(bw.G), new u0h(bw.H));
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7f m7fVar15 = (m7f) obj2;
                                m7fVar15.getClass();
                                ((bsc) obj3).getClass();
                                Object objB = ((qre) m7fVar15.a(jce.a.b(qre.class), null, null)).b(tja.class);
                                objB.getClass();
                                return (tja) objB;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7f m7fVar16 = (m7f) obj2;
                                m7fVar16.getClass();
                                ((bsc) obj3).getClass();
                                Object objB2 = ((qre) m7fVar16.a(jce.a.b(qre.class), null, null)).b(t8b.class);
                                objB2.getClass();
                                return (t8b) objB2;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7f m7fVar17 = (m7f) obj2;
                                m7fVar17.getClass();
                                ((bsc) obj3).getClass();
                                Object objB3 = ((qre) m7fVar17.a(jce.a.b(qre.class), null, null)).b(kab.class);
                                objB3.getClass();
                                return (kab) objB3;
                            case 21:
                                m7f m7fVar18 = (m7f) obj2;
                                m7fVar18.getClass();
                                ((bsc) obj3).getClass();
                                Object objB4 = ((qre) m7fVar18.a(jce.a.b(qre.class), null, null)).b(npb.class);
                                objB4.getClass();
                                return (npb) objB4;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7f m7fVar19 = (m7f) obj2;
                                m7fVar19.getClass();
                                ((bsc) obj3).getClass();
                                Object objB5 = ((qre) m7fVar19.a(jce.a.b(qre.class), null, null)).b(b7c.class);
                                objB5.getClass();
                                return (b7c) objB5;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7f m7fVar20 = (m7f) obj2;
                                m7fVar20.getClass();
                                ((bsc) obj3).getClass();
                                Object objB6 = ((qre) m7fVar20.a(jce.a.b(qre.class), null, null)).b(swa.class);
                                objB6.getClass();
                                return (swa) objB6;
                            case 24:
                                m7f m7fVar21 = (m7f) obj2;
                                m7fVar21.getClass();
                                ((bsc) obj3).getClass();
                                Object objB7 = ((qre) m7fVar21.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB7.getClass();
                                return (j2d) objB7;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7f m7fVar22 = (m7f) obj2;
                                m7fVar22.getClass();
                                ((bsc) obj3).getClass();
                                Object objB8 = ((qre) m7fVar22.a(jce.a.b(qre.class), null, null)).b(mkd.class);
                                objB8.getClass();
                                return (mkd) objB8;
                            case 26:
                                m7f m7fVar23 = (m7f) obj2;
                                m7fVar23.getClass();
                                ((bsc) obj3).getClass();
                                Object objB9 = ((qre) m7fVar23.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB9.getClass();
                                return (i8) objB9;
                            case 27:
                                m7f m7fVar24 = (m7f) obj2;
                                m7fVar24.getClass();
                                ((bsc) obj3).getClass();
                                Object objB10 = ((qre) m7fVar24.a(jce.a.b(qre.class), null, null)).b(omd.class);
                                objB10.getClass();
                                return (omd) objB10;
                            case 28:
                                m7f m7fVar25 = (m7f) obj2;
                                m7fVar25.getClass();
                                ((bsc) obj3).getClass();
                                Object objB11 = ((qre) m7fVar25.a(jce.a.b(qre.class), null, null)).b(pxd.class);
                                objB11.getClass();
                                return (pxd) objB11;
                            default:
                                m7f m7fVar26 = (m7f) obj2;
                                m7fVar26.getClass();
                                ((bsc) obj3).getClass();
                                Object objB12 = ((qre) m7fVar26.a(jce.a.b(qre.class), null, null)).b(r0h.class);
                                objB12.getClass();
                                return (r0h) objB12;
                        }
                    }
                }, kq9.E), oqbVar4);
                break;
            case 4:
                oqb oqbVar5 = (oqb) obj;
                oqbVar5.getClass();
                kce kceVar3 = jce.a;
                xai xaiVar2 = new xai(kceVar3.b(zni.class));
                pz7 pz7Var2 = new pz7() { // from class: c8
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) throws MissingAndroidContextException {
                        int i162 = 1;
                        switch (i12) {
                            case 0:
                                m7f m7fVar = (m7f) obj2;
                                m7fVar.getClass();
                                ((bsc) obj3).getClass();
                                Context contextG = yb5.g(m7fVar);
                                String strM949unboximpl = ((AccountId) m7fVar.a(jce.a.b(AccountId.class), null, null)).m949unboximpl();
                                strM949unboximpl.getClass();
                                SharedPreferences sharedPreferences = contextG.getApplicationContext().getSharedPreferences("account_prefs".concat(strM949unboximpl), 0);
                                sharedPreferences.getClass();
                                return new f8(sharedPreferences);
                            case 1:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                if (v40.a == null) {
                                    synchronized (v40.b) {
                                        if (v40.a == null) {
                                            pl7 pl7VarC = pl7.c();
                                            pl7VarC.a();
                                            v40.a = FirebaseAnalytics.getInstance(pl7VarC.a);
                                        }
                                        break;
                                    }
                                }
                                FirebaseAnalytics firebaseAnalytics = v40.a;
                                firebaseAnalytics.getClass();
                                return firebaseAnalytics;
                            case 2:
                                m7f m7fVar2 = (m7f) obj2;
                                m7fVar2.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar22 = jce.a;
                                return new ll7((FirebaseAnalytics) m7fVar2.a(kceVar22.b(FirebaseAnalytics.class), null, null), (am0) m7fVar2.a(kceVar22.b(am0.class), null, null));
                            case 3:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new kd();
                            case 4:
                                m7f m7fVar3 = (m7f) obj2;
                                m7fVar3.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar32 = jce.a;
                                return new hj((qi3) m7fVar3.a(kceVar32.b(qi3.class), null, null), (fk0) m7fVar3.a(kceVar32.b(fk0.class), null, null), new w9h(new cfk((Context) m7fVar3.a(kceVar32.b(Context.class), null, null))), (g78) m7fVar3.a(kceVar32.b(g78.class), null, null), (h86) m7fVar3.a(kceVar32.b(h86.class), null, null));
                            case 5:
                                m7f m7fVar4 = (m7f) obj2;
                                m7fVar4.getClass();
                                ((bsc) obj3).getClass();
                                return new pl(((doi) m7fVar4.a(jce.a.b(doi.class), null, null)).a("agent_chat"));
                            case 6:
                                m7f m7fVar5 = (m7f) obj2;
                                m7fVar5.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar4 = jce.a;
                                return new fq((dl2) m7fVar5.a(kceVar4.b(dl2.class), null, null), (h86) m7fVar5.a(kceVar4.b(h86.class), null, null), (oda) m7fVar5.a(kceVar4.b(oda.class), null, null), (koi) m7fVar5.a(kceVar4.b(koi.class), null, null));
                            case 7:
                                m7f m7fVar6 = (m7f) obj2;
                                m7fVar6.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar5 = jce.a;
                                return new vm((jwf) m7fVar6.a(kceVar5.b(jwf.class), null, null), (b) m7fVar6.a(kceVar5.b(b.class), null, null), (qzb) m7fVar6.a(kceVar5.b(qzb.class), null, null), (i8c) m7fVar6.a(kceVar5.b(i8c.class), null, null), (pl) m7fVar6.a(kceVar5.b(pl.class), null, null), yb5.g(m7fVar6), (ze0) m7fVar6.a(kceVar5.b(ze0.class), null, null), (koi) m7fVar6.a(kceVar5.b(koi.class), null, null), (i25) m7fVar6.a(kceVar5.b(i25.class), null, null), (hdc) m7fVar6.a(kceVar5.b(hdc.class), null, null), (fq) m7fVar6.a(kceVar5.b(fq.class), null, null), (oda) m7fVar6.a(kceVar5.b(oda.class), null, null), (h86) m7fVar6.a(kceVar5.b(h86.class), null, null), (qi3) m7fVar6.a(kceVar5.b(qi3.class), null, null), (z8c) m7fVar6.a(kceVar5.b(z8c.class), null, null), (j8i) m7fVar6.a(kceVar5.b(j8i.class), null, null), (rc8) m7fVar6.a(kceVar5.b(rc8.class), null, null));
                            case 8:
                                m7f m7fVar7 = (m7f) obj2;
                                m7fVar7.getClass();
                                ((bsc) obj3).getClass();
                                int i172 = lx.a[((AppEnvironment) m7fVar7.a(jce.a.b(AppEnvironment.class), null, null)).ordinal()];
                                if (i172 == 1) {
                                    return "LKJN8LsLERHEOXkw487o7qCTFOrGPimI";
                                }
                                if (i172 == 2 || i172 == 3) {
                                    return "b64sf1kxwDGe1PiSAlv5ixuH0f509RKK";
                                }
                                mr9.b();
                                return null;
                            case 9:
                                m7f m7fVar8 = (m7f) obj2;
                                m7fVar8.getClass();
                                ((bsc) obj3).getClass();
                                mrg mrgVar2 = mx.a;
                                kce kceVar6 = jce.a;
                                return new nff((String) m7fVar8.a(kceVar6.b(String.class), mrgVar2, null), (Context) m7fVar8.a(kceVar6.b(Context.class), null, null), (h86) m7fVar8.a(kceVar6.b(h86.class), null, null), (ud5) m7fVar8.a(kceVar6.b(ud5.class), null, null), (qk5) m7fVar8.a(kceVar6.b(qk5.class), null, null));
                            case 10:
                                m7f m7fVar9 = (m7f) obj2;
                                m7fVar9.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar7 = jce.a;
                                nff nffVar = (nff) m7fVar9.a(kceVar7.b(nff.class), null, null);
                                yw ywVar = gx.Companion;
                                ql8 ql8Var = new ql8(12);
                                ywVar.getClass();
                                gx.K = ql8Var;
                                String str = nffVar.a;
                                if (bsg.I0(str)) {
                                    sz6.p("writeKey cannot be blank ");
                                    return null;
                                }
                                mff mffVar = new mff(new eg4(nffVar.b, str), new el5(nffVar));
                                mffVar.b().a(new e10());
                                mffVar.b().a(new k30());
                                String strA = nffVar.d.a.a();
                                String languageTag = LocaleList.getDefault().get(0).toLanguageTag();
                                languageTag.getClass();
                                mffVar.b().a(new vd5(strA, languageTag));
                                mffVar.b().a(new nk5(i162));
                                mffVar.b().a(new nk5(nffVar.e));
                                boolean z = !((fk0) m7fVar9.a(kceVar7.b(fk0.class), null, null)).o();
                                mffVar.J = z;
                                el5 el5Var = mffVar.F;
                                gb9.D((mp4) el5Var.I, (e45) el5Var.F, null, new ax(mffVar, z, (tp4) null), 2);
                                return mffVar;
                            case 11:
                                m7f m7fVar10 = (m7f) obj2;
                                m7fVar10.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar8 = jce.a;
                                return new com.anthropic.claude.analytics.b((gx) m7fVar10.a(kceVar8.b(gx.class), null, null), (bg9) m7fVar10.a(kceVar8.b(bg9.class), null, null), (qk5) m7fVar10.a(kceVar8.b(qk5.class), null, null));
                            case 12:
                                m7f m7fVar11 = (m7f) obj2;
                                m7fVar11.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar11.a(jce.a.b(com.anthropic.claude.analytics.b.class), null, null);
                            case 13:
                                m7f m7fVar12 = (m7f) obj2;
                                m7fVar12.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar9 = jce.a;
                                fk0 fk0Var = (fk0) m7fVar12.a(kceVar9.b(fk0.class), null, null);
                                t29 t29Var = new t29(m7fVar12.a(kceVar9.b(gx.class), null, null));
                                t29 t29Var2 = new t29(m7fVar12.a(kceVar9.b(FirebaseAnalytics.class), null, null));
                                ((fk0) m7fVar12.a(kceVar9.b(fk0.class), null, null)).o();
                                return new smh(fk0Var, t29Var, t29Var2);
                            case 14:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new ti3();
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7f m7fVar13 = (m7f) obj2;
                                m7fVar13.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar13.a(jce.a.b(ti3.class), null, null);
                            case 16:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new hl8(new wg6(14), new rl7(6));
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7f m7fVar14 = (m7f) obj2;
                                m7fVar14.getClass();
                                ((bsc) obj3).getClass();
                                return new smh((fk0) m7fVar14.a(jce.a.b(fk0.class), null, null), new u0h(bw.G), new u0h(bw.H));
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7f m7fVar15 = (m7f) obj2;
                                m7fVar15.getClass();
                                ((bsc) obj3).getClass();
                                Object objB = ((qre) m7fVar15.a(jce.a.b(qre.class), null, null)).b(tja.class);
                                objB.getClass();
                                return (tja) objB;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7f m7fVar16 = (m7f) obj2;
                                m7fVar16.getClass();
                                ((bsc) obj3).getClass();
                                Object objB2 = ((qre) m7fVar16.a(jce.a.b(qre.class), null, null)).b(t8b.class);
                                objB2.getClass();
                                return (t8b) objB2;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7f m7fVar17 = (m7f) obj2;
                                m7fVar17.getClass();
                                ((bsc) obj3).getClass();
                                Object objB3 = ((qre) m7fVar17.a(jce.a.b(qre.class), null, null)).b(kab.class);
                                objB3.getClass();
                                return (kab) objB3;
                            case 21:
                                m7f m7fVar18 = (m7f) obj2;
                                m7fVar18.getClass();
                                ((bsc) obj3).getClass();
                                Object objB4 = ((qre) m7fVar18.a(jce.a.b(qre.class), null, null)).b(npb.class);
                                objB4.getClass();
                                return (npb) objB4;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7f m7fVar19 = (m7f) obj2;
                                m7fVar19.getClass();
                                ((bsc) obj3).getClass();
                                Object objB5 = ((qre) m7fVar19.a(jce.a.b(qre.class), null, null)).b(b7c.class);
                                objB5.getClass();
                                return (b7c) objB5;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7f m7fVar20 = (m7f) obj2;
                                m7fVar20.getClass();
                                ((bsc) obj3).getClass();
                                Object objB6 = ((qre) m7fVar20.a(jce.a.b(qre.class), null, null)).b(swa.class);
                                objB6.getClass();
                                return (swa) objB6;
                            case 24:
                                m7f m7fVar21 = (m7f) obj2;
                                m7fVar21.getClass();
                                ((bsc) obj3).getClass();
                                Object objB7 = ((qre) m7fVar21.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB7.getClass();
                                return (j2d) objB7;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7f m7fVar22 = (m7f) obj2;
                                m7fVar22.getClass();
                                ((bsc) obj3).getClass();
                                Object objB8 = ((qre) m7fVar22.a(jce.a.b(qre.class), null, null)).b(mkd.class);
                                objB8.getClass();
                                return (mkd) objB8;
                            case 26:
                                m7f m7fVar23 = (m7f) obj2;
                                m7fVar23.getClass();
                                ((bsc) obj3).getClass();
                                Object objB9 = ((qre) m7fVar23.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB9.getClass();
                                return (i8) objB9;
                            case 27:
                                m7f m7fVar24 = (m7f) obj2;
                                m7fVar24.getClass();
                                ((bsc) obj3).getClass();
                                Object objB10 = ((qre) m7fVar24.a(jce.a.b(qre.class), null, null)).b(omd.class);
                                objB10.getClass();
                                return (omd) objB10;
                            case 28:
                                m7f m7fVar25 = (m7f) obj2;
                                m7fVar25.getClass();
                                ((bsc) obj3).getClass();
                                Object objB11 = ((qre) m7fVar25.a(jce.a.b(qre.class), null, null)).b(pxd.class);
                                objB11.getClass();
                                return (pxd) objB11;
                            default:
                                m7f m7fVar26 = (m7f) obj2;
                                m7fVar26.getClass();
                                ((bsc) obj3).getClass();
                                Object objB12 = ((qre) m7fVar26.a(jce.a.b(qre.class), null, null)).b(r0h.class);
                                objB12.getClass();
                                return (r0h) objB12;
                        }
                    }
                };
                pl9 pl9VarB4 = kceVar3.b(pl.class);
                kq9 kq9Var3 = kq9.G;
                oqbVar5.a(new w7f(new qh1(xaiVar2, pl9VarB4, null, pz7Var2, kq9Var3)));
                final int i20 = 6;
                oqbVar5.a(new w7f(new qh1(xaiVar2, kceVar3.b(fq.class), null, new pz7() { // from class: c8
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) throws MissingAndroidContextException {
                        int i162 = 1;
                        switch (i20) {
                            case 0:
                                m7f m7fVar = (m7f) obj2;
                                m7fVar.getClass();
                                ((bsc) obj3).getClass();
                                Context contextG = yb5.g(m7fVar);
                                String strM949unboximpl = ((AccountId) m7fVar.a(jce.a.b(AccountId.class), null, null)).m949unboximpl();
                                strM949unboximpl.getClass();
                                SharedPreferences sharedPreferences = contextG.getApplicationContext().getSharedPreferences("account_prefs".concat(strM949unboximpl), 0);
                                sharedPreferences.getClass();
                                return new f8(sharedPreferences);
                            case 1:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                if (v40.a == null) {
                                    synchronized (v40.b) {
                                        if (v40.a == null) {
                                            pl7 pl7VarC = pl7.c();
                                            pl7VarC.a();
                                            v40.a = FirebaseAnalytics.getInstance(pl7VarC.a);
                                        }
                                        break;
                                    }
                                }
                                FirebaseAnalytics firebaseAnalytics = v40.a;
                                firebaseAnalytics.getClass();
                                return firebaseAnalytics;
                            case 2:
                                m7f m7fVar2 = (m7f) obj2;
                                m7fVar2.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar22 = jce.a;
                                return new ll7((FirebaseAnalytics) m7fVar2.a(kceVar22.b(FirebaseAnalytics.class), null, null), (am0) m7fVar2.a(kceVar22.b(am0.class), null, null));
                            case 3:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new kd();
                            case 4:
                                m7f m7fVar3 = (m7f) obj2;
                                m7fVar3.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar32 = jce.a;
                                return new hj((qi3) m7fVar3.a(kceVar32.b(qi3.class), null, null), (fk0) m7fVar3.a(kceVar32.b(fk0.class), null, null), new w9h(new cfk((Context) m7fVar3.a(kceVar32.b(Context.class), null, null))), (g78) m7fVar3.a(kceVar32.b(g78.class), null, null), (h86) m7fVar3.a(kceVar32.b(h86.class), null, null));
                            case 5:
                                m7f m7fVar4 = (m7f) obj2;
                                m7fVar4.getClass();
                                ((bsc) obj3).getClass();
                                return new pl(((doi) m7fVar4.a(jce.a.b(doi.class), null, null)).a("agent_chat"));
                            case 6:
                                m7f m7fVar5 = (m7f) obj2;
                                m7fVar5.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar4 = jce.a;
                                return new fq((dl2) m7fVar5.a(kceVar4.b(dl2.class), null, null), (h86) m7fVar5.a(kceVar4.b(h86.class), null, null), (oda) m7fVar5.a(kceVar4.b(oda.class), null, null), (koi) m7fVar5.a(kceVar4.b(koi.class), null, null));
                            case 7:
                                m7f m7fVar6 = (m7f) obj2;
                                m7fVar6.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar5 = jce.a;
                                return new vm((jwf) m7fVar6.a(kceVar5.b(jwf.class), null, null), (b) m7fVar6.a(kceVar5.b(b.class), null, null), (qzb) m7fVar6.a(kceVar5.b(qzb.class), null, null), (i8c) m7fVar6.a(kceVar5.b(i8c.class), null, null), (pl) m7fVar6.a(kceVar5.b(pl.class), null, null), yb5.g(m7fVar6), (ze0) m7fVar6.a(kceVar5.b(ze0.class), null, null), (koi) m7fVar6.a(kceVar5.b(koi.class), null, null), (i25) m7fVar6.a(kceVar5.b(i25.class), null, null), (hdc) m7fVar6.a(kceVar5.b(hdc.class), null, null), (fq) m7fVar6.a(kceVar5.b(fq.class), null, null), (oda) m7fVar6.a(kceVar5.b(oda.class), null, null), (h86) m7fVar6.a(kceVar5.b(h86.class), null, null), (qi3) m7fVar6.a(kceVar5.b(qi3.class), null, null), (z8c) m7fVar6.a(kceVar5.b(z8c.class), null, null), (j8i) m7fVar6.a(kceVar5.b(j8i.class), null, null), (rc8) m7fVar6.a(kceVar5.b(rc8.class), null, null));
                            case 8:
                                m7f m7fVar7 = (m7f) obj2;
                                m7fVar7.getClass();
                                ((bsc) obj3).getClass();
                                int i172 = lx.a[((AppEnvironment) m7fVar7.a(jce.a.b(AppEnvironment.class), null, null)).ordinal()];
                                if (i172 == 1) {
                                    return "LKJN8LsLERHEOXkw487o7qCTFOrGPimI";
                                }
                                if (i172 == 2 || i172 == 3) {
                                    return "b64sf1kxwDGe1PiSAlv5ixuH0f509RKK";
                                }
                                mr9.b();
                                return null;
                            case 9:
                                m7f m7fVar8 = (m7f) obj2;
                                m7fVar8.getClass();
                                ((bsc) obj3).getClass();
                                mrg mrgVar2 = mx.a;
                                kce kceVar6 = jce.a;
                                return new nff((String) m7fVar8.a(kceVar6.b(String.class), mrgVar2, null), (Context) m7fVar8.a(kceVar6.b(Context.class), null, null), (h86) m7fVar8.a(kceVar6.b(h86.class), null, null), (ud5) m7fVar8.a(kceVar6.b(ud5.class), null, null), (qk5) m7fVar8.a(kceVar6.b(qk5.class), null, null));
                            case 10:
                                m7f m7fVar9 = (m7f) obj2;
                                m7fVar9.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar7 = jce.a;
                                nff nffVar = (nff) m7fVar9.a(kceVar7.b(nff.class), null, null);
                                yw ywVar = gx.Companion;
                                ql8 ql8Var = new ql8(12);
                                ywVar.getClass();
                                gx.K = ql8Var;
                                String str = nffVar.a;
                                if (bsg.I0(str)) {
                                    sz6.p("writeKey cannot be blank ");
                                    return null;
                                }
                                mff mffVar = new mff(new eg4(nffVar.b, str), new el5(nffVar));
                                mffVar.b().a(new e10());
                                mffVar.b().a(new k30());
                                String strA = nffVar.d.a.a();
                                String languageTag = LocaleList.getDefault().get(0).toLanguageTag();
                                languageTag.getClass();
                                mffVar.b().a(new vd5(strA, languageTag));
                                mffVar.b().a(new nk5(i162));
                                mffVar.b().a(new nk5(nffVar.e));
                                boolean z = !((fk0) m7fVar9.a(kceVar7.b(fk0.class), null, null)).o();
                                mffVar.J = z;
                                el5 el5Var = mffVar.F;
                                gb9.D((mp4) el5Var.I, (e45) el5Var.F, null, new ax(mffVar, z, (tp4) null), 2);
                                return mffVar;
                            case 11:
                                m7f m7fVar10 = (m7f) obj2;
                                m7fVar10.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar8 = jce.a;
                                return new com.anthropic.claude.analytics.b((gx) m7fVar10.a(kceVar8.b(gx.class), null, null), (bg9) m7fVar10.a(kceVar8.b(bg9.class), null, null), (qk5) m7fVar10.a(kceVar8.b(qk5.class), null, null));
                            case 12:
                                m7f m7fVar11 = (m7f) obj2;
                                m7fVar11.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar11.a(jce.a.b(com.anthropic.claude.analytics.b.class), null, null);
                            case 13:
                                m7f m7fVar12 = (m7f) obj2;
                                m7fVar12.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar9 = jce.a;
                                fk0 fk0Var = (fk0) m7fVar12.a(kceVar9.b(fk0.class), null, null);
                                t29 t29Var = new t29(m7fVar12.a(kceVar9.b(gx.class), null, null));
                                t29 t29Var2 = new t29(m7fVar12.a(kceVar9.b(FirebaseAnalytics.class), null, null));
                                ((fk0) m7fVar12.a(kceVar9.b(fk0.class), null, null)).o();
                                return new smh(fk0Var, t29Var, t29Var2);
                            case 14:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new ti3();
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7f m7fVar13 = (m7f) obj2;
                                m7fVar13.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar13.a(jce.a.b(ti3.class), null, null);
                            case 16:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new hl8(new wg6(14), new rl7(6));
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7f m7fVar14 = (m7f) obj2;
                                m7fVar14.getClass();
                                ((bsc) obj3).getClass();
                                return new smh((fk0) m7fVar14.a(jce.a.b(fk0.class), null, null), new u0h(bw.G), new u0h(bw.H));
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7f m7fVar15 = (m7f) obj2;
                                m7fVar15.getClass();
                                ((bsc) obj3).getClass();
                                Object objB = ((qre) m7fVar15.a(jce.a.b(qre.class), null, null)).b(tja.class);
                                objB.getClass();
                                return (tja) objB;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7f m7fVar16 = (m7f) obj2;
                                m7fVar16.getClass();
                                ((bsc) obj3).getClass();
                                Object objB2 = ((qre) m7fVar16.a(jce.a.b(qre.class), null, null)).b(t8b.class);
                                objB2.getClass();
                                return (t8b) objB2;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7f m7fVar17 = (m7f) obj2;
                                m7fVar17.getClass();
                                ((bsc) obj3).getClass();
                                Object objB3 = ((qre) m7fVar17.a(jce.a.b(qre.class), null, null)).b(kab.class);
                                objB3.getClass();
                                return (kab) objB3;
                            case 21:
                                m7f m7fVar18 = (m7f) obj2;
                                m7fVar18.getClass();
                                ((bsc) obj3).getClass();
                                Object objB4 = ((qre) m7fVar18.a(jce.a.b(qre.class), null, null)).b(npb.class);
                                objB4.getClass();
                                return (npb) objB4;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7f m7fVar19 = (m7f) obj2;
                                m7fVar19.getClass();
                                ((bsc) obj3).getClass();
                                Object objB5 = ((qre) m7fVar19.a(jce.a.b(qre.class), null, null)).b(b7c.class);
                                objB5.getClass();
                                return (b7c) objB5;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7f m7fVar20 = (m7f) obj2;
                                m7fVar20.getClass();
                                ((bsc) obj3).getClass();
                                Object objB6 = ((qre) m7fVar20.a(jce.a.b(qre.class), null, null)).b(swa.class);
                                objB6.getClass();
                                return (swa) objB6;
                            case 24:
                                m7f m7fVar21 = (m7f) obj2;
                                m7fVar21.getClass();
                                ((bsc) obj3).getClass();
                                Object objB7 = ((qre) m7fVar21.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB7.getClass();
                                return (j2d) objB7;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7f m7fVar22 = (m7f) obj2;
                                m7fVar22.getClass();
                                ((bsc) obj3).getClass();
                                Object objB8 = ((qre) m7fVar22.a(jce.a.b(qre.class), null, null)).b(mkd.class);
                                objB8.getClass();
                                return (mkd) objB8;
                            case 26:
                                m7f m7fVar23 = (m7f) obj2;
                                m7fVar23.getClass();
                                ((bsc) obj3).getClass();
                                Object objB9 = ((qre) m7fVar23.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB9.getClass();
                                return (i8) objB9;
                            case 27:
                                m7f m7fVar24 = (m7f) obj2;
                                m7fVar24.getClass();
                                ((bsc) obj3).getClass();
                                Object objB10 = ((qre) m7fVar24.a(jce.a.b(qre.class), null, null)).b(omd.class);
                                objB10.getClass();
                                return (omd) objB10;
                            case 28:
                                m7f m7fVar25 = (m7f) obj2;
                                m7fVar25.getClass();
                                ((bsc) obj3).getClass();
                                Object objB11 = ((qre) m7fVar25.a(jce.a.b(qre.class), null, null)).b(pxd.class);
                                objB11.getClass();
                                return (pxd) objB11;
                            default:
                                m7f m7fVar26 = (m7f) obj2;
                                m7fVar26.getClass();
                                ((bsc) obj3).getClass();
                                Object objB12 = ((qre) m7fVar26.a(jce.a.b(qre.class), null, null)).b(r0h.class);
                                objB12.getClass();
                                return (r0h) objB12;
                        }
                    }
                }, kq9Var3)));
                qh1 qh1Var = new qh1(xaiVar2, kceVar3.b(sl.class), null, new pz7() { // from class: c8
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) throws MissingAndroidContextException {
                        int i162 = 1;
                        switch (i13) {
                            case 0:
                                m7f m7fVar = (m7f) obj2;
                                m7fVar.getClass();
                                ((bsc) obj3).getClass();
                                Context contextG = yb5.g(m7fVar);
                                String strM949unboximpl = ((AccountId) m7fVar.a(jce.a.b(AccountId.class), null, null)).m949unboximpl();
                                strM949unboximpl.getClass();
                                SharedPreferences sharedPreferences = contextG.getApplicationContext().getSharedPreferences("account_prefs".concat(strM949unboximpl), 0);
                                sharedPreferences.getClass();
                                return new f8(sharedPreferences);
                            case 1:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                if (v40.a == null) {
                                    synchronized (v40.b) {
                                        if (v40.a == null) {
                                            pl7 pl7VarC = pl7.c();
                                            pl7VarC.a();
                                            v40.a = FirebaseAnalytics.getInstance(pl7VarC.a);
                                        }
                                        break;
                                    }
                                }
                                FirebaseAnalytics firebaseAnalytics = v40.a;
                                firebaseAnalytics.getClass();
                                return firebaseAnalytics;
                            case 2:
                                m7f m7fVar2 = (m7f) obj2;
                                m7fVar2.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar22 = jce.a;
                                return new ll7((FirebaseAnalytics) m7fVar2.a(kceVar22.b(FirebaseAnalytics.class), null, null), (am0) m7fVar2.a(kceVar22.b(am0.class), null, null));
                            case 3:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new kd();
                            case 4:
                                m7f m7fVar3 = (m7f) obj2;
                                m7fVar3.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar32 = jce.a;
                                return new hj((qi3) m7fVar3.a(kceVar32.b(qi3.class), null, null), (fk0) m7fVar3.a(kceVar32.b(fk0.class), null, null), new w9h(new cfk((Context) m7fVar3.a(kceVar32.b(Context.class), null, null))), (g78) m7fVar3.a(kceVar32.b(g78.class), null, null), (h86) m7fVar3.a(kceVar32.b(h86.class), null, null));
                            case 5:
                                m7f m7fVar4 = (m7f) obj2;
                                m7fVar4.getClass();
                                ((bsc) obj3).getClass();
                                return new pl(((doi) m7fVar4.a(jce.a.b(doi.class), null, null)).a("agent_chat"));
                            case 6:
                                m7f m7fVar5 = (m7f) obj2;
                                m7fVar5.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar4 = jce.a;
                                return new fq((dl2) m7fVar5.a(kceVar4.b(dl2.class), null, null), (h86) m7fVar5.a(kceVar4.b(h86.class), null, null), (oda) m7fVar5.a(kceVar4.b(oda.class), null, null), (koi) m7fVar5.a(kceVar4.b(koi.class), null, null));
                            case 7:
                                m7f m7fVar6 = (m7f) obj2;
                                m7fVar6.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar5 = jce.a;
                                return new vm((jwf) m7fVar6.a(kceVar5.b(jwf.class), null, null), (b) m7fVar6.a(kceVar5.b(b.class), null, null), (qzb) m7fVar6.a(kceVar5.b(qzb.class), null, null), (i8c) m7fVar6.a(kceVar5.b(i8c.class), null, null), (pl) m7fVar6.a(kceVar5.b(pl.class), null, null), yb5.g(m7fVar6), (ze0) m7fVar6.a(kceVar5.b(ze0.class), null, null), (koi) m7fVar6.a(kceVar5.b(koi.class), null, null), (i25) m7fVar6.a(kceVar5.b(i25.class), null, null), (hdc) m7fVar6.a(kceVar5.b(hdc.class), null, null), (fq) m7fVar6.a(kceVar5.b(fq.class), null, null), (oda) m7fVar6.a(kceVar5.b(oda.class), null, null), (h86) m7fVar6.a(kceVar5.b(h86.class), null, null), (qi3) m7fVar6.a(kceVar5.b(qi3.class), null, null), (z8c) m7fVar6.a(kceVar5.b(z8c.class), null, null), (j8i) m7fVar6.a(kceVar5.b(j8i.class), null, null), (rc8) m7fVar6.a(kceVar5.b(rc8.class), null, null));
                            case 8:
                                m7f m7fVar7 = (m7f) obj2;
                                m7fVar7.getClass();
                                ((bsc) obj3).getClass();
                                int i172 = lx.a[((AppEnvironment) m7fVar7.a(jce.a.b(AppEnvironment.class), null, null)).ordinal()];
                                if (i172 == 1) {
                                    return "LKJN8LsLERHEOXkw487o7qCTFOrGPimI";
                                }
                                if (i172 == 2 || i172 == 3) {
                                    return "b64sf1kxwDGe1PiSAlv5ixuH0f509RKK";
                                }
                                mr9.b();
                                return null;
                            case 9:
                                m7f m7fVar8 = (m7f) obj2;
                                m7fVar8.getClass();
                                ((bsc) obj3).getClass();
                                mrg mrgVar2 = mx.a;
                                kce kceVar6 = jce.a;
                                return new nff((String) m7fVar8.a(kceVar6.b(String.class), mrgVar2, null), (Context) m7fVar8.a(kceVar6.b(Context.class), null, null), (h86) m7fVar8.a(kceVar6.b(h86.class), null, null), (ud5) m7fVar8.a(kceVar6.b(ud5.class), null, null), (qk5) m7fVar8.a(kceVar6.b(qk5.class), null, null));
                            case 10:
                                m7f m7fVar9 = (m7f) obj2;
                                m7fVar9.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar7 = jce.a;
                                nff nffVar = (nff) m7fVar9.a(kceVar7.b(nff.class), null, null);
                                yw ywVar = gx.Companion;
                                ql8 ql8Var = new ql8(12);
                                ywVar.getClass();
                                gx.K = ql8Var;
                                String str = nffVar.a;
                                if (bsg.I0(str)) {
                                    sz6.p("writeKey cannot be blank ");
                                    return null;
                                }
                                mff mffVar = new mff(new eg4(nffVar.b, str), new el5(nffVar));
                                mffVar.b().a(new e10());
                                mffVar.b().a(new k30());
                                String strA = nffVar.d.a.a();
                                String languageTag = LocaleList.getDefault().get(0).toLanguageTag();
                                languageTag.getClass();
                                mffVar.b().a(new vd5(strA, languageTag));
                                mffVar.b().a(new nk5(i162));
                                mffVar.b().a(new nk5(nffVar.e));
                                boolean z = !((fk0) m7fVar9.a(kceVar7.b(fk0.class), null, null)).o();
                                mffVar.J = z;
                                el5 el5Var = mffVar.F;
                                gb9.D((mp4) el5Var.I, (e45) el5Var.F, null, new ax(mffVar, z, (tp4) null), 2);
                                return mffVar;
                            case 11:
                                m7f m7fVar10 = (m7f) obj2;
                                m7fVar10.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar8 = jce.a;
                                return new com.anthropic.claude.analytics.b((gx) m7fVar10.a(kceVar8.b(gx.class), null, null), (bg9) m7fVar10.a(kceVar8.b(bg9.class), null, null), (qk5) m7fVar10.a(kceVar8.b(qk5.class), null, null));
                            case 12:
                                m7f m7fVar11 = (m7f) obj2;
                                m7fVar11.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar11.a(jce.a.b(com.anthropic.claude.analytics.b.class), null, null);
                            case 13:
                                m7f m7fVar12 = (m7f) obj2;
                                m7fVar12.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar9 = jce.a;
                                fk0 fk0Var = (fk0) m7fVar12.a(kceVar9.b(fk0.class), null, null);
                                t29 t29Var = new t29(m7fVar12.a(kceVar9.b(gx.class), null, null));
                                t29 t29Var2 = new t29(m7fVar12.a(kceVar9.b(FirebaseAnalytics.class), null, null));
                                ((fk0) m7fVar12.a(kceVar9.b(fk0.class), null, null)).o();
                                return new smh(fk0Var, t29Var, t29Var2);
                            case 14:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new ti3();
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7f m7fVar13 = (m7f) obj2;
                                m7fVar13.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar13.a(jce.a.b(ti3.class), null, null);
                            case 16:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new hl8(new wg6(14), new rl7(6));
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7f m7fVar14 = (m7f) obj2;
                                m7fVar14.getClass();
                                ((bsc) obj3).getClass();
                                return new smh((fk0) m7fVar14.a(jce.a.b(fk0.class), null, null), new u0h(bw.G), new u0h(bw.H));
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7f m7fVar15 = (m7f) obj2;
                                m7fVar15.getClass();
                                ((bsc) obj3).getClass();
                                Object objB = ((qre) m7fVar15.a(jce.a.b(qre.class), null, null)).b(tja.class);
                                objB.getClass();
                                return (tja) objB;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7f m7fVar16 = (m7f) obj2;
                                m7fVar16.getClass();
                                ((bsc) obj3).getClass();
                                Object objB2 = ((qre) m7fVar16.a(jce.a.b(qre.class), null, null)).b(t8b.class);
                                objB2.getClass();
                                return (t8b) objB2;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7f m7fVar17 = (m7f) obj2;
                                m7fVar17.getClass();
                                ((bsc) obj3).getClass();
                                Object objB3 = ((qre) m7fVar17.a(jce.a.b(qre.class), null, null)).b(kab.class);
                                objB3.getClass();
                                return (kab) objB3;
                            case 21:
                                m7f m7fVar18 = (m7f) obj2;
                                m7fVar18.getClass();
                                ((bsc) obj3).getClass();
                                Object objB4 = ((qre) m7fVar18.a(jce.a.b(qre.class), null, null)).b(npb.class);
                                objB4.getClass();
                                return (npb) objB4;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7f m7fVar19 = (m7f) obj2;
                                m7fVar19.getClass();
                                ((bsc) obj3).getClass();
                                Object objB5 = ((qre) m7fVar19.a(jce.a.b(qre.class), null, null)).b(b7c.class);
                                objB5.getClass();
                                return (b7c) objB5;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7f m7fVar20 = (m7f) obj2;
                                m7fVar20.getClass();
                                ((bsc) obj3).getClass();
                                Object objB6 = ((qre) m7fVar20.a(jce.a.b(qre.class), null, null)).b(swa.class);
                                objB6.getClass();
                                return (swa) objB6;
                            case 24:
                                m7f m7fVar21 = (m7f) obj2;
                                m7fVar21.getClass();
                                ((bsc) obj3).getClass();
                                Object objB7 = ((qre) m7fVar21.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB7.getClass();
                                return (j2d) objB7;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7f m7fVar22 = (m7f) obj2;
                                m7fVar22.getClass();
                                ((bsc) obj3).getClass();
                                Object objB8 = ((qre) m7fVar22.a(jce.a.b(qre.class), null, null)).b(mkd.class);
                                objB8.getClass();
                                return (mkd) objB8;
                            case 26:
                                m7f m7fVar23 = (m7f) obj2;
                                m7fVar23.getClass();
                                ((bsc) obj3).getClass();
                                Object objB9 = ((qre) m7fVar23.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB9.getClass();
                                return (i8) objB9;
                            case 27:
                                m7f m7fVar24 = (m7f) obj2;
                                m7fVar24.getClass();
                                ((bsc) obj3).getClass();
                                Object objB10 = ((qre) m7fVar24.a(jce.a.b(qre.class), null, null)).b(omd.class);
                                objB10.getClass();
                                return (omd) objB10;
                            case 28:
                                m7f m7fVar25 = (m7f) obj2;
                                m7fVar25.getClass();
                                ((bsc) obj3).getClass();
                                Object objB11 = ((qre) m7fVar25.a(jce.a.b(qre.class), null, null)).b(pxd.class);
                                objB11.getClass();
                                return (pxd) objB11;
                            default:
                                m7f m7fVar26 = (m7f) obj2;
                                m7fVar26.getClass();
                                ((bsc) obj3).getClass();
                                Object objB12 = ((qre) m7fVar26.a(jce.a.b(qre.class), null, null)).b(r0h.class);
                                objB12.getClass();
                                return (r0h) objB12;
                        }
                    }
                }, kq9Var3);
                oqbVar5.a(new w7f(qh1Var));
                qh1Var.g = new p92(new b8(i12));
                oqbVar5.d.add(xaiVar2);
                break;
            case 5:
                sl slVar = (sl) obj;
                if (slVar != null) {
                    fd9.z(((vm) slVar).k, null);
                }
                break;
            case 6:
                oqb oqbVar6 = (oqb) obj;
                oqbVar6.getClass();
                mrg mrgVar2 = mx.a;
                pz7 pz7Var3 = new pz7() { // from class: c8
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) throws MissingAndroidContextException {
                        int i162 = 1;
                        switch (i14) {
                            case 0:
                                m7f m7fVar = (m7f) obj2;
                                m7fVar.getClass();
                                ((bsc) obj3).getClass();
                                Context contextG = yb5.g(m7fVar);
                                String strM949unboximpl = ((AccountId) m7fVar.a(jce.a.b(AccountId.class), null, null)).m949unboximpl();
                                strM949unboximpl.getClass();
                                SharedPreferences sharedPreferences = contextG.getApplicationContext().getSharedPreferences("account_prefs".concat(strM949unboximpl), 0);
                                sharedPreferences.getClass();
                                return new f8(sharedPreferences);
                            case 1:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                if (v40.a == null) {
                                    synchronized (v40.b) {
                                        if (v40.a == null) {
                                            pl7 pl7VarC = pl7.c();
                                            pl7VarC.a();
                                            v40.a = FirebaseAnalytics.getInstance(pl7VarC.a);
                                        }
                                        break;
                                    }
                                }
                                FirebaseAnalytics firebaseAnalytics = v40.a;
                                firebaseAnalytics.getClass();
                                return firebaseAnalytics;
                            case 2:
                                m7f m7fVar2 = (m7f) obj2;
                                m7fVar2.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar22 = jce.a;
                                return new ll7((FirebaseAnalytics) m7fVar2.a(kceVar22.b(FirebaseAnalytics.class), null, null), (am0) m7fVar2.a(kceVar22.b(am0.class), null, null));
                            case 3:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new kd();
                            case 4:
                                m7f m7fVar3 = (m7f) obj2;
                                m7fVar3.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar32 = jce.a;
                                return new hj((qi3) m7fVar3.a(kceVar32.b(qi3.class), null, null), (fk0) m7fVar3.a(kceVar32.b(fk0.class), null, null), new w9h(new cfk((Context) m7fVar3.a(kceVar32.b(Context.class), null, null))), (g78) m7fVar3.a(kceVar32.b(g78.class), null, null), (h86) m7fVar3.a(kceVar32.b(h86.class), null, null));
                            case 5:
                                m7f m7fVar4 = (m7f) obj2;
                                m7fVar4.getClass();
                                ((bsc) obj3).getClass();
                                return new pl(((doi) m7fVar4.a(jce.a.b(doi.class), null, null)).a("agent_chat"));
                            case 6:
                                m7f m7fVar5 = (m7f) obj2;
                                m7fVar5.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar4 = jce.a;
                                return new fq((dl2) m7fVar5.a(kceVar4.b(dl2.class), null, null), (h86) m7fVar5.a(kceVar4.b(h86.class), null, null), (oda) m7fVar5.a(kceVar4.b(oda.class), null, null), (koi) m7fVar5.a(kceVar4.b(koi.class), null, null));
                            case 7:
                                m7f m7fVar6 = (m7f) obj2;
                                m7fVar6.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar5 = jce.a;
                                return new vm((jwf) m7fVar6.a(kceVar5.b(jwf.class), null, null), (b) m7fVar6.a(kceVar5.b(b.class), null, null), (qzb) m7fVar6.a(kceVar5.b(qzb.class), null, null), (i8c) m7fVar6.a(kceVar5.b(i8c.class), null, null), (pl) m7fVar6.a(kceVar5.b(pl.class), null, null), yb5.g(m7fVar6), (ze0) m7fVar6.a(kceVar5.b(ze0.class), null, null), (koi) m7fVar6.a(kceVar5.b(koi.class), null, null), (i25) m7fVar6.a(kceVar5.b(i25.class), null, null), (hdc) m7fVar6.a(kceVar5.b(hdc.class), null, null), (fq) m7fVar6.a(kceVar5.b(fq.class), null, null), (oda) m7fVar6.a(kceVar5.b(oda.class), null, null), (h86) m7fVar6.a(kceVar5.b(h86.class), null, null), (qi3) m7fVar6.a(kceVar5.b(qi3.class), null, null), (z8c) m7fVar6.a(kceVar5.b(z8c.class), null, null), (j8i) m7fVar6.a(kceVar5.b(j8i.class), null, null), (rc8) m7fVar6.a(kceVar5.b(rc8.class), null, null));
                            case 8:
                                m7f m7fVar7 = (m7f) obj2;
                                m7fVar7.getClass();
                                ((bsc) obj3).getClass();
                                int i172 = lx.a[((AppEnvironment) m7fVar7.a(jce.a.b(AppEnvironment.class), null, null)).ordinal()];
                                if (i172 == 1) {
                                    return "LKJN8LsLERHEOXkw487o7qCTFOrGPimI";
                                }
                                if (i172 == 2 || i172 == 3) {
                                    return "b64sf1kxwDGe1PiSAlv5ixuH0f509RKK";
                                }
                                mr9.b();
                                return null;
                            case 9:
                                m7f m7fVar8 = (m7f) obj2;
                                m7fVar8.getClass();
                                ((bsc) obj3).getClass();
                                mrg mrgVar22 = mx.a;
                                kce kceVar6 = jce.a;
                                return new nff((String) m7fVar8.a(kceVar6.b(String.class), mrgVar22, null), (Context) m7fVar8.a(kceVar6.b(Context.class), null, null), (h86) m7fVar8.a(kceVar6.b(h86.class), null, null), (ud5) m7fVar8.a(kceVar6.b(ud5.class), null, null), (qk5) m7fVar8.a(kceVar6.b(qk5.class), null, null));
                            case 10:
                                m7f m7fVar9 = (m7f) obj2;
                                m7fVar9.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar7 = jce.a;
                                nff nffVar = (nff) m7fVar9.a(kceVar7.b(nff.class), null, null);
                                yw ywVar = gx.Companion;
                                ql8 ql8Var = new ql8(12);
                                ywVar.getClass();
                                gx.K = ql8Var;
                                String str = nffVar.a;
                                if (bsg.I0(str)) {
                                    sz6.p("writeKey cannot be blank ");
                                    return null;
                                }
                                mff mffVar = new mff(new eg4(nffVar.b, str), new el5(nffVar));
                                mffVar.b().a(new e10());
                                mffVar.b().a(new k30());
                                String strA = nffVar.d.a.a();
                                String languageTag = LocaleList.getDefault().get(0).toLanguageTag();
                                languageTag.getClass();
                                mffVar.b().a(new vd5(strA, languageTag));
                                mffVar.b().a(new nk5(i162));
                                mffVar.b().a(new nk5(nffVar.e));
                                boolean z = !((fk0) m7fVar9.a(kceVar7.b(fk0.class), null, null)).o();
                                mffVar.J = z;
                                el5 el5Var = mffVar.F;
                                gb9.D((mp4) el5Var.I, (e45) el5Var.F, null, new ax(mffVar, z, (tp4) null), 2);
                                return mffVar;
                            case 11:
                                m7f m7fVar10 = (m7f) obj2;
                                m7fVar10.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar8 = jce.a;
                                return new com.anthropic.claude.analytics.b((gx) m7fVar10.a(kceVar8.b(gx.class), null, null), (bg9) m7fVar10.a(kceVar8.b(bg9.class), null, null), (qk5) m7fVar10.a(kceVar8.b(qk5.class), null, null));
                            case 12:
                                m7f m7fVar11 = (m7f) obj2;
                                m7fVar11.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar11.a(jce.a.b(com.anthropic.claude.analytics.b.class), null, null);
                            case 13:
                                m7f m7fVar12 = (m7f) obj2;
                                m7fVar12.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar9 = jce.a;
                                fk0 fk0Var = (fk0) m7fVar12.a(kceVar9.b(fk0.class), null, null);
                                t29 t29Var = new t29(m7fVar12.a(kceVar9.b(gx.class), null, null));
                                t29 t29Var2 = new t29(m7fVar12.a(kceVar9.b(FirebaseAnalytics.class), null, null));
                                ((fk0) m7fVar12.a(kceVar9.b(fk0.class), null, null)).o();
                                return new smh(fk0Var, t29Var, t29Var2);
                            case 14:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new ti3();
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7f m7fVar13 = (m7f) obj2;
                                m7fVar13.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar13.a(jce.a.b(ti3.class), null, null);
                            case 16:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new hl8(new wg6(14), new rl7(6));
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7f m7fVar14 = (m7f) obj2;
                                m7fVar14.getClass();
                                ((bsc) obj3).getClass();
                                return new smh((fk0) m7fVar14.a(jce.a.b(fk0.class), null, null), new u0h(bw.G), new u0h(bw.H));
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7f m7fVar15 = (m7f) obj2;
                                m7fVar15.getClass();
                                ((bsc) obj3).getClass();
                                Object objB = ((qre) m7fVar15.a(jce.a.b(qre.class), null, null)).b(tja.class);
                                objB.getClass();
                                return (tja) objB;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7f m7fVar16 = (m7f) obj2;
                                m7fVar16.getClass();
                                ((bsc) obj3).getClass();
                                Object objB2 = ((qre) m7fVar16.a(jce.a.b(qre.class), null, null)).b(t8b.class);
                                objB2.getClass();
                                return (t8b) objB2;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7f m7fVar17 = (m7f) obj2;
                                m7fVar17.getClass();
                                ((bsc) obj3).getClass();
                                Object objB3 = ((qre) m7fVar17.a(jce.a.b(qre.class), null, null)).b(kab.class);
                                objB3.getClass();
                                return (kab) objB3;
                            case 21:
                                m7f m7fVar18 = (m7f) obj2;
                                m7fVar18.getClass();
                                ((bsc) obj3).getClass();
                                Object objB4 = ((qre) m7fVar18.a(jce.a.b(qre.class), null, null)).b(npb.class);
                                objB4.getClass();
                                return (npb) objB4;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7f m7fVar19 = (m7f) obj2;
                                m7fVar19.getClass();
                                ((bsc) obj3).getClass();
                                Object objB5 = ((qre) m7fVar19.a(jce.a.b(qre.class), null, null)).b(b7c.class);
                                objB5.getClass();
                                return (b7c) objB5;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7f m7fVar20 = (m7f) obj2;
                                m7fVar20.getClass();
                                ((bsc) obj3).getClass();
                                Object objB6 = ((qre) m7fVar20.a(jce.a.b(qre.class), null, null)).b(swa.class);
                                objB6.getClass();
                                return (swa) objB6;
                            case 24:
                                m7f m7fVar21 = (m7f) obj2;
                                m7fVar21.getClass();
                                ((bsc) obj3).getClass();
                                Object objB7 = ((qre) m7fVar21.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB7.getClass();
                                return (j2d) objB7;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7f m7fVar22 = (m7f) obj2;
                                m7fVar22.getClass();
                                ((bsc) obj3).getClass();
                                Object objB8 = ((qre) m7fVar22.a(jce.a.b(qre.class), null, null)).b(mkd.class);
                                objB8.getClass();
                                return (mkd) objB8;
                            case 26:
                                m7f m7fVar23 = (m7f) obj2;
                                m7fVar23.getClass();
                                ((bsc) obj3).getClass();
                                Object objB9 = ((qre) m7fVar23.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB9.getClass();
                                return (i8) objB9;
                            case 27:
                                m7f m7fVar24 = (m7f) obj2;
                                m7fVar24.getClass();
                                ((bsc) obj3).getClass();
                                Object objB10 = ((qre) m7fVar24.a(jce.a.b(qre.class), null, null)).b(omd.class);
                                objB10.getClass();
                                return (omd) objB10;
                            case 28:
                                m7f m7fVar25 = (m7f) obj2;
                                m7fVar25.getClass();
                                ((bsc) obj3).getClass();
                                Object objB11 = ((qre) m7fVar25.a(jce.a.b(qre.class), null, null)).b(pxd.class);
                                objB11.getClass();
                                return (pxd) objB11;
                            default:
                                m7f m7fVar26 = (m7f) obj2;
                                m7fVar26.getClass();
                                ((bsc) obj3).getClass();
                                Object objB12 = ((qre) m7fVar26.a(jce.a.b(qre.class), null, null)).b(r0h.class);
                                objB12.getClass();
                                return (r0h) objB12;
                        }
                    }
                };
                kce kceVar4 = jce.a;
                pl9 pl9VarB5 = kceVar4.b(String.class);
                mrg mrgVar3 = dpf.K;
                kq9 kq9Var4 = kq9.E;
                oqbVar6.a(new t7g(new qh1(mrgVar3, pl9VarB5, mrgVar2, pz7Var3, kq9Var4)));
                d8 d8Var3 = new d8(i14);
                pl9 pl9VarB6 = kceVar4.b(ud5.class);
                kq9 kq9Var5 = kq9.F;
                oqbVar6.a(new ge7(new qh1(mrgVar3, pl9VarB6, null, d8Var3, kq9Var5)));
                oqbVar6.a(new ge7(new qh1(mrgVar3, kceVar4.b(nff.class), null, new pz7() { // from class: c8
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) throws MissingAndroidContextException {
                        int i162 = 1;
                        switch (i6) {
                            case 0:
                                m7f m7fVar = (m7f) obj2;
                                m7fVar.getClass();
                                ((bsc) obj3).getClass();
                                Context contextG = yb5.g(m7fVar);
                                String strM949unboximpl = ((AccountId) m7fVar.a(jce.a.b(AccountId.class), null, null)).m949unboximpl();
                                strM949unboximpl.getClass();
                                SharedPreferences sharedPreferences = contextG.getApplicationContext().getSharedPreferences("account_prefs".concat(strM949unboximpl), 0);
                                sharedPreferences.getClass();
                                return new f8(sharedPreferences);
                            case 1:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                if (v40.a == null) {
                                    synchronized (v40.b) {
                                        if (v40.a == null) {
                                            pl7 pl7VarC = pl7.c();
                                            pl7VarC.a();
                                            v40.a = FirebaseAnalytics.getInstance(pl7VarC.a);
                                        }
                                        break;
                                    }
                                }
                                FirebaseAnalytics firebaseAnalytics = v40.a;
                                firebaseAnalytics.getClass();
                                return firebaseAnalytics;
                            case 2:
                                m7f m7fVar2 = (m7f) obj2;
                                m7fVar2.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar22 = jce.a;
                                return new ll7((FirebaseAnalytics) m7fVar2.a(kceVar22.b(FirebaseAnalytics.class), null, null), (am0) m7fVar2.a(kceVar22.b(am0.class), null, null));
                            case 3:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new kd();
                            case 4:
                                m7f m7fVar3 = (m7f) obj2;
                                m7fVar3.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar32 = jce.a;
                                return new hj((qi3) m7fVar3.a(kceVar32.b(qi3.class), null, null), (fk0) m7fVar3.a(kceVar32.b(fk0.class), null, null), new w9h(new cfk((Context) m7fVar3.a(kceVar32.b(Context.class), null, null))), (g78) m7fVar3.a(kceVar32.b(g78.class), null, null), (h86) m7fVar3.a(kceVar32.b(h86.class), null, null));
                            case 5:
                                m7f m7fVar4 = (m7f) obj2;
                                m7fVar4.getClass();
                                ((bsc) obj3).getClass();
                                return new pl(((doi) m7fVar4.a(jce.a.b(doi.class), null, null)).a("agent_chat"));
                            case 6:
                                m7f m7fVar5 = (m7f) obj2;
                                m7fVar5.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar42 = jce.a;
                                return new fq((dl2) m7fVar5.a(kceVar42.b(dl2.class), null, null), (h86) m7fVar5.a(kceVar42.b(h86.class), null, null), (oda) m7fVar5.a(kceVar42.b(oda.class), null, null), (koi) m7fVar5.a(kceVar42.b(koi.class), null, null));
                            case 7:
                                m7f m7fVar6 = (m7f) obj2;
                                m7fVar6.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar5 = jce.a;
                                return new vm((jwf) m7fVar6.a(kceVar5.b(jwf.class), null, null), (b) m7fVar6.a(kceVar5.b(b.class), null, null), (qzb) m7fVar6.a(kceVar5.b(qzb.class), null, null), (i8c) m7fVar6.a(kceVar5.b(i8c.class), null, null), (pl) m7fVar6.a(kceVar5.b(pl.class), null, null), yb5.g(m7fVar6), (ze0) m7fVar6.a(kceVar5.b(ze0.class), null, null), (koi) m7fVar6.a(kceVar5.b(koi.class), null, null), (i25) m7fVar6.a(kceVar5.b(i25.class), null, null), (hdc) m7fVar6.a(kceVar5.b(hdc.class), null, null), (fq) m7fVar6.a(kceVar5.b(fq.class), null, null), (oda) m7fVar6.a(kceVar5.b(oda.class), null, null), (h86) m7fVar6.a(kceVar5.b(h86.class), null, null), (qi3) m7fVar6.a(kceVar5.b(qi3.class), null, null), (z8c) m7fVar6.a(kceVar5.b(z8c.class), null, null), (j8i) m7fVar6.a(kceVar5.b(j8i.class), null, null), (rc8) m7fVar6.a(kceVar5.b(rc8.class), null, null));
                            case 8:
                                m7f m7fVar7 = (m7f) obj2;
                                m7fVar7.getClass();
                                ((bsc) obj3).getClass();
                                int i172 = lx.a[((AppEnvironment) m7fVar7.a(jce.a.b(AppEnvironment.class), null, null)).ordinal()];
                                if (i172 == 1) {
                                    return "LKJN8LsLERHEOXkw487o7qCTFOrGPimI";
                                }
                                if (i172 == 2 || i172 == 3) {
                                    return "b64sf1kxwDGe1PiSAlv5ixuH0f509RKK";
                                }
                                mr9.b();
                                return null;
                            case 9:
                                m7f m7fVar8 = (m7f) obj2;
                                m7fVar8.getClass();
                                ((bsc) obj3).getClass();
                                mrg mrgVar22 = mx.a;
                                kce kceVar6 = jce.a;
                                return new nff((String) m7fVar8.a(kceVar6.b(String.class), mrgVar22, null), (Context) m7fVar8.a(kceVar6.b(Context.class), null, null), (h86) m7fVar8.a(kceVar6.b(h86.class), null, null), (ud5) m7fVar8.a(kceVar6.b(ud5.class), null, null), (qk5) m7fVar8.a(kceVar6.b(qk5.class), null, null));
                            case 10:
                                m7f m7fVar9 = (m7f) obj2;
                                m7fVar9.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar7 = jce.a;
                                nff nffVar = (nff) m7fVar9.a(kceVar7.b(nff.class), null, null);
                                yw ywVar = gx.Companion;
                                ql8 ql8Var = new ql8(12);
                                ywVar.getClass();
                                gx.K = ql8Var;
                                String str = nffVar.a;
                                if (bsg.I0(str)) {
                                    sz6.p("writeKey cannot be blank ");
                                    return null;
                                }
                                mff mffVar = new mff(new eg4(nffVar.b, str), new el5(nffVar));
                                mffVar.b().a(new e10());
                                mffVar.b().a(new k30());
                                String strA = nffVar.d.a.a();
                                String languageTag = LocaleList.getDefault().get(0).toLanguageTag();
                                languageTag.getClass();
                                mffVar.b().a(new vd5(strA, languageTag));
                                mffVar.b().a(new nk5(i162));
                                mffVar.b().a(new nk5(nffVar.e));
                                boolean z = !((fk0) m7fVar9.a(kceVar7.b(fk0.class), null, null)).o();
                                mffVar.J = z;
                                el5 el5Var = mffVar.F;
                                gb9.D((mp4) el5Var.I, (e45) el5Var.F, null, new ax(mffVar, z, (tp4) null), 2);
                                return mffVar;
                            case 11:
                                m7f m7fVar10 = (m7f) obj2;
                                m7fVar10.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar8 = jce.a;
                                return new com.anthropic.claude.analytics.b((gx) m7fVar10.a(kceVar8.b(gx.class), null, null), (bg9) m7fVar10.a(kceVar8.b(bg9.class), null, null), (qk5) m7fVar10.a(kceVar8.b(qk5.class), null, null));
                            case 12:
                                m7f m7fVar11 = (m7f) obj2;
                                m7fVar11.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar11.a(jce.a.b(com.anthropic.claude.analytics.b.class), null, null);
                            case 13:
                                m7f m7fVar12 = (m7f) obj2;
                                m7fVar12.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar9 = jce.a;
                                fk0 fk0Var = (fk0) m7fVar12.a(kceVar9.b(fk0.class), null, null);
                                t29 t29Var = new t29(m7fVar12.a(kceVar9.b(gx.class), null, null));
                                t29 t29Var2 = new t29(m7fVar12.a(kceVar9.b(FirebaseAnalytics.class), null, null));
                                ((fk0) m7fVar12.a(kceVar9.b(fk0.class), null, null)).o();
                                return new smh(fk0Var, t29Var, t29Var2);
                            case 14:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new ti3();
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7f m7fVar13 = (m7f) obj2;
                                m7fVar13.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar13.a(jce.a.b(ti3.class), null, null);
                            case 16:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new hl8(new wg6(14), new rl7(6));
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7f m7fVar14 = (m7f) obj2;
                                m7fVar14.getClass();
                                ((bsc) obj3).getClass();
                                return new smh((fk0) m7fVar14.a(jce.a.b(fk0.class), null, null), new u0h(bw.G), new u0h(bw.H));
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7f m7fVar15 = (m7f) obj2;
                                m7fVar15.getClass();
                                ((bsc) obj3).getClass();
                                Object objB = ((qre) m7fVar15.a(jce.a.b(qre.class), null, null)).b(tja.class);
                                objB.getClass();
                                return (tja) objB;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7f m7fVar16 = (m7f) obj2;
                                m7fVar16.getClass();
                                ((bsc) obj3).getClass();
                                Object objB2 = ((qre) m7fVar16.a(jce.a.b(qre.class), null, null)).b(t8b.class);
                                objB2.getClass();
                                return (t8b) objB2;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7f m7fVar17 = (m7f) obj2;
                                m7fVar17.getClass();
                                ((bsc) obj3).getClass();
                                Object objB3 = ((qre) m7fVar17.a(jce.a.b(qre.class), null, null)).b(kab.class);
                                objB3.getClass();
                                return (kab) objB3;
                            case 21:
                                m7f m7fVar18 = (m7f) obj2;
                                m7fVar18.getClass();
                                ((bsc) obj3).getClass();
                                Object objB4 = ((qre) m7fVar18.a(jce.a.b(qre.class), null, null)).b(npb.class);
                                objB4.getClass();
                                return (npb) objB4;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7f m7fVar19 = (m7f) obj2;
                                m7fVar19.getClass();
                                ((bsc) obj3).getClass();
                                Object objB5 = ((qre) m7fVar19.a(jce.a.b(qre.class), null, null)).b(b7c.class);
                                objB5.getClass();
                                return (b7c) objB5;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7f m7fVar20 = (m7f) obj2;
                                m7fVar20.getClass();
                                ((bsc) obj3).getClass();
                                Object objB6 = ((qre) m7fVar20.a(jce.a.b(qre.class), null, null)).b(swa.class);
                                objB6.getClass();
                                return (swa) objB6;
                            case 24:
                                m7f m7fVar21 = (m7f) obj2;
                                m7fVar21.getClass();
                                ((bsc) obj3).getClass();
                                Object objB7 = ((qre) m7fVar21.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB7.getClass();
                                return (j2d) objB7;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7f m7fVar22 = (m7f) obj2;
                                m7fVar22.getClass();
                                ((bsc) obj3).getClass();
                                Object objB8 = ((qre) m7fVar22.a(jce.a.b(qre.class), null, null)).b(mkd.class);
                                objB8.getClass();
                                return (mkd) objB8;
                            case 26:
                                m7f m7fVar23 = (m7f) obj2;
                                m7fVar23.getClass();
                                ((bsc) obj3).getClass();
                                Object objB9 = ((qre) m7fVar23.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB9.getClass();
                                return (i8) objB9;
                            case 27:
                                m7f m7fVar24 = (m7f) obj2;
                                m7fVar24.getClass();
                                ((bsc) obj3).getClass();
                                Object objB10 = ((qre) m7fVar24.a(jce.a.b(qre.class), null, null)).b(omd.class);
                                objB10.getClass();
                                return (omd) objB10;
                            case 28:
                                m7f m7fVar25 = (m7f) obj2;
                                m7fVar25.getClass();
                                ((bsc) obj3).getClass();
                                Object objB11 = ((qre) m7fVar25.a(jce.a.b(qre.class), null, null)).b(pxd.class);
                                objB11.getClass();
                                return (pxd) objB11;
                            default:
                                m7f m7fVar26 = (m7f) obj2;
                                m7fVar26.getClass();
                                ((bsc) obj3).getClass();
                                Object objB12 = ((qre) m7fVar26.a(jce.a.b(qre.class), null, null)).b(r0h.class);
                                objB12.getClass();
                                return (r0h) objB12;
                        }
                    }
                }, kq9Var5)));
                oqbVar6.a(new t7g(new qh1(mrgVar3, kceVar4.b(gx.class), null, new pz7() { // from class: c8
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) throws MissingAndroidContextException {
                        int i162 = 1;
                        switch (i10) {
                            case 0:
                                m7f m7fVar = (m7f) obj2;
                                m7fVar.getClass();
                                ((bsc) obj3).getClass();
                                Context contextG = yb5.g(m7fVar);
                                String strM949unboximpl = ((AccountId) m7fVar.a(jce.a.b(AccountId.class), null, null)).m949unboximpl();
                                strM949unboximpl.getClass();
                                SharedPreferences sharedPreferences = contextG.getApplicationContext().getSharedPreferences("account_prefs".concat(strM949unboximpl), 0);
                                sharedPreferences.getClass();
                                return new f8(sharedPreferences);
                            case 1:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                if (v40.a == null) {
                                    synchronized (v40.b) {
                                        if (v40.a == null) {
                                            pl7 pl7VarC = pl7.c();
                                            pl7VarC.a();
                                            v40.a = FirebaseAnalytics.getInstance(pl7VarC.a);
                                        }
                                        break;
                                    }
                                }
                                FirebaseAnalytics firebaseAnalytics = v40.a;
                                firebaseAnalytics.getClass();
                                return firebaseAnalytics;
                            case 2:
                                m7f m7fVar2 = (m7f) obj2;
                                m7fVar2.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar22 = jce.a;
                                return new ll7((FirebaseAnalytics) m7fVar2.a(kceVar22.b(FirebaseAnalytics.class), null, null), (am0) m7fVar2.a(kceVar22.b(am0.class), null, null));
                            case 3:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new kd();
                            case 4:
                                m7f m7fVar3 = (m7f) obj2;
                                m7fVar3.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar32 = jce.a;
                                return new hj((qi3) m7fVar3.a(kceVar32.b(qi3.class), null, null), (fk0) m7fVar3.a(kceVar32.b(fk0.class), null, null), new w9h(new cfk((Context) m7fVar3.a(kceVar32.b(Context.class), null, null))), (g78) m7fVar3.a(kceVar32.b(g78.class), null, null), (h86) m7fVar3.a(kceVar32.b(h86.class), null, null));
                            case 5:
                                m7f m7fVar4 = (m7f) obj2;
                                m7fVar4.getClass();
                                ((bsc) obj3).getClass();
                                return new pl(((doi) m7fVar4.a(jce.a.b(doi.class), null, null)).a("agent_chat"));
                            case 6:
                                m7f m7fVar5 = (m7f) obj2;
                                m7fVar5.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar42 = jce.a;
                                return new fq((dl2) m7fVar5.a(kceVar42.b(dl2.class), null, null), (h86) m7fVar5.a(kceVar42.b(h86.class), null, null), (oda) m7fVar5.a(kceVar42.b(oda.class), null, null), (koi) m7fVar5.a(kceVar42.b(koi.class), null, null));
                            case 7:
                                m7f m7fVar6 = (m7f) obj2;
                                m7fVar6.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar5 = jce.a;
                                return new vm((jwf) m7fVar6.a(kceVar5.b(jwf.class), null, null), (b) m7fVar6.a(kceVar5.b(b.class), null, null), (qzb) m7fVar6.a(kceVar5.b(qzb.class), null, null), (i8c) m7fVar6.a(kceVar5.b(i8c.class), null, null), (pl) m7fVar6.a(kceVar5.b(pl.class), null, null), yb5.g(m7fVar6), (ze0) m7fVar6.a(kceVar5.b(ze0.class), null, null), (koi) m7fVar6.a(kceVar5.b(koi.class), null, null), (i25) m7fVar6.a(kceVar5.b(i25.class), null, null), (hdc) m7fVar6.a(kceVar5.b(hdc.class), null, null), (fq) m7fVar6.a(kceVar5.b(fq.class), null, null), (oda) m7fVar6.a(kceVar5.b(oda.class), null, null), (h86) m7fVar6.a(kceVar5.b(h86.class), null, null), (qi3) m7fVar6.a(kceVar5.b(qi3.class), null, null), (z8c) m7fVar6.a(kceVar5.b(z8c.class), null, null), (j8i) m7fVar6.a(kceVar5.b(j8i.class), null, null), (rc8) m7fVar6.a(kceVar5.b(rc8.class), null, null));
                            case 8:
                                m7f m7fVar7 = (m7f) obj2;
                                m7fVar7.getClass();
                                ((bsc) obj3).getClass();
                                int i172 = lx.a[((AppEnvironment) m7fVar7.a(jce.a.b(AppEnvironment.class), null, null)).ordinal()];
                                if (i172 == 1) {
                                    return "LKJN8LsLERHEOXkw487o7qCTFOrGPimI";
                                }
                                if (i172 == 2 || i172 == 3) {
                                    return "b64sf1kxwDGe1PiSAlv5ixuH0f509RKK";
                                }
                                mr9.b();
                                return null;
                            case 9:
                                m7f m7fVar8 = (m7f) obj2;
                                m7fVar8.getClass();
                                ((bsc) obj3).getClass();
                                mrg mrgVar22 = mx.a;
                                kce kceVar6 = jce.a;
                                return new nff((String) m7fVar8.a(kceVar6.b(String.class), mrgVar22, null), (Context) m7fVar8.a(kceVar6.b(Context.class), null, null), (h86) m7fVar8.a(kceVar6.b(h86.class), null, null), (ud5) m7fVar8.a(kceVar6.b(ud5.class), null, null), (qk5) m7fVar8.a(kceVar6.b(qk5.class), null, null));
                            case 10:
                                m7f m7fVar9 = (m7f) obj2;
                                m7fVar9.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar7 = jce.a;
                                nff nffVar = (nff) m7fVar9.a(kceVar7.b(nff.class), null, null);
                                yw ywVar = gx.Companion;
                                ql8 ql8Var = new ql8(12);
                                ywVar.getClass();
                                gx.K = ql8Var;
                                String str = nffVar.a;
                                if (bsg.I0(str)) {
                                    sz6.p("writeKey cannot be blank ");
                                    return null;
                                }
                                mff mffVar = new mff(new eg4(nffVar.b, str), new el5(nffVar));
                                mffVar.b().a(new e10());
                                mffVar.b().a(new k30());
                                String strA = nffVar.d.a.a();
                                String languageTag = LocaleList.getDefault().get(0).toLanguageTag();
                                languageTag.getClass();
                                mffVar.b().a(new vd5(strA, languageTag));
                                mffVar.b().a(new nk5(i162));
                                mffVar.b().a(new nk5(nffVar.e));
                                boolean z = !((fk0) m7fVar9.a(kceVar7.b(fk0.class), null, null)).o();
                                mffVar.J = z;
                                el5 el5Var = mffVar.F;
                                gb9.D((mp4) el5Var.I, (e45) el5Var.F, null, new ax(mffVar, z, (tp4) null), 2);
                                return mffVar;
                            case 11:
                                m7f m7fVar10 = (m7f) obj2;
                                m7fVar10.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar8 = jce.a;
                                return new com.anthropic.claude.analytics.b((gx) m7fVar10.a(kceVar8.b(gx.class), null, null), (bg9) m7fVar10.a(kceVar8.b(bg9.class), null, null), (qk5) m7fVar10.a(kceVar8.b(qk5.class), null, null));
                            case 12:
                                m7f m7fVar11 = (m7f) obj2;
                                m7fVar11.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar11.a(jce.a.b(com.anthropic.claude.analytics.b.class), null, null);
                            case 13:
                                m7f m7fVar12 = (m7f) obj2;
                                m7fVar12.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar9 = jce.a;
                                fk0 fk0Var = (fk0) m7fVar12.a(kceVar9.b(fk0.class), null, null);
                                t29 t29Var = new t29(m7fVar12.a(kceVar9.b(gx.class), null, null));
                                t29 t29Var2 = new t29(m7fVar12.a(kceVar9.b(FirebaseAnalytics.class), null, null));
                                ((fk0) m7fVar12.a(kceVar9.b(fk0.class), null, null)).o();
                                return new smh(fk0Var, t29Var, t29Var2);
                            case 14:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new ti3();
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7f m7fVar13 = (m7f) obj2;
                                m7fVar13.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar13.a(jce.a.b(ti3.class), null, null);
                            case 16:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new hl8(new wg6(14), new rl7(6));
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7f m7fVar14 = (m7f) obj2;
                                m7fVar14.getClass();
                                ((bsc) obj3).getClass();
                                return new smh((fk0) m7fVar14.a(jce.a.b(fk0.class), null, null), new u0h(bw.G), new u0h(bw.H));
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7f m7fVar15 = (m7f) obj2;
                                m7fVar15.getClass();
                                ((bsc) obj3).getClass();
                                Object objB = ((qre) m7fVar15.a(jce.a.b(qre.class), null, null)).b(tja.class);
                                objB.getClass();
                                return (tja) objB;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7f m7fVar16 = (m7f) obj2;
                                m7fVar16.getClass();
                                ((bsc) obj3).getClass();
                                Object objB2 = ((qre) m7fVar16.a(jce.a.b(qre.class), null, null)).b(t8b.class);
                                objB2.getClass();
                                return (t8b) objB2;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7f m7fVar17 = (m7f) obj2;
                                m7fVar17.getClass();
                                ((bsc) obj3).getClass();
                                Object objB3 = ((qre) m7fVar17.a(jce.a.b(qre.class), null, null)).b(kab.class);
                                objB3.getClass();
                                return (kab) objB3;
                            case 21:
                                m7f m7fVar18 = (m7f) obj2;
                                m7fVar18.getClass();
                                ((bsc) obj3).getClass();
                                Object objB4 = ((qre) m7fVar18.a(jce.a.b(qre.class), null, null)).b(npb.class);
                                objB4.getClass();
                                return (npb) objB4;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7f m7fVar19 = (m7f) obj2;
                                m7fVar19.getClass();
                                ((bsc) obj3).getClass();
                                Object objB5 = ((qre) m7fVar19.a(jce.a.b(qre.class), null, null)).b(b7c.class);
                                objB5.getClass();
                                return (b7c) objB5;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7f m7fVar20 = (m7f) obj2;
                                m7fVar20.getClass();
                                ((bsc) obj3).getClass();
                                Object objB6 = ((qre) m7fVar20.a(jce.a.b(qre.class), null, null)).b(swa.class);
                                objB6.getClass();
                                return (swa) objB6;
                            case 24:
                                m7f m7fVar21 = (m7f) obj2;
                                m7fVar21.getClass();
                                ((bsc) obj3).getClass();
                                Object objB7 = ((qre) m7fVar21.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB7.getClass();
                                return (j2d) objB7;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7f m7fVar22 = (m7f) obj2;
                                m7fVar22.getClass();
                                ((bsc) obj3).getClass();
                                Object objB8 = ((qre) m7fVar22.a(jce.a.b(qre.class), null, null)).b(mkd.class);
                                objB8.getClass();
                                return (mkd) objB8;
                            case 26:
                                m7f m7fVar23 = (m7f) obj2;
                                m7fVar23.getClass();
                                ((bsc) obj3).getClass();
                                Object objB9 = ((qre) m7fVar23.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB9.getClass();
                                return (i8) objB9;
                            case 27:
                                m7f m7fVar24 = (m7f) obj2;
                                m7fVar24.getClass();
                                ((bsc) obj3).getClass();
                                Object objB10 = ((qre) m7fVar24.a(jce.a.b(qre.class), null, null)).b(omd.class);
                                objB10.getClass();
                                return (omd) objB10;
                            case 28:
                                m7f m7fVar25 = (m7f) obj2;
                                m7fVar25.getClass();
                                ((bsc) obj3).getClass();
                                Object objB11 = ((qre) m7fVar25.a(jce.a.b(qre.class), null, null)).b(pxd.class);
                                objB11.getClass();
                                return (pxd) objB11;
                            default:
                                m7f m7fVar26 = (m7f) obj2;
                                m7fVar26.getClass();
                                ((bsc) obj3).getClass();
                                Object objB12 = ((qre) m7fVar26.a(jce.a.b(qre.class), null, null)).b(r0h.class);
                                objB12.getClass();
                                return (r0h) objB12;
                        }
                    }
                }, kq9Var4)));
                oqbVar6.a(new t7g(new qh1(mrgVar3, kceVar4.b(com.anthropic.claude.analytics.b.class), null, new pz7() { // from class: c8
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) throws MissingAndroidContextException {
                        int i162 = 1;
                        switch (i3) {
                            case 0:
                                m7f m7fVar = (m7f) obj2;
                                m7fVar.getClass();
                                ((bsc) obj3).getClass();
                                Context contextG = yb5.g(m7fVar);
                                String strM949unboximpl = ((AccountId) m7fVar.a(jce.a.b(AccountId.class), null, null)).m949unboximpl();
                                strM949unboximpl.getClass();
                                SharedPreferences sharedPreferences = contextG.getApplicationContext().getSharedPreferences("account_prefs".concat(strM949unboximpl), 0);
                                sharedPreferences.getClass();
                                return new f8(sharedPreferences);
                            case 1:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                if (v40.a == null) {
                                    synchronized (v40.b) {
                                        if (v40.a == null) {
                                            pl7 pl7VarC = pl7.c();
                                            pl7VarC.a();
                                            v40.a = FirebaseAnalytics.getInstance(pl7VarC.a);
                                        }
                                        break;
                                    }
                                }
                                FirebaseAnalytics firebaseAnalytics = v40.a;
                                firebaseAnalytics.getClass();
                                return firebaseAnalytics;
                            case 2:
                                m7f m7fVar2 = (m7f) obj2;
                                m7fVar2.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar22 = jce.a;
                                return new ll7((FirebaseAnalytics) m7fVar2.a(kceVar22.b(FirebaseAnalytics.class), null, null), (am0) m7fVar2.a(kceVar22.b(am0.class), null, null));
                            case 3:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new kd();
                            case 4:
                                m7f m7fVar3 = (m7f) obj2;
                                m7fVar3.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar32 = jce.a;
                                return new hj((qi3) m7fVar3.a(kceVar32.b(qi3.class), null, null), (fk0) m7fVar3.a(kceVar32.b(fk0.class), null, null), new w9h(new cfk((Context) m7fVar3.a(kceVar32.b(Context.class), null, null))), (g78) m7fVar3.a(kceVar32.b(g78.class), null, null), (h86) m7fVar3.a(kceVar32.b(h86.class), null, null));
                            case 5:
                                m7f m7fVar4 = (m7f) obj2;
                                m7fVar4.getClass();
                                ((bsc) obj3).getClass();
                                return new pl(((doi) m7fVar4.a(jce.a.b(doi.class), null, null)).a("agent_chat"));
                            case 6:
                                m7f m7fVar5 = (m7f) obj2;
                                m7fVar5.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar42 = jce.a;
                                return new fq((dl2) m7fVar5.a(kceVar42.b(dl2.class), null, null), (h86) m7fVar5.a(kceVar42.b(h86.class), null, null), (oda) m7fVar5.a(kceVar42.b(oda.class), null, null), (koi) m7fVar5.a(kceVar42.b(koi.class), null, null));
                            case 7:
                                m7f m7fVar6 = (m7f) obj2;
                                m7fVar6.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar5 = jce.a;
                                return new vm((jwf) m7fVar6.a(kceVar5.b(jwf.class), null, null), (b) m7fVar6.a(kceVar5.b(b.class), null, null), (qzb) m7fVar6.a(kceVar5.b(qzb.class), null, null), (i8c) m7fVar6.a(kceVar5.b(i8c.class), null, null), (pl) m7fVar6.a(kceVar5.b(pl.class), null, null), yb5.g(m7fVar6), (ze0) m7fVar6.a(kceVar5.b(ze0.class), null, null), (koi) m7fVar6.a(kceVar5.b(koi.class), null, null), (i25) m7fVar6.a(kceVar5.b(i25.class), null, null), (hdc) m7fVar6.a(kceVar5.b(hdc.class), null, null), (fq) m7fVar6.a(kceVar5.b(fq.class), null, null), (oda) m7fVar6.a(kceVar5.b(oda.class), null, null), (h86) m7fVar6.a(kceVar5.b(h86.class), null, null), (qi3) m7fVar6.a(kceVar5.b(qi3.class), null, null), (z8c) m7fVar6.a(kceVar5.b(z8c.class), null, null), (j8i) m7fVar6.a(kceVar5.b(j8i.class), null, null), (rc8) m7fVar6.a(kceVar5.b(rc8.class), null, null));
                            case 8:
                                m7f m7fVar7 = (m7f) obj2;
                                m7fVar7.getClass();
                                ((bsc) obj3).getClass();
                                int i172 = lx.a[((AppEnvironment) m7fVar7.a(jce.a.b(AppEnvironment.class), null, null)).ordinal()];
                                if (i172 == 1) {
                                    return "LKJN8LsLERHEOXkw487o7qCTFOrGPimI";
                                }
                                if (i172 == 2 || i172 == 3) {
                                    return "b64sf1kxwDGe1PiSAlv5ixuH0f509RKK";
                                }
                                mr9.b();
                                return null;
                            case 9:
                                m7f m7fVar8 = (m7f) obj2;
                                m7fVar8.getClass();
                                ((bsc) obj3).getClass();
                                mrg mrgVar22 = mx.a;
                                kce kceVar6 = jce.a;
                                return new nff((String) m7fVar8.a(kceVar6.b(String.class), mrgVar22, null), (Context) m7fVar8.a(kceVar6.b(Context.class), null, null), (h86) m7fVar8.a(kceVar6.b(h86.class), null, null), (ud5) m7fVar8.a(kceVar6.b(ud5.class), null, null), (qk5) m7fVar8.a(kceVar6.b(qk5.class), null, null));
                            case 10:
                                m7f m7fVar9 = (m7f) obj2;
                                m7fVar9.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar7 = jce.a;
                                nff nffVar = (nff) m7fVar9.a(kceVar7.b(nff.class), null, null);
                                yw ywVar = gx.Companion;
                                ql8 ql8Var = new ql8(12);
                                ywVar.getClass();
                                gx.K = ql8Var;
                                String str = nffVar.a;
                                if (bsg.I0(str)) {
                                    sz6.p("writeKey cannot be blank ");
                                    return null;
                                }
                                mff mffVar = new mff(new eg4(nffVar.b, str), new el5(nffVar));
                                mffVar.b().a(new e10());
                                mffVar.b().a(new k30());
                                String strA = nffVar.d.a.a();
                                String languageTag = LocaleList.getDefault().get(0).toLanguageTag();
                                languageTag.getClass();
                                mffVar.b().a(new vd5(strA, languageTag));
                                mffVar.b().a(new nk5(i162));
                                mffVar.b().a(new nk5(nffVar.e));
                                boolean z = !((fk0) m7fVar9.a(kceVar7.b(fk0.class), null, null)).o();
                                mffVar.J = z;
                                el5 el5Var = mffVar.F;
                                gb9.D((mp4) el5Var.I, (e45) el5Var.F, null, new ax(mffVar, z, (tp4) null), 2);
                                return mffVar;
                            case 11:
                                m7f m7fVar10 = (m7f) obj2;
                                m7fVar10.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar8 = jce.a;
                                return new com.anthropic.claude.analytics.b((gx) m7fVar10.a(kceVar8.b(gx.class), null, null), (bg9) m7fVar10.a(kceVar8.b(bg9.class), null, null), (qk5) m7fVar10.a(kceVar8.b(qk5.class), null, null));
                            case 12:
                                m7f m7fVar11 = (m7f) obj2;
                                m7fVar11.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar11.a(jce.a.b(com.anthropic.claude.analytics.b.class), null, null);
                            case 13:
                                m7f m7fVar12 = (m7f) obj2;
                                m7fVar12.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar9 = jce.a;
                                fk0 fk0Var = (fk0) m7fVar12.a(kceVar9.b(fk0.class), null, null);
                                t29 t29Var = new t29(m7fVar12.a(kceVar9.b(gx.class), null, null));
                                t29 t29Var2 = new t29(m7fVar12.a(kceVar9.b(FirebaseAnalytics.class), null, null));
                                ((fk0) m7fVar12.a(kceVar9.b(fk0.class), null, null)).o();
                                return new smh(fk0Var, t29Var, t29Var2);
                            case 14:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new ti3();
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7f m7fVar13 = (m7f) obj2;
                                m7fVar13.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar13.a(jce.a.b(ti3.class), null, null);
                            case 16:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new hl8(new wg6(14), new rl7(6));
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7f m7fVar14 = (m7f) obj2;
                                m7fVar14.getClass();
                                ((bsc) obj3).getClass();
                                return new smh((fk0) m7fVar14.a(jce.a.b(fk0.class), null, null), new u0h(bw.G), new u0h(bw.H));
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7f m7fVar15 = (m7f) obj2;
                                m7fVar15.getClass();
                                ((bsc) obj3).getClass();
                                Object objB = ((qre) m7fVar15.a(jce.a.b(qre.class), null, null)).b(tja.class);
                                objB.getClass();
                                return (tja) objB;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7f m7fVar16 = (m7f) obj2;
                                m7fVar16.getClass();
                                ((bsc) obj3).getClass();
                                Object objB2 = ((qre) m7fVar16.a(jce.a.b(qre.class), null, null)).b(t8b.class);
                                objB2.getClass();
                                return (t8b) objB2;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7f m7fVar17 = (m7f) obj2;
                                m7fVar17.getClass();
                                ((bsc) obj3).getClass();
                                Object objB3 = ((qre) m7fVar17.a(jce.a.b(qre.class), null, null)).b(kab.class);
                                objB3.getClass();
                                return (kab) objB3;
                            case 21:
                                m7f m7fVar18 = (m7f) obj2;
                                m7fVar18.getClass();
                                ((bsc) obj3).getClass();
                                Object objB4 = ((qre) m7fVar18.a(jce.a.b(qre.class), null, null)).b(npb.class);
                                objB4.getClass();
                                return (npb) objB4;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7f m7fVar19 = (m7f) obj2;
                                m7fVar19.getClass();
                                ((bsc) obj3).getClass();
                                Object objB5 = ((qre) m7fVar19.a(jce.a.b(qre.class), null, null)).b(b7c.class);
                                objB5.getClass();
                                return (b7c) objB5;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7f m7fVar20 = (m7f) obj2;
                                m7fVar20.getClass();
                                ((bsc) obj3).getClass();
                                Object objB6 = ((qre) m7fVar20.a(jce.a.b(qre.class), null, null)).b(swa.class);
                                objB6.getClass();
                                return (swa) objB6;
                            case 24:
                                m7f m7fVar21 = (m7f) obj2;
                                m7fVar21.getClass();
                                ((bsc) obj3).getClass();
                                Object objB7 = ((qre) m7fVar21.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB7.getClass();
                                return (j2d) objB7;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7f m7fVar22 = (m7f) obj2;
                                m7fVar22.getClass();
                                ((bsc) obj3).getClass();
                                Object objB8 = ((qre) m7fVar22.a(jce.a.b(qre.class), null, null)).b(mkd.class);
                                objB8.getClass();
                                return (mkd) objB8;
                            case 26:
                                m7f m7fVar23 = (m7f) obj2;
                                m7fVar23.getClass();
                                ((bsc) obj3).getClass();
                                Object objB9 = ((qre) m7fVar23.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB9.getClass();
                                return (i8) objB9;
                            case 27:
                                m7f m7fVar24 = (m7f) obj2;
                                m7fVar24.getClass();
                                ((bsc) obj3).getClass();
                                Object objB10 = ((qre) m7fVar24.a(jce.a.b(qre.class), null, null)).b(omd.class);
                                objB10.getClass();
                                return (omd) objB10;
                            case 28:
                                m7f m7fVar25 = (m7f) obj2;
                                m7fVar25.getClass();
                                ((bsc) obj3).getClass();
                                Object objB11 = ((qre) m7fVar25.a(jce.a.b(qre.class), null, null)).b(pxd.class);
                                objB11.getClass();
                                return (pxd) objB11;
                            default:
                                m7f m7fVar26 = (m7f) obj2;
                                m7fVar26.getClass();
                                ((bsc) obj3).getClass();
                                Object objB12 = ((qre) m7fVar26.a(jce.a.b(qre.class), null, null)).b(r0h.class);
                                objB12.getClass();
                                return (r0h) objB12;
                        }
                    }
                }, kq9Var4)));
                oqbVar6.a(new t7g(new qh1(mrgVar3, kceVar4.b(qi3.class), null, new pz7() { // from class: c8
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) throws MissingAndroidContextException {
                        int i162 = 1;
                        switch (i2) {
                            case 0:
                                m7f m7fVar = (m7f) obj2;
                                m7fVar.getClass();
                                ((bsc) obj3).getClass();
                                Context contextG = yb5.g(m7fVar);
                                String strM949unboximpl = ((AccountId) m7fVar.a(jce.a.b(AccountId.class), null, null)).m949unboximpl();
                                strM949unboximpl.getClass();
                                SharedPreferences sharedPreferences = contextG.getApplicationContext().getSharedPreferences("account_prefs".concat(strM949unboximpl), 0);
                                sharedPreferences.getClass();
                                return new f8(sharedPreferences);
                            case 1:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                if (v40.a == null) {
                                    synchronized (v40.b) {
                                        if (v40.a == null) {
                                            pl7 pl7VarC = pl7.c();
                                            pl7VarC.a();
                                            v40.a = FirebaseAnalytics.getInstance(pl7VarC.a);
                                        }
                                        break;
                                    }
                                }
                                FirebaseAnalytics firebaseAnalytics = v40.a;
                                firebaseAnalytics.getClass();
                                return firebaseAnalytics;
                            case 2:
                                m7f m7fVar2 = (m7f) obj2;
                                m7fVar2.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar22 = jce.a;
                                return new ll7((FirebaseAnalytics) m7fVar2.a(kceVar22.b(FirebaseAnalytics.class), null, null), (am0) m7fVar2.a(kceVar22.b(am0.class), null, null));
                            case 3:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new kd();
                            case 4:
                                m7f m7fVar3 = (m7f) obj2;
                                m7fVar3.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar32 = jce.a;
                                return new hj((qi3) m7fVar3.a(kceVar32.b(qi3.class), null, null), (fk0) m7fVar3.a(kceVar32.b(fk0.class), null, null), new w9h(new cfk((Context) m7fVar3.a(kceVar32.b(Context.class), null, null))), (g78) m7fVar3.a(kceVar32.b(g78.class), null, null), (h86) m7fVar3.a(kceVar32.b(h86.class), null, null));
                            case 5:
                                m7f m7fVar4 = (m7f) obj2;
                                m7fVar4.getClass();
                                ((bsc) obj3).getClass();
                                return new pl(((doi) m7fVar4.a(jce.a.b(doi.class), null, null)).a("agent_chat"));
                            case 6:
                                m7f m7fVar5 = (m7f) obj2;
                                m7fVar5.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar42 = jce.a;
                                return new fq((dl2) m7fVar5.a(kceVar42.b(dl2.class), null, null), (h86) m7fVar5.a(kceVar42.b(h86.class), null, null), (oda) m7fVar5.a(kceVar42.b(oda.class), null, null), (koi) m7fVar5.a(kceVar42.b(koi.class), null, null));
                            case 7:
                                m7f m7fVar6 = (m7f) obj2;
                                m7fVar6.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar5 = jce.a;
                                return new vm((jwf) m7fVar6.a(kceVar5.b(jwf.class), null, null), (b) m7fVar6.a(kceVar5.b(b.class), null, null), (qzb) m7fVar6.a(kceVar5.b(qzb.class), null, null), (i8c) m7fVar6.a(kceVar5.b(i8c.class), null, null), (pl) m7fVar6.a(kceVar5.b(pl.class), null, null), yb5.g(m7fVar6), (ze0) m7fVar6.a(kceVar5.b(ze0.class), null, null), (koi) m7fVar6.a(kceVar5.b(koi.class), null, null), (i25) m7fVar6.a(kceVar5.b(i25.class), null, null), (hdc) m7fVar6.a(kceVar5.b(hdc.class), null, null), (fq) m7fVar6.a(kceVar5.b(fq.class), null, null), (oda) m7fVar6.a(kceVar5.b(oda.class), null, null), (h86) m7fVar6.a(kceVar5.b(h86.class), null, null), (qi3) m7fVar6.a(kceVar5.b(qi3.class), null, null), (z8c) m7fVar6.a(kceVar5.b(z8c.class), null, null), (j8i) m7fVar6.a(kceVar5.b(j8i.class), null, null), (rc8) m7fVar6.a(kceVar5.b(rc8.class), null, null));
                            case 8:
                                m7f m7fVar7 = (m7f) obj2;
                                m7fVar7.getClass();
                                ((bsc) obj3).getClass();
                                int i172 = lx.a[((AppEnvironment) m7fVar7.a(jce.a.b(AppEnvironment.class), null, null)).ordinal()];
                                if (i172 == 1) {
                                    return "LKJN8LsLERHEOXkw487o7qCTFOrGPimI";
                                }
                                if (i172 == 2 || i172 == 3) {
                                    return "b64sf1kxwDGe1PiSAlv5ixuH0f509RKK";
                                }
                                mr9.b();
                                return null;
                            case 9:
                                m7f m7fVar8 = (m7f) obj2;
                                m7fVar8.getClass();
                                ((bsc) obj3).getClass();
                                mrg mrgVar22 = mx.a;
                                kce kceVar6 = jce.a;
                                return new nff((String) m7fVar8.a(kceVar6.b(String.class), mrgVar22, null), (Context) m7fVar8.a(kceVar6.b(Context.class), null, null), (h86) m7fVar8.a(kceVar6.b(h86.class), null, null), (ud5) m7fVar8.a(kceVar6.b(ud5.class), null, null), (qk5) m7fVar8.a(kceVar6.b(qk5.class), null, null));
                            case 10:
                                m7f m7fVar9 = (m7f) obj2;
                                m7fVar9.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar7 = jce.a;
                                nff nffVar = (nff) m7fVar9.a(kceVar7.b(nff.class), null, null);
                                yw ywVar = gx.Companion;
                                ql8 ql8Var = new ql8(12);
                                ywVar.getClass();
                                gx.K = ql8Var;
                                String str = nffVar.a;
                                if (bsg.I0(str)) {
                                    sz6.p("writeKey cannot be blank ");
                                    return null;
                                }
                                mff mffVar = new mff(new eg4(nffVar.b, str), new el5(nffVar));
                                mffVar.b().a(new e10());
                                mffVar.b().a(new k30());
                                String strA = nffVar.d.a.a();
                                String languageTag = LocaleList.getDefault().get(0).toLanguageTag();
                                languageTag.getClass();
                                mffVar.b().a(new vd5(strA, languageTag));
                                mffVar.b().a(new nk5(i162));
                                mffVar.b().a(new nk5(nffVar.e));
                                boolean z = !((fk0) m7fVar9.a(kceVar7.b(fk0.class), null, null)).o();
                                mffVar.J = z;
                                el5 el5Var = mffVar.F;
                                gb9.D((mp4) el5Var.I, (e45) el5Var.F, null, new ax(mffVar, z, (tp4) null), 2);
                                return mffVar;
                            case 11:
                                m7f m7fVar10 = (m7f) obj2;
                                m7fVar10.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar8 = jce.a;
                                return new com.anthropic.claude.analytics.b((gx) m7fVar10.a(kceVar8.b(gx.class), null, null), (bg9) m7fVar10.a(kceVar8.b(bg9.class), null, null), (qk5) m7fVar10.a(kceVar8.b(qk5.class), null, null));
                            case 12:
                                m7f m7fVar11 = (m7f) obj2;
                                m7fVar11.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar11.a(jce.a.b(com.anthropic.claude.analytics.b.class), null, null);
                            case 13:
                                m7f m7fVar12 = (m7f) obj2;
                                m7fVar12.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar9 = jce.a;
                                fk0 fk0Var = (fk0) m7fVar12.a(kceVar9.b(fk0.class), null, null);
                                t29 t29Var = new t29(m7fVar12.a(kceVar9.b(gx.class), null, null));
                                t29 t29Var2 = new t29(m7fVar12.a(kceVar9.b(FirebaseAnalytics.class), null, null));
                                ((fk0) m7fVar12.a(kceVar9.b(fk0.class), null, null)).o();
                                return new smh(fk0Var, t29Var, t29Var2);
                            case 14:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new ti3();
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7f m7fVar13 = (m7f) obj2;
                                m7fVar13.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar13.a(jce.a.b(ti3.class), null, null);
                            case 16:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new hl8(new wg6(14), new rl7(6));
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7f m7fVar14 = (m7f) obj2;
                                m7fVar14.getClass();
                                ((bsc) obj3).getClass();
                                return new smh((fk0) m7fVar14.a(jce.a.b(fk0.class), null, null), new u0h(bw.G), new u0h(bw.H));
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7f m7fVar15 = (m7f) obj2;
                                m7fVar15.getClass();
                                ((bsc) obj3).getClass();
                                Object objB = ((qre) m7fVar15.a(jce.a.b(qre.class), null, null)).b(tja.class);
                                objB.getClass();
                                return (tja) objB;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7f m7fVar16 = (m7f) obj2;
                                m7fVar16.getClass();
                                ((bsc) obj3).getClass();
                                Object objB2 = ((qre) m7fVar16.a(jce.a.b(qre.class), null, null)).b(t8b.class);
                                objB2.getClass();
                                return (t8b) objB2;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7f m7fVar17 = (m7f) obj2;
                                m7fVar17.getClass();
                                ((bsc) obj3).getClass();
                                Object objB3 = ((qre) m7fVar17.a(jce.a.b(qre.class), null, null)).b(kab.class);
                                objB3.getClass();
                                return (kab) objB3;
                            case 21:
                                m7f m7fVar18 = (m7f) obj2;
                                m7fVar18.getClass();
                                ((bsc) obj3).getClass();
                                Object objB4 = ((qre) m7fVar18.a(jce.a.b(qre.class), null, null)).b(npb.class);
                                objB4.getClass();
                                return (npb) objB4;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7f m7fVar19 = (m7f) obj2;
                                m7fVar19.getClass();
                                ((bsc) obj3).getClass();
                                Object objB5 = ((qre) m7fVar19.a(jce.a.b(qre.class), null, null)).b(b7c.class);
                                objB5.getClass();
                                return (b7c) objB5;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7f m7fVar20 = (m7f) obj2;
                                m7fVar20.getClass();
                                ((bsc) obj3).getClass();
                                Object objB6 = ((qre) m7fVar20.a(jce.a.b(qre.class), null, null)).b(swa.class);
                                objB6.getClass();
                                return (swa) objB6;
                            case 24:
                                m7f m7fVar21 = (m7f) obj2;
                                m7fVar21.getClass();
                                ((bsc) obj3).getClass();
                                Object objB7 = ((qre) m7fVar21.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB7.getClass();
                                return (j2d) objB7;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7f m7fVar22 = (m7f) obj2;
                                m7fVar22.getClass();
                                ((bsc) obj3).getClass();
                                Object objB8 = ((qre) m7fVar22.a(jce.a.b(qre.class), null, null)).b(mkd.class);
                                objB8.getClass();
                                return (mkd) objB8;
                            case 26:
                                m7f m7fVar23 = (m7f) obj2;
                                m7fVar23.getClass();
                                ((bsc) obj3).getClass();
                                Object objB9 = ((qre) m7fVar23.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB9.getClass();
                                return (i8) objB9;
                            case 27:
                                m7f m7fVar24 = (m7f) obj2;
                                m7fVar24.getClass();
                                ((bsc) obj3).getClass();
                                Object objB10 = ((qre) m7fVar24.a(jce.a.b(qre.class), null, null)).b(omd.class);
                                objB10.getClass();
                                return (omd) objB10;
                            case 28:
                                m7f m7fVar25 = (m7f) obj2;
                                m7fVar25.getClass();
                                ((bsc) obj3).getClass();
                                Object objB11 = ((qre) m7fVar25.a(jce.a.b(qre.class), null, null)).b(pxd.class);
                                objB11.getClass();
                                return (pxd) objB11;
                            default:
                                m7f m7fVar26 = (m7f) obj2;
                                m7fVar26.getClass();
                                ((bsc) obj3).getClass();
                                Object objB12 = ((qre) m7fVar26.a(jce.a.b(qre.class), null, null)).b(r0h.class);
                                objB12.getClass();
                                return (r0h) objB12;
                        }
                    }
                }, kq9Var4)));
                final int i21 = 13;
                t7g t7gVarO = sq6.o(new qh1(mrgVar3, kceVar4.b(smh.class), null, new pz7() { // from class: c8
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) throws MissingAndroidContextException {
                        int i162 = 1;
                        switch (i21) {
                            case 0:
                                m7f m7fVar = (m7f) obj2;
                                m7fVar.getClass();
                                ((bsc) obj3).getClass();
                                Context contextG = yb5.g(m7fVar);
                                String strM949unboximpl = ((AccountId) m7fVar.a(jce.a.b(AccountId.class), null, null)).m949unboximpl();
                                strM949unboximpl.getClass();
                                SharedPreferences sharedPreferences = contextG.getApplicationContext().getSharedPreferences("account_prefs".concat(strM949unboximpl), 0);
                                sharedPreferences.getClass();
                                return new f8(sharedPreferences);
                            case 1:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                if (v40.a == null) {
                                    synchronized (v40.b) {
                                        if (v40.a == null) {
                                            pl7 pl7VarC = pl7.c();
                                            pl7VarC.a();
                                            v40.a = FirebaseAnalytics.getInstance(pl7VarC.a);
                                        }
                                        break;
                                    }
                                }
                                FirebaseAnalytics firebaseAnalytics = v40.a;
                                firebaseAnalytics.getClass();
                                return firebaseAnalytics;
                            case 2:
                                m7f m7fVar2 = (m7f) obj2;
                                m7fVar2.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar22 = jce.a;
                                return new ll7((FirebaseAnalytics) m7fVar2.a(kceVar22.b(FirebaseAnalytics.class), null, null), (am0) m7fVar2.a(kceVar22.b(am0.class), null, null));
                            case 3:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new kd();
                            case 4:
                                m7f m7fVar3 = (m7f) obj2;
                                m7fVar3.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar32 = jce.a;
                                return new hj((qi3) m7fVar3.a(kceVar32.b(qi3.class), null, null), (fk0) m7fVar3.a(kceVar32.b(fk0.class), null, null), new w9h(new cfk((Context) m7fVar3.a(kceVar32.b(Context.class), null, null))), (g78) m7fVar3.a(kceVar32.b(g78.class), null, null), (h86) m7fVar3.a(kceVar32.b(h86.class), null, null));
                            case 5:
                                m7f m7fVar4 = (m7f) obj2;
                                m7fVar4.getClass();
                                ((bsc) obj3).getClass();
                                return new pl(((doi) m7fVar4.a(jce.a.b(doi.class), null, null)).a("agent_chat"));
                            case 6:
                                m7f m7fVar5 = (m7f) obj2;
                                m7fVar5.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar42 = jce.a;
                                return new fq((dl2) m7fVar5.a(kceVar42.b(dl2.class), null, null), (h86) m7fVar5.a(kceVar42.b(h86.class), null, null), (oda) m7fVar5.a(kceVar42.b(oda.class), null, null), (koi) m7fVar5.a(kceVar42.b(koi.class), null, null));
                            case 7:
                                m7f m7fVar6 = (m7f) obj2;
                                m7fVar6.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar5 = jce.a;
                                return new vm((jwf) m7fVar6.a(kceVar5.b(jwf.class), null, null), (b) m7fVar6.a(kceVar5.b(b.class), null, null), (qzb) m7fVar6.a(kceVar5.b(qzb.class), null, null), (i8c) m7fVar6.a(kceVar5.b(i8c.class), null, null), (pl) m7fVar6.a(kceVar5.b(pl.class), null, null), yb5.g(m7fVar6), (ze0) m7fVar6.a(kceVar5.b(ze0.class), null, null), (koi) m7fVar6.a(kceVar5.b(koi.class), null, null), (i25) m7fVar6.a(kceVar5.b(i25.class), null, null), (hdc) m7fVar6.a(kceVar5.b(hdc.class), null, null), (fq) m7fVar6.a(kceVar5.b(fq.class), null, null), (oda) m7fVar6.a(kceVar5.b(oda.class), null, null), (h86) m7fVar6.a(kceVar5.b(h86.class), null, null), (qi3) m7fVar6.a(kceVar5.b(qi3.class), null, null), (z8c) m7fVar6.a(kceVar5.b(z8c.class), null, null), (j8i) m7fVar6.a(kceVar5.b(j8i.class), null, null), (rc8) m7fVar6.a(kceVar5.b(rc8.class), null, null));
                            case 8:
                                m7f m7fVar7 = (m7f) obj2;
                                m7fVar7.getClass();
                                ((bsc) obj3).getClass();
                                int i172 = lx.a[((AppEnvironment) m7fVar7.a(jce.a.b(AppEnvironment.class), null, null)).ordinal()];
                                if (i172 == 1) {
                                    return "LKJN8LsLERHEOXkw487o7qCTFOrGPimI";
                                }
                                if (i172 == 2 || i172 == 3) {
                                    return "b64sf1kxwDGe1PiSAlv5ixuH0f509RKK";
                                }
                                mr9.b();
                                return null;
                            case 9:
                                m7f m7fVar8 = (m7f) obj2;
                                m7fVar8.getClass();
                                ((bsc) obj3).getClass();
                                mrg mrgVar22 = mx.a;
                                kce kceVar6 = jce.a;
                                return new nff((String) m7fVar8.a(kceVar6.b(String.class), mrgVar22, null), (Context) m7fVar8.a(kceVar6.b(Context.class), null, null), (h86) m7fVar8.a(kceVar6.b(h86.class), null, null), (ud5) m7fVar8.a(kceVar6.b(ud5.class), null, null), (qk5) m7fVar8.a(kceVar6.b(qk5.class), null, null));
                            case 10:
                                m7f m7fVar9 = (m7f) obj2;
                                m7fVar9.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar7 = jce.a;
                                nff nffVar = (nff) m7fVar9.a(kceVar7.b(nff.class), null, null);
                                yw ywVar = gx.Companion;
                                ql8 ql8Var = new ql8(12);
                                ywVar.getClass();
                                gx.K = ql8Var;
                                String str = nffVar.a;
                                if (bsg.I0(str)) {
                                    sz6.p("writeKey cannot be blank ");
                                    return null;
                                }
                                mff mffVar = new mff(new eg4(nffVar.b, str), new el5(nffVar));
                                mffVar.b().a(new e10());
                                mffVar.b().a(new k30());
                                String strA = nffVar.d.a.a();
                                String languageTag = LocaleList.getDefault().get(0).toLanguageTag();
                                languageTag.getClass();
                                mffVar.b().a(new vd5(strA, languageTag));
                                mffVar.b().a(new nk5(i162));
                                mffVar.b().a(new nk5(nffVar.e));
                                boolean z = !((fk0) m7fVar9.a(kceVar7.b(fk0.class), null, null)).o();
                                mffVar.J = z;
                                el5 el5Var = mffVar.F;
                                gb9.D((mp4) el5Var.I, (e45) el5Var.F, null, new ax(mffVar, z, (tp4) null), 2);
                                return mffVar;
                            case 11:
                                m7f m7fVar10 = (m7f) obj2;
                                m7fVar10.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar8 = jce.a;
                                return new com.anthropic.claude.analytics.b((gx) m7fVar10.a(kceVar8.b(gx.class), null, null), (bg9) m7fVar10.a(kceVar8.b(bg9.class), null, null), (qk5) m7fVar10.a(kceVar8.b(qk5.class), null, null));
                            case 12:
                                m7f m7fVar11 = (m7f) obj2;
                                m7fVar11.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar11.a(jce.a.b(com.anthropic.claude.analytics.b.class), null, null);
                            case 13:
                                m7f m7fVar12 = (m7f) obj2;
                                m7fVar12.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar9 = jce.a;
                                fk0 fk0Var = (fk0) m7fVar12.a(kceVar9.b(fk0.class), null, null);
                                t29 t29Var = new t29(m7fVar12.a(kceVar9.b(gx.class), null, null));
                                t29 t29Var2 = new t29(m7fVar12.a(kceVar9.b(FirebaseAnalytics.class), null, null));
                                ((fk0) m7fVar12.a(kceVar9.b(fk0.class), null, null)).o();
                                return new smh(fk0Var, t29Var, t29Var2);
                            case 14:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new ti3();
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7f m7fVar13 = (m7f) obj2;
                                m7fVar13.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar13.a(jce.a.b(ti3.class), null, null);
                            case 16:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new hl8(new wg6(14), new rl7(6));
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7f m7fVar14 = (m7f) obj2;
                                m7fVar14.getClass();
                                ((bsc) obj3).getClass();
                                return new smh((fk0) m7fVar14.a(jce.a.b(fk0.class), null, null), new u0h(bw.G), new u0h(bw.H));
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7f m7fVar15 = (m7f) obj2;
                                m7fVar15.getClass();
                                ((bsc) obj3).getClass();
                                Object objB = ((qre) m7fVar15.a(jce.a.b(qre.class), null, null)).b(tja.class);
                                objB.getClass();
                                return (tja) objB;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7f m7fVar16 = (m7f) obj2;
                                m7fVar16.getClass();
                                ((bsc) obj3).getClass();
                                Object objB2 = ((qre) m7fVar16.a(jce.a.b(qre.class), null, null)).b(t8b.class);
                                objB2.getClass();
                                return (t8b) objB2;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7f m7fVar17 = (m7f) obj2;
                                m7fVar17.getClass();
                                ((bsc) obj3).getClass();
                                Object objB3 = ((qre) m7fVar17.a(jce.a.b(qre.class), null, null)).b(kab.class);
                                objB3.getClass();
                                return (kab) objB3;
                            case 21:
                                m7f m7fVar18 = (m7f) obj2;
                                m7fVar18.getClass();
                                ((bsc) obj3).getClass();
                                Object objB4 = ((qre) m7fVar18.a(jce.a.b(qre.class), null, null)).b(npb.class);
                                objB4.getClass();
                                return (npb) objB4;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7f m7fVar19 = (m7f) obj2;
                                m7fVar19.getClass();
                                ((bsc) obj3).getClass();
                                Object objB5 = ((qre) m7fVar19.a(jce.a.b(qre.class), null, null)).b(b7c.class);
                                objB5.getClass();
                                return (b7c) objB5;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7f m7fVar20 = (m7f) obj2;
                                m7fVar20.getClass();
                                ((bsc) obj3).getClass();
                                Object objB6 = ((qre) m7fVar20.a(jce.a.b(qre.class), null, null)).b(swa.class);
                                objB6.getClass();
                                return (swa) objB6;
                            case 24:
                                m7f m7fVar21 = (m7f) obj2;
                                m7fVar21.getClass();
                                ((bsc) obj3).getClass();
                                Object objB7 = ((qre) m7fVar21.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB7.getClass();
                                return (j2d) objB7;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7f m7fVar22 = (m7f) obj2;
                                m7fVar22.getClass();
                                ((bsc) obj3).getClass();
                                Object objB8 = ((qre) m7fVar22.a(jce.a.b(qre.class), null, null)).b(mkd.class);
                                objB8.getClass();
                                return (mkd) objB8;
                            case 26:
                                m7f m7fVar23 = (m7f) obj2;
                                m7fVar23.getClass();
                                ((bsc) obj3).getClass();
                                Object objB9 = ((qre) m7fVar23.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB9.getClass();
                                return (i8) objB9;
                            case 27:
                                m7f m7fVar24 = (m7f) obj2;
                                m7fVar24.getClass();
                                ((bsc) obj3).getClass();
                                Object objB10 = ((qre) m7fVar24.a(jce.a.b(qre.class), null, null)).b(omd.class);
                                objB10.getClass();
                                return (omd) objB10;
                            case 28:
                                m7f m7fVar25 = (m7f) obj2;
                                m7fVar25.getClass();
                                ((bsc) obj3).getClass();
                                Object objB11 = ((qre) m7fVar25.a(jce.a.b(qre.class), null, null)).b(pxd.class);
                                objB11.getClass();
                                return (pxd) objB11;
                            default:
                                m7f m7fVar26 = (m7f) obj2;
                                m7fVar26.getClass();
                                ((bsc) obj3).getClass();
                                Object objB12 = ((qre) m7fVar26.a(jce.a.b(qre.class), null, null)).b(r0h.class);
                                objB12.getClass();
                                return (r0h) objB12;
                        }
                    }
                }, kq9Var4), oqbVar6);
                pl9 pl9VarB7 = kceVar4.b(ekc.class);
                qh1 qh1Var2 = t7gVarO.a;
                qh1Var2.f = w44.b1(qh1Var2.f, pl9VarB7);
                rzd rzdVar = qh1Var2.c;
                rzd rzdVar2 = qh1Var2.a;
                StringBuilder sb = new StringBuilder();
                sq6.D(pl9VarB7, sb, ':');
                if (rzdVar == null || (value = rzdVar.getValue()) == null) {
                    value = "";
                }
                oqbVar6.c.put(sq6.w(sb, value, ':', rzdVar2), t7gVarO);
                b54.u0(oqbVar6.e, new oqb[]{jd.a});
                break;
            case 7:
                oqb oqbVar7 = (oqb) obj;
                oqbVar7.getClass();
                final int i22 = 14;
                pz7 pz7Var4 = new pz7() { // from class: c8
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) throws MissingAndroidContextException {
                        int i162 = 1;
                        switch (i22) {
                            case 0:
                                m7f m7fVar = (m7f) obj2;
                                m7fVar.getClass();
                                ((bsc) obj3).getClass();
                                Context contextG = yb5.g(m7fVar);
                                String strM949unboximpl = ((AccountId) m7fVar.a(jce.a.b(AccountId.class), null, null)).m949unboximpl();
                                strM949unboximpl.getClass();
                                SharedPreferences sharedPreferences = contextG.getApplicationContext().getSharedPreferences("account_prefs".concat(strM949unboximpl), 0);
                                sharedPreferences.getClass();
                                return new f8(sharedPreferences);
                            case 1:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                if (v40.a == null) {
                                    synchronized (v40.b) {
                                        if (v40.a == null) {
                                            pl7 pl7VarC = pl7.c();
                                            pl7VarC.a();
                                            v40.a = FirebaseAnalytics.getInstance(pl7VarC.a);
                                        }
                                        break;
                                    }
                                }
                                FirebaseAnalytics firebaseAnalytics = v40.a;
                                firebaseAnalytics.getClass();
                                return firebaseAnalytics;
                            case 2:
                                m7f m7fVar2 = (m7f) obj2;
                                m7fVar2.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar22 = jce.a;
                                return new ll7((FirebaseAnalytics) m7fVar2.a(kceVar22.b(FirebaseAnalytics.class), null, null), (am0) m7fVar2.a(kceVar22.b(am0.class), null, null));
                            case 3:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new kd();
                            case 4:
                                m7f m7fVar3 = (m7f) obj2;
                                m7fVar3.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar32 = jce.a;
                                return new hj((qi3) m7fVar3.a(kceVar32.b(qi3.class), null, null), (fk0) m7fVar3.a(kceVar32.b(fk0.class), null, null), new w9h(new cfk((Context) m7fVar3.a(kceVar32.b(Context.class), null, null))), (g78) m7fVar3.a(kceVar32.b(g78.class), null, null), (h86) m7fVar3.a(kceVar32.b(h86.class), null, null));
                            case 5:
                                m7f m7fVar4 = (m7f) obj2;
                                m7fVar4.getClass();
                                ((bsc) obj3).getClass();
                                return new pl(((doi) m7fVar4.a(jce.a.b(doi.class), null, null)).a("agent_chat"));
                            case 6:
                                m7f m7fVar5 = (m7f) obj2;
                                m7fVar5.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar42 = jce.a;
                                return new fq((dl2) m7fVar5.a(kceVar42.b(dl2.class), null, null), (h86) m7fVar5.a(kceVar42.b(h86.class), null, null), (oda) m7fVar5.a(kceVar42.b(oda.class), null, null), (koi) m7fVar5.a(kceVar42.b(koi.class), null, null));
                            case 7:
                                m7f m7fVar6 = (m7f) obj2;
                                m7fVar6.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar5 = jce.a;
                                return new vm((jwf) m7fVar6.a(kceVar5.b(jwf.class), null, null), (b) m7fVar6.a(kceVar5.b(b.class), null, null), (qzb) m7fVar6.a(kceVar5.b(qzb.class), null, null), (i8c) m7fVar6.a(kceVar5.b(i8c.class), null, null), (pl) m7fVar6.a(kceVar5.b(pl.class), null, null), yb5.g(m7fVar6), (ze0) m7fVar6.a(kceVar5.b(ze0.class), null, null), (koi) m7fVar6.a(kceVar5.b(koi.class), null, null), (i25) m7fVar6.a(kceVar5.b(i25.class), null, null), (hdc) m7fVar6.a(kceVar5.b(hdc.class), null, null), (fq) m7fVar6.a(kceVar5.b(fq.class), null, null), (oda) m7fVar6.a(kceVar5.b(oda.class), null, null), (h86) m7fVar6.a(kceVar5.b(h86.class), null, null), (qi3) m7fVar6.a(kceVar5.b(qi3.class), null, null), (z8c) m7fVar6.a(kceVar5.b(z8c.class), null, null), (j8i) m7fVar6.a(kceVar5.b(j8i.class), null, null), (rc8) m7fVar6.a(kceVar5.b(rc8.class), null, null));
                            case 8:
                                m7f m7fVar7 = (m7f) obj2;
                                m7fVar7.getClass();
                                ((bsc) obj3).getClass();
                                int i172 = lx.a[((AppEnvironment) m7fVar7.a(jce.a.b(AppEnvironment.class), null, null)).ordinal()];
                                if (i172 == 1) {
                                    return "LKJN8LsLERHEOXkw487o7qCTFOrGPimI";
                                }
                                if (i172 == 2 || i172 == 3) {
                                    return "b64sf1kxwDGe1PiSAlv5ixuH0f509RKK";
                                }
                                mr9.b();
                                return null;
                            case 9:
                                m7f m7fVar8 = (m7f) obj2;
                                m7fVar8.getClass();
                                ((bsc) obj3).getClass();
                                mrg mrgVar22 = mx.a;
                                kce kceVar6 = jce.a;
                                return new nff((String) m7fVar8.a(kceVar6.b(String.class), mrgVar22, null), (Context) m7fVar8.a(kceVar6.b(Context.class), null, null), (h86) m7fVar8.a(kceVar6.b(h86.class), null, null), (ud5) m7fVar8.a(kceVar6.b(ud5.class), null, null), (qk5) m7fVar8.a(kceVar6.b(qk5.class), null, null));
                            case 10:
                                m7f m7fVar9 = (m7f) obj2;
                                m7fVar9.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar7 = jce.a;
                                nff nffVar = (nff) m7fVar9.a(kceVar7.b(nff.class), null, null);
                                yw ywVar = gx.Companion;
                                ql8 ql8Var = new ql8(12);
                                ywVar.getClass();
                                gx.K = ql8Var;
                                String str = nffVar.a;
                                if (bsg.I0(str)) {
                                    sz6.p("writeKey cannot be blank ");
                                    return null;
                                }
                                mff mffVar = new mff(new eg4(nffVar.b, str), new el5(nffVar));
                                mffVar.b().a(new e10());
                                mffVar.b().a(new k30());
                                String strA = nffVar.d.a.a();
                                String languageTag = LocaleList.getDefault().get(0).toLanguageTag();
                                languageTag.getClass();
                                mffVar.b().a(new vd5(strA, languageTag));
                                mffVar.b().a(new nk5(i162));
                                mffVar.b().a(new nk5(nffVar.e));
                                boolean z = !((fk0) m7fVar9.a(kceVar7.b(fk0.class), null, null)).o();
                                mffVar.J = z;
                                el5 el5Var = mffVar.F;
                                gb9.D((mp4) el5Var.I, (e45) el5Var.F, null, new ax(mffVar, z, (tp4) null), 2);
                                return mffVar;
                            case 11:
                                m7f m7fVar10 = (m7f) obj2;
                                m7fVar10.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar8 = jce.a;
                                return new com.anthropic.claude.analytics.b((gx) m7fVar10.a(kceVar8.b(gx.class), null, null), (bg9) m7fVar10.a(kceVar8.b(bg9.class), null, null), (qk5) m7fVar10.a(kceVar8.b(qk5.class), null, null));
                            case 12:
                                m7f m7fVar11 = (m7f) obj2;
                                m7fVar11.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar11.a(jce.a.b(com.anthropic.claude.analytics.b.class), null, null);
                            case 13:
                                m7f m7fVar12 = (m7f) obj2;
                                m7fVar12.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar9 = jce.a;
                                fk0 fk0Var = (fk0) m7fVar12.a(kceVar9.b(fk0.class), null, null);
                                t29 t29Var = new t29(m7fVar12.a(kceVar9.b(gx.class), null, null));
                                t29 t29Var2 = new t29(m7fVar12.a(kceVar9.b(FirebaseAnalytics.class), null, null));
                                ((fk0) m7fVar12.a(kceVar9.b(fk0.class), null, null)).o();
                                return new smh(fk0Var, t29Var, t29Var2);
                            case 14:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new ti3();
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7f m7fVar13 = (m7f) obj2;
                                m7fVar13.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar13.a(jce.a.b(ti3.class), null, null);
                            case 16:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new hl8(new wg6(14), new rl7(6));
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7f m7fVar14 = (m7f) obj2;
                                m7fVar14.getClass();
                                ((bsc) obj3).getClass();
                                return new smh((fk0) m7fVar14.a(jce.a.b(fk0.class), null, null), new u0h(bw.G), new u0h(bw.H));
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7f m7fVar15 = (m7f) obj2;
                                m7fVar15.getClass();
                                ((bsc) obj3).getClass();
                                Object objB = ((qre) m7fVar15.a(jce.a.b(qre.class), null, null)).b(tja.class);
                                objB.getClass();
                                return (tja) objB;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7f m7fVar16 = (m7f) obj2;
                                m7fVar16.getClass();
                                ((bsc) obj3).getClass();
                                Object objB2 = ((qre) m7fVar16.a(jce.a.b(qre.class), null, null)).b(t8b.class);
                                objB2.getClass();
                                return (t8b) objB2;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7f m7fVar17 = (m7f) obj2;
                                m7fVar17.getClass();
                                ((bsc) obj3).getClass();
                                Object objB3 = ((qre) m7fVar17.a(jce.a.b(qre.class), null, null)).b(kab.class);
                                objB3.getClass();
                                return (kab) objB3;
                            case 21:
                                m7f m7fVar18 = (m7f) obj2;
                                m7fVar18.getClass();
                                ((bsc) obj3).getClass();
                                Object objB4 = ((qre) m7fVar18.a(jce.a.b(qre.class), null, null)).b(npb.class);
                                objB4.getClass();
                                return (npb) objB4;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7f m7fVar19 = (m7f) obj2;
                                m7fVar19.getClass();
                                ((bsc) obj3).getClass();
                                Object objB5 = ((qre) m7fVar19.a(jce.a.b(qre.class), null, null)).b(b7c.class);
                                objB5.getClass();
                                return (b7c) objB5;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7f m7fVar20 = (m7f) obj2;
                                m7fVar20.getClass();
                                ((bsc) obj3).getClass();
                                Object objB6 = ((qre) m7fVar20.a(jce.a.b(qre.class), null, null)).b(swa.class);
                                objB6.getClass();
                                return (swa) objB6;
                            case 24:
                                m7f m7fVar21 = (m7f) obj2;
                                m7fVar21.getClass();
                                ((bsc) obj3).getClass();
                                Object objB7 = ((qre) m7fVar21.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB7.getClass();
                                return (j2d) objB7;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7f m7fVar22 = (m7f) obj2;
                                m7fVar22.getClass();
                                ((bsc) obj3).getClass();
                                Object objB8 = ((qre) m7fVar22.a(jce.a.b(qre.class), null, null)).b(mkd.class);
                                objB8.getClass();
                                return (mkd) objB8;
                            case 26:
                                m7f m7fVar23 = (m7f) obj2;
                                m7fVar23.getClass();
                                ((bsc) obj3).getClass();
                                Object objB9 = ((qre) m7fVar23.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB9.getClass();
                                return (i8) objB9;
                            case 27:
                                m7f m7fVar24 = (m7f) obj2;
                                m7fVar24.getClass();
                                ((bsc) obj3).getClass();
                                Object objB10 = ((qre) m7fVar24.a(jce.a.b(qre.class), null, null)).b(omd.class);
                                objB10.getClass();
                                return (omd) objB10;
                            case 28:
                                m7f m7fVar25 = (m7f) obj2;
                                m7fVar25.getClass();
                                ((bsc) obj3).getClass();
                                Object objB11 = ((qre) m7fVar25.a(jce.a.b(qre.class), null, null)).b(pxd.class);
                                objB11.getClass();
                                return (pxd) objB11;
                            default:
                                m7f m7fVar26 = (m7f) obj2;
                                m7fVar26.getClass();
                                ((bsc) obj3).getClass();
                                Object objB12 = ((qre) m7fVar26.a(jce.a.b(qre.class), null, null)).b(r0h.class);
                                objB12.getClass();
                                return (r0h) objB12;
                        }
                    }
                };
                kce kceVar5 = jce.a;
                pl9 pl9VarB8 = kceVar5.b(ti3.class);
                mrg mrgVar4 = dpf.K;
                kq9 kq9Var6 = kq9.E;
                oqbVar7.a(new t7g(new qh1(mrgVar4, pl9VarB8, null, pz7Var4, kq9Var6)));
                final int i23 = 15;
                oqbVar7.a(new t7g(new qh1(mrgVar4, kceVar5.b(qi3.class), null, new pz7() { // from class: c8
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) throws MissingAndroidContextException {
                        int i162 = 1;
                        switch (i23) {
                            case 0:
                                m7f m7fVar = (m7f) obj2;
                                m7fVar.getClass();
                                ((bsc) obj3).getClass();
                                Context contextG = yb5.g(m7fVar);
                                String strM949unboximpl = ((AccountId) m7fVar.a(jce.a.b(AccountId.class), null, null)).m949unboximpl();
                                strM949unboximpl.getClass();
                                SharedPreferences sharedPreferences = contextG.getApplicationContext().getSharedPreferences("account_prefs".concat(strM949unboximpl), 0);
                                sharedPreferences.getClass();
                                return new f8(sharedPreferences);
                            case 1:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                if (v40.a == null) {
                                    synchronized (v40.b) {
                                        if (v40.a == null) {
                                            pl7 pl7VarC = pl7.c();
                                            pl7VarC.a();
                                            v40.a = FirebaseAnalytics.getInstance(pl7VarC.a);
                                        }
                                        break;
                                    }
                                }
                                FirebaseAnalytics firebaseAnalytics = v40.a;
                                firebaseAnalytics.getClass();
                                return firebaseAnalytics;
                            case 2:
                                m7f m7fVar2 = (m7f) obj2;
                                m7fVar2.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar22 = jce.a;
                                return new ll7((FirebaseAnalytics) m7fVar2.a(kceVar22.b(FirebaseAnalytics.class), null, null), (am0) m7fVar2.a(kceVar22.b(am0.class), null, null));
                            case 3:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new kd();
                            case 4:
                                m7f m7fVar3 = (m7f) obj2;
                                m7fVar3.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar32 = jce.a;
                                return new hj((qi3) m7fVar3.a(kceVar32.b(qi3.class), null, null), (fk0) m7fVar3.a(kceVar32.b(fk0.class), null, null), new w9h(new cfk((Context) m7fVar3.a(kceVar32.b(Context.class), null, null))), (g78) m7fVar3.a(kceVar32.b(g78.class), null, null), (h86) m7fVar3.a(kceVar32.b(h86.class), null, null));
                            case 5:
                                m7f m7fVar4 = (m7f) obj2;
                                m7fVar4.getClass();
                                ((bsc) obj3).getClass();
                                return new pl(((doi) m7fVar4.a(jce.a.b(doi.class), null, null)).a("agent_chat"));
                            case 6:
                                m7f m7fVar5 = (m7f) obj2;
                                m7fVar5.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar42 = jce.a;
                                return new fq((dl2) m7fVar5.a(kceVar42.b(dl2.class), null, null), (h86) m7fVar5.a(kceVar42.b(h86.class), null, null), (oda) m7fVar5.a(kceVar42.b(oda.class), null, null), (koi) m7fVar5.a(kceVar42.b(koi.class), null, null));
                            case 7:
                                m7f m7fVar6 = (m7f) obj2;
                                m7fVar6.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar52 = jce.a;
                                return new vm((jwf) m7fVar6.a(kceVar52.b(jwf.class), null, null), (b) m7fVar6.a(kceVar52.b(b.class), null, null), (qzb) m7fVar6.a(kceVar52.b(qzb.class), null, null), (i8c) m7fVar6.a(kceVar52.b(i8c.class), null, null), (pl) m7fVar6.a(kceVar52.b(pl.class), null, null), yb5.g(m7fVar6), (ze0) m7fVar6.a(kceVar52.b(ze0.class), null, null), (koi) m7fVar6.a(kceVar52.b(koi.class), null, null), (i25) m7fVar6.a(kceVar52.b(i25.class), null, null), (hdc) m7fVar6.a(kceVar52.b(hdc.class), null, null), (fq) m7fVar6.a(kceVar52.b(fq.class), null, null), (oda) m7fVar6.a(kceVar52.b(oda.class), null, null), (h86) m7fVar6.a(kceVar52.b(h86.class), null, null), (qi3) m7fVar6.a(kceVar52.b(qi3.class), null, null), (z8c) m7fVar6.a(kceVar52.b(z8c.class), null, null), (j8i) m7fVar6.a(kceVar52.b(j8i.class), null, null), (rc8) m7fVar6.a(kceVar52.b(rc8.class), null, null));
                            case 8:
                                m7f m7fVar7 = (m7f) obj2;
                                m7fVar7.getClass();
                                ((bsc) obj3).getClass();
                                int i172 = lx.a[((AppEnvironment) m7fVar7.a(jce.a.b(AppEnvironment.class), null, null)).ordinal()];
                                if (i172 == 1) {
                                    return "LKJN8LsLERHEOXkw487o7qCTFOrGPimI";
                                }
                                if (i172 == 2 || i172 == 3) {
                                    return "b64sf1kxwDGe1PiSAlv5ixuH0f509RKK";
                                }
                                mr9.b();
                                return null;
                            case 9:
                                m7f m7fVar8 = (m7f) obj2;
                                m7fVar8.getClass();
                                ((bsc) obj3).getClass();
                                mrg mrgVar22 = mx.a;
                                kce kceVar6 = jce.a;
                                return new nff((String) m7fVar8.a(kceVar6.b(String.class), mrgVar22, null), (Context) m7fVar8.a(kceVar6.b(Context.class), null, null), (h86) m7fVar8.a(kceVar6.b(h86.class), null, null), (ud5) m7fVar8.a(kceVar6.b(ud5.class), null, null), (qk5) m7fVar8.a(kceVar6.b(qk5.class), null, null));
                            case 10:
                                m7f m7fVar9 = (m7f) obj2;
                                m7fVar9.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar7 = jce.a;
                                nff nffVar = (nff) m7fVar9.a(kceVar7.b(nff.class), null, null);
                                yw ywVar = gx.Companion;
                                ql8 ql8Var = new ql8(12);
                                ywVar.getClass();
                                gx.K = ql8Var;
                                String str = nffVar.a;
                                if (bsg.I0(str)) {
                                    sz6.p("writeKey cannot be blank ");
                                    return null;
                                }
                                mff mffVar = new mff(new eg4(nffVar.b, str), new el5(nffVar));
                                mffVar.b().a(new e10());
                                mffVar.b().a(new k30());
                                String strA = nffVar.d.a.a();
                                String languageTag = LocaleList.getDefault().get(0).toLanguageTag();
                                languageTag.getClass();
                                mffVar.b().a(new vd5(strA, languageTag));
                                mffVar.b().a(new nk5(i162));
                                mffVar.b().a(new nk5(nffVar.e));
                                boolean z = !((fk0) m7fVar9.a(kceVar7.b(fk0.class), null, null)).o();
                                mffVar.J = z;
                                el5 el5Var = mffVar.F;
                                gb9.D((mp4) el5Var.I, (e45) el5Var.F, null, new ax(mffVar, z, (tp4) null), 2);
                                return mffVar;
                            case 11:
                                m7f m7fVar10 = (m7f) obj2;
                                m7fVar10.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar8 = jce.a;
                                return new com.anthropic.claude.analytics.b((gx) m7fVar10.a(kceVar8.b(gx.class), null, null), (bg9) m7fVar10.a(kceVar8.b(bg9.class), null, null), (qk5) m7fVar10.a(kceVar8.b(qk5.class), null, null));
                            case 12:
                                m7f m7fVar11 = (m7f) obj2;
                                m7fVar11.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar11.a(jce.a.b(com.anthropic.claude.analytics.b.class), null, null);
                            case 13:
                                m7f m7fVar12 = (m7f) obj2;
                                m7fVar12.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar9 = jce.a;
                                fk0 fk0Var = (fk0) m7fVar12.a(kceVar9.b(fk0.class), null, null);
                                t29 t29Var = new t29(m7fVar12.a(kceVar9.b(gx.class), null, null));
                                t29 t29Var2 = new t29(m7fVar12.a(kceVar9.b(FirebaseAnalytics.class), null, null));
                                ((fk0) m7fVar12.a(kceVar9.b(fk0.class), null, null)).o();
                                return new smh(fk0Var, t29Var, t29Var2);
                            case 14:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new ti3();
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7f m7fVar13 = (m7f) obj2;
                                m7fVar13.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar13.a(jce.a.b(ti3.class), null, null);
                            case 16:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new hl8(new wg6(14), new rl7(6));
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7f m7fVar14 = (m7f) obj2;
                                m7fVar14.getClass();
                                ((bsc) obj3).getClass();
                                return new smh((fk0) m7fVar14.a(jce.a.b(fk0.class), null, null), new u0h(bw.G), new u0h(bw.H));
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7f m7fVar15 = (m7f) obj2;
                                m7fVar15.getClass();
                                ((bsc) obj3).getClass();
                                Object objB = ((qre) m7fVar15.a(jce.a.b(qre.class), null, null)).b(tja.class);
                                objB.getClass();
                                return (tja) objB;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7f m7fVar16 = (m7f) obj2;
                                m7fVar16.getClass();
                                ((bsc) obj3).getClass();
                                Object objB2 = ((qre) m7fVar16.a(jce.a.b(qre.class), null, null)).b(t8b.class);
                                objB2.getClass();
                                return (t8b) objB2;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7f m7fVar17 = (m7f) obj2;
                                m7fVar17.getClass();
                                ((bsc) obj3).getClass();
                                Object objB3 = ((qre) m7fVar17.a(jce.a.b(qre.class), null, null)).b(kab.class);
                                objB3.getClass();
                                return (kab) objB3;
                            case 21:
                                m7f m7fVar18 = (m7f) obj2;
                                m7fVar18.getClass();
                                ((bsc) obj3).getClass();
                                Object objB4 = ((qre) m7fVar18.a(jce.a.b(qre.class), null, null)).b(npb.class);
                                objB4.getClass();
                                return (npb) objB4;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7f m7fVar19 = (m7f) obj2;
                                m7fVar19.getClass();
                                ((bsc) obj3).getClass();
                                Object objB5 = ((qre) m7fVar19.a(jce.a.b(qre.class), null, null)).b(b7c.class);
                                objB5.getClass();
                                return (b7c) objB5;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7f m7fVar20 = (m7f) obj2;
                                m7fVar20.getClass();
                                ((bsc) obj3).getClass();
                                Object objB6 = ((qre) m7fVar20.a(jce.a.b(qre.class), null, null)).b(swa.class);
                                objB6.getClass();
                                return (swa) objB6;
                            case 24:
                                m7f m7fVar21 = (m7f) obj2;
                                m7fVar21.getClass();
                                ((bsc) obj3).getClass();
                                Object objB7 = ((qre) m7fVar21.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB7.getClass();
                                return (j2d) objB7;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7f m7fVar22 = (m7f) obj2;
                                m7fVar22.getClass();
                                ((bsc) obj3).getClass();
                                Object objB8 = ((qre) m7fVar22.a(jce.a.b(qre.class), null, null)).b(mkd.class);
                                objB8.getClass();
                                return (mkd) objB8;
                            case 26:
                                m7f m7fVar23 = (m7f) obj2;
                                m7fVar23.getClass();
                                ((bsc) obj3).getClass();
                                Object objB9 = ((qre) m7fVar23.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB9.getClass();
                                return (i8) objB9;
                            case 27:
                                m7f m7fVar24 = (m7f) obj2;
                                m7fVar24.getClass();
                                ((bsc) obj3).getClass();
                                Object objB10 = ((qre) m7fVar24.a(jce.a.b(qre.class), null, null)).b(omd.class);
                                objB10.getClass();
                                return (omd) objB10;
                            case 28:
                                m7f m7fVar25 = (m7f) obj2;
                                m7fVar25.getClass();
                                ((bsc) obj3).getClass();
                                Object objB11 = ((qre) m7fVar25.a(jce.a.b(qre.class), null, null)).b(pxd.class);
                                objB11.getClass();
                                return (pxd) objB11;
                            default:
                                m7f m7fVar26 = (m7f) obj2;
                                m7fVar26.getClass();
                                ((bsc) obj3).getClass();
                                Object objB12 = ((qre) m7fVar26.a(jce.a.b(qre.class), null, null)).b(r0h.class);
                                objB12.getClass();
                                return (r0h) objB12;
                        }
                    }
                }, kq9Var6)));
                oqbVar7.a(new t7g(new qh1(mrgVar4, kceVar5.b(hl8.class), null, new pz7() { // from class: c8
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) throws MissingAndroidContextException {
                        int i162 = 1;
                        switch (i4) {
                            case 0:
                                m7f m7fVar = (m7f) obj2;
                                m7fVar.getClass();
                                ((bsc) obj3).getClass();
                                Context contextG = yb5.g(m7fVar);
                                String strM949unboximpl = ((AccountId) m7fVar.a(jce.a.b(AccountId.class), null, null)).m949unboximpl();
                                strM949unboximpl.getClass();
                                SharedPreferences sharedPreferences = contextG.getApplicationContext().getSharedPreferences("account_prefs".concat(strM949unboximpl), 0);
                                sharedPreferences.getClass();
                                return new f8(sharedPreferences);
                            case 1:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                if (v40.a == null) {
                                    synchronized (v40.b) {
                                        if (v40.a == null) {
                                            pl7 pl7VarC = pl7.c();
                                            pl7VarC.a();
                                            v40.a = FirebaseAnalytics.getInstance(pl7VarC.a);
                                        }
                                        break;
                                    }
                                }
                                FirebaseAnalytics firebaseAnalytics = v40.a;
                                firebaseAnalytics.getClass();
                                return firebaseAnalytics;
                            case 2:
                                m7f m7fVar2 = (m7f) obj2;
                                m7fVar2.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar22 = jce.a;
                                return new ll7((FirebaseAnalytics) m7fVar2.a(kceVar22.b(FirebaseAnalytics.class), null, null), (am0) m7fVar2.a(kceVar22.b(am0.class), null, null));
                            case 3:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new kd();
                            case 4:
                                m7f m7fVar3 = (m7f) obj2;
                                m7fVar3.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar32 = jce.a;
                                return new hj((qi3) m7fVar3.a(kceVar32.b(qi3.class), null, null), (fk0) m7fVar3.a(kceVar32.b(fk0.class), null, null), new w9h(new cfk((Context) m7fVar3.a(kceVar32.b(Context.class), null, null))), (g78) m7fVar3.a(kceVar32.b(g78.class), null, null), (h86) m7fVar3.a(kceVar32.b(h86.class), null, null));
                            case 5:
                                m7f m7fVar4 = (m7f) obj2;
                                m7fVar4.getClass();
                                ((bsc) obj3).getClass();
                                return new pl(((doi) m7fVar4.a(jce.a.b(doi.class), null, null)).a("agent_chat"));
                            case 6:
                                m7f m7fVar5 = (m7f) obj2;
                                m7fVar5.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar42 = jce.a;
                                return new fq((dl2) m7fVar5.a(kceVar42.b(dl2.class), null, null), (h86) m7fVar5.a(kceVar42.b(h86.class), null, null), (oda) m7fVar5.a(kceVar42.b(oda.class), null, null), (koi) m7fVar5.a(kceVar42.b(koi.class), null, null));
                            case 7:
                                m7f m7fVar6 = (m7f) obj2;
                                m7fVar6.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar52 = jce.a;
                                return new vm((jwf) m7fVar6.a(kceVar52.b(jwf.class), null, null), (b) m7fVar6.a(kceVar52.b(b.class), null, null), (qzb) m7fVar6.a(kceVar52.b(qzb.class), null, null), (i8c) m7fVar6.a(kceVar52.b(i8c.class), null, null), (pl) m7fVar6.a(kceVar52.b(pl.class), null, null), yb5.g(m7fVar6), (ze0) m7fVar6.a(kceVar52.b(ze0.class), null, null), (koi) m7fVar6.a(kceVar52.b(koi.class), null, null), (i25) m7fVar6.a(kceVar52.b(i25.class), null, null), (hdc) m7fVar6.a(kceVar52.b(hdc.class), null, null), (fq) m7fVar6.a(kceVar52.b(fq.class), null, null), (oda) m7fVar6.a(kceVar52.b(oda.class), null, null), (h86) m7fVar6.a(kceVar52.b(h86.class), null, null), (qi3) m7fVar6.a(kceVar52.b(qi3.class), null, null), (z8c) m7fVar6.a(kceVar52.b(z8c.class), null, null), (j8i) m7fVar6.a(kceVar52.b(j8i.class), null, null), (rc8) m7fVar6.a(kceVar52.b(rc8.class), null, null));
                            case 8:
                                m7f m7fVar7 = (m7f) obj2;
                                m7fVar7.getClass();
                                ((bsc) obj3).getClass();
                                int i172 = lx.a[((AppEnvironment) m7fVar7.a(jce.a.b(AppEnvironment.class), null, null)).ordinal()];
                                if (i172 == 1) {
                                    return "LKJN8LsLERHEOXkw487o7qCTFOrGPimI";
                                }
                                if (i172 == 2 || i172 == 3) {
                                    return "b64sf1kxwDGe1PiSAlv5ixuH0f509RKK";
                                }
                                mr9.b();
                                return null;
                            case 9:
                                m7f m7fVar8 = (m7f) obj2;
                                m7fVar8.getClass();
                                ((bsc) obj3).getClass();
                                mrg mrgVar22 = mx.a;
                                kce kceVar6 = jce.a;
                                return new nff((String) m7fVar8.a(kceVar6.b(String.class), mrgVar22, null), (Context) m7fVar8.a(kceVar6.b(Context.class), null, null), (h86) m7fVar8.a(kceVar6.b(h86.class), null, null), (ud5) m7fVar8.a(kceVar6.b(ud5.class), null, null), (qk5) m7fVar8.a(kceVar6.b(qk5.class), null, null));
                            case 10:
                                m7f m7fVar9 = (m7f) obj2;
                                m7fVar9.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar7 = jce.a;
                                nff nffVar = (nff) m7fVar9.a(kceVar7.b(nff.class), null, null);
                                yw ywVar = gx.Companion;
                                ql8 ql8Var = new ql8(12);
                                ywVar.getClass();
                                gx.K = ql8Var;
                                String str = nffVar.a;
                                if (bsg.I0(str)) {
                                    sz6.p("writeKey cannot be blank ");
                                    return null;
                                }
                                mff mffVar = new mff(new eg4(nffVar.b, str), new el5(nffVar));
                                mffVar.b().a(new e10());
                                mffVar.b().a(new k30());
                                String strA = nffVar.d.a.a();
                                String languageTag = LocaleList.getDefault().get(0).toLanguageTag();
                                languageTag.getClass();
                                mffVar.b().a(new vd5(strA, languageTag));
                                mffVar.b().a(new nk5(i162));
                                mffVar.b().a(new nk5(nffVar.e));
                                boolean z = !((fk0) m7fVar9.a(kceVar7.b(fk0.class), null, null)).o();
                                mffVar.J = z;
                                el5 el5Var = mffVar.F;
                                gb9.D((mp4) el5Var.I, (e45) el5Var.F, null, new ax(mffVar, z, (tp4) null), 2);
                                return mffVar;
                            case 11:
                                m7f m7fVar10 = (m7f) obj2;
                                m7fVar10.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar8 = jce.a;
                                return new com.anthropic.claude.analytics.b((gx) m7fVar10.a(kceVar8.b(gx.class), null, null), (bg9) m7fVar10.a(kceVar8.b(bg9.class), null, null), (qk5) m7fVar10.a(kceVar8.b(qk5.class), null, null));
                            case 12:
                                m7f m7fVar11 = (m7f) obj2;
                                m7fVar11.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar11.a(jce.a.b(com.anthropic.claude.analytics.b.class), null, null);
                            case 13:
                                m7f m7fVar12 = (m7f) obj2;
                                m7fVar12.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar9 = jce.a;
                                fk0 fk0Var = (fk0) m7fVar12.a(kceVar9.b(fk0.class), null, null);
                                t29 t29Var = new t29(m7fVar12.a(kceVar9.b(gx.class), null, null));
                                t29 t29Var2 = new t29(m7fVar12.a(kceVar9.b(FirebaseAnalytics.class), null, null));
                                ((fk0) m7fVar12.a(kceVar9.b(fk0.class), null, null)).o();
                                return new smh(fk0Var, t29Var, t29Var2);
                            case 14:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new ti3();
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7f m7fVar13 = (m7f) obj2;
                                m7fVar13.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar13.a(jce.a.b(ti3.class), null, null);
                            case 16:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new hl8(new wg6(14), new rl7(6));
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7f m7fVar14 = (m7f) obj2;
                                m7fVar14.getClass();
                                ((bsc) obj3).getClass();
                                return new smh((fk0) m7fVar14.a(jce.a.b(fk0.class), null, null), new u0h(bw.G), new u0h(bw.H));
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7f m7fVar15 = (m7f) obj2;
                                m7fVar15.getClass();
                                ((bsc) obj3).getClass();
                                Object objB = ((qre) m7fVar15.a(jce.a.b(qre.class), null, null)).b(tja.class);
                                objB.getClass();
                                return (tja) objB;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7f m7fVar16 = (m7f) obj2;
                                m7fVar16.getClass();
                                ((bsc) obj3).getClass();
                                Object objB2 = ((qre) m7fVar16.a(jce.a.b(qre.class), null, null)).b(t8b.class);
                                objB2.getClass();
                                return (t8b) objB2;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7f m7fVar17 = (m7f) obj2;
                                m7fVar17.getClass();
                                ((bsc) obj3).getClass();
                                Object objB3 = ((qre) m7fVar17.a(jce.a.b(qre.class), null, null)).b(kab.class);
                                objB3.getClass();
                                return (kab) objB3;
                            case 21:
                                m7f m7fVar18 = (m7f) obj2;
                                m7fVar18.getClass();
                                ((bsc) obj3).getClass();
                                Object objB4 = ((qre) m7fVar18.a(jce.a.b(qre.class), null, null)).b(npb.class);
                                objB4.getClass();
                                return (npb) objB4;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7f m7fVar19 = (m7f) obj2;
                                m7fVar19.getClass();
                                ((bsc) obj3).getClass();
                                Object objB5 = ((qre) m7fVar19.a(jce.a.b(qre.class), null, null)).b(b7c.class);
                                objB5.getClass();
                                return (b7c) objB5;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7f m7fVar20 = (m7f) obj2;
                                m7fVar20.getClass();
                                ((bsc) obj3).getClass();
                                Object objB6 = ((qre) m7fVar20.a(jce.a.b(qre.class), null, null)).b(swa.class);
                                objB6.getClass();
                                return (swa) objB6;
                            case 24:
                                m7f m7fVar21 = (m7f) obj2;
                                m7fVar21.getClass();
                                ((bsc) obj3).getClass();
                                Object objB7 = ((qre) m7fVar21.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB7.getClass();
                                return (j2d) objB7;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7f m7fVar22 = (m7f) obj2;
                                m7fVar22.getClass();
                                ((bsc) obj3).getClass();
                                Object objB8 = ((qre) m7fVar22.a(jce.a.b(qre.class), null, null)).b(mkd.class);
                                objB8.getClass();
                                return (mkd) objB8;
                            case 26:
                                m7f m7fVar23 = (m7f) obj2;
                                m7fVar23.getClass();
                                ((bsc) obj3).getClass();
                                Object objB9 = ((qre) m7fVar23.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB9.getClass();
                                return (i8) objB9;
                            case 27:
                                m7f m7fVar24 = (m7f) obj2;
                                m7fVar24.getClass();
                                ((bsc) obj3).getClass();
                                Object objB10 = ((qre) m7fVar24.a(jce.a.b(qre.class), null, null)).b(omd.class);
                                objB10.getClass();
                                return (omd) objB10;
                            case 28:
                                m7f m7fVar25 = (m7f) obj2;
                                m7fVar25.getClass();
                                ((bsc) obj3).getClass();
                                Object objB11 = ((qre) m7fVar25.a(jce.a.b(qre.class), null, null)).b(pxd.class);
                                objB11.getClass();
                                return (pxd) objB11;
                            default:
                                m7f m7fVar26 = (m7f) obj2;
                                m7fVar26.getClass();
                                ((bsc) obj3).getClass();
                                Object objB12 = ((qre) m7fVar26.a(jce.a.b(qre.class), null, null)).b(r0h.class);
                                objB12.getClass();
                                return (r0h) objB12;
                        }
                    }
                }, kq9Var6)));
                sq6.C(new qh1(mrgVar4, kceVar5.b(smh.class), null, new pz7() { // from class: c8
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) throws MissingAndroidContextException {
                        int i162 = 1;
                        switch (i5) {
                            case 0:
                                m7f m7fVar = (m7f) obj2;
                                m7fVar.getClass();
                                ((bsc) obj3).getClass();
                                Context contextG = yb5.g(m7fVar);
                                String strM949unboximpl = ((AccountId) m7fVar.a(jce.a.b(AccountId.class), null, null)).m949unboximpl();
                                strM949unboximpl.getClass();
                                SharedPreferences sharedPreferences = contextG.getApplicationContext().getSharedPreferences("account_prefs".concat(strM949unboximpl), 0);
                                sharedPreferences.getClass();
                                return new f8(sharedPreferences);
                            case 1:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                if (v40.a == null) {
                                    synchronized (v40.b) {
                                        if (v40.a == null) {
                                            pl7 pl7VarC = pl7.c();
                                            pl7VarC.a();
                                            v40.a = FirebaseAnalytics.getInstance(pl7VarC.a);
                                        }
                                        break;
                                    }
                                }
                                FirebaseAnalytics firebaseAnalytics = v40.a;
                                firebaseAnalytics.getClass();
                                return firebaseAnalytics;
                            case 2:
                                m7f m7fVar2 = (m7f) obj2;
                                m7fVar2.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar22 = jce.a;
                                return new ll7((FirebaseAnalytics) m7fVar2.a(kceVar22.b(FirebaseAnalytics.class), null, null), (am0) m7fVar2.a(kceVar22.b(am0.class), null, null));
                            case 3:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new kd();
                            case 4:
                                m7f m7fVar3 = (m7f) obj2;
                                m7fVar3.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar32 = jce.a;
                                return new hj((qi3) m7fVar3.a(kceVar32.b(qi3.class), null, null), (fk0) m7fVar3.a(kceVar32.b(fk0.class), null, null), new w9h(new cfk((Context) m7fVar3.a(kceVar32.b(Context.class), null, null))), (g78) m7fVar3.a(kceVar32.b(g78.class), null, null), (h86) m7fVar3.a(kceVar32.b(h86.class), null, null));
                            case 5:
                                m7f m7fVar4 = (m7f) obj2;
                                m7fVar4.getClass();
                                ((bsc) obj3).getClass();
                                return new pl(((doi) m7fVar4.a(jce.a.b(doi.class), null, null)).a("agent_chat"));
                            case 6:
                                m7f m7fVar5 = (m7f) obj2;
                                m7fVar5.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar42 = jce.a;
                                return new fq((dl2) m7fVar5.a(kceVar42.b(dl2.class), null, null), (h86) m7fVar5.a(kceVar42.b(h86.class), null, null), (oda) m7fVar5.a(kceVar42.b(oda.class), null, null), (koi) m7fVar5.a(kceVar42.b(koi.class), null, null));
                            case 7:
                                m7f m7fVar6 = (m7f) obj2;
                                m7fVar6.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar52 = jce.a;
                                return new vm((jwf) m7fVar6.a(kceVar52.b(jwf.class), null, null), (b) m7fVar6.a(kceVar52.b(b.class), null, null), (qzb) m7fVar6.a(kceVar52.b(qzb.class), null, null), (i8c) m7fVar6.a(kceVar52.b(i8c.class), null, null), (pl) m7fVar6.a(kceVar52.b(pl.class), null, null), yb5.g(m7fVar6), (ze0) m7fVar6.a(kceVar52.b(ze0.class), null, null), (koi) m7fVar6.a(kceVar52.b(koi.class), null, null), (i25) m7fVar6.a(kceVar52.b(i25.class), null, null), (hdc) m7fVar6.a(kceVar52.b(hdc.class), null, null), (fq) m7fVar6.a(kceVar52.b(fq.class), null, null), (oda) m7fVar6.a(kceVar52.b(oda.class), null, null), (h86) m7fVar6.a(kceVar52.b(h86.class), null, null), (qi3) m7fVar6.a(kceVar52.b(qi3.class), null, null), (z8c) m7fVar6.a(kceVar52.b(z8c.class), null, null), (j8i) m7fVar6.a(kceVar52.b(j8i.class), null, null), (rc8) m7fVar6.a(kceVar52.b(rc8.class), null, null));
                            case 8:
                                m7f m7fVar7 = (m7f) obj2;
                                m7fVar7.getClass();
                                ((bsc) obj3).getClass();
                                int i172 = lx.a[((AppEnvironment) m7fVar7.a(jce.a.b(AppEnvironment.class), null, null)).ordinal()];
                                if (i172 == 1) {
                                    return "LKJN8LsLERHEOXkw487o7qCTFOrGPimI";
                                }
                                if (i172 == 2 || i172 == 3) {
                                    return "b64sf1kxwDGe1PiSAlv5ixuH0f509RKK";
                                }
                                mr9.b();
                                return null;
                            case 9:
                                m7f m7fVar8 = (m7f) obj2;
                                m7fVar8.getClass();
                                ((bsc) obj3).getClass();
                                mrg mrgVar22 = mx.a;
                                kce kceVar6 = jce.a;
                                return new nff((String) m7fVar8.a(kceVar6.b(String.class), mrgVar22, null), (Context) m7fVar8.a(kceVar6.b(Context.class), null, null), (h86) m7fVar8.a(kceVar6.b(h86.class), null, null), (ud5) m7fVar8.a(kceVar6.b(ud5.class), null, null), (qk5) m7fVar8.a(kceVar6.b(qk5.class), null, null));
                            case 10:
                                m7f m7fVar9 = (m7f) obj2;
                                m7fVar9.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar7 = jce.a;
                                nff nffVar = (nff) m7fVar9.a(kceVar7.b(nff.class), null, null);
                                yw ywVar = gx.Companion;
                                ql8 ql8Var = new ql8(12);
                                ywVar.getClass();
                                gx.K = ql8Var;
                                String str = nffVar.a;
                                if (bsg.I0(str)) {
                                    sz6.p("writeKey cannot be blank ");
                                    return null;
                                }
                                mff mffVar = new mff(new eg4(nffVar.b, str), new el5(nffVar));
                                mffVar.b().a(new e10());
                                mffVar.b().a(new k30());
                                String strA = nffVar.d.a.a();
                                String languageTag = LocaleList.getDefault().get(0).toLanguageTag();
                                languageTag.getClass();
                                mffVar.b().a(new vd5(strA, languageTag));
                                mffVar.b().a(new nk5(i162));
                                mffVar.b().a(new nk5(nffVar.e));
                                boolean z = !((fk0) m7fVar9.a(kceVar7.b(fk0.class), null, null)).o();
                                mffVar.J = z;
                                el5 el5Var = mffVar.F;
                                gb9.D((mp4) el5Var.I, (e45) el5Var.F, null, new ax(mffVar, z, (tp4) null), 2);
                                return mffVar;
                            case 11:
                                m7f m7fVar10 = (m7f) obj2;
                                m7fVar10.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar8 = jce.a;
                                return new com.anthropic.claude.analytics.b((gx) m7fVar10.a(kceVar8.b(gx.class), null, null), (bg9) m7fVar10.a(kceVar8.b(bg9.class), null, null), (qk5) m7fVar10.a(kceVar8.b(qk5.class), null, null));
                            case 12:
                                m7f m7fVar11 = (m7f) obj2;
                                m7fVar11.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar11.a(jce.a.b(com.anthropic.claude.analytics.b.class), null, null);
                            case 13:
                                m7f m7fVar12 = (m7f) obj2;
                                m7fVar12.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar9 = jce.a;
                                fk0 fk0Var = (fk0) m7fVar12.a(kceVar9.b(fk0.class), null, null);
                                t29 t29Var = new t29(m7fVar12.a(kceVar9.b(gx.class), null, null));
                                t29 t29Var2 = new t29(m7fVar12.a(kceVar9.b(FirebaseAnalytics.class), null, null));
                                ((fk0) m7fVar12.a(kceVar9.b(fk0.class), null, null)).o();
                                return new smh(fk0Var, t29Var, t29Var2);
                            case 14:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new ti3();
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7f m7fVar13 = (m7f) obj2;
                                m7fVar13.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar13.a(jce.a.b(ti3.class), null, null);
                            case 16:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new hl8(new wg6(14), new rl7(6));
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7f m7fVar14 = (m7f) obj2;
                                m7fVar14.getClass();
                                ((bsc) obj3).getClass();
                                return new smh((fk0) m7fVar14.a(jce.a.b(fk0.class), null, null), new u0h(bw.G), new u0h(bw.H));
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7f m7fVar15 = (m7f) obj2;
                                m7fVar15.getClass();
                                ((bsc) obj3).getClass();
                                Object objB = ((qre) m7fVar15.a(jce.a.b(qre.class), null, null)).b(tja.class);
                                objB.getClass();
                                return (tja) objB;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7f m7fVar16 = (m7f) obj2;
                                m7fVar16.getClass();
                                ((bsc) obj3).getClass();
                                Object objB2 = ((qre) m7fVar16.a(jce.a.b(qre.class), null, null)).b(t8b.class);
                                objB2.getClass();
                                return (t8b) objB2;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7f m7fVar17 = (m7f) obj2;
                                m7fVar17.getClass();
                                ((bsc) obj3).getClass();
                                Object objB3 = ((qre) m7fVar17.a(jce.a.b(qre.class), null, null)).b(kab.class);
                                objB3.getClass();
                                return (kab) objB3;
                            case 21:
                                m7f m7fVar18 = (m7f) obj2;
                                m7fVar18.getClass();
                                ((bsc) obj3).getClass();
                                Object objB4 = ((qre) m7fVar18.a(jce.a.b(qre.class), null, null)).b(npb.class);
                                objB4.getClass();
                                return (npb) objB4;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7f m7fVar19 = (m7f) obj2;
                                m7fVar19.getClass();
                                ((bsc) obj3).getClass();
                                Object objB5 = ((qre) m7fVar19.a(jce.a.b(qre.class), null, null)).b(b7c.class);
                                objB5.getClass();
                                return (b7c) objB5;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7f m7fVar20 = (m7f) obj2;
                                m7fVar20.getClass();
                                ((bsc) obj3).getClass();
                                Object objB6 = ((qre) m7fVar20.a(jce.a.b(qre.class), null, null)).b(swa.class);
                                objB6.getClass();
                                return (swa) objB6;
                            case 24:
                                m7f m7fVar21 = (m7f) obj2;
                                m7fVar21.getClass();
                                ((bsc) obj3).getClass();
                                Object objB7 = ((qre) m7fVar21.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB7.getClass();
                                return (j2d) objB7;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7f m7fVar22 = (m7f) obj2;
                                m7fVar22.getClass();
                                ((bsc) obj3).getClass();
                                Object objB8 = ((qre) m7fVar22.a(jce.a.b(qre.class), null, null)).b(mkd.class);
                                objB8.getClass();
                                return (mkd) objB8;
                            case 26:
                                m7f m7fVar23 = (m7f) obj2;
                                m7fVar23.getClass();
                                ((bsc) obj3).getClass();
                                Object objB9 = ((qre) m7fVar23.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB9.getClass();
                                return (i8) objB9;
                            case 27:
                                m7f m7fVar24 = (m7f) obj2;
                                m7fVar24.getClass();
                                ((bsc) obj3).getClass();
                                Object objB10 = ((qre) m7fVar24.a(jce.a.b(qre.class), null, null)).b(omd.class);
                                objB10.getClass();
                                return (omd) objB10;
                            case 28:
                                m7f m7fVar25 = (m7f) obj2;
                                m7fVar25.getClass();
                                ((bsc) obj3).getClass();
                                Object objB11 = ((qre) m7fVar25.a(jce.a.b(qre.class), null, null)).b(pxd.class);
                                objB11.getClass();
                                return (pxd) objB11;
                            default:
                                m7f m7fVar26 = (m7f) obj2;
                                m7fVar26.getClass();
                                ((bsc) obj3).getClass();
                                Object objB12 = ((qre) m7fVar26.a(jce.a.b(qre.class), null, null)).b(r0h.class);
                                objB12.getClass();
                                return (r0h) objB12;
                        }
                    }
                }, kq9Var6), oqbVar7);
                b54.u0(oqbVar7.e, new oqb[]{jd.b});
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                ((Integer) obj).getClass();
                break;
            case 11:
                break;
            case 12:
                ((i90) obj).getClass();
                ad5 ad5Var = wi6.a;
                break;
            case 13:
                break;
            case 14:
                oqb oqbVar8 = (oqb) obj;
                oqbVar8.getClass();
                final int i24 = 24;
                pz7 pz7Var5 = new pz7() { // from class: if0
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) {
                        m7f m7fVar = (m7f) obj2;
                        bsc bscVar = (bsc) obj3;
                        switch (i24) {
                            case 0:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(n9h.class);
                                objB.getClass();
                                return (n9h) objB;
                            case 1:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB2 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(v7i.class);
                                objB2.getClass();
                                return (v7i) objB2;
                            case 2:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB3 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ptf.class);
                                objB3.getClass();
                                return (ptf) objB3;
                            case 3:
                                m7fVar.getClass();
                                bscVar.getClass();
                                return new jf0((rc8) m7fVar.a(jce.a.b(rc8.class), null, null));
                            case 4:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB4 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(kli.class);
                                objB4.getClass();
                                return (kli) objB4;
                            case 5:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB5 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(haj.class);
                                objB5.getClass();
                                return (haj) objB5;
                            case 6:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB6 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ok7.class);
                                objB6.getClass();
                                return (ok7) objB6;
                            case 7:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB7 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ui0.class);
                                objB7.getClass();
                                return (ui0) objB7;
                            case 8:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB8 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(p87.class);
                                objB8.getClass();
                                return (p87) objB8;
                            case 9:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB9 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(nu0.class);
                                objB9.getClass();
                                return (nu0) objB9;
                            case 10:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB10 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(dl2.class);
                                objB10.getClass();
                                return (dl2) objB10;
                            case 11:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB11 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ya3.class);
                                objB11.getClass();
                                return (ya3) objB11;
                            case 12:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB12 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uk4.class);
                                objB12.getClass();
                                return (uk4) objB12;
                            case 13:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB13 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(er4.class);
                                objB13.getClass();
                                return (er4) objB13;
                            case 14:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB14 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uz6.class);
                                objB14.getClass();
                                return (uz6) objB14;
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB15 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(hb7.class);
                                objB15.getClass();
                                y6a.r(objB15);
                                throw null;
                            case 16:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB16 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(tga.class);
                                objB16.getClass();
                                return (tga) objB16;
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB17 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB17.getClass();
                                return (o7) objB17;
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB18 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB18.getClass();
                                return (j2d) objB18;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB19 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB19.getClass();
                                return (o7) objB19;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB20 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB20.getClass();
                                return (i8) objB20;
                            case 21:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB21 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(xjc.class);
                                objB21.getClass();
                                return (xjc) objB21;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB22 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(gae.class);
                                objB22.getClass();
                                return (gae) objB22;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB23 = ((qre) m7fVar.a(jce.a.b(qre.class), nai.s, null)).b(rmb.class);
                                objB23.getClass();
                                y6a.r(objB23);
                                throw null;
                            case 24:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB24 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(uz6.class);
                                objB24.getClass();
                                return (uz6) objB24;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB25 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(p2a.class);
                                objB25.getClass();
                                return (p2a) objB25;
                            case 26:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB26 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(a78.class);
                                objB26.getClass();
                                return (a78) objB26;
                            case 27:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB27 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB27.getClass();
                                return (o7) objB27;
                            case 28:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB28 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uf7.class);
                                objB28.getClass();
                                return (uf7) objB28;
                            default:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB29 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(mk7.class);
                                objB29.getClass();
                                return (mk7) objB29;
                        }
                    }
                };
                kce kceVar6 = jce.a;
                pl9 pl9VarB9 = kceVar6.b(uz6.class);
                mrg mrgVar5 = dpf.K;
                kq9 kq9Var7 = kq9.F;
                oqbVar8.a(new ge7(new qh1(mrgVar5, pl9VarB9, null, pz7Var5, kq9Var7)));
                final int i25 = 25;
                ij0.v(new qh1(mrgVar5, kceVar6.b(p2a.class), null, new pz7() { // from class: if0
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) {
                        m7f m7fVar = (m7f) obj2;
                        bsc bscVar = (bsc) obj3;
                        switch (i25) {
                            case 0:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(n9h.class);
                                objB.getClass();
                                return (n9h) objB;
                            case 1:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB2 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(v7i.class);
                                objB2.getClass();
                                return (v7i) objB2;
                            case 2:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB3 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ptf.class);
                                objB3.getClass();
                                return (ptf) objB3;
                            case 3:
                                m7fVar.getClass();
                                bscVar.getClass();
                                return new jf0((rc8) m7fVar.a(jce.a.b(rc8.class), null, null));
                            case 4:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB4 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(kli.class);
                                objB4.getClass();
                                return (kli) objB4;
                            case 5:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB5 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(haj.class);
                                objB5.getClass();
                                return (haj) objB5;
                            case 6:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB6 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ok7.class);
                                objB6.getClass();
                                return (ok7) objB6;
                            case 7:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB7 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ui0.class);
                                objB7.getClass();
                                return (ui0) objB7;
                            case 8:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB8 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(p87.class);
                                objB8.getClass();
                                return (p87) objB8;
                            case 9:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB9 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(nu0.class);
                                objB9.getClass();
                                return (nu0) objB9;
                            case 10:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB10 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(dl2.class);
                                objB10.getClass();
                                return (dl2) objB10;
                            case 11:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB11 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ya3.class);
                                objB11.getClass();
                                return (ya3) objB11;
                            case 12:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB12 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uk4.class);
                                objB12.getClass();
                                return (uk4) objB12;
                            case 13:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB13 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(er4.class);
                                objB13.getClass();
                                return (er4) objB13;
                            case 14:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB14 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uz6.class);
                                objB14.getClass();
                                return (uz6) objB14;
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB15 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(hb7.class);
                                objB15.getClass();
                                y6a.r(objB15);
                                throw null;
                            case 16:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB16 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(tga.class);
                                objB16.getClass();
                                return (tga) objB16;
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB17 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB17.getClass();
                                return (o7) objB17;
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB18 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB18.getClass();
                                return (j2d) objB18;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB19 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB19.getClass();
                                return (o7) objB19;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB20 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB20.getClass();
                                return (i8) objB20;
                            case 21:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB21 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(xjc.class);
                                objB21.getClass();
                                return (xjc) objB21;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB22 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(gae.class);
                                objB22.getClass();
                                return (gae) objB22;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB23 = ((qre) m7fVar.a(jce.a.b(qre.class), nai.s, null)).b(rmb.class);
                                objB23.getClass();
                                y6a.r(objB23);
                                throw null;
                            case 24:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB24 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(uz6.class);
                                objB24.getClass();
                                return (uz6) objB24;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB25 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(p2a.class);
                                objB25.getClass();
                                return (p2a) objB25;
                            case 26:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB26 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(a78.class);
                                objB26.getClass();
                                return (a78) objB26;
                            case 27:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB27 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB27.getClass();
                                return (o7) objB27;
                            case 28:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB28 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uf7.class);
                                objB28.getClass();
                                return (uf7) objB28;
                            default:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB29 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(mk7.class);
                                objB29.getClass();
                                return (mk7) objB29;
                        }
                    }
                }, kq9Var7), oqbVar8);
                final int i26 = 26;
                ij0.v(new qh1(mrgVar5, kceVar6.b(a78.class), nai.r, new pz7() { // from class: if0
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) {
                        m7f m7fVar = (m7f) obj2;
                        bsc bscVar = (bsc) obj3;
                        switch (i26) {
                            case 0:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(n9h.class);
                                objB.getClass();
                                return (n9h) objB;
                            case 1:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB2 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(v7i.class);
                                objB2.getClass();
                                return (v7i) objB2;
                            case 2:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB3 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ptf.class);
                                objB3.getClass();
                                return (ptf) objB3;
                            case 3:
                                m7fVar.getClass();
                                bscVar.getClass();
                                return new jf0((rc8) m7fVar.a(jce.a.b(rc8.class), null, null));
                            case 4:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB4 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(kli.class);
                                objB4.getClass();
                                return (kli) objB4;
                            case 5:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB5 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(haj.class);
                                objB5.getClass();
                                return (haj) objB5;
                            case 6:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB6 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ok7.class);
                                objB6.getClass();
                                return (ok7) objB6;
                            case 7:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB7 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ui0.class);
                                objB7.getClass();
                                return (ui0) objB7;
                            case 8:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB8 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(p87.class);
                                objB8.getClass();
                                return (p87) objB8;
                            case 9:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB9 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(nu0.class);
                                objB9.getClass();
                                return (nu0) objB9;
                            case 10:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB10 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(dl2.class);
                                objB10.getClass();
                                return (dl2) objB10;
                            case 11:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB11 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ya3.class);
                                objB11.getClass();
                                return (ya3) objB11;
                            case 12:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB12 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uk4.class);
                                objB12.getClass();
                                return (uk4) objB12;
                            case 13:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB13 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(er4.class);
                                objB13.getClass();
                                return (er4) objB13;
                            case 14:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB14 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uz6.class);
                                objB14.getClass();
                                return (uz6) objB14;
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB15 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(hb7.class);
                                objB15.getClass();
                                y6a.r(objB15);
                                throw null;
                            case 16:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB16 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(tga.class);
                                objB16.getClass();
                                return (tga) objB16;
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB17 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB17.getClass();
                                return (o7) objB17;
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB18 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB18.getClass();
                                return (j2d) objB18;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB19 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB19.getClass();
                                return (o7) objB19;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB20 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB20.getClass();
                                return (i8) objB20;
                            case 21:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB21 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(xjc.class);
                                objB21.getClass();
                                return (xjc) objB21;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB22 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(gae.class);
                                objB22.getClass();
                                return (gae) objB22;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB23 = ((qre) m7fVar.a(jce.a.b(qre.class), nai.s, null)).b(rmb.class);
                                objB23.getClass();
                                y6a.r(objB23);
                                throw null;
                            case 24:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB24 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(uz6.class);
                                objB24.getClass();
                                return (uz6) objB24;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB25 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(p2a.class);
                                objB25.getClass();
                                return (p2a) objB25;
                            case 26:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB26 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(a78.class);
                                objB26.getClass();
                                return (a78) objB26;
                            case 27:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB27 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB27.getClass();
                                return (o7) objB27;
                            case 28:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB28 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uf7.class);
                                objB28.getClass();
                                return (uf7) objB28;
                            default:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB29 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(mk7.class);
                                objB29.getClass();
                                return (mk7) objB29;
                        }
                    }
                }, kq9Var7), oqbVar8);
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                oqb oqbVar9 = (oqb) obj;
                oqbVar9.getClass();
                kce kceVar7 = jce.a;
                xai xaiVar3 = new xai(kceVar7.b(lja.class));
                pz7 pz7Var6 = new pz7() { // from class: if0
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) {
                        m7f m7fVar = (m7f) obj2;
                        bsc bscVar = (bsc) obj3;
                        switch (i4) {
                            case 0:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(n9h.class);
                                objB.getClass();
                                return (n9h) objB;
                            case 1:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB2 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(v7i.class);
                                objB2.getClass();
                                return (v7i) objB2;
                            case 2:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB3 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ptf.class);
                                objB3.getClass();
                                return (ptf) objB3;
                            case 3:
                                m7fVar.getClass();
                                bscVar.getClass();
                                return new jf0((rc8) m7fVar.a(jce.a.b(rc8.class), null, null));
                            case 4:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB4 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(kli.class);
                                objB4.getClass();
                                return (kli) objB4;
                            case 5:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB5 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(haj.class);
                                objB5.getClass();
                                return (haj) objB5;
                            case 6:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB6 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ok7.class);
                                objB6.getClass();
                                return (ok7) objB6;
                            case 7:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB7 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ui0.class);
                                objB7.getClass();
                                return (ui0) objB7;
                            case 8:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB8 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(p87.class);
                                objB8.getClass();
                                return (p87) objB8;
                            case 9:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB9 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(nu0.class);
                                objB9.getClass();
                                return (nu0) objB9;
                            case 10:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB10 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(dl2.class);
                                objB10.getClass();
                                return (dl2) objB10;
                            case 11:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB11 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ya3.class);
                                objB11.getClass();
                                return (ya3) objB11;
                            case 12:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB12 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uk4.class);
                                objB12.getClass();
                                return (uk4) objB12;
                            case 13:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB13 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(er4.class);
                                objB13.getClass();
                                return (er4) objB13;
                            case 14:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB14 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uz6.class);
                                objB14.getClass();
                                return (uz6) objB14;
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB15 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(hb7.class);
                                objB15.getClass();
                                y6a.r(objB15);
                                throw null;
                            case 16:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB16 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(tga.class);
                                objB16.getClass();
                                return (tga) objB16;
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB17 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB17.getClass();
                                return (o7) objB17;
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB18 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB18.getClass();
                                return (j2d) objB18;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB19 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB19.getClass();
                                return (o7) objB19;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB20 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB20.getClass();
                                return (i8) objB20;
                            case 21:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB21 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(xjc.class);
                                objB21.getClass();
                                return (xjc) objB21;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB22 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(gae.class);
                                objB22.getClass();
                                return (gae) objB22;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB23 = ((qre) m7fVar.a(jce.a.b(qre.class), nai.s, null)).b(rmb.class);
                                objB23.getClass();
                                y6a.r(objB23);
                                throw null;
                            case 24:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB24 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(uz6.class);
                                objB24.getClass();
                                return (uz6) objB24;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB25 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(p2a.class);
                                objB25.getClass();
                                return (p2a) objB25;
                            case 26:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB26 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(a78.class);
                                objB26.getClass();
                                return (a78) objB26;
                            case 27:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB27 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB27.getClass();
                                return (o7) objB27;
                            case 28:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB28 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uf7.class);
                                objB28.getClass();
                                return (uf7) objB28;
                            default:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB29 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(mk7.class);
                                objB29.getClass();
                                return (mk7) objB29;
                        }
                    }
                };
                pl9 pl9VarB10 = kceVar7.b(tga.class);
                kq9 kq9Var8 = kq9.F;
                oqbVar9.a(new ge7(new qh1(xaiVar3, pl9VarB10, null, pz7Var6, kq9Var8)));
                oqbVar9.a(new ge7(new qh1(xaiVar3, kceVar7.b(o7.class), null, new pz7() { // from class: if0
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) {
                        m7f m7fVar = (m7f) obj2;
                        bsc bscVar = (bsc) obj3;
                        switch (i5) {
                            case 0:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(n9h.class);
                                objB.getClass();
                                return (n9h) objB;
                            case 1:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB2 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(v7i.class);
                                objB2.getClass();
                                return (v7i) objB2;
                            case 2:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB3 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ptf.class);
                                objB3.getClass();
                                return (ptf) objB3;
                            case 3:
                                m7fVar.getClass();
                                bscVar.getClass();
                                return new jf0((rc8) m7fVar.a(jce.a.b(rc8.class), null, null));
                            case 4:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB4 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(kli.class);
                                objB4.getClass();
                                return (kli) objB4;
                            case 5:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB5 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(haj.class);
                                objB5.getClass();
                                return (haj) objB5;
                            case 6:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB6 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ok7.class);
                                objB6.getClass();
                                return (ok7) objB6;
                            case 7:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB7 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ui0.class);
                                objB7.getClass();
                                return (ui0) objB7;
                            case 8:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB8 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(p87.class);
                                objB8.getClass();
                                return (p87) objB8;
                            case 9:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB9 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(nu0.class);
                                objB9.getClass();
                                return (nu0) objB9;
                            case 10:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB10 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(dl2.class);
                                objB10.getClass();
                                return (dl2) objB10;
                            case 11:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB11 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ya3.class);
                                objB11.getClass();
                                return (ya3) objB11;
                            case 12:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB12 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uk4.class);
                                objB12.getClass();
                                return (uk4) objB12;
                            case 13:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB13 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(er4.class);
                                objB13.getClass();
                                return (er4) objB13;
                            case 14:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB14 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uz6.class);
                                objB14.getClass();
                                return (uz6) objB14;
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB15 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(hb7.class);
                                objB15.getClass();
                                y6a.r(objB15);
                                throw null;
                            case 16:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB16 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(tga.class);
                                objB16.getClass();
                                return (tga) objB16;
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB17 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB17.getClass();
                                return (o7) objB17;
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB18 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB18.getClass();
                                return (j2d) objB18;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB19 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB19.getClass();
                                return (o7) objB19;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB20 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB20.getClass();
                                return (i8) objB20;
                            case 21:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB21 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(xjc.class);
                                objB21.getClass();
                                return (xjc) objB21;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB22 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(gae.class);
                                objB22.getClass();
                                return (gae) objB22;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB23 = ((qre) m7fVar.a(jce.a.b(qre.class), nai.s, null)).b(rmb.class);
                                objB23.getClass();
                                y6a.r(objB23);
                                throw null;
                            case 24:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB24 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(uz6.class);
                                objB24.getClass();
                                return (uz6) objB24;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB25 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(p2a.class);
                                objB25.getClass();
                                return (p2a) objB25;
                            case 26:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB26 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(a78.class);
                                objB26.getClass();
                                return (a78) objB26;
                            case 27:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB27 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB27.getClass();
                                return (o7) objB27;
                            case 28:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB28 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uf7.class);
                                objB28.getClass();
                                return (uf7) objB28;
                            default:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB29 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(mk7.class);
                                objB29.getClass();
                                return (mk7) objB29;
                        }
                    }
                }, kq9Var8)));
                ij0.v(new qh1(xaiVar3, kceVar7.b(j2d.class), null, new pz7() { // from class: if0
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) {
                        m7f m7fVar = (m7f) obj2;
                        bsc bscVar = (bsc) obj3;
                        switch (i11) {
                            case 0:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(n9h.class);
                                objB.getClass();
                                return (n9h) objB;
                            case 1:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB2 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(v7i.class);
                                objB2.getClass();
                                return (v7i) objB2;
                            case 2:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB3 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ptf.class);
                                objB3.getClass();
                                return (ptf) objB3;
                            case 3:
                                m7fVar.getClass();
                                bscVar.getClass();
                                return new jf0((rc8) m7fVar.a(jce.a.b(rc8.class), null, null));
                            case 4:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB4 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(kli.class);
                                objB4.getClass();
                                return (kli) objB4;
                            case 5:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB5 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(haj.class);
                                objB5.getClass();
                                return (haj) objB5;
                            case 6:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB6 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ok7.class);
                                objB6.getClass();
                                return (ok7) objB6;
                            case 7:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB7 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ui0.class);
                                objB7.getClass();
                                return (ui0) objB7;
                            case 8:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB8 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(p87.class);
                                objB8.getClass();
                                return (p87) objB8;
                            case 9:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB9 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(nu0.class);
                                objB9.getClass();
                                return (nu0) objB9;
                            case 10:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB10 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(dl2.class);
                                objB10.getClass();
                                return (dl2) objB10;
                            case 11:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB11 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ya3.class);
                                objB11.getClass();
                                return (ya3) objB11;
                            case 12:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB12 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uk4.class);
                                objB12.getClass();
                                return (uk4) objB12;
                            case 13:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB13 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(er4.class);
                                objB13.getClass();
                                return (er4) objB13;
                            case 14:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB14 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uz6.class);
                                objB14.getClass();
                                return (uz6) objB14;
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB15 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(hb7.class);
                                objB15.getClass();
                                y6a.r(objB15);
                                throw null;
                            case 16:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB16 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(tga.class);
                                objB16.getClass();
                                return (tga) objB16;
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB17 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB17.getClass();
                                return (o7) objB17;
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB18 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB18.getClass();
                                return (j2d) objB18;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB19 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB19.getClass();
                                return (o7) objB19;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB20 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB20.getClass();
                                return (i8) objB20;
                            case 21:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB21 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(xjc.class);
                                objB21.getClass();
                                return (xjc) objB21;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB22 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(gae.class);
                                objB22.getClass();
                                return (gae) objB22;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB23 = ((qre) m7fVar.a(jce.a.b(qre.class), nai.s, null)).b(rmb.class);
                                objB23.getClass();
                                y6a.r(objB23);
                                throw null;
                            case 24:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB24 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(uz6.class);
                                objB24.getClass();
                                return (uz6) objB24;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB25 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(p2a.class);
                                objB25.getClass();
                                return (p2a) objB25;
                            case 26:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB26 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(a78.class);
                                objB26.getClass();
                                return (a78) objB26;
                            case 27:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB27 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB27.getClass();
                                return (o7) objB27;
                            case 28:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB28 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uf7.class);
                                objB28.getClass();
                                return (uf7) objB28;
                            default:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB29 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(mk7.class);
                                objB29.getClass();
                                return (mk7) objB29;
                        }
                    }
                }, kq9Var8), oqbVar9);
                oqbVar9.d.add(xaiVar3);
                break;
            case 16:
                oqb oqbVar10 = (oqb) obj;
                oqbVar10.getClass();
                kce kceVar8 = jce.a;
                xai xaiVar4 = new xai(kceVar8.b(j8.class));
                pz7 pz7Var7 = new pz7() { // from class: if0
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) {
                        m7f m7fVar = (m7f) obj2;
                        bsc bscVar = (bsc) obj3;
                        switch (i9) {
                            case 0:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(n9h.class);
                                objB.getClass();
                                return (n9h) objB;
                            case 1:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB2 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(v7i.class);
                                objB2.getClass();
                                return (v7i) objB2;
                            case 2:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB3 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ptf.class);
                                objB3.getClass();
                                return (ptf) objB3;
                            case 3:
                                m7fVar.getClass();
                                bscVar.getClass();
                                return new jf0((rc8) m7fVar.a(jce.a.b(rc8.class), null, null));
                            case 4:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB4 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(kli.class);
                                objB4.getClass();
                                return (kli) objB4;
                            case 5:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB5 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(haj.class);
                                objB5.getClass();
                                return (haj) objB5;
                            case 6:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB6 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ok7.class);
                                objB6.getClass();
                                return (ok7) objB6;
                            case 7:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB7 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ui0.class);
                                objB7.getClass();
                                return (ui0) objB7;
                            case 8:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB8 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(p87.class);
                                objB8.getClass();
                                return (p87) objB8;
                            case 9:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB9 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(nu0.class);
                                objB9.getClass();
                                return (nu0) objB9;
                            case 10:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB10 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(dl2.class);
                                objB10.getClass();
                                return (dl2) objB10;
                            case 11:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB11 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ya3.class);
                                objB11.getClass();
                                return (ya3) objB11;
                            case 12:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB12 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uk4.class);
                                objB12.getClass();
                                return (uk4) objB12;
                            case 13:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB13 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(er4.class);
                                objB13.getClass();
                                return (er4) objB13;
                            case 14:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB14 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uz6.class);
                                objB14.getClass();
                                return (uz6) objB14;
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB15 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(hb7.class);
                                objB15.getClass();
                                y6a.r(objB15);
                                throw null;
                            case 16:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB16 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(tga.class);
                                objB16.getClass();
                                return (tga) objB16;
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB17 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB17.getClass();
                                return (o7) objB17;
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB18 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB18.getClass();
                                return (j2d) objB18;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB19 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB19.getClass();
                                return (o7) objB19;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB20 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB20.getClass();
                                return (i8) objB20;
                            case 21:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB21 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(xjc.class);
                                objB21.getClass();
                                return (xjc) objB21;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB22 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(gae.class);
                                objB22.getClass();
                                return (gae) objB22;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB23 = ((qre) m7fVar.a(jce.a.b(qre.class), nai.s, null)).b(rmb.class);
                                objB23.getClass();
                                y6a.r(objB23);
                                throw null;
                            case 24:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB24 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(uz6.class);
                                objB24.getClass();
                                return (uz6) objB24;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB25 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(p2a.class);
                                objB25.getClass();
                                return (p2a) objB25;
                            case 26:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB26 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(a78.class);
                                objB26.getClass();
                                return (a78) objB26;
                            case 27:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB27 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB27.getClass();
                                return (o7) objB27;
                            case 28:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB28 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uf7.class);
                                objB28.getClass();
                                return (uf7) objB28;
                            default:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB29 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(mk7.class);
                                objB29.getClass();
                                return (mk7) objB29;
                        }
                    }
                };
                pl9 pl9VarB11 = kceVar8.b(o7.class);
                kq9 kq9Var9 = kq9.F;
                oqbVar10.a(new ge7(new qh1(xaiVar4, pl9VarB11, null, pz7Var7, kq9Var9)));
                oqbVar10.a(new ge7(new qh1(xaiVar4, kceVar8.b(i8.class), null, new pz7() { // from class: if0
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) {
                        m7f m7fVar = (m7f) obj2;
                        bsc bscVar = (bsc) obj3;
                        switch (i8) {
                            case 0:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(n9h.class);
                                objB.getClass();
                                return (n9h) objB;
                            case 1:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB2 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(v7i.class);
                                objB2.getClass();
                                return (v7i) objB2;
                            case 2:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB3 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ptf.class);
                                objB3.getClass();
                                return (ptf) objB3;
                            case 3:
                                m7fVar.getClass();
                                bscVar.getClass();
                                return new jf0((rc8) m7fVar.a(jce.a.b(rc8.class), null, null));
                            case 4:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB4 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(kli.class);
                                objB4.getClass();
                                return (kli) objB4;
                            case 5:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB5 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(haj.class);
                                objB5.getClass();
                                return (haj) objB5;
                            case 6:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB6 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ok7.class);
                                objB6.getClass();
                                return (ok7) objB6;
                            case 7:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB7 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ui0.class);
                                objB7.getClass();
                                return (ui0) objB7;
                            case 8:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB8 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(p87.class);
                                objB8.getClass();
                                return (p87) objB8;
                            case 9:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB9 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(nu0.class);
                                objB9.getClass();
                                return (nu0) objB9;
                            case 10:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB10 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(dl2.class);
                                objB10.getClass();
                                return (dl2) objB10;
                            case 11:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB11 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ya3.class);
                                objB11.getClass();
                                return (ya3) objB11;
                            case 12:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB12 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uk4.class);
                                objB12.getClass();
                                return (uk4) objB12;
                            case 13:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB13 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(er4.class);
                                objB13.getClass();
                                return (er4) objB13;
                            case 14:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB14 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uz6.class);
                                objB14.getClass();
                                return (uz6) objB14;
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB15 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(hb7.class);
                                objB15.getClass();
                                y6a.r(objB15);
                                throw null;
                            case 16:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB16 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(tga.class);
                                objB16.getClass();
                                return (tga) objB16;
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB17 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB17.getClass();
                                return (o7) objB17;
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB18 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB18.getClass();
                                return (j2d) objB18;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB19 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB19.getClass();
                                return (o7) objB19;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB20 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB20.getClass();
                                return (i8) objB20;
                            case 21:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB21 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(xjc.class);
                                objB21.getClass();
                                return (xjc) objB21;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB22 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(gae.class);
                                objB22.getClass();
                                return (gae) objB22;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB23 = ((qre) m7fVar.a(jce.a.b(qre.class), nai.s, null)).b(rmb.class);
                                objB23.getClass();
                                y6a.r(objB23);
                                throw null;
                            case 24:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB24 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(uz6.class);
                                objB24.getClass();
                                return (uz6) objB24;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB25 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(p2a.class);
                                objB25.getClass();
                                return (p2a) objB25;
                            case 26:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB26 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(a78.class);
                                objB26.getClass();
                                return (a78) objB26;
                            case 27:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB27 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB27.getClass();
                                return (o7) objB27;
                            case 28:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB28 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uf7.class);
                                objB28.getClass();
                                return (uf7) objB28;
                            default:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB29 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(mk7.class);
                                objB29.getClass();
                                return (mk7) objB29;
                        }
                    }
                }, kq9Var9)));
                oqbVar10.a(new ge7(new qh1(xaiVar4, kceVar8.b(xjc.class), null, new pz7() { // from class: if0
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) {
                        m7f m7fVar = (m7f) obj2;
                        bsc bscVar = (bsc) obj3;
                        switch (i7) {
                            case 0:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(n9h.class);
                                objB.getClass();
                                return (n9h) objB;
                            case 1:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB2 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(v7i.class);
                                objB2.getClass();
                                return (v7i) objB2;
                            case 2:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB3 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ptf.class);
                                objB3.getClass();
                                return (ptf) objB3;
                            case 3:
                                m7fVar.getClass();
                                bscVar.getClass();
                                return new jf0((rc8) m7fVar.a(jce.a.b(rc8.class), null, null));
                            case 4:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB4 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(kli.class);
                                objB4.getClass();
                                return (kli) objB4;
                            case 5:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB5 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(haj.class);
                                objB5.getClass();
                                return (haj) objB5;
                            case 6:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB6 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ok7.class);
                                objB6.getClass();
                                return (ok7) objB6;
                            case 7:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB7 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ui0.class);
                                objB7.getClass();
                                return (ui0) objB7;
                            case 8:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB8 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(p87.class);
                                objB8.getClass();
                                return (p87) objB8;
                            case 9:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB9 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(nu0.class);
                                objB9.getClass();
                                return (nu0) objB9;
                            case 10:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB10 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(dl2.class);
                                objB10.getClass();
                                return (dl2) objB10;
                            case 11:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB11 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ya3.class);
                                objB11.getClass();
                                return (ya3) objB11;
                            case 12:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB12 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uk4.class);
                                objB12.getClass();
                                return (uk4) objB12;
                            case 13:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB13 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(er4.class);
                                objB13.getClass();
                                return (er4) objB13;
                            case 14:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB14 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uz6.class);
                                objB14.getClass();
                                return (uz6) objB14;
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB15 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(hb7.class);
                                objB15.getClass();
                                y6a.r(objB15);
                                throw null;
                            case 16:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB16 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(tga.class);
                                objB16.getClass();
                                return (tga) objB16;
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB17 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB17.getClass();
                                return (o7) objB17;
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB18 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB18.getClass();
                                return (j2d) objB18;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB19 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB19.getClass();
                                return (o7) objB19;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB20 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB20.getClass();
                                return (i8) objB20;
                            case 21:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB21 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(xjc.class);
                                objB21.getClass();
                                return (xjc) objB21;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB22 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(gae.class);
                                objB22.getClass();
                                return (gae) objB22;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB23 = ((qre) m7fVar.a(jce.a.b(qre.class), nai.s, null)).b(rmb.class);
                                objB23.getClass();
                                y6a.r(objB23);
                                throw null;
                            case 24:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB24 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(uz6.class);
                                objB24.getClass();
                                return (uz6) objB24;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB25 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(p2a.class);
                                objB25.getClass();
                                return (p2a) objB25;
                            case 26:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB26 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(a78.class);
                                objB26.getClass();
                                return (a78) objB26;
                            case 27:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB27 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB27.getClass();
                                return (o7) objB27;
                            case 28:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB28 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uf7.class);
                                objB28.getClass();
                                return (uf7) objB28;
                            default:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB29 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(mk7.class);
                                objB29.getClass();
                                return (mk7) objB29;
                        }
                    }
                }, kq9Var9)));
                final int i27 = 22;
                oqbVar10.a(new ge7(new qh1(xaiVar4, kceVar8.b(gae.class), null, new pz7() { // from class: if0
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) {
                        m7f m7fVar = (m7f) obj2;
                        bsc bscVar = (bsc) obj3;
                        switch (i27) {
                            case 0:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(n9h.class);
                                objB.getClass();
                                return (n9h) objB;
                            case 1:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB2 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(v7i.class);
                                objB2.getClass();
                                return (v7i) objB2;
                            case 2:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB3 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ptf.class);
                                objB3.getClass();
                                return (ptf) objB3;
                            case 3:
                                m7fVar.getClass();
                                bscVar.getClass();
                                return new jf0((rc8) m7fVar.a(jce.a.b(rc8.class), null, null));
                            case 4:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB4 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(kli.class);
                                objB4.getClass();
                                return (kli) objB4;
                            case 5:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB5 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(haj.class);
                                objB5.getClass();
                                return (haj) objB5;
                            case 6:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB6 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ok7.class);
                                objB6.getClass();
                                return (ok7) objB6;
                            case 7:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB7 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ui0.class);
                                objB7.getClass();
                                return (ui0) objB7;
                            case 8:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB8 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(p87.class);
                                objB8.getClass();
                                return (p87) objB8;
                            case 9:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB9 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(nu0.class);
                                objB9.getClass();
                                return (nu0) objB9;
                            case 10:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB10 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(dl2.class);
                                objB10.getClass();
                                return (dl2) objB10;
                            case 11:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB11 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ya3.class);
                                objB11.getClass();
                                return (ya3) objB11;
                            case 12:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB12 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uk4.class);
                                objB12.getClass();
                                return (uk4) objB12;
                            case 13:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB13 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(er4.class);
                                objB13.getClass();
                                return (er4) objB13;
                            case 14:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB14 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uz6.class);
                                objB14.getClass();
                                return (uz6) objB14;
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB15 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(hb7.class);
                                objB15.getClass();
                                y6a.r(objB15);
                                throw null;
                            case 16:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB16 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(tga.class);
                                objB16.getClass();
                                return (tga) objB16;
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB17 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB17.getClass();
                                return (o7) objB17;
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB18 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB18.getClass();
                                return (j2d) objB18;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB19 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB19.getClass();
                                return (o7) objB19;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB20 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB20.getClass();
                                return (i8) objB20;
                            case 21:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB21 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(xjc.class);
                                objB21.getClass();
                                return (xjc) objB21;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB22 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(gae.class);
                                objB22.getClass();
                                return (gae) objB22;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB23 = ((qre) m7fVar.a(jce.a.b(qre.class), nai.s, null)).b(rmb.class);
                                objB23.getClass();
                                y6a.r(objB23);
                                throw null;
                            case 24:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB24 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(uz6.class);
                                objB24.getClass();
                                return (uz6) objB24;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB25 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(p2a.class);
                                objB25.getClass();
                                return (p2a) objB25;
                            case 26:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB26 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(a78.class);
                                objB26.getClass();
                                return (a78) objB26;
                            case 27:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB27 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB27.getClass();
                                return (o7) objB27;
                            case 28:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB28 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uf7.class);
                                objB28.getClass();
                                return (uf7) objB28;
                            default:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB29 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(mk7.class);
                                objB29.getClass();
                                return (mk7) objB29;
                        }
                    }
                }, kq9Var9)));
                final int i28 = 23;
                sq6.E(new qh1(xaiVar4, kceVar8.b(rmb.class), null, new pz7() { // from class: if0
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) {
                        m7f m7fVar = (m7f) obj2;
                        bsc bscVar = (bsc) obj3;
                        switch (i28) {
                            case 0:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(n9h.class);
                                objB.getClass();
                                return (n9h) objB;
                            case 1:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB2 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(v7i.class);
                                objB2.getClass();
                                return (v7i) objB2;
                            case 2:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB3 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ptf.class);
                                objB3.getClass();
                                return (ptf) objB3;
                            case 3:
                                m7fVar.getClass();
                                bscVar.getClass();
                                return new jf0((rc8) m7fVar.a(jce.a.b(rc8.class), null, null));
                            case 4:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB4 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(kli.class);
                                objB4.getClass();
                                return (kli) objB4;
                            case 5:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB5 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(haj.class);
                                objB5.getClass();
                                return (haj) objB5;
                            case 6:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB6 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ok7.class);
                                objB6.getClass();
                                return (ok7) objB6;
                            case 7:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB7 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ui0.class);
                                objB7.getClass();
                                return (ui0) objB7;
                            case 8:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB8 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(p87.class);
                                objB8.getClass();
                                return (p87) objB8;
                            case 9:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB9 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(nu0.class);
                                objB9.getClass();
                                return (nu0) objB9;
                            case 10:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB10 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(dl2.class);
                                objB10.getClass();
                                return (dl2) objB10;
                            case 11:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB11 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ya3.class);
                                objB11.getClass();
                                return (ya3) objB11;
                            case 12:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB12 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uk4.class);
                                objB12.getClass();
                                return (uk4) objB12;
                            case 13:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB13 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(er4.class);
                                objB13.getClass();
                                return (er4) objB13;
                            case 14:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB14 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uz6.class);
                                objB14.getClass();
                                return (uz6) objB14;
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB15 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(hb7.class);
                                objB15.getClass();
                                y6a.r(objB15);
                                throw null;
                            case 16:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB16 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(tga.class);
                                objB16.getClass();
                                return (tga) objB16;
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB17 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB17.getClass();
                                return (o7) objB17;
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB18 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB18.getClass();
                                return (j2d) objB18;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB19 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB19.getClass();
                                return (o7) objB19;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB20 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB20.getClass();
                                return (i8) objB20;
                            case 21:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB21 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(xjc.class);
                                objB21.getClass();
                                return (xjc) objB21;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB22 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(gae.class);
                                objB22.getClass();
                                return (gae) objB22;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB23 = ((qre) m7fVar.a(jce.a.b(qre.class), nai.s, null)).b(rmb.class);
                                objB23.getClass();
                                y6a.r(objB23);
                                throw null;
                            case 24:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB24 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(uz6.class);
                                objB24.getClass();
                                return (uz6) objB24;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB25 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(p2a.class);
                                objB25.getClass();
                                return (p2a) objB25;
                            case 26:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB26 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(a78.class);
                                objB26.getClass();
                                return (a78) objB26;
                            case 27:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB27 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB27.getClass();
                                return (o7) objB27;
                            case 28:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB28 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uf7.class);
                                objB28.getClass();
                                return (uf7) objB28;
                            default:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB29 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(mk7.class);
                                objB29.getClass();
                                return (mk7) objB29;
                        }
                    }
                }, kq9.G), oqbVar10);
                oqbVar10.d.add(xaiVar4);
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                oqb oqbVar11 = (oqb) obj;
                oqbVar11.getClass();
                kce kceVar9 = jce.a;
                xai xaiVar5 = new xai(kceVar9.b(zni.class));
                final int i29 = 27;
                pz7 pz7Var8 = new pz7() { // from class: if0
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) {
                        m7f m7fVar = (m7f) obj2;
                        bsc bscVar = (bsc) obj3;
                        switch (i29) {
                            case 0:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(n9h.class);
                                objB.getClass();
                                return (n9h) objB;
                            case 1:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB2 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(v7i.class);
                                objB2.getClass();
                                return (v7i) objB2;
                            case 2:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB3 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ptf.class);
                                objB3.getClass();
                                return (ptf) objB3;
                            case 3:
                                m7fVar.getClass();
                                bscVar.getClass();
                                return new jf0((rc8) m7fVar.a(jce.a.b(rc8.class), null, null));
                            case 4:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB4 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(kli.class);
                                objB4.getClass();
                                return (kli) objB4;
                            case 5:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB5 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(haj.class);
                                objB5.getClass();
                                return (haj) objB5;
                            case 6:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB6 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ok7.class);
                                objB6.getClass();
                                return (ok7) objB6;
                            case 7:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB7 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ui0.class);
                                objB7.getClass();
                                return (ui0) objB7;
                            case 8:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB8 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(p87.class);
                                objB8.getClass();
                                return (p87) objB8;
                            case 9:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB9 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(nu0.class);
                                objB9.getClass();
                                return (nu0) objB9;
                            case 10:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB10 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(dl2.class);
                                objB10.getClass();
                                return (dl2) objB10;
                            case 11:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB11 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ya3.class);
                                objB11.getClass();
                                return (ya3) objB11;
                            case 12:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB12 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uk4.class);
                                objB12.getClass();
                                return (uk4) objB12;
                            case 13:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB13 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(er4.class);
                                objB13.getClass();
                                return (er4) objB13;
                            case 14:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB14 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uz6.class);
                                objB14.getClass();
                                return (uz6) objB14;
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB15 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(hb7.class);
                                objB15.getClass();
                                y6a.r(objB15);
                                throw null;
                            case 16:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB16 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(tga.class);
                                objB16.getClass();
                                return (tga) objB16;
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB17 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB17.getClass();
                                return (o7) objB17;
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB18 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB18.getClass();
                                return (j2d) objB18;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB19 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB19.getClass();
                                return (o7) objB19;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB20 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB20.getClass();
                                return (i8) objB20;
                            case 21:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB21 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(xjc.class);
                                objB21.getClass();
                                return (xjc) objB21;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB22 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(gae.class);
                                objB22.getClass();
                                return (gae) objB22;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB23 = ((qre) m7fVar.a(jce.a.b(qre.class), nai.s, null)).b(rmb.class);
                                objB23.getClass();
                                y6a.r(objB23);
                                throw null;
                            case 24:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB24 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(uz6.class);
                                objB24.getClass();
                                return (uz6) objB24;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB25 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(p2a.class);
                                objB25.getClass();
                                return (p2a) objB25;
                            case 26:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB26 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(a78.class);
                                objB26.getClass();
                                return (a78) objB26;
                            case 27:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB27 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB27.getClass();
                                return (o7) objB27;
                            case 28:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB28 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uf7.class);
                                objB28.getClass();
                                return (uf7) objB28;
                            default:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB29 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(mk7.class);
                                objB29.getClass();
                                return (mk7) objB29;
                        }
                    }
                };
                pl9 pl9VarB12 = kceVar9.b(o7.class);
                kq9 kq9Var10 = kq9.F;
                oqbVar11.a(new ge7(new qh1(xaiVar5, pl9VarB12, null, pz7Var8, kq9Var10)));
                final int i30 = 26;
                oqbVar11.a(new ge7(new qh1(xaiVar5, kceVar9.b(i8.class), null, new pz7() { // from class: c8
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) throws MissingAndroidContextException {
                        int i162 = 1;
                        switch (i30) {
                            case 0:
                                m7f m7fVar = (m7f) obj2;
                                m7fVar.getClass();
                                ((bsc) obj3).getClass();
                                Context contextG = yb5.g(m7fVar);
                                String strM949unboximpl = ((AccountId) m7fVar.a(jce.a.b(AccountId.class), null, null)).m949unboximpl();
                                strM949unboximpl.getClass();
                                SharedPreferences sharedPreferences = contextG.getApplicationContext().getSharedPreferences("account_prefs".concat(strM949unboximpl), 0);
                                sharedPreferences.getClass();
                                return new f8(sharedPreferences);
                            case 1:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                if (v40.a == null) {
                                    synchronized (v40.b) {
                                        if (v40.a == null) {
                                            pl7 pl7VarC = pl7.c();
                                            pl7VarC.a();
                                            v40.a = FirebaseAnalytics.getInstance(pl7VarC.a);
                                        }
                                        break;
                                    }
                                }
                                FirebaseAnalytics firebaseAnalytics = v40.a;
                                firebaseAnalytics.getClass();
                                return firebaseAnalytics;
                            case 2:
                                m7f m7fVar2 = (m7f) obj2;
                                m7fVar2.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar22 = jce.a;
                                return new ll7((FirebaseAnalytics) m7fVar2.a(kceVar22.b(FirebaseAnalytics.class), null, null), (am0) m7fVar2.a(kceVar22.b(am0.class), null, null));
                            case 3:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new kd();
                            case 4:
                                m7f m7fVar3 = (m7f) obj2;
                                m7fVar3.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar32 = jce.a;
                                return new hj((qi3) m7fVar3.a(kceVar32.b(qi3.class), null, null), (fk0) m7fVar3.a(kceVar32.b(fk0.class), null, null), new w9h(new cfk((Context) m7fVar3.a(kceVar32.b(Context.class), null, null))), (g78) m7fVar3.a(kceVar32.b(g78.class), null, null), (h86) m7fVar3.a(kceVar32.b(h86.class), null, null));
                            case 5:
                                m7f m7fVar4 = (m7f) obj2;
                                m7fVar4.getClass();
                                ((bsc) obj3).getClass();
                                return new pl(((doi) m7fVar4.a(jce.a.b(doi.class), null, null)).a("agent_chat"));
                            case 6:
                                m7f m7fVar5 = (m7f) obj2;
                                m7fVar5.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar42 = jce.a;
                                return new fq((dl2) m7fVar5.a(kceVar42.b(dl2.class), null, null), (h86) m7fVar5.a(kceVar42.b(h86.class), null, null), (oda) m7fVar5.a(kceVar42.b(oda.class), null, null), (koi) m7fVar5.a(kceVar42.b(koi.class), null, null));
                            case 7:
                                m7f m7fVar6 = (m7f) obj2;
                                m7fVar6.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar52 = jce.a;
                                return new vm((jwf) m7fVar6.a(kceVar52.b(jwf.class), null, null), (b) m7fVar6.a(kceVar52.b(b.class), null, null), (qzb) m7fVar6.a(kceVar52.b(qzb.class), null, null), (i8c) m7fVar6.a(kceVar52.b(i8c.class), null, null), (pl) m7fVar6.a(kceVar52.b(pl.class), null, null), yb5.g(m7fVar6), (ze0) m7fVar6.a(kceVar52.b(ze0.class), null, null), (koi) m7fVar6.a(kceVar52.b(koi.class), null, null), (i25) m7fVar6.a(kceVar52.b(i25.class), null, null), (hdc) m7fVar6.a(kceVar52.b(hdc.class), null, null), (fq) m7fVar6.a(kceVar52.b(fq.class), null, null), (oda) m7fVar6.a(kceVar52.b(oda.class), null, null), (h86) m7fVar6.a(kceVar52.b(h86.class), null, null), (qi3) m7fVar6.a(kceVar52.b(qi3.class), null, null), (z8c) m7fVar6.a(kceVar52.b(z8c.class), null, null), (j8i) m7fVar6.a(kceVar52.b(j8i.class), null, null), (rc8) m7fVar6.a(kceVar52.b(rc8.class), null, null));
                            case 8:
                                m7f m7fVar7 = (m7f) obj2;
                                m7fVar7.getClass();
                                ((bsc) obj3).getClass();
                                int i172 = lx.a[((AppEnvironment) m7fVar7.a(jce.a.b(AppEnvironment.class), null, null)).ordinal()];
                                if (i172 == 1) {
                                    return "LKJN8LsLERHEOXkw487o7qCTFOrGPimI";
                                }
                                if (i172 == 2 || i172 == 3) {
                                    return "b64sf1kxwDGe1PiSAlv5ixuH0f509RKK";
                                }
                                mr9.b();
                                return null;
                            case 9:
                                m7f m7fVar8 = (m7f) obj2;
                                m7fVar8.getClass();
                                ((bsc) obj3).getClass();
                                mrg mrgVar22 = mx.a;
                                kce kceVar62 = jce.a;
                                return new nff((String) m7fVar8.a(kceVar62.b(String.class), mrgVar22, null), (Context) m7fVar8.a(kceVar62.b(Context.class), null, null), (h86) m7fVar8.a(kceVar62.b(h86.class), null, null), (ud5) m7fVar8.a(kceVar62.b(ud5.class), null, null), (qk5) m7fVar8.a(kceVar62.b(qk5.class), null, null));
                            case 10:
                                m7f m7fVar9 = (m7f) obj2;
                                m7fVar9.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar72 = jce.a;
                                nff nffVar = (nff) m7fVar9.a(kceVar72.b(nff.class), null, null);
                                yw ywVar = gx.Companion;
                                ql8 ql8Var = new ql8(12);
                                ywVar.getClass();
                                gx.K = ql8Var;
                                String str = nffVar.a;
                                if (bsg.I0(str)) {
                                    sz6.p("writeKey cannot be blank ");
                                    return null;
                                }
                                mff mffVar = new mff(new eg4(nffVar.b, str), new el5(nffVar));
                                mffVar.b().a(new e10());
                                mffVar.b().a(new k30());
                                String strA = nffVar.d.a.a();
                                String languageTag = LocaleList.getDefault().get(0).toLanguageTag();
                                languageTag.getClass();
                                mffVar.b().a(new vd5(strA, languageTag));
                                mffVar.b().a(new nk5(i162));
                                mffVar.b().a(new nk5(nffVar.e));
                                boolean z = !((fk0) m7fVar9.a(kceVar72.b(fk0.class), null, null)).o();
                                mffVar.J = z;
                                el5 el5Var = mffVar.F;
                                gb9.D((mp4) el5Var.I, (e45) el5Var.F, null, new ax(mffVar, z, (tp4) null), 2);
                                return mffVar;
                            case 11:
                                m7f m7fVar10 = (m7f) obj2;
                                m7fVar10.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar82 = jce.a;
                                return new com.anthropic.claude.analytics.b((gx) m7fVar10.a(kceVar82.b(gx.class), null, null), (bg9) m7fVar10.a(kceVar82.b(bg9.class), null, null), (qk5) m7fVar10.a(kceVar82.b(qk5.class), null, null));
                            case 12:
                                m7f m7fVar11 = (m7f) obj2;
                                m7fVar11.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar11.a(jce.a.b(com.anthropic.claude.analytics.b.class), null, null);
                            case 13:
                                m7f m7fVar12 = (m7f) obj2;
                                m7fVar12.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar92 = jce.a;
                                fk0 fk0Var = (fk0) m7fVar12.a(kceVar92.b(fk0.class), null, null);
                                t29 t29Var = new t29(m7fVar12.a(kceVar92.b(gx.class), null, null));
                                t29 t29Var2 = new t29(m7fVar12.a(kceVar92.b(FirebaseAnalytics.class), null, null));
                                ((fk0) m7fVar12.a(kceVar92.b(fk0.class), null, null)).o();
                                return new smh(fk0Var, t29Var, t29Var2);
                            case 14:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new ti3();
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7f m7fVar13 = (m7f) obj2;
                                m7fVar13.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar13.a(jce.a.b(ti3.class), null, null);
                            case 16:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new hl8(new wg6(14), new rl7(6));
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7f m7fVar14 = (m7f) obj2;
                                m7fVar14.getClass();
                                ((bsc) obj3).getClass();
                                return new smh((fk0) m7fVar14.a(jce.a.b(fk0.class), null, null), new u0h(bw.G), new u0h(bw.H));
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7f m7fVar15 = (m7f) obj2;
                                m7fVar15.getClass();
                                ((bsc) obj3).getClass();
                                Object objB = ((qre) m7fVar15.a(jce.a.b(qre.class), null, null)).b(tja.class);
                                objB.getClass();
                                return (tja) objB;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7f m7fVar16 = (m7f) obj2;
                                m7fVar16.getClass();
                                ((bsc) obj3).getClass();
                                Object objB2 = ((qre) m7fVar16.a(jce.a.b(qre.class), null, null)).b(t8b.class);
                                objB2.getClass();
                                return (t8b) objB2;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7f m7fVar17 = (m7f) obj2;
                                m7fVar17.getClass();
                                ((bsc) obj3).getClass();
                                Object objB3 = ((qre) m7fVar17.a(jce.a.b(qre.class), null, null)).b(kab.class);
                                objB3.getClass();
                                return (kab) objB3;
                            case 21:
                                m7f m7fVar18 = (m7f) obj2;
                                m7fVar18.getClass();
                                ((bsc) obj3).getClass();
                                Object objB4 = ((qre) m7fVar18.a(jce.a.b(qre.class), null, null)).b(npb.class);
                                objB4.getClass();
                                return (npb) objB4;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7f m7fVar19 = (m7f) obj2;
                                m7fVar19.getClass();
                                ((bsc) obj3).getClass();
                                Object objB5 = ((qre) m7fVar19.a(jce.a.b(qre.class), null, null)).b(b7c.class);
                                objB5.getClass();
                                return (b7c) objB5;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7f m7fVar20 = (m7f) obj2;
                                m7fVar20.getClass();
                                ((bsc) obj3).getClass();
                                Object objB6 = ((qre) m7fVar20.a(jce.a.b(qre.class), null, null)).b(swa.class);
                                objB6.getClass();
                                return (swa) objB6;
                            case 24:
                                m7f m7fVar21 = (m7f) obj2;
                                m7fVar21.getClass();
                                ((bsc) obj3).getClass();
                                Object objB7 = ((qre) m7fVar21.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB7.getClass();
                                return (j2d) objB7;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7f m7fVar22 = (m7f) obj2;
                                m7fVar22.getClass();
                                ((bsc) obj3).getClass();
                                Object objB8 = ((qre) m7fVar22.a(jce.a.b(qre.class), null, null)).b(mkd.class);
                                objB8.getClass();
                                return (mkd) objB8;
                            case 26:
                                m7f m7fVar23 = (m7f) obj2;
                                m7fVar23.getClass();
                                ((bsc) obj3).getClass();
                                Object objB9 = ((qre) m7fVar23.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB9.getClass();
                                return (i8) objB9;
                            case 27:
                                m7f m7fVar24 = (m7f) obj2;
                                m7fVar24.getClass();
                                ((bsc) obj3).getClass();
                                Object objB10 = ((qre) m7fVar24.a(jce.a.b(qre.class), null, null)).b(omd.class);
                                objB10.getClass();
                                return (omd) objB10;
                            case 28:
                                m7f m7fVar25 = (m7f) obj2;
                                m7fVar25.getClass();
                                ((bsc) obj3).getClass();
                                Object objB11 = ((qre) m7fVar25.a(jce.a.b(qre.class), null, null)).b(pxd.class);
                                objB11.getClass();
                                return (pxd) objB11;
                            default:
                                m7f m7fVar26 = (m7f) obj2;
                                m7fVar26.getClass();
                                ((bsc) obj3).getClass();
                                Object objB12 = ((qre) m7fVar26.a(jce.a.b(qre.class), null, null)).b(r0h.class);
                                objB12.getClass();
                                return (r0h) objB12;
                        }
                    }
                }, kq9Var10)));
                oqbVar11.a(new ge7(new qh1(xaiVar5, kceVar9.b(ui0.class), null, new pz7() { // from class: if0
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) {
                        m7f m7fVar = (m7f) obj2;
                        bsc bscVar = (bsc) obj3;
                        switch (i13) {
                            case 0:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(n9h.class);
                                objB.getClass();
                                return (n9h) objB;
                            case 1:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB2 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(v7i.class);
                                objB2.getClass();
                                return (v7i) objB2;
                            case 2:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB3 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ptf.class);
                                objB3.getClass();
                                return (ptf) objB3;
                            case 3:
                                m7fVar.getClass();
                                bscVar.getClass();
                                return new jf0((rc8) m7fVar.a(jce.a.b(rc8.class), null, null));
                            case 4:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB4 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(kli.class);
                                objB4.getClass();
                                return (kli) objB4;
                            case 5:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB5 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(haj.class);
                                objB5.getClass();
                                return (haj) objB5;
                            case 6:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB6 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ok7.class);
                                objB6.getClass();
                                return (ok7) objB6;
                            case 7:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB7 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ui0.class);
                                objB7.getClass();
                                return (ui0) objB7;
                            case 8:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB8 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(p87.class);
                                objB8.getClass();
                                return (p87) objB8;
                            case 9:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB9 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(nu0.class);
                                objB9.getClass();
                                return (nu0) objB9;
                            case 10:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB10 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(dl2.class);
                                objB10.getClass();
                                return (dl2) objB10;
                            case 11:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB11 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ya3.class);
                                objB11.getClass();
                                return (ya3) objB11;
                            case 12:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB12 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uk4.class);
                                objB12.getClass();
                                return (uk4) objB12;
                            case 13:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB13 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(er4.class);
                                objB13.getClass();
                                return (er4) objB13;
                            case 14:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB14 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uz6.class);
                                objB14.getClass();
                                return (uz6) objB14;
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB15 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(hb7.class);
                                objB15.getClass();
                                y6a.r(objB15);
                                throw null;
                            case 16:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB16 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(tga.class);
                                objB16.getClass();
                                return (tga) objB16;
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB17 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB17.getClass();
                                return (o7) objB17;
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB18 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB18.getClass();
                                return (j2d) objB18;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB19 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB19.getClass();
                                return (o7) objB19;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB20 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB20.getClass();
                                return (i8) objB20;
                            case 21:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB21 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(xjc.class);
                                objB21.getClass();
                                return (xjc) objB21;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB22 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(gae.class);
                                objB22.getClass();
                                return (gae) objB22;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB23 = ((qre) m7fVar.a(jce.a.b(qre.class), nai.s, null)).b(rmb.class);
                                objB23.getClass();
                                y6a.r(objB23);
                                throw null;
                            case 24:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB24 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(uz6.class);
                                objB24.getClass();
                                return (uz6) objB24;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB25 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(p2a.class);
                                objB25.getClass();
                                return (p2a) objB25;
                            case 26:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB26 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(a78.class);
                                objB26.getClass();
                                return (a78) objB26;
                            case 27:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB27 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB27.getClass();
                                return (o7) objB27;
                            case 28:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB28 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uf7.class);
                                objB28.getClass();
                                return (uf7) objB28;
                            default:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB29 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(mk7.class);
                                objB29.getClass();
                                return (mk7) objB29;
                        }
                    }
                }, kq9Var10)));
                oqbVar11.a(new ge7(new qh1(xaiVar5, kceVar9.b(nu0.class), null, new pz7() { // from class: if0
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) {
                        m7f m7fVar = (m7f) obj2;
                        bsc bscVar = (bsc) obj3;
                        switch (i6) {
                            case 0:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(n9h.class);
                                objB.getClass();
                                return (n9h) objB;
                            case 1:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB2 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(v7i.class);
                                objB2.getClass();
                                return (v7i) objB2;
                            case 2:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB3 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ptf.class);
                                objB3.getClass();
                                return (ptf) objB3;
                            case 3:
                                m7fVar.getClass();
                                bscVar.getClass();
                                return new jf0((rc8) m7fVar.a(jce.a.b(rc8.class), null, null));
                            case 4:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB4 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(kli.class);
                                objB4.getClass();
                                return (kli) objB4;
                            case 5:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB5 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(haj.class);
                                objB5.getClass();
                                return (haj) objB5;
                            case 6:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB6 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ok7.class);
                                objB6.getClass();
                                return (ok7) objB6;
                            case 7:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB7 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ui0.class);
                                objB7.getClass();
                                return (ui0) objB7;
                            case 8:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB8 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(p87.class);
                                objB8.getClass();
                                return (p87) objB8;
                            case 9:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB9 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(nu0.class);
                                objB9.getClass();
                                return (nu0) objB9;
                            case 10:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB10 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(dl2.class);
                                objB10.getClass();
                                return (dl2) objB10;
                            case 11:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB11 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ya3.class);
                                objB11.getClass();
                                return (ya3) objB11;
                            case 12:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB12 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uk4.class);
                                objB12.getClass();
                                return (uk4) objB12;
                            case 13:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB13 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(er4.class);
                                objB13.getClass();
                                return (er4) objB13;
                            case 14:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB14 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uz6.class);
                                objB14.getClass();
                                return (uz6) objB14;
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB15 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(hb7.class);
                                objB15.getClass();
                                y6a.r(objB15);
                                throw null;
                            case 16:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB16 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(tga.class);
                                objB16.getClass();
                                return (tga) objB16;
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB17 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB17.getClass();
                                return (o7) objB17;
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB18 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB18.getClass();
                                return (j2d) objB18;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB19 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB19.getClass();
                                return (o7) objB19;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB20 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB20.getClass();
                                return (i8) objB20;
                            case 21:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB21 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(xjc.class);
                                objB21.getClass();
                                return (xjc) objB21;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB22 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(gae.class);
                                objB22.getClass();
                                return (gae) objB22;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB23 = ((qre) m7fVar.a(jce.a.b(qre.class), nai.s, null)).b(rmb.class);
                                objB23.getClass();
                                y6a.r(objB23);
                                throw null;
                            case 24:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB24 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(uz6.class);
                                objB24.getClass();
                                return (uz6) objB24;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB25 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(p2a.class);
                                objB25.getClass();
                                return (p2a) objB25;
                            case 26:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB26 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(a78.class);
                                objB26.getClass();
                                return (a78) objB26;
                            case 27:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB27 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB27.getClass();
                                return (o7) objB27;
                            case 28:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB28 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uf7.class);
                                objB28.getClass();
                                return (uf7) objB28;
                            default:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB29 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(mk7.class);
                                objB29.getClass();
                                return (mk7) objB29;
                        }
                    }
                }, kq9Var10)));
                oqbVar11.a(new ge7(new qh1(xaiVar5, kceVar9.b(dl2.class), null, new pz7() { // from class: if0
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) {
                        m7f m7fVar = (m7f) obj2;
                        bsc bscVar = (bsc) obj3;
                        switch (i10) {
                            case 0:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(n9h.class);
                                objB.getClass();
                                return (n9h) objB;
                            case 1:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB2 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(v7i.class);
                                objB2.getClass();
                                return (v7i) objB2;
                            case 2:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB3 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ptf.class);
                                objB3.getClass();
                                return (ptf) objB3;
                            case 3:
                                m7fVar.getClass();
                                bscVar.getClass();
                                return new jf0((rc8) m7fVar.a(jce.a.b(rc8.class), null, null));
                            case 4:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB4 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(kli.class);
                                objB4.getClass();
                                return (kli) objB4;
                            case 5:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB5 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(haj.class);
                                objB5.getClass();
                                return (haj) objB5;
                            case 6:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB6 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ok7.class);
                                objB6.getClass();
                                return (ok7) objB6;
                            case 7:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB7 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ui0.class);
                                objB7.getClass();
                                return (ui0) objB7;
                            case 8:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB8 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(p87.class);
                                objB8.getClass();
                                return (p87) objB8;
                            case 9:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB9 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(nu0.class);
                                objB9.getClass();
                                return (nu0) objB9;
                            case 10:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB10 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(dl2.class);
                                objB10.getClass();
                                return (dl2) objB10;
                            case 11:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB11 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ya3.class);
                                objB11.getClass();
                                return (ya3) objB11;
                            case 12:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB12 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uk4.class);
                                objB12.getClass();
                                return (uk4) objB12;
                            case 13:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB13 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(er4.class);
                                objB13.getClass();
                                return (er4) objB13;
                            case 14:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB14 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uz6.class);
                                objB14.getClass();
                                return (uz6) objB14;
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB15 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(hb7.class);
                                objB15.getClass();
                                y6a.r(objB15);
                                throw null;
                            case 16:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB16 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(tga.class);
                                objB16.getClass();
                                return (tga) objB16;
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB17 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB17.getClass();
                                return (o7) objB17;
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB18 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB18.getClass();
                                return (j2d) objB18;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB19 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB19.getClass();
                                return (o7) objB19;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB20 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB20.getClass();
                                return (i8) objB20;
                            case 21:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB21 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(xjc.class);
                                objB21.getClass();
                                return (xjc) objB21;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB22 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(gae.class);
                                objB22.getClass();
                                return (gae) objB22;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB23 = ((qre) m7fVar.a(jce.a.b(qre.class), nai.s, null)).b(rmb.class);
                                objB23.getClass();
                                y6a.r(objB23);
                                throw null;
                            case 24:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB24 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(uz6.class);
                                objB24.getClass();
                                return (uz6) objB24;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB25 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(p2a.class);
                                objB25.getClass();
                                return (p2a) objB25;
                            case 26:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB26 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(a78.class);
                                objB26.getClass();
                                return (a78) objB26;
                            case 27:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB27 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB27.getClass();
                                return (o7) objB27;
                            case 28:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB28 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uf7.class);
                                objB28.getClass();
                                return (uf7) objB28;
                            default:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB29 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(mk7.class);
                                objB29.getClass();
                                return (mk7) objB29;
                        }
                    }
                }, kq9Var10)));
                oqbVar11.a(new ge7(new qh1(xaiVar5, kceVar9.b(ya3.class), null, new pz7() { // from class: if0
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) {
                        m7f m7fVar = (m7f) obj2;
                        bsc bscVar = (bsc) obj3;
                        switch (i3) {
                            case 0:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(n9h.class);
                                objB.getClass();
                                return (n9h) objB;
                            case 1:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB2 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(v7i.class);
                                objB2.getClass();
                                return (v7i) objB2;
                            case 2:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB3 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ptf.class);
                                objB3.getClass();
                                return (ptf) objB3;
                            case 3:
                                m7fVar.getClass();
                                bscVar.getClass();
                                return new jf0((rc8) m7fVar.a(jce.a.b(rc8.class), null, null));
                            case 4:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB4 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(kli.class);
                                objB4.getClass();
                                return (kli) objB4;
                            case 5:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB5 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(haj.class);
                                objB5.getClass();
                                return (haj) objB5;
                            case 6:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB6 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ok7.class);
                                objB6.getClass();
                                return (ok7) objB6;
                            case 7:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB7 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ui0.class);
                                objB7.getClass();
                                return (ui0) objB7;
                            case 8:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB8 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(p87.class);
                                objB8.getClass();
                                return (p87) objB8;
                            case 9:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB9 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(nu0.class);
                                objB9.getClass();
                                return (nu0) objB9;
                            case 10:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB10 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(dl2.class);
                                objB10.getClass();
                                return (dl2) objB10;
                            case 11:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB11 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ya3.class);
                                objB11.getClass();
                                return (ya3) objB11;
                            case 12:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB12 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uk4.class);
                                objB12.getClass();
                                return (uk4) objB12;
                            case 13:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB13 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(er4.class);
                                objB13.getClass();
                                return (er4) objB13;
                            case 14:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB14 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uz6.class);
                                objB14.getClass();
                                return (uz6) objB14;
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB15 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(hb7.class);
                                objB15.getClass();
                                y6a.r(objB15);
                                throw null;
                            case 16:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB16 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(tga.class);
                                objB16.getClass();
                                return (tga) objB16;
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB17 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB17.getClass();
                                return (o7) objB17;
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB18 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB18.getClass();
                                return (j2d) objB18;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB19 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB19.getClass();
                                return (o7) objB19;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB20 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB20.getClass();
                                return (i8) objB20;
                            case 21:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB21 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(xjc.class);
                                objB21.getClass();
                                return (xjc) objB21;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB22 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(gae.class);
                                objB22.getClass();
                                return (gae) objB22;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB23 = ((qre) m7fVar.a(jce.a.b(qre.class), nai.s, null)).b(rmb.class);
                                objB23.getClass();
                                y6a.r(objB23);
                                throw null;
                            case 24:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB24 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(uz6.class);
                                objB24.getClass();
                                return (uz6) objB24;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB25 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(p2a.class);
                                objB25.getClass();
                                return (p2a) objB25;
                            case 26:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB26 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(a78.class);
                                objB26.getClass();
                                return (a78) objB26;
                            case 27:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB27 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB27.getClass();
                                return (o7) objB27;
                            case 28:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB28 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uf7.class);
                                objB28.getClass();
                                return (uf7) objB28;
                            default:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB29 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(mk7.class);
                                objB29.getClass();
                                return (mk7) objB29;
                        }
                    }
                }, kq9Var10)));
                oqbVar11.a(new ge7(new qh1(xaiVar5, kceVar9.b(uk4.class), null, new pz7() { // from class: if0
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) {
                        m7f m7fVar = (m7f) obj2;
                        bsc bscVar = (bsc) obj3;
                        switch (i2) {
                            case 0:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(n9h.class);
                                objB.getClass();
                                return (n9h) objB;
                            case 1:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB2 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(v7i.class);
                                objB2.getClass();
                                return (v7i) objB2;
                            case 2:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB3 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ptf.class);
                                objB3.getClass();
                                return (ptf) objB3;
                            case 3:
                                m7fVar.getClass();
                                bscVar.getClass();
                                return new jf0((rc8) m7fVar.a(jce.a.b(rc8.class), null, null));
                            case 4:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB4 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(kli.class);
                                objB4.getClass();
                                return (kli) objB4;
                            case 5:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB5 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(haj.class);
                                objB5.getClass();
                                return (haj) objB5;
                            case 6:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB6 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ok7.class);
                                objB6.getClass();
                                return (ok7) objB6;
                            case 7:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB7 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ui0.class);
                                objB7.getClass();
                                return (ui0) objB7;
                            case 8:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB8 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(p87.class);
                                objB8.getClass();
                                return (p87) objB8;
                            case 9:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB9 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(nu0.class);
                                objB9.getClass();
                                return (nu0) objB9;
                            case 10:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB10 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(dl2.class);
                                objB10.getClass();
                                return (dl2) objB10;
                            case 11:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB11 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ya3.class);
                                objB11.getClass();
                                return (ya3) objB11;
                            case 12:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB12 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uk4.class);
                                objB12.getClass();
                                return (uk4) objB12;
                            case 13:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB13 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(er4.class);
                                objB13.getClass();
                                return (er4) objB13;
                            case 14:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB14 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uz6.class);
                                objB14.getClass();
                                return (uz6) objB14;
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB15 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(hb7.class);
                                objB15.getClass();
                                y6a.r(objB15);
                                throw null;
                            case 16:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB16 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(tga.class);
                                objB16.getClass();
                                return (tga) objB16;
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB17 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB17.getClass();
                                return (o7) objB17;
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB18 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB18.getClass();
                                return (j2d) objB18;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB19 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB19.getClass();
                                return (o7) objB19;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB20 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB20.getClass();
                                return (i8) objB20;
                            case 21:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB21 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(xjc.class);
                                objB21.getClass();
                                return (xjc) objB21;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB22 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(gae.class);
                                objB22.getClass();
                                return (gae) objB22;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB23 = ((qre) m7fVar.a(jce.a.b(qre.class), nai.s, null)).b(rmb.class);
                                objB23.getClass();
                                y6a.r(objB23);
                                throw null;
                            case 24:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB24 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(uz6.class);
                                objB24.getClass();
                                return (uz6) objB24;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB25 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(p2a.class);
                                objB25.getClass();
                                return (p2a) objB25;
                            case 26:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB26 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(a78.class);
                                objB26.getClass();
                                return (a78) objB26;
                            case 27:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB27 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB27.getClass();
                                return (o7) objB27;
                            case 28:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB28 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uf7.class);
                                objB28.getClass();
                                return (uf7) objB28;
                            default:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB29 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(mk7.class);
                                objB29.getClass();
                                return (mk7) objB29;
                        }
                    }
                }, kq9Var10)));
                final int i31 = 13;
                oqbVar11.a(new ge7(new qh1(xaiVar5, kceVar9.b(er4.class), null, new pz7() { // from class: if0
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) {
                        m7f m7fVar = (m7f) obj2;
                        bsc bscVar = (bsc) obj3;
                        switch (i31) {
                            case 0:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(n9h.class);
                                objB.getClass();
                                return (n9h) objB;
                            case 1:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB2 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(v7i.class);
                                objB2.getClass();
                                return (v7i) objB2;
                            case 2:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB3 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ptf.class);
                                objB3.getClass();
                                return (ptf) objB3;
                            case 3:
                                m7fVar.getClass();
                                bscVar.getClass();
                                return new jf0((rc8) m7fVar.a(jce.a.b(rc8.class), null, null));
                            case 4:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB4 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(kli.class);
                                objB4.getClass();
                                return (kli) objB4;
                            case 5:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB5 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(haj.class);
                                objB5.getClass();
                                return (haj) objB5;
                            case 6:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB6 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ok7.class);
                                objB6.getClass();
                                return (ok7) objB6;
                            case 7:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB7 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ui0.class);
                                objB7.getClass();
                                return (ui0) objB7;
                            case 8:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB8 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(p87.class);
                                objB8.getClass();
                                return (p87) objB8;
                            case 9:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB9 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(nu0.class);
                                objB9.getClass();
                                return (nu0) objB9;
                            case 10:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB10 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(dl2.class);
                                objB10.getClass();
                                return (dl2) objB10;
                            case 11:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB11 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ya3.class);
                                objB11.getClass();
                                return (ya3) objB11;
                            case 12:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB12 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uk4.class);
                                objB12.getClass();
                                return (uk4) objB12;
                            case 13:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB13 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(er4.class);
                                objB13.getClass();
                                return (er4) objB13;
                            case 14:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB14 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uz6.class);
                                objB14.getClass();
                                return (uz6) objB14;
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB15 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(hb7.class);
                                objB15.getClass();
                                y6a.r(objB15);
                                throw null;
                            case 16:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB16 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(tga.class);
                                objB16.getClass();
                                return (tga) objB16;
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB17 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB17.getClass();
                                return (o7) objB17;
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB18 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB18.getClass();
                                return (j2d) objB18;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB19 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB19.getClass();
                                return (o7) objB19;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB20 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB20.getClass();
                                return (i8) objB20;
                            case 21:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB21 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(xjc.class);
                                objB21.getClass();
                                return (xjc) objB21;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB22 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(gae.class);
                                objB22.getClass();
                                return (gae) objB22;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB23 = ((qre) m7fVar.a(jce.a.b(qre.class), nai.s, null)).b(rmb.class);
                                objB23.getClass();
                                y6a.r(objB23);
                                throw null;
                            case 24:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB24 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(uz6.class);
                                objB24.getClass();
                                return (uz6) objB24;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB25 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(p2a.class);
                                objB25.getClass();
                                return (p2a) objB25;
                            case 26:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB26 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(a78.class);
                                objB26.getClass();
                                return (a78) objB26;
                            case 27:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB27 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB27.getClass();
                                return (o7) objB27;
                            case 28:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB28 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uf7.class);
                                objB28.getClass();
                                return (uf7) objB28;
                            default:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB29 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(mk7.class);
                                objB29.getClass();
                                return (mk7) objB29;
                        }
                    }
                }, kq9Var10)));
                final int i32 = 14;
                oqbVar11.a(new ge7(new qh1(xaiVar5, kceVar9.b(uz6.class), null, new pz7() { // from class: if0
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) {
                        m7f m7fVar = (m7f) obj2;
                        bsc bscVar = (bsc) obj3;
                        switch (i32) {
                            case 0:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(n9h.class);
                                objB.getClass();
                                return (n9h) objB;
                            case 1:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB2 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(v7i.class);
                                objB2.getClass();
                                return (v7i) objB2;
                            case 2:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB3 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ptf.class);
                                objB3.getClass();
                                return (ptf) objB3;
                            case 3:
                                m7fVar.getClass();
                                bscVar.getClass();
                                return new jf0((rc8) m7fVar.a(jce.a.b(rc8.class), null, null));
                            case 4:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB4 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(kli.class);
                                objB4.getClass();
                                return (kli) objB4;
                            case 5:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB5 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(haj.class);
                                objB5.getClass();
                                return (haj) objB5;
                            case 6:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB6 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ok7.class);
                                objB6.getClass();
                                return (ok7) objB6;
                            case 7:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB7 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ui0.class);
                                objB7.getClass();
                                return (ui0) objB7;
                            case 8:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB8 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(p87.class);
                                objB8.getClass();
                                return (p87) objB8;
                            case 9:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB9 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(nu0.class);
                                objB9.getClass();
                                return (nu0) objB9;
                            case 10:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB10 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(dl2.class);
                                objB10.getClass();
                                return (dl2) objB10;
                            case 11:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB11 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ya3.class);
                                objB11.getClass();
                                return (ya3) objB11;
                            case 12:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB12 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uk4.class);
                                objB12.getClass();
                                return (uk4) objB12;
                            case 13:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB13 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(er4.class);
                                objB13.getClass();
                                return (er4) objB13;
                            case 14:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB14 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uz6.class);
                                objB14.getClass();
                                return (uz6) objB14;
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB15 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(hb7.class);
                                objB15.getClass();
                                y6a.r(objB15);
                                throw null;
                            case 16:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB16 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(tga.class);
                                objB16.getClass();
                                return (tga) objB16;
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB17 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB17.getClass();
                                return (o7) objB17;
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB18 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB18.getClass();
                                return (j2d) objB18;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB19 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB19.getClass();
                                return (o7) objB19;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB20 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB20.getClass();
                                return (i8) objB20;
                            case 21:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB21 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(xjc.class);
                                objB21.getClass();
                                return (xjc) objB21;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB22 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(gae.class);
                                objB22.getClass();
                                return (gae) objB22;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB23 = ((qre) m7fVar.a(jce.a.b(qre.class), nai.s, null)).b(rmb.class);
                                objB23.getClass();
                                y6a.r(objB23);
                                throw null;
                            case 24:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB24 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(uz6.class);
                                objB24.getClass();
                                return (uz6) objB24;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB25 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(p2a.class);
                                objB25.getClass();
                                return (p2a) objB25;
                            case 26:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB26 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(a78.class);
                                objB26.getClass();
                                return (a78) objB26;
                            case 27:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB27 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB27.getClass();
                                return (o7) objB27;
                            case 28:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB28 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uf7.class);
                                objB28.getClass();
                                return (uf7) objB28;
                            default:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB29 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(mk7.class);
                                objB29.getClass();
                                return (mk7) objB29;
                        }
                    }
                }, kq9Var10)));
                final int i33 = 15;
                oqbVar11.a(new ge7(new qh1(xaiVar5, kceVar9.b(hb7.class), null, new pz7() { // from class: if0
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) {
                        m7f m7fVar = (m7f) obj2;
                        bsc bscVar = (bsc) obj3;
                        switch (i33) {
                            case 0:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(n9h.class);
                                objB.getClass();
                                return (n9h) objB;
                            case 1:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB2 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(v7i.class);
                                objB2.getClass();
                                return (v7i) objB2;
                            case 2:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB3 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ptf.class);
                                objB3.getClass();
                                return (ptf) objB3;
                            case 3:
                                m7fVar.getClass();
                                bscVar.getClass();
                                return new jf0((rc8) m7fVar.a(jce.a.b(rc8.class), null, null));
                            case 4:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB4 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(kli.class);
                                objB4.getClass();
                                return (kli) objB4;
                            case 5:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB5 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(haj.class);
                                objB5.getClass();
                                return (haj) objB5;
                            case 6:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB6 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ok7.class);
                                objB6.getClass();
                                return (ok7) objB6;
                            case 7:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB7 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ui0.class);
                                objB7.getClass();
                                return (ui0) objB7;
                            case 8:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB8 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(p87.class);
                                objB8.getClass();
                                return (p87) objB8;
                            case 9:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB9 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(nu0.class);
                                objB9.getClass();
                                return (nu0) objB9;
                            case 10:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB10 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(dl2.class);
                                objB10.getClass();
                                return (dl2) objB10;
                            case 11:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB11 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ya3.class);
                                objB11.getClass();
                                return (ya3) objB11;
                            case 12:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB12 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uk4.class);
                                objB12.getClass();
                                return (uk4) objB12;
                            case 13:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB13 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(er4.class);
                                objB13.getClass();
                                return (er4) objB13;
                            case 14:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB14 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uz6.class);
                                objB14.getClass();
                                return (uz6) objB14;
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB15 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(hb7.class);
                                objB15.getClass();
                                y6a.r(objB15);
                                throw null;
                            case 16:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB16 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(tga.class);
                                objB16.getClass();
                                return (tga) objB16;
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB17 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB17.getClass();
                                return (o7) objB17;
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB18 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB18.getClass();
                                return (j2d) objB18;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB19 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB19.getClass();
                                return (o7) objB19;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB20 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB20.getClass();
                                return (i8) objB20;
                            case 21:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB21 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(xjc.class);
                                objB21.getClass();
                                return (xjc) objB21;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB22 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(gae.class);
                                objB22.getClass();
                                return (gae) objB22;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB23 = ((qre) m7fVar.a(jce.a.b(qre.class), nai.s, null)).b(rmb.class);
                                objB23.getClass();
                                y6a.r(objB23);
                                throw null;
                            case 24:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB24 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(uz6.class);
                                objB24.getClass();
                                return (uz6) objB24;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB25 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(p2a.class);
                                objB25.getClass();
                                return (p2a) objB25;
                            case 26:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB26 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(a78.class);
                                objB26.getClass();
                                return (a78) objB26;
                            case 27:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB27 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB27.getClass();
                                return (o7) objB27;
                            case 28:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB28 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uf7.class);
                                objB28.getClass();
                                return (uf7) objB28;
                            default:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB29 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(mk7.class);
                                objB29.getClass();
                                return (mk7) objB29;
                        }
                    }
                }, kq9Var10)));
                final int i34 = 28;
                oqbVar11.a(new ge7(new qh1(xaiVar5, kceVar9.b(uf7.class), null, new pz7() { // from class: if0
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) {
                        m7f m7fVar = (m7f) obj2;
                        bsc bscVar = (bsc) obj3;
                        switch (i34) {
                            case 0:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(n9h.class);
                                objB.getClass();
                                return (n9h) objB;
                            case 1:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB2 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(v7i.class);
                                objB2.getClass();
                                return (v7i) objB2;
                            case 2:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB3 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ptf.class);
                                objB3.getClass();
                                return (ptf) objB3;
                            case 3:
                                m7fVar.getClass();
                                bscVar.getClass();
                                return new jf0((rc8) m7fVar.a(jce.a.b(rc8.class), null, null));
                            case 4:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB4 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(kli.class);
                                objB4.getClass();
                                return (kli) objB4;
                            case 5:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB5 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(haj.class);
                                objB5.getClass();
                                return (haj) objB5;
                            case 6:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB6 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ok7.class);
                                objB6.getClass();
                                return (ok7) objB6;
                            case 7:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB7 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ui0.class);
                                objB7.getClass();
                                return (ui0) objB7;
                            case 8:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB8 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(p87.class);
                                objB8.getClass();
                                return (p87) objB8;
                            case 9:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB9 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(nu0.class);
                                objB9.getClass();
                                return (nu0) objB9;
                            case 10:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB10 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(dl2.class);
                                objB10.getClass();
                                return (dl2) objB10;
                            case 11:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB11 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ya3.class);
                                objB11.getClass();
                                return (ya3) objB11;
                            case 12:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB12 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uk4.class);
                                objB12.getClass();
                                return (uk4) objB12;
                            case 13:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB13 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(er4.class);
                                objB13.getClass();
                                return (er4) objB13;
                            case 14:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB14 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uz6.class);
                                objB14.getClass();
                                return (uz6) objB14;
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB15 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(hb7.class);
                                objB15.getClass();
                                y6a.r(objB15);
                                throw null;
                            case 16:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB16 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(tga.class);
                                objB16.getClass();
                                return (tga) objB16;
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB17 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB17.getClass();
                                return (o7) objB17;
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB18 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB18.getClass();
                                return (j2d) objB18;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB19 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB19.getClass();
                                return (o7) objB19;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB20 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB20.getClass();
                                return (i8) objB20;
                            case 21:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB21 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(xjc.class);
                                objB21.getClass();
                                return (xjc) objB21;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB22 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(gae.class);
                                objB22.getClass();
                                return (gae) objB22;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB23 = ((qre) m7fVar.a(jce.a.b(qre.class), nai.s, null)).b(rmb.class);
                                objB23.getClass();
                                y6a.r(objB23);
                                throw null;
                            case 24:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB24 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(uz6.class);
                                objB24.getClass();
                                return (uz6) objB24;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB25 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(p2a.class);
                                objB25.getClass();
                                return (p2a) objB25;
                            case 26:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB26 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(a78.class);
                                objB26.getClass();
                                return (a78) objB26;
                            case 27:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB27 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB27.getClass();
                                return (o7) objB27;
                            case 28:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB28 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uf7.class);
                                objB28.getClass();
                                return (uf7) objB28;
                            default:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB29 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(mk7.class);
                                objB29.getClass();
                                return (mk7) objB29;
                        }
                    }
                }, kq9Var10)));
                final int i35 = 29;
                oqbVar11.a(new ge7(new qh1(xaiVar5, kceVar9.b(mk7.class), null, new pz7() { // from class: if0
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) {
                        m7f m7fVar = (m7f) obj2;
                        bsc bscVar = (bsc) obj3;
                        switch (i35) {
                            case 0:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(n9h.class);
                                objB.getClass();
                                return (n9h) objB;
                            case 1:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB2 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(v7i.class);
                                objB2.getClass();
                                return (v7i) objB2;
                            case 2:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB3 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ptf.class);
                                objB3.getClass();
                                return (ptf) objB3;
                            case 3:
                                m7fVar.getClass();
                                bscVar.getClass();
                                return new jf0((rc8) m7fVar.a(jce.a.b(rc8.class), null, null));
                            case 4:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB4 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(kli.class);
                                objB4.getClass();
                                return (kli) objB4;
                            case 5:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB5 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(haj.class);
                                objB5.getClass();
                                return (haj) objB5;
                            case 6:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB6 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ok7.class);
                                objB6.getClass();
                                return (ok7) objB6;
                            case 7:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB7 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ui0.class);
                                objB7.getClass();
                                return (ui0) objB7;
                            case 8:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB8 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(p87.class);
                                objB8.getClass();
                                return (p87) objB8;
                            case 9:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB9 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(nu0.class);
                                objB9.getClass();
                                return (nu0) objB9;
                            case 10:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB10 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(dl2.class);
                                objB10.getClass();
                                return (dl2) objB10;
                            case 11:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB11 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ya3.class);
                                objB11.getClass();
                                return (ya3) objB11;
                            case 12:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB12 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uk4.class);
                                objB12.getClass();
                                return (uk4) objB12;
                            case 13:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB13 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(er4.class);
                                objB13.getClass();
                                return (er4) objB13;
                            case 14:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB14 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uz6.class);
                                objB14.getClass();
                                return (uz6) objB14;
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB15 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(hb7.class);
                                objB15.getClass();
                                y6a.r(objB15);
                                throw null;
                            case 16:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB16 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(tga.class);
                                objB16.getClass();
                                return (tga) objB16;
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB17 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB17.getClass();
                                return (o7) objB17;
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB18 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB18.getClass();
                                return (j2d) objB18;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB19 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB19.getClass();
                                return (o7) objB19;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB20 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB20.getClass();
                                return (i8) objB20;
                            case 21:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB21 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(xjc.class);
                                objB21.getClass();
                                return (xjc) objB21;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB22 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(gae.class);
                                objB22.getClass();
                                return (gae) objB22;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB23 = ((qre) m7fVar.a(jce.a.b(qre.class), nai.s, null)).b(rmb.class);
                                objB23.getClass();
                                y6a.r(objB23);
                                throw null;
                            case 24:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB24 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(uz6.class);
                                objB24.getClass();
                                return (uz6) objB24;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB25 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(p2a.class);
                                objB25.getClass();
                                return (p2a) objB25;
                            case 26:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB26 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(a78.class);
                                objB26.getClass();
                                return (a78) objB26;
                            case 27:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB27 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB27.getClass();
                                return (o7) objB27;
                            case 28:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB28 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uf7.class);
                                objB28.getClass();
                                return (uf7) objB28;
                            default:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB29 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(mk7.class);
                                objB29.getClass();
                                return (mk7) objB29;
                        }
                    }
                }, kq9Var10)));
                oqbVar11.a(new ge7(new qh1(xaiVar5, kceVar9.b(tja.class), null, new pz7() { // from class: c8
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) throws MissingAndroidContextException {
                        int i162 = 1;
                        switch (i11) {
                            case 0:
                                m7f m7fVar = (m7f) obj2;
                                m7fVar.getClass();
                                ((bsc) obj3).getClass();
                                Context contextG = yb5.g(m7fVar);
                                String strM949unboximpl = ((AccountId) m7fVar.a(jce.a.b(AccountId.class), null, null)).m949unboximpl();
                                strM949unboximpl.getClass();
                                SharedPreferences sharedPreferences = contextG.getApplicationContext().getSharedPreferences("account_prefs".concat(strM949unboximpl), 0);
                                sharedPreferences.getClass();
                                return new f8(sharedPreferences);
                            case 1:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                if (v40.a == null) {
                                    synchronized (v40.b) {
                                        if (v40.a == null) {
                                            pl7 pl7VarC = pl7.c();
                                            pl7VarC.a();
                                            v40.a = FirebaseAnalytics.getInstance(pl7VarC.a);
                                        }
                                        break;
                                    }
                                }
                                FirebaseAnalytics firebaseAnalytics = v40.a;
                                firebaseAnalytics.getClass();
                                return firebaseAnalytics;
                            case 2:
                                m7f m7fVar2 = (m7f) obj2;
                                m7fVar2.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar22 = jce.a;
                                return new ll7((FirebaseAnalytics) m7fVar2.a(kceVar22.b(FirebaseAnalytics.class), null, null), (am0) m7fVar2.a(kceVar22.b(am0.class), null, null));
                            case 3:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new kd();
                            case 4:
                                m7f m7fVar3 = (m7f) obj2;
                                m7fVar3.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar32 = jce.a;
                                return new hj((qi3) m7fVar3.a(kceVar32.b(qi3.class), null, null), (fk0) m7fVar3.a(kceVar32.b(fk0.class), null, null), new w9h(new cfk((Context) m7fVar3.a(kceVar32.b(Context.class), null, null))), (g78) m7fVar3.a(kceVar32.b(g78.class), null, null), (h86) m7fVar3.a(kceVar32.b(h86.class), null, null));
                            case 5:
                                m7f m7fVar4 = (m7f) obj2;
                                m7fVar4.getClass();
                                ((bsc) obj3).getClass();
                                return new pl(((doi) m7fVar4.a(jce.a.b(doi.class), null, null)).a("agent_chat"));
                            case 6:
                                m7f m7fVar5 = (m7f) obj2;
                                m7fVar5.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar42 = jce.a;
                                return new fq((dl2) m7fVar5.a(kceVar42.b(dl2.class), null, null), (h86) m7fVar5.a(kceVar42.b(h86.class), null, null), (oda) m7fVar5.a(kceVar42.b(oda.class), null, null), (koi) m7fVar5.a(kceVar42.b(koi.class), null, null));
                            case 7:
                                m7f m7fVar6 = (m7f) obj2;
                                m7fVar6.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar52 = jce.a;
                                return new vm((jwf) m7fVar6.a(kceVar52.b(jwf.class), null, null), (b) m7fVar6.a(kceVar52.b(b.class), null, null), (qzb) m7fVar6.a(kceVar52.b(qzb.class), null, null), (i8c) m7fVar6.a(kceVar52.b(i8c.class), null, null), (pl) m7fVar6.a(kceVar52.b(pl.class), null, null), yb5.g(m7fVar6), (ze0) m7fVar6.a(kceVar52.b(ze0.class), null, null), (koi) m7fVar6.a(kceVar52.b(koi.class), null, null), (i25) m7fVar6.a(kceVar52.b(i25.class), null, null), (hdc) m7fVar6.a(kceVar52.b(hdc.class), null, null), (fq) m7fVar6.a(kceVar52.b(fq.class), null, null), (oda) m7fVar6.a(kceVar52.b(oda.class), null, null), (h86) m7fVar6.a(kceVar52.b(h86.class), null, null), (qi3) m7fVar6.a(kceVar52.b(qi3.class), null, null), (z8c) m7fVar6.a(kceVar52.b(z8c.class), null, null), (j8i) m7fVar6.a(kceVar52.b(j8i.class), null, null), (rc8) m7fVar6.a(kceVar52.b(rc8.class), null, null));
                            case 8:
                                m7f m7fVar7 = (m7f) obj2;
                                m7fVar7.getClass();
                                ((bsc) obj3).getClass();
                                int i172 = lx.a[((AppEnvironment) m7fVar7.a(jce.a.b(AppEnvironment.class), null, null)).ordinal()];
                                if (i172 == 1) {
                                    return "LKJN8LsLERHEOXkw487o7qCTFOrGPimI";
                                }
                                if (i172 == 2 || i172 == 3) {
                                    return "b64sf1kxwDGe1PiSAlv5ixuH0f509RKK";
                                }
                                mr9.b();
                                return null;
                            case 9:
                                m7f m7fVar8 = (m7f) obj2;
                                m7fVar8.getClass();
                                ((bsc) obj3).getClass();
                                mrg mrgVar22 = mx.a;
                                kce kceVar62 = jce.a;
                                return new nff((String) m7fVar8.a(kceVar62.b(String.class), mrgVar22, null), (Context) m7fVar8.a(kceVar62.b(Context.class), null, null), (h86) m7fVar8.a(kceVar62.b(h86.class), null, null), (ud5) m7fVar8.a(kceVar62.b(ud5.class), null, null), (qk5) m7fVar8.a(kceVar62.b(qk5.class), null, null));
                            case 10:
                                m7f m7fVar9 = (m7f) obj2;
                                m7fVar9.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar72 = jce.a;
                                nff nffVar = (nff) m7fVar9.a(kceVar72.b(nff.class), null, null);
                                yw ywVar = gx.Companion;
                                ql8 ql8Var = new ql8(12);
                                ywVar.getClass();
                                gx.K = ql8Var;
                                String str = nffVar.a;
                                if (bsg.I0(str)) {
                                    sz6.p("writeKey cannot be blank ");
                                    return null;
                                }
                                mff mffVar = new mff(new eg4(nffVar.b, str), new el5(nffVar));
                                mffVar.b().a(new e10());
                                mffVar.b().a(new k30());
                                String strA = nffVar.d.a.a();
                                String languageTag = LocaleList.getDefault().get(0).toLanguageTag();
                                languageTag.getClass();
                                mffVar.b().a(new vd5(strA, languageTag));
                                mffVar.b().a(new nk5(i162));
                                mffVar.b().a(new nk5(nffVar.e));
                                boolean z = !((fk0) m7fVar9.a(kceVar72.b(fk0.class), null, null)).o();
                                mffVar.J = z;
                                el5 el5Var = mffVar.F;
                                gb9.D((mp4) el5Var.I, (e45) el5Var.F, null, new ax(mffVar, z, (tp4) null), 2);
                                return mffVar;
                            case 11:
                                m7f m7fVar10 = (m7f) obj2;
                                m7fVar10.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar82 = jce.a;
                                return new com.anthropic.claude.analytics.b((gx) m7fVar10.a(kceVar82.b(gx.class), null, null), (bg9) m7fVar10.a(kceVar82.b(bg9.class), null, null), (qk5) m7fVar10.a(kceVar82.b(qk5.class), null, null));
                            case 12:
                                m7f m7fVar11 = (m7f) obj2;
                                m7fVar11.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar11.a(jce.a.b(com.anthropic.claude.analytics.b.class), null, null);
                            case 13:
                                m7f m7fVar12 = (m7f) obj2;
                                m7fVar12.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar92 = jce.a;
                                fk0 fk0Var = (fk0) m7fVar12.a(kceVar92.b(fk0.class), null, null);
                                t29 t29Var = new t29(m7fVar12.a(kceVar92.b(gx.class), null, null));
                                t29 t29Var2 = new t29(m7fVar12.a(kceVar92.b(FirebaseAnalytics.class), null, null));
                                ((fk0) m7fVar12.a(kceVar92.b(fk0.class), null, null)).o();
                                return new smh(fk0Var, t29Var, t29Var2);
                            case 14:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new ti3();
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7f m7fVar13 = (m7f) obj2;
                                m7fVar13.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar13.a(jce.a.b(ti3.class), null, null);
                            case 16:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new hl8(new wg6(14), new rl7(6));
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7f m7fVar14 = (m7f) obj2;
                                m7fVar14.getClass();
                                ((bsc) obj3).getClass();
                                return new smh((fk0) m7fVar14.a(jce.a.b(fk0.class), null, null), new u0h(bw.G), new u0h(bw.H));
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7f m7fVar15 = (m7f) obj2;
                                m7fVar15.getClass();
                                ((bsc) obj3).getClass();
                                Object objB = ((qre) m7fVar15.a(jce.a.b(qre.class), null, null)).b(tja.class);
                                objB.getClass();
                                return (tja) objB;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7f m7fVar16 = (m7f) obj2;
                                m7fVar16.getClass();
                                ((bsc) obj3).getClass();
                                Object objB2 = ((qre) m7fVar16.a(jce.a.b(qre.class), null, null)).b(t8b.class);
                                objB2.getClass();
                                return (t8b) objB2;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7f m7fVar17 = (m7f) obj2;
                                m7fVar17.getClass();
                                ((bsc) obj3).getClass();
                                Object objB3 = ((qre) m7fVar17.a(jce.a.b(qre.class), null, null)).b(kab.class);
                                objB3.getClass();
                                return (kab) objB3;
                            case 21:
                                m7f m7fVar18 = (m7f) obj2;
                                m7fVar18.getClass();
                                ((bsc) obj3).getClass();
                                Object objB4 = ((qre) m7fVar18.a(jce.a.b(qre.class), null, null)).b(npb.class);
                                objB4.getClass();
                                return (npb) objB4;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7f m7fVar19 = (m7f) obj2;
                                m7fVar19.getClass();
                                ((bsc) obj3).getClass();
                                Object objB5 = ((qre) m7fVar19.a(jce.a.b(qre.class), null, null)).b(b7c.class);
                                objB5.getClass();
                                return (b7c) objB5;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7f m7fVar20 = (m7f) obj2;
                                m7fVar20.getClass();
                                ((bsc) obj3).getClass();
                                Object objB6 = ((qre) m7fVar20.a(jce.a.b(qre.class), null, null)).b(swa.class);
                                objB6.getClass();
                                return (swa) objB6;
                            case 24:
                                m7f m7fVar21 = (m7f) obj2;
                                m7fVar21.getClass();
                                ((bsc) obj3).getClass();
                                Object objB7 = ((qre) m7fVar21.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB7.getClass();
                                return (j2d) objB7;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7f m7fVar22 = (m7f) obj2;
                                m7fVar22.getClass();
                                ((bsc) obj3).getClass();
                                Object objB8 = ((qre) m7fVar22.a(jce.a.b(qre.class), null, null)).b(mkd.class);
                                objB8.getClass();
                                return (mkd) objB8;
                            case 26:
                                m7f m7fVar23 = (m7f) obj2;
                                m7fVar23.getClass();
                                ((bsc) obj3).getClass();
                                Object objB9 = ((qre) m7fVar23.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB9.getClass();
                                return (i8) objB9;
                            case 27:
                                m7f m7fVar24 = (m7f) obj2;
                                m7fVar24.getClass();
                                ((bsc) obj3).getClass();
                                Object objB10 = ((qre) m7fVar24.a(jce.a.b(qre.class), null, null)).b(omd.class);
                                objB10.getClass();
                                return (omd) objB10;
                            case 28:
                                m7f m7fVar25 = (m7f) obj2;
                                m7fVar25.getClass();
                                ((bsc) obj3).getClass();
                                Object objB11 = ((qre) m7fVar25.a(jce.a.b(qre.class), null, null)).b(pxd.class);
                                objB11.getClass();
                                return (pxd) objB11;
                            default:
                                m7f m7fVar26 = (m7f) obj2;
                                m7fVar26.getClass();
                                ((bsc) obj3).getClass();
                                Object objB12 = ((qre) m7fVar26.a(jce.a.b(qre.class), null, null)).b(r0h.class);
                                objB12.getClass();
                                return (r0h) objB12;
                        }
                    }
                }, kq9Var10)));
                oqbVar11.a(new ge7(new qh1(xaiVar5, kceVar9.b(t8b.class), null, new pz7() { // from class: c8
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) throws MissingAndroidContextException {
                        int i162 = 1;
                        switch (i9) {
                            case 0:
                                m7f m7fVar = (m7f) obj2;
                                m7fVar.getClass();
                                ((bsc) obj3).getClass();
                                Context contextG = yb5.g(m7fVar);
                                String strM949unboximpl = ((AccountId) m7fVar.a(jce.a.b(AccountId.class), null, null)).m949unboximpl();
                                strM949unboximpl.getClass();
                                SharedPreferences sharedPreferences = contextG.getApplicationContext().getSharedPreferences("account_prefs".concat(strM949unboximpl), 0);
                                sharedPreferences.getClass();
                                return new f8(sharedPreferences);
                            case 1:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                if (v40.a == null) {
                                    synchronized (v40.b) {
                                        if (v40.a == null) {
                                            pl7 pl7VarC = pl7.c();
                                            pl7VarC.a();
                                            v40.a = FirebaseAnalytics.getInstance(pl7VarC.a);
                                        }
                                        break;
                                    }
                                }
                                FirebaseAnalytics firebaseAnalytics = v40.a;
                                firebaseAnalytics.getClass();
                                return firebaseAnalytics;
                            case 2:
                                m7f m7fVar2 = (m7f) obj2;
                                m7fVar2.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar22 = jce.a;
                                return new ll7((FirebaseAnalytics) m7fVar2.a(kceVar22.b(FirebaseAnalytics.class), null, null), (am0) m7fVar2.a(kceVar22.b(am0.class), null, null));
                            case 3:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new kd();
                            case 4:
                                m7f m7fVar3 = (m7f) obj2;
                                m7fVar3.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar32 = jce.a;
                                return new hj((qi3) m7fVar3.a(kceVar32.b(qi3.class), null, null), (fk0) m7fVar3.a(kceVar32.b(fk0.class), null, null), new w9h(new cfk((Context) m7fVar3.a(kceVar32.b(Context.class), null, null))), (g78) m7fVar3.a(kceVar32.b(g78.class), null, null), (h86) m7fVar3.a(kceVar32.b(h86.class), null, null));
                            case 5:
                                m7f m7fVar4 = (m7f) obj2;
                                m7fVar4.getClass();
                                ((bsc) obj3).getClass();
                                return new pl(((doi) m7fVar4.a(jce.a.b(doi.class), null, null)).a("agent_chat"));
                            case 6:
                                m7f m7fVar5 = (m7f) obj2;
                                m7fVar5.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar42 = jce.a;
                                return new fq((dl2) m7fVar5.a(kceVar42.b(dl2.class), null, null), (h86) m7fVar5.a(kceVar42.b(h86.class), null, null), (oda) m7fVar5.a(kceVar42.b(oda.class), null, null), (koi) m7fVar5.a(kceVar42.b(koi.class), null, null));
                            case 7:
                                m7f m7fVar6 = (m7f) obj2;
                                m7fVar6.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar52 = jce.a;
                                return new vm((jwf) m7fVar6.a(kceVar52.b(jwf.class), null, null), (b) m7fVar6.a(kceVar52.b(b.class), null, null), (qzb) m7fVar6.a(kceVar52.b(qzb.class), null, null), (i8c) m7fVar6.a(kceVar52.b(i8c.class), null, null), (pl) m7fVar6.a(kceVar52.b(pl.class), null, null), yb5.g(m7fVar6), (ze0) m7fVar6.a(kceVar52.b(ze0.class), null, null), (koi) m7fVar6.a(kceVar52.b(koi.class), null, null), (i25) m7fVar6.a(kceVar52.b(i25.class), null, null), (hdc) m7fVar6.a(kceVar52.b(hdc.class), null, null), (fq) m7fVar6.a(kceVar52.b(fq.class), null, null), (oda) m7fVar6.a(kceVar52.b(oda.class), null, null), (h86) m7fVar6.a(kceVar52.b(h86.class), null, null), (qi3) m7fVar6.a(kceVar52.b(qi3.class), null, null), (z8c) m7fVar6.a(kceVar52.b(z8c.class), null, null), (j8i) m7fVar6.a(kceVar52.b(j8i.class), null, null), (rc8) m7fVar6.a(kceVar52.b(rc8.class), null, null));
                            case 8:
                                m7f m7fVar7 = (m7f) obj2;
                                m7fVar7.getClass();
                                ((bsc) obj3).getClass();
                                int i172 = lx.a[((AppEnvironment) m7fVar7.a(jce.a.b(AppEnvironment.class), null, null)).ordinal()];
                                if (i172 == 1) {
                                    return "LKJN8LsLERHEOXkw487o7qCTFOrGPimI";
                                }
                                if (i172 == 2 || i172 == 3) {
                                    return "b64sf1kxwDGe1PiSAlv5ixuH0f509RKK";
                                }
                                mr9.b();
                                return null;
                            case 9:
                                m7f m7fVar8 = (m7f) obj2;
                                m7fVar8.getClass();
                                ((bsc) obj3).getClass();
                                mrg mrgVar22 = mx.a;
                                kce kceVar62 = jce.a;
                                return new nff((String) m7fVar8.a(kceVar62.b(String.class), mrgVar22, null), (Context) m7fVar8.a(kceVar62.b(Context.class), null, null), (h86) m7fVar8.a(kceVar62.b(h86.class), null, null), (ud5) m7fVar8.a(kceVar62.b(ud5.class), null, null), (qk5) m7fVar8.a(kceVar62.b(qk5.class), null, null));
                            case 10:
                                m7f m7fVar9 = (m7f) obj2;
                                m7fVar9.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar72 = jce.a;
                                nff nffVar = (nff) m7fVar9.a(kceVar72.b(nff.class), null, null);
                                yw ywVar = gx.Companion;
                                ql8 ql8Var = new ql8(12);
                                ywVar.getClass();
                                gx.K = ql8Var;
                                String str = nffVar.a;
                                if (bsg.I0(str)) {
                                    sz6.p("writeKey cannot be blank ");
                                    return null;
                                }
                                mff mffVar = new mff(new eg4(nffVar.b, str), new el5(nffVar));
                                mffVar.b().a(new e10());
                                mffVar.b().a(new k30());
                                String strA = nffVar.d.a.a();
                                String languageTag = LocaleList.getDefault().get(0).toLanguageTag();
                                languageTag.getClass();
                                mffVar.b().a(new vd5(strA, languageTag));
                                mffVar.b().a(new nk5(i162));
                                mffVar.b().a(new nk5(nffVar.e));
                                boolean z = !((fk0) m7fVar9.a(kceVar72.b(fk0.class), null, null)).o();
                                mffVar.J = z;
                                el5 el5Var = mffVar.F;
                                gb9.D((mp4) el5Var.I, (e45) el5Var.F, null, new ax(mffVar, z, (tp4) null), 2);
                                return mffVar;
                            case 11:
                                m7f m7fVar10 = (m7f) obj2;
                                m7fVar10.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar82 = jce.a;
                                return new com.anthropic.claude.analytics.b((gx) m7fVar10.a(kceVar82.b(gx.class), null, null), (bg9) m7fVar10.a(kceVar82.b(bg9.class), null, null), (qk5) m7fVar10.a(kceVar82.b(qk5.class), null, null));
                            case 12:
                                m7f m7fVar11 = (m7f) obj2;
                                m7fVar11.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar11.a(jce.a.b(com.anthropic.claude.analytics.b.class), null, null);
                            case 13:
                                m7f m7fVar12 = (m7f) obj2;
                                m7fVar12.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar92 = jce.a;
                                fk0 fk0Var = (fk0) m7fVar12.a(kceVar92.b(fk0.class), null, null);
                                t29 t29Var = new t29(m7fVar12.a(kceVar92.b(gx.class), null, null));
                                t29 t29Var2 = new t29(m7fVar12.a(kceVar92.b(FirebaseAnalytics.class), null, null));
                                ((fk0) m7fVar12.a(kceVar92.b(fk0.class), null, null)).o();
                                return new smh(fk0Var, t29Var, t29Var2);
                            case 14:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new ti3();
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7f m7fVar13 = (m7f) obj2;
                                m7fVar13.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar13.a(jce.a.b(ti3.class), null, null);
                            case 16:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new hl8(new wg6(14), new rl7(6));
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7f m7fVar14 = (m7f) obj2;
                                m7fVar14.getClass();
                                ((bsc) obj3).getClass();
                                return new smh((fk0) m7fVar14.a(jce.a.b(fk0.class), null, null), new u0h(bw.G), new u0h(bw.H));
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7f m7fVar15 = (m7f) obj2;
                                m7fVar15.getClass();
                                ((bsc) obj3).getClass();
                                Object objB = ((qre) m7fVar15.a(jce.a.b(qre.class), null, null)).b(tja.class);
                                objB.getClass();
                                return (tja) objB;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7f m7fVar16 = (m7f) obj2;
                                m7fVar16.getClass();
                                ((bsc) obj3).getClass();
                                Object objB2 = ((qre) m7fVar16.a(jce.a.b(qre.class), null, null)).b(t8b.class);
                                objB2.getClass();
                                return (t8b) objB2;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7f m7fVar17 = (m7f) obj2;
                                m7fVar17.getClass();
                                ((bsc) obj3).getClass();
                                Object objB3 = ((qre) m7fVar17.a(jce.a.b(qre.class), null, null)).b(kab.class);
                                objB3.getClass();
                                return (kab) objB3;
                            case 21:
                                m7f m7fVar18 = (m7f) obj2;
                                m7fVar18.getClass();
                                ((bsc) obj3).getClass();
                                Object objB4 = ((qre) m7fVar18.a(jce.a.b(qre.class), null, null)).b(npb.class);
                                objB4.getClass();
                                return (npb) objB4;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7f m7fVar19 = (m7f) obj2;
                                m7fVar19.getClass();
                                ((bsc) obj3).getClass();
                                Object objB5 = ((qre) m7fVar19.a(jce.a.b(qre.class), null, null)).b(b7c.class);
                                objB5.getClass();
                                return (b7c) objB5;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7f m7fVar20 = (m7f) obj2;
                                m7fVar20.getClass();
                                ((bsc) obj3).getClass();
                                Object objB6 = ((qre) m7fVar20.a(jce.a.b(qre.class), null, null)).b(swa.class);
                                objB6.getClass();
                                return (swa) objB6;
                            case 24:
                                m7f m7fVar21 = (m7f) obj2;
                                m7fVar21.getClass();
                                ((bsc) obj3).getClass();
                                Object objB7 = ((qre) m7fVar21.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB7.getClass();
                                return (j2d) objB7;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7f m7fVar22 = (m7f) obj2;
                                m7fVar22.getClass();
                                ((bsc) obj3).getClass();
                                Object objB8 = ((qre) m7fVar22.a(jce.a.b(qre.class), null, null)).b(mkd.class);
                                objB8.getClass();
                                return (mkd) objB8;
                            case 26:
                                m7f m7fVar23 = (m7f) obj2;
                                m7fVar23.getClass();
                                ((bsc) obj3).getClass();
                                Object objB9 = ((qre) m7fVar23.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB9.getClass();
                                return (i8) objB9;
                            case 27:
                                m7f m7fVar24 = (m7f) obj2;
                                m7fVar24.getClass();
                                ((bsc) obj3).getClass();
                                Object objB10 = ((qre) m7fVar24.a(jce.a.b(qre.class), null, null)).b(omd.class);
                                objB10.getClass();
                                return (omd) objB10;
                            case 28:
                                m7f m7fVar25 = (m7f) obj2;
                                m7fVar25.getClass();
                                ((bsc) obj3).getClass();
                                Object objB11 = ((qre) m7fVar25.a(jce.a.b(qre.class), null, null)).b(pxd.class);
                                objB11.getClass();
                                return (pxd) objB11;
                            default:
                                m7f m7fVar26 = (m7f) obj2;
                                m7fVar26.getClass();
                                ((bsc) obj3).getClass();
                                Object objB12 = ((qre) m7fVar26.a(jce.a.b(qre.class), null, null)).b(r0h.class);
                                objB12.getClass();
                                return (r0h) objB12;
                        }
                    }
                }, kq9Var10)));
                oqbVar11.a(new ge7(new qh1(xaiVar5, kceVar9.b(kab.class), null, new pz7() { // from class: c8
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) throws MissingAndroidContextException {
                        int i162 = 1;
                        switch (i8) {
                            case 0:
                                m7f m7fVar = (m7f) obj2;
                                m7fVar.getClass();
                                ((bsc) obj3).getClass();
                                Context contextG = yb5.g(m7fVar);
                                String strM949unboximpl = ((AccountId) m7fVar.a(jce.a.b(AccountId.class), null, null)).m949unboximpl();
                                strM949unboximpl.getClass();
                                SharedPreferences sharedPreferences = contextG.getApplicationContext().getSharedPreferences("account_prefs".concat(strM949unboximpl), 0);
                                sharedPreferences.getClass();
                                return new f8(sharedPreferences);
                            case 1:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                if (v40.a == null) {
                                    synchronized (v40.b) {
                                        if (v40.a == null) {
                                            pl7 pl7VarC = pl7.c();
                                            pl7VarC.a();
                                            v40.a = FirebaseAnalytics.getInstance(pl7VarC.a);
                                        }
                                        break;
                                    }
                                }
                                FirebaseAnalytics firebaseAnalytics = v40.a;
                                firebaseAnalytics.getClass();
                                return firebaseAnalytics;
                            case 2:
                                m7f m7fVar2 = (m7f) obj2;
                                m7fVar2.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar22 = jce.a;
                                return new ll7((FirebaseAnalytics) m7fVar2.a(kceVar22.b(FirebaseAnalytics.class), null, null), (am0) m7fVar2.a(kceVar22.b(am0.class), null, null));
                            case 3:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new kd();
                            case 4:
                                m7f m7fVar3 = (m7f) obj2;
                                m7fVar3.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar32 = jce.a;
                                return new hj((qi3) m7fVar3.a(kceVar32.b(qi3.class), null, null), (fk0) m7fVar3.a(kceVar32.b(fk0.class), null, null), new w9h(new cfk((Context) m7fVar3.a(kceVar32.b(Context.class), null, null))), (g78) m7fVar3.a(kceVar32.b(g78.class), null, null), (h86) m7fVar3.a(kceVar32.b(h86.class), null, null));
                            case 5:
                                m7f m7fVar4 = (m7f) obj2;
                                m7fVar4.getClass();
                                ((bsc) obj3).getClass();
                                return new pl(((doi) m7fVar4.a(jce.a.b(doi.class), null, null)).a("agent_chat"));
                            case 6:
                                m7f m7fVar5 = (m7f) obj2;
                                m7fVar5.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar42 = jce.a;
                                return new fq((dl2) m7fVar5.a(kceVar42.b(dl2.class), null, null), (h86) m7fVar5.a(kceVar42.b(h86.class), null, null), (oda) m7fVar5.a(kceVar42.b(oda.class), null, null), (koi) m7fVar5.a(kceVar42.b(koi.class), null, null));
                            case 7:
                                m7f m7fVar6 = (m7f) obj2;
                                m7fVar6.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar52 = jce.a;
                                return new vm((jwf) m7fVar6.a(kceVar52.b(jwf.class), null, null), (b) m7fVar6.a(kceVar52.b(b.class), null, null), (qzb) m7fVar6.a(kceVar52.b(qzb.class), null, null), (i8c) m7fVar6.a(kceVar52.b(i8c.class), null, null), (pl) m7fVar6.a(kceVar52.b(pl.class), null, null), yb5.g(m7fVar6), (ze0) m7fVar6.a(kceVar52.b(ze0.class), null, null), (koi) m7fVar6.a(kceVar52.b(koi.class), null, null), (i25) m7fVar6.a(kceVar52.b(i25.class), null, null), (hdc) m7fVar6.a(kceVar52.b(hdc.class), null, null), (fq) m7fVar6.a(kceVar52.b(fq.class), null, null), (oda) m7fVar6.a(kceVar52.b(oda.class), null, null), (h86) m7fVar6.a(kceVar52.b(h86.class), null, null), (qi3) m7fVar6.a(kceVar52.b(qi3.class), null, null), (z8c) m7fVar6.a(kceVar52.b(z8c.class), null, null), (j8i) m7fVar6.a(kceVar52.b(j8i.class), null, null), (rc8) m7fVar6.a(kceVar52.b(rc8.class), null, null));
                            case 8:
                                m7f m7fVar7 = (m7f) obj2;
                                m7fVar7.getClass();
                                ((bsc) obj3).getClass();
                                int i172 = lx.a[((AppEnvironment) m7fVar7.a(jce.a.b(AppEnvironment.class), null, null)).ordinal()];
                                if (i172 == 1) {
                                    return "LKJN8LsLERHEOXkw487o7qCTFOrGPimI";
                                }
                                if (i172 == 2 || i172 == 3) {
                                    return "b64sf1kxwDGe1PiSAlv5ixuH0f509RKK";
                                }
                                mr9.b();
                                return null;
                            case 9:
                                m7f m7fVar8 = (m7f) obj2;
                                m7fVar8.getClass();
                                ((bsc) obj3).getClass();
                                mrg mrgVar22 = mx.a;
                                kce kceVar62 = jce.a;
                                return new nff((String) m7fVar8.a(kceVar62.b(String.class), mrgVar22, null), (Context) m7fVar8.a(kceVar62.b(Context.class), null, null), (h86) m7fVar8.a(kceVar62.b(h86.class), null, null), (ud5) m7fVar8.a(kceVar62.b(ud5.class), null, null), (qk5) m7fVar8.a(kceVar62.b(qk5.class), null, null));
                            case 10:
                                m7f m7fVar9 = (m7f) obj2;
                                m7fVar9.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar72 = jce.a;
                                nff nffVar = (nff) m7fVar9.a(kceVar72.b(nff.class), null, null);
                                yw ywVar = gx.Companion;
                                ql8 ql8Var = new ql8(12);
                                ywVar.getClass();
                                gx.K = ql8Var;
                                String str = nffVar.a;
                                if (bsg.I0(str)) {
                                    sz6.p("writeKey cannot be blank ");
                                    return null;
                                }
                                mff mffVar = new mff(new eg4(nffVar.b, str), new el5(nffVar));
                                mffVar.b().a(new e10());
                                mffVar.b().a(new k30());
                                String strA = nffVar.d.a.a();
                                String languageTag = LocaleList.getDefault().get(0).toLanguageTag();
                                languageTag.getClass();
                                mffVar.b().a(new vd5(strA, languageTag));
                                mffVar.b().a(new nk5(i162));
                                mffVar.b().a(new nk5(nffVar.e));
                                boolean z = !((fk0) m7fVar9.a(kceVar72.b(fk0.class), null, null)).o();
                                mffVar.J = z;
                                el5 el5Var = mffVar.F;
                                gb9.D((mp4) el5Var.I, (e45) el5Var.F, null, new ax(mffVar, z, (tp4) null), 2);
                                return mffVar;
                            case 11:
                                m7f m7fVar10 = (m7f) obj2;
                                m7fVar10.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar82 = jce.a;
                                return new com.anthropic.claude.analytics.b((gx) m7fVar10.a(kceVar82.b(gx.class), null, null), (bg9) m7fVar10.a(kceVar82.b(bg9.class), null, null), (qk5) m7fVar10.a(kceVar82.b(qk5.class), null, null));
                            case 12:
                                m7f m7fVar11 = (m7f) obj2;
                                m7fVar11.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar11.a(jce.a.b(com.anthropic.claude.analytics.b.class), null, null);
                            case 13:
                                m7f m7fVar12 = (m7f) obj2;
                                m7fVar12.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar92 = jce.a;
                                fk0 fk0Var = (fk0) m7fVar12.a(kceVar92.b(fk0.class), null, null);
                                t29 t29Var = new t29(m7fVar12.a(kceVar92.b(gx.class), null, null));
                                t29 t29Var2 = new t29(m7fVar12.a(kceVar92.b(FirebaseAnalytics.class), null, null));
                                ((fk0) m7fVar12.a(kceVar92.b(fk0.class), null, null)).o();
                                return new smh(fk0Var, t29Var, t29Var2);
                            case 14:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new ti3();
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7f m7fVar13 = (m7f) obj2;
                                m7fVar13.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar13.a(jce.a.b(ti3.class), null, null);
                            case 16:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new hl8(new wg6(14), new rl7(6));
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7f m7fVar14 = (m7f) obj2;
                                m7fVar14.getClass();
                                ((bsc) obj3).getClass();
                                return new smh((fk0) m7fVar14.a(jce.a.b(fk0.class), null, null), new u0h(bw.G), new u0h(bw.H));
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7f m7fVar15 = (m7f) obj2;
                                m7fVar15.getClass();
                                ((bsc) obj3).getClass();
                                Object objB = ((qre) m7fVar15.a(jce.a.b(qre.class), null, null)).b(tja.class);
                                objB.getClass();
                                return (tja) objB;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7f m7fVar16 = (m7f) obj2;
                                m7fVar16.getClass();
                                ((bsc) obj3).getClass();
                                Object objB2 = ((qre) m7fVar16.a(jce.a.b(qre.class), null, null)).b(t8b.class);
                                objB2.getClass();
                                return (t8b) objB2;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7f m7fVar17 = (m7f) obj2;
                                m7fVar17.getClass();
                                ((bsc) obj3).getClass();
                                Object objB3 = ((qre) m7fVar17.a(jce.a.b(qre.class), null, null)).b(kab.class);
                                objB3.getClass();
                                return (kab) objB3;
                            case 21:
                                m7f m7fVar18 = (m7f) obj2;
                                m7fVar18.getClass();
                                ((bsc) obj3).getClass();
                                Object objB4 = ((qre) m7fVar18.a(jce.a.b(qre.class), null, null)).b(npb.class);
                                objB4.getClass();
                                return (npb) objB4;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7f m7fVar19 = (m7f) obj2;
                                m7fVar19.getClass();
                                ((bsc) obj3).getClass();
                                Object objB5 = ((qre) m7fVar19.a(jce.a.b(qre.class), null, null)).b(b7c.class);
                                objB5.getClass();
                                return (b7c) objB5;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7f m7fVar20 = (m7f) obj2;
                                m7fVar20.getClass();
                                ((bsc) obj3).getClass();
                                Object objB6 = ((qre) m7fVar20.a(jce.a.b(qre.class), null, null)).b(swa.class);
                                objB6.getClass();
                                return (swa) objB6;
                            case 24:
                                m7f m7fVar21 = (m7f) obj2;
                                m7fVar21.getClass();
                                ((bsc) obj3).getClass();
                                Object objB7 = ((qre) m7fVar21.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB7.getClass();
                                return (j2d) objB7;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7f m7fVar22 = (m7f) obj2;
                                m7fVar22.getClass();
                                ((bsc) obj3).getClass();
                                Object objB8 = ((qre) m7fVar22.a(jce.a.b(qre.class), null, null)).b(mkd.class);
                                objB8.getClass();
                                return (mkd) objB8;
                            case 26:
                                m7f m7fVar23 = (m7f) obj2;
                                m7fVar23.getClass();
                                ((bsc) obj3).getClass();
                                Object objB9 = ((qre) m7fVar23.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB9.getClass();
                                return (i8) objB9;
                            case 27:
                                m7f m7fVar24 = (m7f) obj2;
                                m7fVar24.getClass();
                                ((bsc) obj3).getClass();
                                Object objB10 = ((qre) m7fVar24.a(jce.a.b(qre.class), null, null)).b(omd.class);
                                objB10.getClass();
                                return (omd) objB10;
                            case 28:
                                m7f m7fVar25 = (m7f) obj2;
                                m7fVar25.getClass();
                                ((bsc) obj3).getClass();
                                Object objB11 = ((qre) m7fVar25.a(jce.a.b(qre.class), null, null)).b(pxd.class);
                                objB11.getClass();
                                return (pxd) objB11;
                            default:
                                m7f m7fVar26 = (m7f) obj2;
                                m7fVar26.getClass();
                                ((bsc) obj3).getClass();
                                Object objB12 = ((qre) m7fVar26.a(jce.a.b(qre.class), null, null)).b(r0h.class);
                                objB12.getClass();
                                return (r0h) objB12;
                        }
                    }
                }, kq9Var10)));
                oqbVar11.a(new ge7(new qh1(xaiVar5, kceVar9.b(npb.class), null, new pz7() { // from class: c8
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) throws MissingAndroidContextException {
                        int i162 = 1;
                        switch (i7) {
                            case 0:
                                m7f m7fVar = (m7f) obj2;
                                m7fVar.getClass();
                                ((bsc) obj3).getClass();
                                Context contextG = yb5.g(m7fVar);
                                String strM949unboximpl = ((AccountId) m7fVar.a(jce.a.b(AccountId.class), null, null)).m949unboximpl();
                                strM949unboximpl.getClass();
                                SharedPreferences sharedPreferences = contextG.getApplicationContext().getSharedPreferences("account_prefs".concat(strM949unboximpl), 0);
                                sharedPreferences.getClass();
                                return new f8(sharedPreferences);
                            case 1:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                if (v40.a == null) {
                                    synchronized (v40.b) {
                                        if (v40.a == null) {
                                            pl7 pl7VarC = pl7.c();
                                            pl7VarC.a();
                                            v40.a = FirebaseAnalytics.getInstance(pl7VarC.a);
                                        }
                                        break;
                                    }
                                }
                                FirebaseAnalytics firebaseAnalytics = v40.a;
                                firebaseAnalytics.getClass();
                                return firebaseAnalytics;
                            case 2:
                                m7f m7fVar2 = (m7f) obj2;
                                m7fVar2.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar22 = jce.a;
                                return new ll7((FirebaseAnalytics) m7fVar2.a(kceVar22.b(FirebaseAnalytics.class), null, null), (am0) m7fVar2.a(kceVar22.b(am0.class), null, null));
                            case 3:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new kd();
                            case 4:
                                m7f m7fVar3 = (m7f) obj2;
                                m7fVar3.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar32 = jce.a;
                                return new hj((qi3) m7fVar3.a(kceVar32.b(qi3.class), null, null), (fk0) m7fVar3.a(kceVar32.b(fk0.class), null, null), new w9h(new cfk((Context) m7fVar3.a(kceVar32.b(Context.class), null, null))), (g78) m7fVar3.a(kceVar32.b(g78.class), null, null), (h86) m7fVar3.a(kceVar32.b(h86.class), null, null));
                            case 5:
                                m7f m7fVar4 = (m7f) obj2;
                                m7fVar4.getClass();
                                ((bsc) obj3).getClass();
                                return new pl(((doi) m7fVar4.a(jce.a.b(doi.class), null, null)).a("agent_chat"));
                            case 6:
                                m7f m7fVar5 = (m7f) obj2;
                                m7fVar5.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar42 = jce.a;
                                return new fq((dl2) m7fVar5.a(kceVar42.b(dl2.class), null, null), (h86) m7fVar5.a(kceVar42.b(h86.class), null, null), (oda) m7fVar5.a(kceVar42.b(oda.class), null, null), (koi) m7fVar5.a(kceVar42.b(koi.class), null, null));
                            case 7:
                                m7f m7fVar6 = (m7f) obj2;
                                m7fVar6.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar52 = jce.a;
                                return new vm((jwf) m7fVar6.a(kceVar52.b(jwf.class), null, null), (b) m7fVar6.a(kceVar52.b(b.class), null, null), (qzb) m7fVar6.a(kceVar52.b(qzb.class), null, null), (i8c) m7fVar6.a(kceVar52.b(i8c.class), null, null), (pl) m7fVar6.a(kceVar52.b(pl.class), null, null), yb5.g(m7fVar6), (ze0) m7fVar6.a(kceVar52.b(ze0.class), null, null), (koi) m7fVar6.a(kceVar52.b(koi.class), null, null), (i25) m7fVar6.a(kceVar52.b(i25.class), null, null), (hdc) m7fVar6.a(kceVar52.b(hdc.class), null, null), (fq) m7fVar6.a(kceVar52.b(fq.class), null, null), (oda) m7fVar6.a(kceVar52.b(oda.class), null, null), (h86) m7fVar6.a(kceVar52.b(h86.class), null, null), (qi3) m7fVar6.a(kceVar52.b(qi3.class), null, null), (z8c) m7fVar6.a(kceVar52.b(z8c.class), null, null), (j8i) m7fVar6.a(kceVar52.b(j8i.class), null, null), (rc8) m7fVar6.a(kceVar52.b(rc8.class), null, null));
                            case 8:
                                m7f m7fVar7 = (m7f) obj2;
                                m7fVar7.getClass();
                                ((bsc) obj3).getClass();
                                int i172 = lx.a[((AppEnvironment) m7fVar7.a(jce.a.b(AppEnvironment.class), null, null)).ordinal()];
                                if (i172 == 1) {
                                    return "LKJN8LsLERHEOXkw487o7qCTFOrGPimI";
                                }
                                if (i172 == 2 || i172 == 3) {
                                    return "b64sf1kxwDGe1PiSAlv5ixuH0f509RKK";
                                }
                                mr9.b();
                                return null;
                            case 9:
                                m7f m7fVar8 = (m7f) obj2;
                                m7fVar8.getClass();
                                ((bsc) obj3).getClass();
                                mrg mrgVar22 = mx.a;
                                kce kceVar62 = jce.a;
                                return new nff((String) m7fVar8.a(kceVar62.b(String.class), mrgVar22, null), (Context) m7fVar8.a(kceVar62.b(Context.class), null, null), (h86) m7fVar8.a(kceVar62.b(h86.class), null, null), (ud5) m7fVar8.a(kceVar62.b(ud5.class), null, null), (qk5) m7fVar8.a(kceVar62.b(qk5.class), null, null));
                            case 10:
                                m7f m7fVar9 = (m7f) obj2;
                                m7fVar9.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar72 = jce.a;
                                nff nffVar = (nff) m7fVar9.a(kceVar72.b(nff.class), null, null);
                                yw ywVar = gx.Companion;
                                ql8 ql8Var = new ql8(12);
                                ywVar.getClass();
                                gx.K = ql8Var;
                                String str = nffVar.a;
                                if (bsg.I0(str)) {
                                    sz6.p("writeKey cannot be blank ");
                                    return null;
                                }
                                mff mffVar = new mff(new eg4(nffVar.b, str), new el5(nffVar));
                                mffVar.b().a(new e10());
                                mffVar.b().a(new k30());
                                String strA = nffVar.d.a.a();
                                String languageTag = LocaleList.getDefault().get(0).toLanguageTag();
                                languageTag.getClass();
                                mffVar.b().a(new vd5(strA, languageTag));
                                mffVar.b().a(new nk5(i162));
                                mffVar.b().a(new nk5(nffVar.e));
                                boolean z = !((fk0) m7fVar9.a(kceVar72.b(fk0.class), null, null)).o();
                                mffVar.J = z;
                                el5 el5Var = mffVar.F;
                                gb9.D((mp4) el5Var.I, (e45) el5Var.F, null, new ax(mffVar, z, (tp4) null), 2);
                                return mffVar;
                            case 11:
                                m7f m7fVar10 = (m7f) obj2;
                                m7fVar10.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar82 = jce.a;
                                return new com.anthropic.claude.analytics.b((gx) m7fVar10.a(kceVar82.b(gx.class), null, null), (bg9) m7fVar10.a(kceVar82.b(bg9.class), null, null), (qk5) m7fVar10.a(kceVar82.b(qk5.class), null, null));
                            case 12:
                                m7f m7fVar11 = (m7f) obj2;
                                m7fVar11.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar11.a(jce.a.b(com.anthropic.claude.analytics.b.class), null, null);
                            case 13:
                                m7f m7fVar12 = (m7f) obj2;
                                m7fVar12.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar92 = jce.a;
                                fk0 fk0Var = (fk0) m7fVar12.a(kceVar92.b(fk0.class), null, null);
                                t29 t29Var = new t29(m7fVar12.a(kceVar92.b(gx.class), null, null));
                                t29 t29Var2 = new t29(m7fVar12.a(kceVar92.b(FirebaseAnalytics.class), null, null));
                                ((fk0) m7fVar12.a(kceVar92.b(fk0.class), null, null)).o();
                                return new smh(fk0Var, t29Var, t29Var2);
                            case 14:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new ti3();
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7f m7fVar13 = (m7f) obj2;
                                m7fVar13.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar13.a(jce.a.b(ti3.class), null, null);
                            case 16:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new hl8(new wg6(14), new rl7(6));
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7f m7fVar14 = (m7f) obj2;
                                m7fVar14.getClass();
                                ((bsc) obj3).getClass();
                                return new smh((fk0) m7fVar14.a(jce.a.b(fk0.class), null, null), new u0h(bw.G), new u0h(bw.H));
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7f m7fVar15 = (m7f) obj2;
                                m7fVar15.getClass();
                                ((bsc) obj3).getClass();
                                Object objB = ((qre) m7fVar15.a(jce.a.b(qre.class), null, null)).b(tja.class);
                                objB.getClass();
                                return (tja) objB;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7f m7fVar16 = (m7f) obj2;
                                m7fVar16.getClass();
                                ((bsc) obj3).getClass();
                                Object objB2 = ((qre) m7fVar16.a(jce.a.b(qre.class), null, null)).b(t8b.class);
                                objB2.getClass();
                                return (t8b) objB2;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7f m7fVar17 = (m7f) obj2;
                                m7fVar17.getClass();
                                ((bsc) obj3).getClass();
                                Object objB3 = ((qre) m7fVar17.a(jce.a.b(qre.class), null, null)).b(kab.class);
                                objB3.getClass();
                                return (kab) objB3;
                            case 21:
                                m7f m7fVar18 = (m7f) obj2;
                                m7fVar18.getClass();
                                ((bsc) obj3).getClass();
                                Object objB4 = ((qre) m7fVar18.a(jce.a.b(qre.class), null, null)).b(npb.class);
                                objB4.getClass();
                                return (npb) objB4;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7f m7fVar19 = (m7f) obj2;
                                m7fVar19.getClass();
                                ((bsc) obj3).getClass();
                                Object objB5 = ((qre) m7fVar19.a(jce.a.b(qre.class), null, null)).b(b7c.class);
                                objB5.getClass();
                                return (b7c) objB5;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7f m7fVar20 = (m7f) obj2;
                                m7fVar20.getClass();
                                ((bsc) obj3).getClass();
                                Object objB6 = ((qre) m7fVar20.a(jce.a.b(qre.class), null, null)).b(swa.class);
                                objB6.getClass();
                                return (swa) objB6;
                            case 24:
                                m7f m7fVar21 = (m7f) obj2;
                                m7fVar21.getClass();
                                ((bsc) obj3).getClass();
                                Object objB7 = ((qre) m7fVar21.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB7.getClass();
                                return (j2d) objB7;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7f m7fVar22 = (m7f) obj2;
                                m7fVar22.getClass();
                                ((bsc) obj3).getClass();
                                Object objB8 = ((qre) m7fVar22.a(jce.a.b(qre.class), null, null)).b(mkd.class);
                                objB8.getClass();
                                return (mkd) objB8;
                            case 26:
                                m7f m7fVar23 = (m7f) obj2;
                                m7fVar23.getClass();
                                ((bsc) obj3).getClass();
                                Object objB9 = ((qre) m7fVar23.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB9.getClass();
                                return (i8) objB9;
                            case 27:
                                m7f m7fVar24 = (m7f) obj2;
                                m7fVar24.getClass();
                                ((bsc) obj3).getClass();
                                Object objB10 = ((qre) m7fVar24.a(jce.a.b(qre.class), null, null)).b(omd.class);
                                objB10.getClass();
                                return (omd) objB10;
                            case 28:
                                m7f m7fVar25 = (m7f) obj2;
                                m7fVar25.getClass();
                                ((bsc) obj3).getClass();
                                Object objB11 = ((qre) m7fVar25.a(jce.a.b(qre.class), null, null)).b(pxd.class);
                                objB11.getClass();
                                return (pxd) objB11;
                            default:
                                m7f m7fVar26 = (m7f) obj2;
                                m7fVar26.getClass();
                                ((bsc) obj3).getClass();
                                Object objB12 = ((qre) m7fVar26.a(jce.a.b(qre.class), null, null)).b(r0h.class);
                                objB12.getClass();
                                return (r0h) objB12;
                        }
                    }
                }, kq9Var10)));
                final int i36 = 22;
                oqbVar11.a(new ge7(new qh1(xaiVar5, kceVar9.b(b7c.class), null, new pz7() { // from class: c8
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) throws MissingAndroidContextException {
                        int i162 = 1;
                        switch (i36) {
                            case 0:
                                m7f m7fVar = (m7f) obj2;
                                m7fVar.getClass();
                                ((bsc) obj3).getClass();
                                Context contextG = yb5.g(m7fVar);
                                String strM949unboximpl = ((AccountId) m7fVar.a(jce.a.b(AccountId.class), null, null)).m949unboximpl();
                                strM949unboximpl.getClass();
                                SharedPreferences sharedPreferences = contextG.getApplicationContext().getSharedPreferences("account_prefs".concat(strM949unboximpl), 0);
                                sharedPreferences.getClass();
                                return new f8(sharedPreferences);
                            case 1:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                if (v40.a == null) {
                                    synchronized (v40.b) {
                                        if (v40.a == null) {
                                            pl7 pl7VarC = pl7.c();
                                            pl7VarC.a();
                                            v40.a = FirebaseAnalytics.getInstance(pl7VarC.a);
                                        }
                                        break;
                                    }
                                }
                                FirebaseAnalytics firebaseAnalytics = v40.a;
                                firebaseAnalytics.getClass();
                                return firebaseAnalytics;
                            case 2:
                                m7f m7fVar2 = (m7f) obj2;
                                m7fVar2.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar22 = jce.a;
                                return new ll7((FirebaseAnalytics) m7fVar2.a(kceVar22.b(FirebaseAnalytics.class), null, null), (am0) m7fVar2.a(kceVar22.b(am0.class), null, null));
                            case 3:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new kd();
                            case 4:
                                m7f m7fVar3 = (m7f) obj2;
                                m7fVar3.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar32 = jce.a;
                                return new hj((qi3) m7fVar3.a(kceVar32.b(qi3.class), null, null), (fk0) m7fVar3.a(kceVar32.b(fk0.class), null, null), new w9h(new cfk((Context) m7fVar3.a(kceVar32.b(Context.class), null, null))), (g78) m7fVar3.a(kceVar32.b(g78.class), null, null), (h86) m7fVar3.a(kceVar32.b(h86.class), null, null));
                            case 5:
                                m7f m7fVar4 = (m7f) obj2;
                                m7fVar4.getClass();
                                ((bsc) obj3).getClass();
                                return new pl(((doi) m7fVar4.a(jce.a.b(doi.class), null, null)).a("agent_chat"));
                            case 6:
                                m7f m7fVar5 = (m7f) obj2;
                                m7fVar5.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar42 = jce.a;
                                return new fq((dl2) m7fVar5.a(kceVar42.b(dl2.class), null, null), (h86) m7fVar5.a(kceVar42.b(h86.class), null, null), (oda) m7fVar5.a(kceVar42.b(oda.class), null, null), (koi) m7fVar5.a(kceVar42.b(koi.class), null, null));
                            case 7:
                                m7f m7fVar6 = (m7f) obj2;
                                m7fVar6.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar52 = jce.a;
                                return new vm((jwf) m7fVar6.a(kceVar52.b(jwf.class), null, null), (b) m7fVar6.a(kceVar52.b(b.class), null, null), (qzb) m7fVar6.a(kceVar52.b(qzb.class), null, null), (i8c) m7fVar6.a(kceVar52.b(i8c.class), null, null), (pl) m7fVar6.a(kceVar52.b(pl.class), null, null), yb5.g(m7fVar6), (ze0) m7fVar6.a(kceVar52.b(ze0.class), null, null), (koi) m7fVar6.a(kceVar52.b(koi.class), null, null), (i25) m7fVar6.a(kceVar52.b(i25.class), null, null), (hdc) m7fVar6.a(kceVar52.b(hdc.class), null, null), (fq) m7fVar6.a(kceVar52.b(fq.class), null, null), (oda) m7fVar6.a(kceVar52.b(oda.class), null, null), (h86) m7fVar6.a(kceVar52.b(h86.class), null, null), (qi3) m7fVar6.a(kceVar52.b(qi3.class), null, null), (z8c) m7fVar6.a(kceVar52.b(z8c.class), null, null), (j8i) m7fVar6.a(kceVar52.b(j8i.class), null, null), (rc8) m7fVar6.a(kceVar52.b(rc8.class), null, null));
                            case 8:
                                m7f m7fVar7 = (m7f) obj2;
                                m7fVar7.getClass();
                                ((bsc) obj3).getClass();
                                int i172 = lx.a[((AppEnvironment) m7fVar7.a(jce.a.b(AppEnvironment.class), null, null)).ordinal()];
                                if (i172 == 1) {
                                    return "LKJN8LsLERHEOXkw487o7qCTFOrGPimI";
                                }
                                if (i172 == 2 || i172 == 3) {
                                    return "b64sf1kxwDGe1PiSAlv5ixuH0f509RKK";
                                }
                                mr9.b();
                                return null;
                            case 9:
                                m7f m7fVar8 = (m7f) obj2;
                                m7fVar8.getClass();
                                ((bsc) obj3).getClass();
                                mrg mrgVar22 = mx.a;
                                kce kceVar62 = jce.a;
                                return new nff((String) m7fVar8.a(kceVar62.b(String.class), mrgVar22, null), (Context) m7fVar8.a(kceVar62.b(Context.class), null, null), (h86) m7fVar8.a(kceVar62.b(h86.class), null, null), (ud5) m7fVar8.a(kceVar62.b(ud5.class), null, null), (qk5) m7fVar8.a(kceVar62.b(qk5.class), null, null));
                            case 10:
                                m7f m7fVar9 = (m7f) obj2;
                                m7fVar9.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar72 = jce.a;
                                nff nffVar = (nff) m7fVar9.a(kceVar72.b(nff.class), null, null);
                                yw ywVar = gx.Companion;
                                ql8 ql8Var = new ql8(12);
                                ywVar.getClass();
                                gx.K = ql8Var;
                                String str = nffVar.a;
                                if (bsg.I0(str)) {
                                    sz6.p("writeKey cannot be blank ");
                                    return null;
                                }
                                mff mffVar = new mff(new eg4(nffVar.b, str), new el5(nffVar));
                                mffVar.b().a(new e10());
                                mffVar.b().a(new k30());
                                String strA = nffVar.d.a.a();
                                String languageTag = LocaleList.getDefault().get(0).toLanguageTag();
                                languageTag.getClass();
                                mffVar.b().a(new vd5(strA, languageTag));
                                mffVar.b().a(new nk5(i162));
                                mffVar.b().a(new nk5(nffVar.e));
                                boolean z = !((fk0) m7fVar9.a(kceVar72.b(fk0.class), null, null)).o();
                                mffVar.J = z;
                                el5 el5Var = mffVar.F;
                                gb9.D((mp4) el5Var.I, (e45) el5Var.F, null, new ax(mffVar, z, (tp4) null), 2);
                                return mffVar;
                            case 11:
                                m7f m7fVar10 = (m7f) obj2;
                                m7fVar10.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar82 = jce.a;
                                return new com.anthropic.claude.analytics.b((gx) m7fVar10.a(kceVar82.b(gx.class), null, null), (bg9) m7fVar10.a(kceVar82.b(bg9.class), null, null), (qk5) m7fVar10.a(kceVar82.b(qk5.class), null, null));
                            case 12:
                                m7f m7fVar11 = (m7f) obj2;
                                m7fVar11.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar11.a(jce.a.b(com.anthropic.claude.analytics.b.class), null, null);
                            case 13:
                                m7f m7fVar12 = (m7f) obj2;
                                m7fVar12.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar92 = jce.a;
                                fk0 fk0Var = (fk0) m7fVar12.a(kceVar92.b(fk0.class), null, null);
                                t29 t29Var = new t29(m7fVar12.a(kceVar92.b(gx.class), null, null));
                                t29 t29Var2 = new t29(m7fVar12.a(kceVar92.b(FirebaseAnalytics.class), null, null));
                                ((fk0) m7fVar12.a(kceVar92.b(fk0.class), null, null)).o();
                                return new smh(fk0Var, t29Var, t29Var2);
                            case 14:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new ti3();
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7f m7fVar13 = (m7f) obj2;
                                m7fVar13.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar13.a(jce.a.b(ti3.class), null, null);
                            case 16:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new hl8(new wg6(14), new rl7(6));
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7f m7fVar14 = (m7f) obj2;
                                m7fVar14.getClass();
                                ((bsc) obj3).getClass();
                                return new smh((fk0) m7fVar14.a(jce.a.b(fk0.class), null, null), new u0h(bw.G), new u0h(bw.H));
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7f m7fVar15 = (m7f) obj2;
                                m7fVar15.getClass();
                                ((bsc) obj3).getClass();
                                Object objB = ((qre) m7fVar15.a(jce.a.b(qre.class), null, null)).b(tja.class);
                                objB.getClass();
                                return (tja) objB;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7f m7fVar16 = (m7f) obj2;
                                m7fVar16.getClass();
                                ((bsc) obj3).getClass();
                                Object objB2 = ((qre) m7fVar16.a(jce.a.b(qre.class), null, null)).b(t8b.class);
                                objB2.getClass();
                                return (t8b) objB2;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7f m7fVar17 = (m7f) obj2;
                                m7fVar17.getClass();
                                ((bsc) obj3).getClass();
                                Object objB3 = ((qre) m7fVar17.a(jce.a.b(qre.class), null, null)).b(kab.class);
                                objB3.getClass();
                                return (kab) objB3;
                            case 21:
                                m7f m7fVar18 = (m7f) obj2;
                                m7fVar18.getClass();
                                ((bsc) obj3).getClass();
                                Object objB4 = ((qre) m7fVar18.a(jce.a.b(qre.class), null, null)).b(npb.class);
                                objB4.getClass();
                                return (npb) objB4;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7f m7fVar19 = (m7f) obj2;
                                m7fVar19.getClass();
                                ((bsc) obj3).getClass();
                                Object objB5 = ((qre) m7fVar19.a(jce.a.b(qre.class), null, null)).b(b7c.class);
                                objB5.getClass();
                                return (b7c) objB5;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7f m7fVar20 = (m7f) obj2;
                                m7fVar20.getClass();
                                ((bsc) obj3).getClass();
                                Object objB6 = ((qre) m7fVar20.a(jce.a.b(qre.class), null, null)).b(swa.class);
                                objB6.getClass();
                                return (swa) objB6;
                            case 24:
                                m7f m7fVar21 = (m7f) obj2;
                                m7fVar21.getClass();
                                ((bsc) obj3).getClass();
                                Object objB7 = ((qre) m7fVar21.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB7.getClass();
                                return (j2d) objB7;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7f m7fVar22 = (m7f) obj2;
                                m7fVar22.getClass();
                                ((bsc) obj3).getClass();
                                Object objB8 = ((qre) m7fVar22.a(jce.a.b(qre.class), null, null)).b(mkd.class);
                                objB8.getClass();
                                return (mkd) objB8;
                            case 26:
                                m7f m7fVar23 = (m7f) obj2;
                                m7fVar23.getClass();
                                ((bsc) obj3).getClass();
                                Object objB9 = ((qre) m7fVar23.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB9.getClass();
                                return (i8) objB9;
                            case 27:
                                m7f m7fVar24 = (m7f) obj2;
                                m7fVar24.getClass();
                                ((bsc) obj3).getClass();
                                Object objB10 = ((qre) m7fVar24.a(jce.a.b(qre.class), null, null)).b(omd.class);
                                objB10.getClass();
                                return (omd) objB10;
                            case 28:
                                m7f m7fVar25 = (m7f) obj2;
                                m7fVar25.getClass();
                                ((bsc) obj3).getClass();
                                Object objB11 = ((qre) m7fVar25.a(jce.a.b(qre.class), null, null)).b(pxd.class);
                                objB11.getClass();
                                return (pxd) objB11;
                            default:
                                m7f m7fVar26 = (m7f) obj2;
                                m7fVar26.getClass();
                                ((bsc) obj3).getClass();
                                Object objB12 = ((qre) m7fVar26.a(jce.a.b(qre.class), null, null)).b(r0h.class);
                                objB12.getClass();
                                return (r0h) objB12;
                        }
                    }
                }, kq9Var10)));
                final int i37 = 23;
                oqbVar11.a(new ge7(new qh1(xaiVar5, kceVar9.b(swa.class), null, new pz7() { // from class: c8
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) throws MissingAndroidContextException {
                        int i162 = 1;
                        switch (i37) {
                            case 0:
                                m7f m7fVar = (m7f) obj2;
                                m7fVar.getClass();
                                ((bsc) obj3).getClass();
                                Context contextG = yb5.g(m7fVar);
                                String strM949unboximpl = ((AccountId) m7fVar.a(jce.a.b(AccountId.class), null, null)).m949unboximpl();
                                strM949unboximpl.getClass();
                                SharedPreferences sharedPreferences = contextG.getApplicationContext().getSharedPreferences("account_prefs".concat(strM949unboximpl), 0);
                                sharedPreferences.getClass();
                                return new f8(sharedPreferences);
                            case 1:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                if (v40.a == null) {
                                    synchronized (v40.b) {
                                        if (v40.a == null) {
                                            pl7 pl7VarC = pl7.c();
                                            pl7VarC.a();
                                            v40.a = FirebaseAnalytics.getInstance(pl7VarC.a);
                                        }
                                        break;
                                    }
                                }
                                FirebaseAnalytics firebaseAnalytics = v40.a;
                                firebaseAnalytics.getClass();
                                return firebaseAnalytics;
                            case 2:
                                m7f m7fVar2 = (m7f) obj2;
                                m7fVar2.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar22 = jce.a;
                                return new ll7((FirebaseAnalytics) m7fVar2.a(kceVar22.b(FirebaseAnalytics.class), null, null), (am0) m7fVar2.a(kceVar22.b(am0.class), null, null));
                            case 3:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new kd();
                            case 4:
                                m7f m7fVar3 = (m7f) obj2;
                                m7fVar3.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar32 = jce.a;
                                return new hj((qi3) m7fVar3.a(kceVar32.b(qi3.class), null, null), (fk0) m7fVar3.a(kceVar32.b(fk0.class), null, null), new w9h(new cfk((Context) m7fVar3.a(kceVar32.b(Context.class), null, null))), (g78) m7fVar3.a(kceVar32.b(g78.class), null, null), (h86) m7fVar3.a(kceVar32.b(h86.class), null, null));
                            case 5:
                                m7f m7fVar4 = (m7f) obj2;
                                m7fVar4.getClass();
                                ((bsc) obj3).getClass();
                                return new pl(((doi) m7fVar4.a(jce.a.b(doi.class), null, null)).a("agent_chat"));
                            case 6:
                                m7f m7fVar5 = (m7f) obj2;
                                m7fVar5.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar42 = jce.a;
                                return new fq((dl2) m7fVar5.a(kceVar42.b(dl2.class), null, null), (h86) m7fVar5.a(kceVar42.b(h86.class), null, null), (oda) m7fVar5.a(kceVar42.b(oda.class), null, null), (koi) m7fVar5.a(kceVar42.b(koi.class), null, null));
                            case 7:
                                m7f m7fVar6 = (m7f) obj2;
                                m7fVar6.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar52 = jce.a;
                                return new vm((jwf) m7fVar6.a(kceVar52.b(jwf.class), null, null), (b) m7fVar6.a(kceVar52.b(b.class), null, null), (qzb) m7fVar6.a(kceVar52.b(qzb.class), null, null), (i8c) m7fVar6.a(kceVar52.b(i8c.class), null, null), (pl) m7fVar6.a(kceVar52.b(pl.class), null, null), yb5.g(m7fVar6), (ze0) m7fVar6.a(kceVar52.b(ze0.class), null, null), (koi) m7fVar6.a(kceVar52.b(koi.class), null, null), (i25) m7fVar6.a(kceVar52.b(i25.class), null, null), (hdc) m7fVar6.a(kceVar52.b(hdc.class), null, null), (fq) m7fVar6.a(kceVar52.b(fq.class), null, null), (oda) m7fVar6.a(kceVar52.b(oda.class), null, null), (h86) m7fVar6.a(kceVar52.b(h86.class), null, null), (qi3) m7fVar6.a(kceVar52.b(qi3.class), null, null), (z8c) m7fVar6.a(kceVar52.b(z8c.class), null, null), (j8i) m7fVar6.a(kceVar52.b(j8i.class), null, null), (rc8) m7fVar6.a(kceVar52.b(rc8.class), null, null));
                            case 8:
                                m7f m7fVar7 = (m7f) obj2;
                                m7fVar7.getClass();
                                ((bsc) obj3).getClass();
                                int i172 = lx.a[((AppEnvironment) m7fVar7.a(jce.a.b(AppEnvironment.class), null, null)).ordinal()];
                                if (i172 == 1) {
                                    return "LKJN8LsLERHEOXkw487o7qCTFOrGPimI";
                                }
                                if (i172 == 2 || i172 == 3) {
                                    return "b64sf1kxwDGe1PiSAlv5ixuH0f509RKK";
                                }
                                mr9.b();
                                return null;
                            case 9:
                                m7f m7fVar8 = (m7f) obj2;
                                m7fVar8.getClass();
                                ((bsc) obj3).getClass();
                                mrg mrgVar22 = mx.a;
                                kce kceVar62 = jce.a;
                                return new nff((String) m7fVar8.a(kceVar62.b(String.class), mrgVar22, null), (Context) m7fVar8.a(kceVar62.b(Context.class), null, null), (h86) m7fVar8.a(kceVar62.b(h86.class), null, null), (ud5) m7fVar8.a(kceVar62.b(ud5.class), null, null), (qk5) m7fVar8.a(kceVar62.b(qk5.class), null, null));
                            case 10:
                                m7f m7fVar9 = (m7f) obj2;
                                m7fVar9.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar72 = jce.a;
                                nff nffVar = (nff) m7fVar9.a(kceVar72.b(nff.class), null, null);
                                yw ywVar = gx.Companion;
                                ql8 ql8Var = new ql8(12);
                                ywVar.getClass();
                                gx.K = ql8Var;
                                String str = nffVar.a;
                                if (bsg.I0(str)) {
                                    sz6.p("writeKey cannot be blank ");
                                    return null;
                                }
                                mff mffVar = new mff(new eg4(nffVar.b, str), new el5(nffVar));
                                mffVar.b().a(new e10());
                                mffVar.b().a(new k30());
                                String strA = nffVar.d.a.a();
                                String languageTag = LocaleList.getDefault().get(0).toLanguageTag();
                                languageTag.getClass();
                                mffVar.b().a(new vd5(strA, languageTag));
                                mffVar.b().a(new nk5(i162));
                                mffVar.b().a(new nk5(nffVar.e));
                                boolean z = !((fk0) m7fVar9.a(kceVar72.b(fk0.class), null, null)).o();
                                mffVar.J = z;
                                el5 el5Var = mffVar.F;
                                gb9.D((mp4) el5Var.I, (e45) el5Var.F, null, new ax(mffVar, z, (tp4) null), 2);
                                return mffVar;
                            case 11:
                                m7f m7fVar10 = (m7f) obj2;
                                m7fVar10.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar82 = jce.a;
                                return new com.anthropic.claude.analytics.b((gx) m7fVar10.a(kceVar82.b(gx.class), null, null), (bg9) m7fVar10.a(kceVar82.b(bg9.class), null, null), (qk5) m7fVar10.a(kceVar82.b(qk5.class), null, null));
                            case 12:
                                m7f m7fVar11 = (m7f) obj2;
                                m7fVar11.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar11.a(jce.a.b(com.anthropic.claude.analytics.b.class), null, null);
                            case 13:
                                m7f m7fVar12 = (m7f) obj2;
                                m7fVar12.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar92 = jce.a;
                                fk0 fk0Var = (fk0) m7fVar12.a(kceVar92.b(fk0.class), null, null);
                                t29 t29Var = new t29(m7fVar12.a(kceVar92.b(gx.class), null, null));
                                t29 t29Var2 = new t29(m7fVar12.a(kceVar92.b(FirebaseAnalytics.class), null, null));
                                ((fk0) m7fVar12.a(kceVar92.b(fk0.class), null, null)).o();
                                return new smh(fk0Var, t29Var, t29Var2);
                            case 14:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new ti3();
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7f m7fVar13 = (m7f) obj2;
                                m7fVar13.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar13.a(jce.a.b(ti3.class), null, null);
                            case 16:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new hl8(new wg6(14), new rl7(6));
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7f m7fVar14 = (m7f) obj2;
                                m7fVar14.getClass();
                                ((bsc) obj3).getClass();
                                return new smh((fk0) m7fVar14.a(jce.a.b(fk0.class), null, null), new u0h(bw.G), new u0h(bw.H));
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7f m7fVar15 = (m7f) obj2;
                                m7fVar15.getClass();
                                ((bsc) obj3).getClass();
                                Object objB = ((qre) m7fVar15.a(jce.a.b(qre.class), null, null)).b(tja.class);
                                objB.getClass();
                                return (tja) objB;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7f m7fVar16 = (m7f) obj2;
                                m7fVar16.getClass();
                                ((bsc) obj3).getClass();
                                Object objB2 = ((qre) m7fVar16.a(jce.a.b(qre.class), null, null)).b(t8b.class);
                                objB2.getClass();
                                return (t8b) objB2;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7f m7fVar17 = (m7f) obj2;
                                m7fVar17.getClass();
                                ((bsc) obj3).getClass();
                                Object objB3 = ((qre) m7fVar17.a(jce.a.b(qre.class), null, null)).b(kab.class);
                                objB3.getClass();
                                return (kab) objB3;
                            case 21:
                                m7f m7fVar18 = (m7f) obj2;
                                m7fVar18.getClass();
                                ((bsc) obj3).getClass();
                                Object objB4 = ((qre) m7fVar18.a(jce.a.b(qre.class), null, null)).b(npb.class);
                                objB4.getClass();
                                return (npb) objB4;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7f m7fVar19 = (m7f) obj2;
                                m7fVar19.getClass();
                                ((bsc) obj3).getClass();
                                Object objB5 = ((qre) m7fVar19.a(jce.a.b(qre.class), null, null)).b(b7c.class);
                                objB5.getClass();
                                return (b7c) objB5;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7f m7fVar20 = (m7f) obj2;
                                m7fVar20.getClass();
                                ((bsc) obj3).getClass();
                                Object objB6 = ((qre) m7fVar20.a(jce.a.b(qre.class), null, null)).b(swa.class);
                                objB6.getClass();
                                return (swa) objB6;
                            case 24:
                                m7f m7fVar21 = (m7f) obj2;
                                m7fVar21.getClass();
                                ((bsc) obj3).getClass();
                                Object objB7 = ((qre) m7fVar21.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB7.getClass();
                                return (j2d) objB7;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7f m7fVar22 = (m7f) obj2;
                                m7fVar22.getClass();
                                ((bsc) obj3).getClass();
                                Object objB8 = ((qre) m7fVar22.a(jce.a.b(qre.class), null, null)).b(mkd.class);
                                objB8.getClass();
                                return (mkd) objB8;
                            case 26:
                                m7f m7fVar23 = (m7f) obj2;
                                m7fVar23.getClass();
                                ((bsc) obj3).getClass();
                                Object objB9 = ((qre) m7fVar23.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB9.getClass();
                                return (i8) objB9;
                            case 27:
                                m7f m7fVar24 = (m7f) obj2;
                                m7fVar24.getClass();
                                ((bsc) obj3).getClass();
                                Object objB10 = ((qre) m7fVar24.a(jce.a.b(qre.class), null, null)).b(omd.class);
                                objB10.getClass();
                                return (omd) objB10;
                            case 28:
                                m7f m7fVar25 = (m7f) obj2;
                                m7fVar25.getClass();
                                ((bsc) obj3).getClass();
                                Object objB11 = ((qre) m7fVar25.a(jce.a.b(qre.class), null, null)).b(pxd.class);
                                objB11.getClass();
                                return (pxd) objB11;
                            default:
                                m7f m7fVar26 = (m7f) obj2;
                                m7fVar26.getClass();
                                ((bsc) obj3).getClass();
                                Object objB12 = ((qre) m7fVar26.a(jce.a.b(qre.class), null, null)).b(r0h.class);
                                objB12.getClass();
                                return (r0h) objB12;
                        }
                    }
                }, kq9Var10)));
                final int i38 = 24;
                oqbVar11.a(new ge7(new qh1(xaiVar5, kceVar9.b(j2d.class), null, new pz7() { // from class: c8
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) throws MissingAndroidContextException {
                        int i162 = 1;
                        switch (i38) {
                            case 0:
                                m7f m7fVar = (m7f) obj2;
                                m7fVar.getClass();
                                ((bsc) obj3).getClass();
                                Context contextG = yb5.g(m7fVar);
                                String strM949unboximpl = ((AccountId) m7fVar.a(jce.a.b(AccountId.class), null, null)).m949unboximpl();
                                strM949unboximpl.getClass();
                                SharedPreferences sharedPreferences = contextG.getApplicationContext().getSharedPreferences("account_prefs".concat(strM949unboximpl), 0);
                                sharedPreferences.getClass();
                                return new f8(sharedPreferences);
                            case 1:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                if (v40.a == null) {
                                    synchronized (v40.b) {
                                        if (v40.a == null) {
                                            pl7 pl7VarC = pl7.c();
                                            pl7VarC.a();
                                            v40.a = FirebaseAnalytics.getInstance(pl7VarC.a);
                                        }
                                        break;
                                    }
                                }
                                FirebaseAnalytics firebaseAnalytics = v40.a;
                                firebaseAnalytics.getClass();
                                return firebaseAnalytics;
                            case 2:
                                m7f m7fVar2 = (m7f) obj2;
                                m7fVar2.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar22 = jce.a;
                                return new ll7((FirebaseAnalytics) m7fVar2.a(kceVar22.b(FirebaseAnalytics.class), null, null), (am0) m7fVar2.a(kceVar22.b(am0.class), null, null));
                            case 3:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new kd();
                            case 4:
                                m7f m7fVar3 = (m7f) obj2;
                                m7fVar3.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar32 = jce.a;
                                return new hj((qi3) m7fVar3.a(kceVar32.b(qi3.class), null, null), (fk0) m7fVar3.a(kceVar32.b(fk0.class), null, null), new w9h(new cfk((Context) m7fVar3.a(kceVar32.b(Context.class), null, null))), (g78) m7fVar3.a(kceVar32.b(g78.class), null, null), (h86) m7fVar3.a(kceVar32.b(h86.class), null, null));
                            case 5:
                                m7f m7fVar4 = (m7f) obj2;
                                m7fVar4.getClass();
                                ((bsc) obj3).getClass();
                                return new pl(((doi) m7fVar4.a(jce.a.b(doi.class), null, null)).a("agent_chat"));
                            case 6:
                                m7f m7fVar5 = (m7f) obj2;
                                m7fVar5.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar42 = jce.a;
                                return new fq((dl2) m7fVar5.a(kceVar42.b(dl2.class), null, null), (h86) m7fVar5.a(kceVar42.b(h86.class), null, null), (oda) m7fVar5.a(kceVar42.b(oda.class), null, null), (koi) m7fVar5.a(kceVar42.b(koi.class), null, null));
                            case 7:
                                m7f m7fVar6 = (m7f) obj2;
                                m7fVar6.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar52 = jce.a;
                                return new vm((jwf) m7fVar6.a(kceVar52.b(jwf.class), null, null), (b) m7fVar6.a(kceVar52.b(b.class), null, null), (qzb) m7fVar6.a(kceVar52.b(qzb.class), null, null), (i8c) m7fVar6.a(kceVar52.b(i8c.class), null, null), (pl) m7fVar6.a(kceVar52.b(pl.class), null, null), yb5.g(m7fVar6), (ze0) m7fVar6.a(kceVar52.b(ze0.class), null, null), (koi) m7fVar6.a(kceVar52.b(koi.class), null, null), (i25) m7fVar6.a(kceVar52.b(i25.class), null, null), (hdc) m7fVar6.a(kceVar52.b(hdc.class), null, null), (fq) m7fVar6.a(kceVar52.b(fq.class), null, null), (oda) m7fVar6.a(kceVar52.b(oda.class), null, null), (h86) m7fVar6.a(kceVar52.b(h86.class), null, null), (qi3) m7fVar6.a(kceVar52.b(qi3.class), null, null), (z8c) m7fVar6.a(kceVar52.b(z8c.class), null, null), (j8i) m7fVar6.a(kceVar52.b(j8i.class), null, null), (rc8) m7fVar6.a(kceVar52.b(rc8.class), null, null));
                            case 8:
                                m7f m7fVar7 = (m7f) obj2;
                                m7fVar7.getClass();
                                ((bsc) obj3).getClass();
                                int i172 = lx.a[((AppEnvironment) m7fVar7.a(jce.a.b(AppEnvironment.class), null, null)).ordinal()];
                                if (i172 == 1) {
                                    return "LKJN8LsLERHEOXkw487o7qCTFOrGPimI";
                                }
                                if (i172 == 2 || i172 == 3) {
                                    return "b64sf1kxwDGe1PiSAlv5ixuH0f509RKK";
                                }
                                mr9.b();
                                return null;
                            case 9:
                                m7f m7fVar8 = (m7f) obj2;
                                m7fVar8.getClass();
                                ((bsc) obj3).getClass();
                                mrg mrgVar22 = mx.a;
                                kce kceVar62 = jce.a;
                                return new nff((String) m7fVar8.a(kceVar62.b(String.class), mrgVar22, null), (Context) m7fVar8.a(kceVar62.b(Context.class), null, null), (h86) m7fVar8.a(kceVar62.b(h86.class), null, null), (ud5) m7fVar8.a(kceVar62.b(ud5.class), null, null), (qk5) m7fVar8.a(kceVar62.b(qk5.class), null, null));
                            case 10:
                                m7f m7fVar9 = (m7f) obj2;
                                m7fVar9.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar72 = jce.a;
                                nff nffVar = (nff) m7fVar9.a(kceVar72.b(nff.class), null, null);
                                yw ywVar = gx.Companion;
                                ql8 ql8Var = new ql8(12);
                                ywVar.getClass();
                                gx.K = ql8Var;
                                String str = nffVar.a;
                                if (bsg.I0(str)) {
                                    sz6.p("writeKey cannot be blank ");
                                    return null;
                                }
                                mff mffVar = new mff(new eg4(nffVar.b, str), new el5(nffVar));
                                mffVar.b().a(new e10());
                                mffVar.b().a(new k30());
                                String strA = nffVar.d.a.a();
                                String languageTag = LocaleList.getDefault().get(0).toLanguageTag();
                                languageTag.getClass();
                                mffVar.b().a(new vd5(strA, languageTag));
                                mffVar.b().a(new nk5(i162));
                                mffVar.b().a(new nk5(nffVar.e));
                                boolean z = !((fk0) m7fVar9.a(kceVar72.b(fk0.class), null, null)).o();
                                mffVar.J = z;
                                el5 el5Var = mffVar.F;
                                gb9.D((mp4) el5Var.I, (e45) el5Var.F, null, new ax(mffVar, z, (tp4) null), 2);
                                return mffVar;
                            case 11:
                                m7f m7fVar10 = (m7f) obj2;
                                m7fVar10.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar82 = jce.a;
                                return new com.anthropic.claude.analytics.b((gx) m7fVar10.a(kceVar82.b(gx.class), null, null), (bg9) m7fVar10.a(kceVar82.b(bg9.class), null, null), (qk5) m7fVar10.a(kceVar82.b(qk5.class), null, null));
                            case 12:
                                m7f m7fVar11 = (m7f) obj2;
                                m7fVar11.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar11.a(jce.a.b(com.anthropic.claude.analytics.b.class), null, null);
                            case 13:
                                m7f m7fVar12 = (m7f) obj2;
                                m7fVar12.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar92 = jce.a;
                                fk0 fk0Var = (fk0) m7fVar12.a(kceVar92.b(fk0.class), null, null);
                                t29 t29Var = new t29(m7fVar12.a(kceVar92.b(gx.class), null, null));
                                t29 t29Var2 = new t29(m7fVar12.a(kceVar92.b(FirebaseAnalytics.class), null, null));
                                ((fk0) m7fVar12.a(kceVar92.b(fk0.class), null, null)).o();
                                return new smh(fk0Var, t29Var, t29Var2);
                            case 14:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new ti3();
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7f m7fVar13 = (m7f) obj2;
                                m7fVar13.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar13.a(jce.a.b(ti3.class), null, null);
                            case 16:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new hl8(new wg6(14), new rl7(6));
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7f m7fVar14 = (m7f) obj2;
                                m7fVar14.getClass();
                                ((bsc) obj3).getClass();
                                return new smh((fk0) m7fVar14.a(jce.a.b(fk0.class), null, null), new u0h(bw.G), new u0h(bw.H));
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7f m7fVar15 = (m7f) obj2;
                                m7fVar15.getClass();
                                ((bsc) obj3).getClass();
                                Object objB = ((qre) m7fVar15.a(jce.a.b(qre.class), null, null)).b(tja.class);
                                objB.getClass();
                                return (tja) objB;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7f m7fVar16 = (m7f) obj2;
                                m7fVar16.getClass();
                                ((bsc) obj3).getClass();
                                Object objB2 = ((qre) m7fVar16.a(jce.a.b(qre.class), null, null)).b(t8b.class);
                                objB2.getClass();
                                return (t8b) objB2;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7f m7fVar17 = (m7f) obj2;
                                m7fVar17.getClass();
                                ((bsc) obj3).getClass();
                                Object objB3 = ((qre) m7fVar17.a(jce.a.b(qre.class), null, null)).b(kab.class);
                                objB3.getClass();
                                return (kab) objB3;
                            case 21:
                                m7f m7fVar18 = (m7f) obj2;
                                m7fVar18.getClass();
                                ((bsc) obj3).getClass();
                                Object objB4 = ((qre) m7fVar18.a(jce.a.b(qre.class), null, null)).b(npb.class);
                                objB4.getClass();
                                return (npb) objB4;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7f m7fVar19 = (m7f) obj2;
                                m7fVar19.getClass();
                                ((bsc) obj3).getClass();
                                Object objB5 = ((qre) m7fVar19.a(jce.a.b(qre.class), null, null)).b(b7c.class);
                                objB5.getClass();
                                return (b7c) objB5;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7f m7fVar20 = (m7f) obj2;
                                m7fVar20.getClass();
                                ((bsc) obj3).getClass();
                                Object objB6 = ((qre) m7fVar20.a(jce.a.b(qre.class), null, null)).b(swa.class);
                                objB6.getClass();
                                return (swa) objB6;
                            case 24:
                                m7f m7fVar21 = (m7f) obj2;
                                m7fVar21.getClass();
                                ((bsc) obj3).getClass();
                                Object objB7 = ((qre) m7fVar21.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB7.getClass();
                                return (j2d) objB7;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7f m7fVar22 = (m7f) obj2;
                                m7fVar22.getClass();
                                ((bsc) obj3).getClass();
                                Object objB8 = ((qre) m7fVar22.a(jce.a.b(qre.class), null, null)).b(mkd.class);
                                objB8.getClass();
                                return (mkd) objB8;
                            case 26:
                                m7f m7fVar23 = (m7f) obj2;
                                m7fVar23.getClass();
                                ((bsc) obj3).getClass();
                                Object objB9 = ((qre) m7fVar23.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB9.getClass();
                                return (i8) objB9;
                            case 27:
                                m7f m7fVar24 = (m7f) obj2;
                                m7fVar24.getClass();
                                ((bsc) obj3).getClass();
                                Object objB10 = ((qre) m7fVar24.a(jce.a.b(qre.class), null, null)).b(omd.class);
                                objB10.getClass();
                                return (omd) objB10;
                            case 28:
                                m7f m7fVar25 = (m7f) obj2;
                                m7fVar25.getClass();
                                ((bsc) obj3).getClass();
                                Object objB11 = ((qre) m7fVar25.a(jce.a.b(qre.class), null, null)).b(pxd.class);
                                objB11.getClass();
                                return (pxd) objB11;
                            default:
                                m7f m7fVar26 = (m7f) obj2;
                                m7fVar26.getClass();
                                ((bsc) obj3).getClass();
                                Object objB12 = ((qre) m7fVar26.a(jce.a.b(qre.class), null, null)).b(r0h.class);
                                objB12.getClass();
                                return (r0h) objB12;
                        }
                    }
                }, kq9Var10)));
                final int i39 = 25;
                oqbVar11.a(new ge7(new qh1(xaiVar5, kceVar9.b(mkd.class), null, new pz7() { // from class: c8
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) throws MissingAndroidContextException {
                        int i162 = 1;
                        switch (i39) {
                            case 0:
                                m7f m7fVar = (m7f) obj2;
                                m7fVar.getClass();
                                ((bsc) obj3).getClass();
                                Context contextG = yb5.g(m7fVar);
                                String strM949unboximpl = ((AccountId) m7fVar.a(jce.a.b(AccountId.class), null, null)).m949unboximpl();
                                strM949unboximpl.getClass();
                                SharedPreferences sharedPreferences = contextG.getApplicationContext().getSharedPreferences("account_prefs".concat(strM949unboximpl), 0);
                                sharedPreferences.getClass();
                                return new f8(sharedPreferences);
                            case 1:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                if (v40.a == null) {
                                    synchronized (v40.b) {
                                        if (v40.a == null) {
                                            pl7 pl7VarC = pl7.c();
                                            pl7VarC.a();
                                            v40.a = FirebaseAnalytics.getInstance(pl7VarC.a);
                                        }
                                        break;
                                    }
                                }
                                FirebaseAnalytics firebaseAnalytics = v40.a;
                                firebaseAnalytics.getClass();
                                return firebaseAnalytics;
                            case 2:
                                m7f m7fVar2 = (m7f) obj2;
                                m7fVar2.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar22 = jce.a;
                                return new ll7((FirebaseAnalytics) m7fVar2.a(kceVar22.b(FirebaseAnalytics.class), null, null), (am0) m7fVar2.a(kceVar22.b(am0.class), null, null));
                            case 3:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new kd();
                            case 4:
                                m7f m7fVar3 = (m7f) obj2;
                                m7fVar3.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar32 = jce.a;
                                return new hj((qi3) m7fVar3.a(kceVar32.b(qi3.class), null, null), (fk0) m7fVar3.a(kceVar32.b(fk0.class), null, null), new w9h(new cfk((Context) m7fVar3.a(kceVar32.b(Context.class), null, null))), (g78) m7fVar3.a(kceVar32.b(g78.class), null, null), (h86) m7fVar3.a(kceVar32.b(h86.class), null, null));
                            case 5:
                                m7f m7fVar4 = (m7f) obj2;
                                m7fVar4.getClass();
                                ((bsc) obj3).getClass();
                                return new pl(((doi) m7fVar4.a(jce.a.b(doi.class), null, null)).a("agent_chat"));
                            case 6:
                                m7f m7fVar5 = (m7f) obj2;
                                m7fVar5.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar42 = jce.a;
                                return new fq((dl2) m7fVar5.a(kceVar42.b(dl2.class), null, null), (h86) m7fVar5.a(kceVar42.b(h86.class), null, null), (oda) m7fVar5.a(kceVar42.b(oda.class), null, null), (koi) m7fVar5.a(kceVar42.b(koi.class), null, null));
                            case 7:
                                m7f m7fVar6 = (m7f) obj2;
                                m7fVar6.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar52 = jce.a;
                                return new vm((jwf) m7fVar6.a(kceVar52.b(jwf.class), null, null), (b) m7fVar6.a(kceVar52.b(b.class), null, null), (qzb) m7fVar6.a(kceVar52.b(qzb.class), null, null), (i8c) m7fVar6.a(kceVar52.b(i8c.class), null, null), (pl) m7fVar6.a(kceVar52.b(pl.class), null, null), yb5.g(m7fVar6), (ze0) m7fVar6.a(kceVar52.b(ze0.class), null, null), (koi) m7fVar6.a(kceVar52.b(koi.class), null, null), (i25) m7fVar6.a(kceVar52.b(i25.class), null, null), (hdc) m7fVar6.a(kceVar52.b(hdc.class), null, null), (fq) m7fVar6.a(kceVar52.b(fq.class), null, null), (oda) m7fVar6.a(kceVar52.b(oda.class), null, null), (h86) m7fVar6.a(kceVar52.b(h86.class), null, null), (qi3) m7fVar6.a(kceVar52.b(qi3.class), null, null), (z8c) m7fVar6.a(kceVar52.b(z8c.class), null, null), (j8i) m7fVar6.a(kceVar52.b(j8i.class), null, null), (rc8) m7fVar6.a(kceVar52.b(rc8.class), null, null));
                            case 8:
                                m7f m7fVar7 = (m7f) obj2;
                                m7fVar7.getClass();
                                ((bsc) obj3).getClass();
                                int i172 = lx.a[((AppEnvironment) m7fVar7.a(jce.a.b(AppEnvironment.class), null, null)).ordinal()];
                                if (i172 == 1) {
                                    return "LKJN8LsLERHEOXkw487o7qCTFOrGPimI";
                                }
                                if (i172 == 2 || i172 == 3) {
                                    return "b64sf1kxwDGe1PiSAlv5ixuH0f509RKK";
                                }
                                mr9.b();
                                return null;
                            case 9:
                                m7f m7fVar8 = (m7f) obj2;
                                m7fVar8.getClass();
                                ((bsc) obj3).getClass();
                                mrg mrgVar22 = mx.a;
                                kce kceVar62 = jce.a;
                                return new nff((String) m7fVar8.a(kceVar62.b(String.class), mrgVar22, null), (Context) m7fVar8.a(kceVar62.b(Context.class), null, null), (h86) m7fVar8.a(kceVar62.b(h86.class), null, null), (ud5) m7fVar8.a(kceVar62.b(ud5.class), null, null), (qk5) m7fVar8.a(kceVar62.b(qk5.class), null, null));
                            case 10:
                                m7f m7fVar9 = (m7f) obj2;
                                m7fVar9.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar72 = jce.a;
                                nff nffVar = (nff) m7fVar9.a(kceVar72.b(nff.class), null, null);
                                yw ywVar = gx.Companion;
                                ql8 ql8Var = new ql8(12);
                                ywVar.getClass();
                                gx.K = ql8Var;
                                String str = nffVar.a;
                                if (bsg.I0(str)) {
                                    sz6.p("writeKey cannot be blank ");
                                    return null;
                                }
                                mff mffVar = new mff(new eg4(nffVar.b, str), new el5(nffVar));
                                mffVar.b().a(new e10());
                                mffVar.b().a(new k30());
                                String strA = nffVar.d.a.a();
                                String languageTag = LocaleList.getDefault().get(0).toLanguageTag();
                                languageTag.getClass();
                                mffVar.b().a(new vd5(strA, languageTag));
                                mffVar.b().a(new nk5(i162));
                                mffVar.b().a(new nk5(nffVar.e));
                                boolean z = !((fk0) m7fVar9.a(kceVar72.b(fk0.class), null, null)).o();
                                mffVar.J = z;
                                el5 el5Var = mffVar.F;
                                gb9.D((mp4) el5Var.I, (e45) el5Var.F, null, new ax(mffVar, z, (tp4) null), 2);
                                return mffVar;
                            case 11:
                                m7f m7fVar10 = (m7f) obj2;
                                m7fVar10.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar82 = jce.a;
                                return new com.anthropic.claude.analytics.b((gx) m7fVar10.a(kceVar82.b(gx.class), null, null), (bg9) m7fVar10.a(kceVar82.b(bg9.class), null, null), (qk5) m7fVar10.a(kceVar82.b(qk5.class), null, null));
                            case 12:
                                m7f m7fVar11 = (m7f) obj2;
                                m7fVar11.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar11.a(jce.a.b(com.anthropic.claude.analytics.b.class), null, null);
                            case 13:
                                m7f m7fVar12 = (m7f) obj2;
                                m7fVar12.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar92 = jce.a;
                                fk0 fk0Var = (fk0) m7fVar12.a(kceVar92.b(fk0.class), null, null);
                                t29 t29Var = new t29(m7fVar12.a(kceVar92.b(gx.class), null, null));
                                t29 t29Var2 = new t29(m7fVar12.a(kceVar92.b(FirebaseAnalytics.class), null, null));
                                ((fk0) m7fVar12.a(kceVar92.b(fk0.class), null, null)).o();
                                return new smh(fk0Var, t29Var, t29Var2);
                            case 14:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new ti3();
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7f m7fVar13 = (m7f) obj2;
                                m7fVar13.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar13.a(jce.a.b(ti3.class), null, null);
                            case 16:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new hl8(new wg6(14), new rl7(6));
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7f m7fVar14 = (m7f) obj2;
                                m7fVar14.getClass();
                                ((bsc) obj3).getClass();
                                return new smh((fk0) m7fVar14.a(jce.a.b(fk0.class), null, null), new u0h(bw.G), new u0h(bw.H));
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7f m7fVar15 = (m7f) obj2;
                                m7fVar15.getClass();
                                ((bsc) obj3).getClass();
                                Object objB = ((qre) m7fVar15.a(jce.a.b(qre.class), null, null)).b(tja.class);
                                objB.getClass();
                                return (tja) objB;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7f m7fVar16 = (m7f) obj2;
                                m7fVar16.getClass();
                                ((bsc) obj3).getClass();
                                Object objB2 = ((qre) m7fVar16.a(jce.a.b(qre.class), null, null)).b(t8b.class);
                                objB2.getClass();
                                return (t8b) objB2;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7f m7fVar17 = (m7f) obj2;
                                m7fVar17.getClass();
                                ((bsc) obj3).getClass();
                                Object objB3 = ((qre) m7fVar17.a(jce.a.b(qre.class), null, null)).b(kab.class);
                                objB3.getClass();
                                return (kab) objB3;
                            case 21:
                                m7f m7fVar18 = (m7f) obj2;
                                m7fVar18.getClass();
                                ((bsc) obj3).getClass();
                                Object objB4 = ((qre) m7fVar18.a(jce.a.b(qre.class), null, null)).b(npb.class);
                                objB4.getClass();
                                return (npb) objB4;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7f m7fVar19 = (m7f) obj2;
                                m7fVar19.getClass();
                                ((bsc) obj3).getClass();
                                Object objB5 = ((qre) m7fVar19.a(jce.a.b(qre.class), null, null)).b(b7c.class);
                                objB5.getClass();
                                return (b7c) objB5;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7f m7fVar20 = (m7f) obj2;
                                m7fVar20.getClass();
                                ((bsc) obj3).getClass();
                                Object objB6 = ((qre) m7fVar20.a(jce.a.b(qre.class), null, null)).b(swa.class);
                                objB6.getClass();
                                return (swa) objB6;
                            case 24:
                                m7f m7fVar21 = (m7f) obj2;
                                m7fVar21.getClass();
                                ((bsc) obj3).getClass();
                                Object objB7 = ((qre) m7fVar21.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB7.getClass();
                                return (j2d) objB7;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7f m7fVar22 = (m7f) obj2;
                                m7fVar22.getClass();
                                ((bsc) obj3).getClass();
                                Object objB8 = ((qre) m7fVar22.a(jce.a.b(qre.class), null, null)).b(mkd.class);
                                objB8.getClass();
                                return (mkd) objB8;
                            case 26:
                                m7f m7fVar23 = (m7f) obj2;
                                m7fVar23.getClass();
                                ((bsc) obj3).getClass();
                                Object objB9 = ((qre) m7fVar23.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB9.getClass();
                                return (i8) objB9;
                            case 27:
                                m7f m7fVar24 = (m7f) obj2;
                                m7fVar24.getClass();
                                ((bsc) obj3).getClass();
                                Object objB10 = ((qre) m7fVar24.a(jce.a.b(qre.class), null, null)).b(omd.class);
                                objB10.getClass();
                                return (omd) objB10;
                            case 28:
                                m7f m7fVar25 = (m7f) obj2;
                                m7fVar25.getClass();
                                ((bsc) obj3).getClass();
                                Object objB11 = ((qre) m7fVar25.a(jce.a.b(qre.class), null, null)).b(pxd.class);
                                objB11.getClass();
                                return (pxd) objB11;
                            default:
                                m7f m7fVar26 = (m7f) obj2;
                                m7fVar26.getClass();
                                ((bsc) obj3).getClass();
                                Object objB12 = ((qre) m7fVar26.a(jce.a.b(qre.class), null, null)).b(r0h.class);
                                objB12.getClass();
                                return (r0h) objB12;
                        }
                    }
                }, kq9Var10)));
                final int i40 = 27;
                oqbVar11.a(new ge7(new qh1(xaiVar5, kceVar9.b(omd.class), null, new pz7() { // from class: c8
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) throws MissingAndroidContextException {
                        int i162 = 1;
                        switch (i40) {
                            case 0:
                                m7f m7fVar = (m7f) obj2;
                                m7fVar.getClass();
                                ((bsc) obj3).getClass();
                                Context contextG = yb5.g(m7fVar);
                                String strM949unboximpl = ((AccountId) m7fVar.a(jce.a.b(AccountId.class), null, null)).m949unboximpl();
                                strM949unboximpl.getClass();
                                SharedPreferences sharedPreferences = contextG.getApplicationContext().getSharedPreferences("account_prefs".concat(strM949unboximpl), 0);
                                sharedPreferences.getClass();
                                return new f8(sharedPreferences);
                            case 1:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                if (v40.a == null) {
                                    synchronized (v40.b) {
                                        if (v40.a == null) {
                                            pl7 pl7VarC = pl7.c();
                                            pl7VarC.a();
                                            v40.a = FirebaseAnalytics.getInstance(pl7VarC.a);
                                        }
                                        break;
                                    }
                                }
                                FirebaseAnalytics firebaseAnalytics = v40.a;
                                firebaseAnalytics.getClass();
                                return firebaseAnalytics;
                            case 2:
                                m7f m7fVar2 = (m7f) obj2;
                                m7fVar2.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar22 = jce.a;
                                return new ll7((FirebaseAnalytics) m7fVar2.a(kceVar22.b(FirebaseAnalytics.class), null, null), (am0) m7fVar2.a(kceVar22.b(am0.class), null, null));
                            case 3:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new kd();
                            case 4:
                                m7f m7fVar3 = (m7f) obj2;
                                m7fVar3.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar32 = jce.a;
                                return new hj((qi3) m7fVar3.a(kceVar32.b(qi3.class), null, null), (fk0) m7fVar3.a(kceVar32.b(fk0.class), null, null), new w9h(new cfk((Context) m7fVar3.a(kceVar32.b(Context.class), null, null))), (g78) m7fVar3.a(kceVar32.b(g78.class), null, null), (h86) m7fVar3.a(kceVar32.b(h86.class), null, null));
                            case 5:
                                m7f m7fVar4 = (m7f) obj2;
                                m7fVar4.getClass();
                                ((bsc) obj3).getClass();
                                return new pl(((doi) m7fVar4.a(jce.a.b(doi.class), null, null)).a("agent_chat"));
                            case 6:
                                m7f m7fVar5 = (m7f) obj2;
                                m7fVar5.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar42 = jce.a;
                                return new fq((dl2) m7fVar5.a(kceVar42.b(dl2.class), null, null), (h86) m7fVar5.a(kceVar42.b(h86.class), null, null), (oda) m7fVar5.a(kceVar42.b(oda.class), null, null), (koi) m7fVar5.a(kceVar42.b(koi.class), null, null));
                            case 7:
                                m7f m7fVar6 = (m7f) obj2;
                                m7fVar6.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar52 = jce.a;
                                return new vm((jwf) m7fVar6.a(kceVar52.b(jwf.class), null, null), (b) m7fVar6.a(kceVar52.b(b.class), null, null), (qzb) m7fVar6.a(kceVar52.b(qzb.class), null, null), (i8c) m7fVar6.a(kceVar52.b(i8c.class), null, null), (pl) m7fVar6.a(kceVar52.b(pl.class), null, null), yb5.g(m7fVar6), (ze0) m7fVar6.a(kceVar52.b(ze0.class), null, null), (koi) m7fVar6.a(kceVar52.b(koi.class), null, null), (i25) m7fVar6.a(kceVar52.b(i25.class), null, null), (hdc) m7fVar6.a(kceVar52.b(hdc.class), null, null), (fq) m7fVar6.a(kceVar52.b(fq.class), null, null), (oda) m7fVar6.a(kceVar52.b(oda.class), null, null), (h86) m7fVar6.a(kceVar52.b(h86.class), null, null), (qi3) m7fVar6.a(kceVar52.b(qi3.class), null, null), (z8c) m7fVar6.a(kceVar52.b(z8c.class), null, null), (j8i) m7fVar6.a(kceVar52.b(j8i.class), null, null), (rc8) m7fVar6.a(kceVar52.b(rc8.class), null, null));
                            case 8:
                                m7f m7fVar7 = (m7f) obj2;
                                m7fVar7.getClass();
                                ((bsc) obj3).getClass();
                                int i172 = lx.a[((AppEnvironment) m7fVar7.a(jce.a.b(AppEnvironment.class), null, null)).ordinal()];
                                if (i172 == 1) {
                                    return "LKJN8LsLERHEOXkw487o7qCTFOrGPimI";
                                }
                                if (i172 == 2 || i172 == 3) {
                                    return "b64sf1kxwDGe1PiSAlv5ixuH0f509RKK";
                                }
                                mr9.b();
                                return null;
                            case 9:
                                m7f m7fVar8 = (m7f) obj2;
                                m7fVar8.getClass();
                                ((bsc) obj3).getClass();
                                mrg mrgVar22 = mx.a;
                                kce kceVar62 = jce.a;
                                return new nff((String) m7fVar8.a(kceVar62.b(String.class), mrgVar22, null), (Context) m7fVar8.a(kceVar62.b(Context.class), null, null), (h86) m7fVar8.a(kceVar62.b(h86.class), null, null), (ud5) m7fVar8.a(kceVar62.b(ud5.class), null, null), (qk5) m7fVar8.a(kceVar62.b(qk5.class), null, null));
                            case 10:
                                m7f m7fVar9 = (m7f) obj2;
                                m7fVar9.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar72 = jce.a;
                                nff nffVar = (nff) m7fVar9.a(kceVar72.b(nff.class), null, null);
                                yw ywVar = gx.Companion;
                                ql8 ql8Var = new ql8(12);
                                ywVar.getClass();
                                gx.K = ql8Var;
                                String str = nffVar.a;
                                if (bsg.I0(str)) {
                                    sz6.p("writeKey cannot be blank ");
                                    return null;
                                }
                                mff mffVar = new mff(new eg4(nffVar.b, str), new el5(nffVar));
                                mffVar.b().a(new e10());
                                mffVar.b().a(new k30());
                                String strA = nffVar.d.a.a();
                                String languageTag = LocaleList.getDefault().get(0).toLanguageTag();
                                languageTag.getClass();
                                mffVar.b().a(new vd5(strA, languageTag));
                                mffVar.b().a(new nk5(i162));
                                mffVar.b().a(new nk5(nffVar.e));
                                boolean z = !((fk0) m7fVar9.a(kceVar72.b(fk0.class), null, null)).o();
                                mffVar.J = z;
                                el5 el5Var = mffVar.F;
                                gb9.D((mp4) el5Var.I, (e45) el5Var.F, null, new ax(mffVar, z, (tp4) null), 2);
                                return mffVar;
                            case 11:
                                m7f m7fVar10 = (m7f) obj2;
                                m7fVar10.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar82 = jce.a;
                                return new com.anthropic.claude.analytics.b((gx) m7fVar10.a(kceVar82.b(gx.class), null, null), (bg9) m7fVar10.a(kceVar82.b(bg9.class), null, null), (qk5) m7fVar10.a(kceVar82.b(qk5.class), null, null));
                            case 12:
                                m7f m7fVar11 = (m7f) obj2;
                                m7fVar11.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar11.a(jce.a.b(com.anthropic.claude.analytics.b.class), null, null);
                            case 13:
                                m7f m7fVar12 = (m7f) obj2;
                                m7fVar12.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar92 = jce.a;
                                fk0 fk0Var = (fk0) m7fVar12.a(kceVar92.b(fk0.class), null, null);
                                t29 t29Var = new t29(m7fVar12.a(kceVar92.b(gx.class), null, null));
                                t29 t29Var2 = new t29(m7fVar12.a(kceVar92.b(FirebaseAnalytics.class), null, null));
                                ((fk0) m7fVar12.a(kceVar92.b(fk0.class), null, null)).o();
                                return new smh(fk0Var, t29Var, t29Var2);
                            case 14:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new ti3();
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7f m7fVar13 = (m7f) obj2;
                                m7fVar13.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar13.a(jce.a.b(ti3.class), null, null);
                            case 16:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new hl8(new wg6(14), new rl7(6));
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7f m7fVar14 = (m7f) obj2;
                                m7fVar14.getClass();
                                ((bsc) obj3).getClass();
                                return new smh((fk0) m7fVar14.a(jce.a.b(fk0.class), null, null), new u0h(bw.G), new u0h(bw.H));
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7f m7fVar15 = (m7f) obj2;
                                m7fVar15.getClass();
                                ((bsc) obj3).getClass();
                                Object objB = ((qre) m7fVar15.a(jce.a.b(qre.class), null, null)).b(tja.class);
                                objB.getClass();
                                return (tja) objB;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7f m7fVar16 = (m7f) obj2;
                                m7fVar16.getClass();
                                ((bsc) obj3).getClass();
                                Object objB2 = ((qre) m7fVar16.a(jce.a.b(qre.class), null, null)).b(t8b.class);
                                objB2.getClass();
                                return (t8b) objB2;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7f m7fVar17 = (m7f) obj2;
                                m7fVar17.getClass();
                                ((bsc) obj3).getClass();
                                Object objB3 = ((qre) m7fVar17.a(jce.a.b(qre.class), null, null)).b(kab.class);
                                objB3.getClass();
                                return (kab) objB3;
                            case 21:
                                m7f m7fVar18 = (m7f) obj2;
                                m7fVar18.getClass();
                                ((bsc) obj3).getClass();
                                Object objB4 = ((qre) m7fVar18.a(jce.a.b(qre.class), null, null)).b(npb.class);
                                objB4.getClass();
                                return (npb) objB4;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7f m7fVar19 = (m7f) obj2;
                                m7fVar19.getClass();
                                ((bsc) obj3).getClass();
                                Object objB5 = ((qre) m7fVar19.a(jce.a.b(qre.class), null, null)).b(b7c.class);
                                objB5.getClass();
                                return (b7c) objB5;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7f m7fVar20 = (m7f) obj2;
                                m7fVar20.getClass();
                                ((bsc) obj3).getClass();
                                Object objB6 = ((qre) m7fVar20.a(jce.a.b(qre.class), null, null)).b(swa.class);
                                objB6.getClass();
                                return (swa) objB6;
                            case 24:
                                m7f m7fVar21 = (m7f) obj2;
                                m7fVar21.getClass();
                                ((bsc) obj3).getClass();
                                Object objB7 = ((qre) m7fVar21.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB7.getClass();
                                return (j2d) objB7;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7f m7fVar22 = (m7f) obj2;
                                m7fVar22.getClass();
                                ((bsc) obj3).getClass();
                                Object objB8 = ((qre) m7fVar22.a(jce.a.b(qre.class), null, null)).b(mkd.class);
                                objB8.getClass();
                                return (mkd) objB8;
                            case 26:
                                m7f m7fVar23 = (m7f) obj2;
                                m7fVar23.getClass();
                                ((bsc) obj3).getClass();
                                Object objB9 = ((qre) m7fVar23.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB9.getClass();
                                return (i8) objB9;
                            case 27:
                                m7f m7fVar24 = (m7f) obj2;
                                m7fVar24.getClass();
                                ((bsc) obj3).getClass();
                                Object objB10 = ((qre) m7fVar24.a(jce.a.b(qre.class), null, null)).b(omd.class);
                                objB10.getClass();
                                return (omd) objB10;
                            case 28:
                                m7f m7fVar25 = (m7f) obj2;
                                m7fVar25.getClass();
                                ((bsc) obj3).getClass();
                                Object objB11 = ((qre) m7fVar25.a(jce.a.b(qre.class), null, null)).b(pxd.class);
                                objB11.getClass();
                                return (pxd) objB11;
                            default:
                                m7f m7fVar26 = (m7f) obj2;
                                m7fVar26.getClass();
                                ((bsc) obj3).getClass();
                                Object objB12 = ((qre) m7fVar26.a(jce.a.b(qre.class), null, null)).b(r0h.class);
                                objB12.getClass();
                                return (r0h) objB12;
                        }
                    }
                }, kq9Var10)));
                final int i41 = 28;
                oqbVar11.a(new ge7(new qh1(xaiVar5, kceVar9.b(pxd.class), null, new pz7() { // from class: c8
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) throws MissingAndroidContextException {
                        int i162 = 1;
                        switch (i41) {
                            case 0:
                                m7f m7fVar = (m7f) obj2;
                                m7fVar.getClass();
                                ((bsc) obj3).getClass();
                                Context contextG = yb5.g(m7fVar);
                                String strM949unboximpl = ((AccountId) m7fVar.a(jce.a.b(AccountId.class), null, null)).m949unboximpl();
                                strM949unboximpl.getClass();
                                SharedPreferences sharedPreferences = contextG.getApplicationContext().getSharedPreferences("account_prefs".concat(strM949unboximpl), 0);
                                sharedPreferences.getClass();
                                return new f8(sharedPreferences);
                            case 1:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                if (v40.a == null) {
                                    synchronized (v40.b) {
                                        if (v40.a == null) {
                                            pl7 pl7VarC = pl7.c();
                                            pl7VarC.a();
                                            v40.a = FirebaseAnalytics.getInstance(pl7VarC.a);
                                        }
                                        break;
                                    }
                                }
                                FirebaseAnalytics firebaseAnalytics = v40.a;
                                firebaseAnalytics.getClass();
                                return firebaseAnalytics;
                            case 2:
                                m7f m7fVar2 = (m7f) obj2;
                                m7fVar2.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar22 = jce.a;
                                return new ll7((FirebaseAnalytics) m7fVar2.a(kceVar22.b(FirebaseAnalytics.class), null, null), (am0) m7fVar2.a(kceVar22.b(am0.class), null, null));
                            case 3:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new kd();
                            case 4:
                                m7f m7fVar3 = (m7f) obj2;
                                m7fVar3.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar32 = jce.a;
                                return new hj((qi3) m7fVar3.a(kceVar32.b(qi3.class), null, null), (fk0) m7fVar3.a(kceVar32.b(fk0.class), null, null), new w9h(new cfk((Context) m7fVar3.a(kceVar32.b(Context.class), null, null))), (g78) m7fVar3.a(kceVar32.b(g78.class), null, null), (h86) m7fVar3.a(kceVar32.b(h86.class), null, null));
                            case 5:
                                m7f m7fVar4 = (m7f) obj2;
                                m7fVar4.getClass();
                                ((bsc) obj3).getClass();
                                return new pl(((doi) m7fVar4.a(jce.a.b(doi.class), null, null)).a("agent_chat"));
                            case 6:
                                m7f m7fVar5 = (m7f) obj2;
                                m7fVar5.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar42 = jce.a;
                                return new fq((dl2) m7fVar5.a(kceVar42.b(dl2.class), null, null), (h86) m7fVar5.a(kceVar42.b(h86.class), null, null), (oda) m7fVar5.a(kceVar42.b(oda.class), null, null), (koi) m7fVar5.a(kceVar42.b(koi.class), null, null));
                            case 7:
                                m7f m7fVar6 = (m7f) obj2;
                                m7fVar6.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar52 = jce.a;
                                return new vm((jwf) m7fVar6.a(kceVar52.b(jwf.class), null, null), (b) m7fVar6.a(kceVar52.b(b.class), null, null), (qzb) m7fVar6.a(kceVar52.b(qzb.class), null, null), (i8c) m7fVar6.a(kceVar52.b(i8c.class), null, null), (pl) m7fVar6.a(kceVar52.b(pl.class), null, null), yb5.g(m7fVar6), (ze0) m7fVar6.a(kceVar52.b(ze0.class), null, null), (koi) m7fVar6.a(kceVar52.b(koi.class), null, null), (i25) m7fVar6.a(kceVar52.b(i25.class), null, null), (hdc) m7fVar6.a(kceVar52.b(hdc.class), null, null), (fq) m7fVar6.a(kceVar52.b(fq.class), null, null), (oda) m7fVar6.a(kceVar52.b(oda.class), null, null), (h86) m7fVar6.a(kceVar52.b(h86.class), null, null), (qi3) m7fVar6.a(kceVar52.b(qi3.class), null, null), (z8c) m7fVar6.a(kceVar52.b(z8c.class), null, null), (j8i) m7fVar6.a(kceVar52.b(j8i.class), null, null), (rc8) m7fVar6.a(kceVar52.b(rc8.class), null, null));
                            case 8:
                                m7f m7fVar7 = (m7f) obj2;
                                m7fVar7.getClass();
                                ((bsc) obj3).getClass();
                                int i172 = lx.a[((AppEnvironment) m7fVar7.a(jce.a.b(AppEnvironment.class), null, null)).ordinal()];
                                if (i172 == 1) {
                                    return "LKJN8LsLERHEOXkw487o7qCTFOrGPimI";
                                }
                                if (i172 == 2 || i172 == 3) {
                                    return "b64sf1kxwDGe1PiSAlv5ixuH0f509RKK";
                                }
                                mr9.b();
                                return null;
                            case 9:
                                m7f m7fVar8 = (m7f) obj2;
                                m7fVar8.getClass();
                                ((bsc) obj3).getClass();
                                mrg mrgVar22 = mx.a;
                                kce kceVar62 = jce.a;
                                return new nff((String) m7fVar8.a(kceVar62.b(String.class), mrgVar22, null), (Context) m7fVar8.a(kceVar62.b(Context.class), null, null), (h86) m7fVar8.a(kceVar62.b(h86.class), null, null), (ud5) m7fVar8.a(kceVar62.b(ud5.class), null, null), (qk5) m7fVar8.a(kceVar62.b(qk5.class), null, null));
                            case 10:
                                m7f m7fVar9 = (m7f) obj2;
                                m7fVar9.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar72 = jce.a;
                                nff nffVar = (nff) m7fVar9.a(kceVar72.b(nff.class), null, null);
                                yw ywVar = gx.Companion;
                                ql8 ql8Var = new ql8(12);
                                ywVar.getClass();
                                gx.K = ql8Var;
                                String str = nffVar.a;
                                if (bsg.I0(str)) {
                                    sz6.p("writeKey cannot be blank ");
                                    return null;
                                }
                                mff mffVar = new mff(new eg4(nffVar.b, str), new el5(nffVar));
                                mffVar.b().a(new e10());
                                mffVar.b().a(new k30());
                                String strA = nffVar.d.a.a();
                                String languageTag = LocaleList.getDefault().get(0).toLanguageTag();
                                languageTag.getClass();
                                mffVar.b().a(new vd5(strA, languageTag));
                                mffVar.b().a(new nk5(i162));
                                mffVar.b().a(new nk5(nffVar.e));
                                boolean z = !((fk0) m7fVar9.a(kceVar72.b(fk0.class), null, null)).o();
                                mffVar.J = z;
                                el5 el5Var = mffVar.F;
                                gb9.D((mp4) el5Var.I, (e45) el5Var.F, null, new ax(mffVar, z, (tp4) null), 2);
                                return mffVar;
                            case 11:
                                m7f m7fVar10 = (m7f) obj2;
                                m7fVar10.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar82 = jce.a;
                                return new com.anthropic.claude.analytics.b((gx) m7fVar10.a(kceVar82.b(gx.class), null, null), (bg9) m7fVar10.a(kceVar82.b(bg9.class), null, null), (qk5) m7fVar10.a(kceVar82.b(qk5.class), null, null));
                            case 12:
                                m7f m7fVar11 = (m7f) obj2;
                                m7fVar11.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar11.a(jce.a.b(com.anthropic.claude.analytics.b.class), null, null);
                            case 13:
                                m7f m7fVar12 = (m7f) obj2;
                                m7fVar12.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar92 = jce.a;
                                fk0 fk0Var = (fk0) m7fVar12.a(kceVar92.b(fk0.class), null, null);
                                t29 t29Var = new t29(m7fVar12.a(kceVar92.b(gx.class), null, null));
                                t29 t29Var2 = new t29(m7fVar12.a(kceVar92.b(FirebaseAnalytics.class), null, null));
                                ((fk0) m7fVar12.a(kceVar92.b(fk0.class), null, null)).o();
                                return new smh(fk0Var, t29Var, t29Var2);
                            case 14:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new ti3();
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7f m7fVar13 = (m7f) obj2;
                                m7fVar13.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar13.a(jce.a.b(ti3.class), null, null);
                            case 16:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new hl8(new wg6(14), new rl7(6));
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7f m7fVar14 = (m7f) obj2;
                                m7fVar14.getClass();
                                ((bsc) obj3).getClass();
                                return new smh((fk0) m7fVar14.a(jce.a.b(fk0.class), null, null), new u0h(bw.G), new u0h(bw.H));
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7f m7fVar15 = (m7f) obj2;
                                m7fVar15.getClass();
                                ((bsc) obj3).getClass();
                                Object objB = ((qre) m7fVar15.a(jce.a.b(qre.class), null, null)).b(tja.class);
                                objB.getClass();
                                return (tja) objB;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7f m7fVar16 = (m7f) obj2;
                                m7fVar16.getClass();
                                ((bsc) obj3).getClass();
                                Object objB2 = ((qre) m7fVar16.a(jce.a.b(qre.class), null, null)).b(t8b.class);
                                objB2.getClass();
                                return (t8b) objB2;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7f m7fVar17 = (m7f) obj2;
                                m7fVar17.getClass();
                                ((bsc) obj3).getClass();
                                Object objB3 = ((qre) m7fVar17.a(jce.a.b(qre.class), null, null)).b(kab.class);
                                objB3.getClass();
                                return (kab) objB3;
                            case 21:
                                m7f m7fVar18 = (m7f) obj2;
                                m7fVar18.getClass();
                                ((bsc) obj3).getClass();
                                Object objB4 = ((qre) m7fVar18.a(jce.a.b(qre.class), null, null)).b(npb.class);
                                objB4.getClass();
                                return (npb) objB4;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7f m7fVar19 = (m7f) obj2;
                                m7fVar19.getClass();
                                ((bsc) obj3).getClass();
                                Object objB5 = ((qre) m7fVar19.a(jce.a.b(qre.class), null, null)).b(b7c.class);
                                objB5.getClass();
                                return (b7c) objB5;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7f m7fVar20 = (m7f) obj2;
                                m7fVar20.getClass();
                                ((bsc) obj3).getClass();
                                Object objB6 = ((qre) m7fVar20.a(jce.a.b(qre.class), null, null)).b(swa.class);
                                objB6.getClass();
                                return (swa) objB6;
                            case 24:
                                m7f m7fVar21 = (m7f) obj2;
                                m7fVar21.getClass();
                                ((bsc) obj3).getClass();
                                Object objB7 = ((qre) m7fVar21.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB7.getClass();
                                return (j2d) objB7;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7f m7fVar22 = (m7f) obj2;
                                m7fVar22.getClass();
                                ((bsc) obj3).getClass();
                                Object objB8 = ((qre) m7fVar22.a(jce.a.b(qre.class), null, null)).b(mkd.class);
                                objB8.getClass();
                                return (mkd) objB8;
                            case 26:
                                m7f m7fVar23 = (m7f) obj2;
                                m7fVar23.getClass();
                                ((bsc) obj3).getClass();
                                Object objB9 = ((qre) m7fVar23.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB9.getClass();
                                return (i8) objB9;
                            case 27:
                                m7f m7fVar24 = (m7f) obj2;
                                m7fVar24.getClass();
                                ((bsc) obj3).getClass();
                                Object objB10 = ((qre) m7fVar24.a(jce.a.b(qre.class), null, null)).b(omd.class);
                                objB10.getClass();
                                return (omd) objB10;
                            case 28:
                                m7f m7fVar25 = (m7f) obj2;
                                m7fVar25.getClass();
                                ((bsc) obj3).getClass();
                                Object objB11 = ((qre) m7fVar25.a(jce.a.b(qre.class), null, null)).b(pxd.class);
                                objB11.getClass();
                                return (pxd) objB11;
                            default:
                                m7f m7fVar26 = (m7f) obj2;
                                m7fVar26.getClass();
                                ((bsc) obj3).getClass();
                                Object objB12 = ((qre) m7fVar26.a(jce.a.b(qre.class), null, null)).b(r0h.class);
                                objB12.getClass();
                                return (r0h) objB12;
                        }
                    }
                }, kq9Var10)));
                final int i42 = 29;
                oqbVar11.a(new ge7(new qh1(xaiVar5, kceVar9.b(r0h.class), null, new pz7() { // from class: c8
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) throws MissingAndroidContextException {
                        int i162 = 1;
                        switch (i42) {
                            case 0:
                                m7f m7fVar = (m7f) obj2;
                                m7fVar.getClass();
                                ((bsc) obj3).getClass();
                                Context contextG = yb5.g(m7fVar);
                                String strM949unboximpl = ((AccountId) m7fVar.a(jce.a.b(AccountId.class), null, null)).m949unboximpl();
                                strM949unboximpl.getClass();
                                SharedPreferences sharedPreferences = contextG.getApplicationContext().getSharedPreferences("account_prefs".concat(strM949unboximpl), 0);
                                sharedPreferences.getClass();
                                return new f8(sharedPreferences);
                            case 1:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                if (v40.a == null) {
                                    synchronized (v40.b) {
                                        if (v40.a == null) {
                                            pl7 pl7VarC = pl7.c();
                                            pl7VarC.a();
                                            v40.a = FirebaseAnalytics.getInstance(pl7VarC.a);
                                        }
                                        break;
                                    }
                                }
                                FirebaseAnalytics firebaseAnalytics = v40.a;
                                firebaseAnalytics.getClass();
                                return firebaseAnalytics;
                            case 2:
                                m7f m7fVar2 = (m7f) obj2;
                                m7fVar2.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar22 = jce.a;
                                return new ll7((FirebaseAnalytics) m7fVar2.a(kceVar22.b(FirebaseAnalytics.class), null, null), (am0) m7fVar2.a(kceVar22.b(am0.class), null, null));
                            case 3:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new kd();
                            case 4:
                                m7f m7fVar3 = (m7f) obj2;
                                m7fVar3.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar32 = jce.a;
                                return new hj((qi3) m7fVar3.a(kceVar32.b(qi3.class), null, null), (fk0) m7fVar3.a(kceVar32.b(fk0.class), null, null), new w9h(new cfk((Context) m7fVar3.a(kceVar32.b(Context.class), null, null))), (g78) m7fVar3.a(kceVar32.b(g78.class), null, null), (h86) m7fVar3.a(kceVar32.b(h86.class), null, null));
                            case 5:
                                m7f m7fVar4 = (m7f) obj2;
                                m7fVar4.getClass();
                                ((bsc) obj3).getClass();
                                return new pl(((doi) m7fVar4.a(jce.a.b(doi.class), null, null)).a("agent_chat"));
                            case 6:
                                m7f m7fVar5 = (m7f) obj2;
                                m7fVar5.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar42 = jce.a;
                                return new fq((dl2) m7fVar5.a(kceVar42.b(dl2.class), null, null), (h86) m7fVar5.a(kceVar42.b(h86.class), null, null), (oda) m7fVar5.a(kceVar42.b(oda.class), null, null), (koi) m7fVar5.a(kceVar42.b(koi.class), null, null));
                            case 7:
                                m7f m7fVar6 = (m7f) obj2;
                                m7fVar6.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar52 = jce.a;
                                return new vm((jwf) m7fVar6.a(kceVar52.b(jwf.class), null, null), (b) m7fVar6.a(kceVar52.b(b.class), null, null), (qzb) m7fVar6.a(kceVar52.b(qzb.class), null, null), (i8c) m7fVar6.a(kceVar52.b(i8c.class), null, null), (pl) m7fVar6.a(kceVar52.b(pl.class), null, null), yb5.g(m7fVar6), (ze0) m7fVar6.a(kceVar52.b(ze0.class), null, null), (koi) m7fVar6.a(kceVar52.b(koi.class), null, null), (i25) m7fVar6.a(kceVar52.b(i25.class), null, null), (hdc) m7fVar6.a(kceVar52.b(hdc.class), null, null), (fq) m7fVar6.a(kceVar52.b(fq.class), null, null), (oda) m7fVar6.a(kceVar52.b(oda.class), null, null), (h86) m7fVar6.a(kceVar52.b(h86.class), null, null), (qi3) m7fVar6.a(kceVar52.b(qi3.class), null, null), (z8c) m7fVar6.a(kceVar52.b(z8c.class), null, null), (j8i) m7fVar6.a(kceVar52.b(j8i.class), null, null), (rc8) m7fVar6.a(kceVar52.b(rc8.class), null, null));
                            case 8:
                                m7f m7fVar7 = (m7f) obj2;
                                m7fVar7.getClass();
                                ((bsc) obj3).getClass();
                                int i172 = lx.a[((AppEnvironment) m7fVar7.a(jce.a.b(AppEnvironment.class), null, null)).ordinal()];
                                if (i172 == 1) {
                                    return "LKJN8LsLERHEOXkw487o7qCTFOrGPimI";
                                }
                                if (i172 == 2 || i172 == 3) {
                                    return "b64sf1kxwDGe1PiSAlv5ixuH0f509RKK";
                                }
                                mr9.b();
                                return null;
                            case 9:
                                m7f m7fVar8 = (m7f) obj2;
                                m7fVar8.getClass();
                                ((bsc) obj3).getClass();
                                mrg mrgVar22 = mx.a;
                                kce kceVar62 = jce.a;
                                return new nff((String) m7fVar8.a(kceVar62.b(String.class), mrgVar22, null), (Context) m7fVar8.a(kceVar62.b(Context.class), null, null), (h86) m7fVar8.a(kceVar62.b(h86.class), null, null), (ud5) m7fVar8.a(kceVar62.b(ud5.class), null, null), (qk5) m7fVar8.a(kceVar62.b(qk5.class), null, null));
                            case 10:
                                m7f m7fVar9 = (m7f) obj2;
                                m7fVar9.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar72 = jce.a;
                                nff nffVar = (nff) m7fVar9.a(kceVar72.b(nff.class), null, null);
                                yw ywVar = gx.Companion;
                                ql8 ql8Var = new ql8(12);
                                ywVar.getClass();
                                gx.K = ql8Var;
                                String str = nffVar.a;
                                if (bsg.I0(str)) {
                                    sz6.p("writeKey cannot be blank ");
                                    return null;
                                }
                                mff mffVar = new mff(new eg4(nffVar.b, str), new el5(nffVar));
                                mffVar.b().a(new e10());
                                mffVar.b().a(new k30());
                                String strA = nffVar.d.a.a();
                                String languageTag = LocaleList.getDefault().get(0).toLanguageTag();
                                languageTag.getClass();
                                mffVar.b().a(new vd5(strA, languageTag));
                                mffVar.b().a(new nk5(i162));
                                mffVar.b().a(new nk5(nffVar.e));
                                boolean z = !((fk0) m7fVar9.a(kceVar72.b(fk0.class), null, null)).o();
                                mffVar.J = z;
                                el5 el5Var = mffVar.F;
                                gb9.D((mp4) el5Var.I, (e45) el5Var.F, null, new ax(mffVar, z, (tp4) null), 2);
                                return mffVar;
                            case 11:
                                m7f m7fVar10 = (m7f) obj2;
                                m7fVar10.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar82 = jce.a;
                                return new com.anthropic.claude.analytics.b((gx) m7fVar10.a(kceVar82.b(gx.class), null, null), (bg9) m7fVar10.a(kceVar82.b(bg9.class), null, null), (qk5) m7fVar10.a(kceVar82.b(qk5.class), null, null));
                            case 12:
                                m7f m7fVar11 = (m7f) obj2;
                                m7fVar11.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar11.a(jce.a.b(com.anthropic.claude.analytics.b.class), null, null);
                            case 13:
                                m7f m7fVar12 = (m7f) obj2;
                                m7fVar12.getClass();
                                ((bsc) obj3).getClass();
                                kce kceVar92 = jce.a;
                                fk0 fk0Var = (fk0) m7fVar12.a(kceVar92.b(fk0.class), null, null);
                                t29 t29Var = new t29(m7fVar12.a(kceVar92.b(gx.class), null, null));
                                t29 t29Var2 = new t29(m7fVar12.a(kceVar92.b(FirebaseAnalytics.class), null, null));
                                ((fk0) m7fVar12.a(kceVar92.b(fk0.class), null, null)).o();
                                return new smh(fk0Var, t29Var, t29Var2);
                            case 14:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new ti3();
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7f m7fVar13 = (m7f) obj2;
                                m7fVar13.getClass();
                                ((bsc) obj3).getClass();
                                return (qi3) m7fVar13.a(jce.a.b(ti3.class), null, null);
                            case 16:
                                ((m7f) obj2).getClass();
                                ((bsc) obj3).getClass();
                                return new hl8(new wg6(14), new rl7(6));
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7f m7fVar14 = (m7f) obj2;
                                m7fVar14.getClass();
                                ((bsc) obj3).getClass();
                                return new smh((fk0) m7fVar14.a(jce.a.b(fk0.class), null, null), new u0h(bw.G), new u0h(bw.H));
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7f m7fVar15 = (m7f) obj2;
                                m7fVar15.getClass();
                                ((bsc) obj3).getClass();
                                Object objB = ((qre) m7fVar15.a(jce.a.b(qre.class), null, null)).b(tja.class);
                                objB.getClass();
                                return (tja) objB;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7f m7fVar16 = (m7f) obj2;
                                m7fVar16.getClass();
                                ((bsc) obj3).getClass();
                                Object objB2 = ((qre) m7fVar16.a(jce.a.b(qre.class), null, null)).b(t8b.class);
                                objB2.getClass();
                                return (t8b) objB2;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7f m7fVar17 = (m7f) obj2;
                                m7fVar17.getClass();
                                ((bsc) obj3).getClass();
                                Object objB3 = ((qre) m7fVar17.a(jce.a.b(qre.class), null, null)).b(kab.class);
                                objB3.getClass();
                                return (kab) objB3;
                            case 21:
                                m7f m7fVar18 = (m7f) obj2;
                                m7fVar18.getClass();
                                ((bsc) obj3).getClass();
                                Object objB4 = ((qre) m7fVar18.a(jce.a.b(qre.class), null, null)).b(npb.class);
                                objB4.getClass();
                                return (npb) objB4;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7f m7fVar19 = (m7f) obj2;
                                m7fVar19.getClass();
                                ((bsc) obj3).getClass();
                                Object objB5 = ((qre) m7fVar19.a(jce.a.b(qre.class), null, null)).b(b7c.class);
                                objB5.getClass();
                                return (b7c) objB5;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7f m7fVar20 = (m7f) obj2;
                                m7fVar20.getClass();
                                ((bsc) obj3).getClass();
                                Object objB6 = ((qre) m7fVar20.a(jce.a.b(qre.class), null, null)).b(swa.class);
                                objB6.getClass();
                                return (swa) objB6;
                            case 24:
                                m7f m7fVar21 = (m7f) obj2;
                                m7fVar21.getClass();
                                ((bsc) obj3).getClass();
                                Object objB7 = ((qre) m7fVar21.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB7.getClass();
                                return (j2d) objB7;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7f m7fVar22 = (m7f) obj2;
                                m7fVar22.getClass();
                                ((bsc) obj3).getClass();
                                Object objB8 = ((qre) m7fVar22.a(jce.a.b(qre.class), null, null)).b(mkd.class);
                                objB8.getClass();
                                return (mkd) objB8;
                            case 26:
                                m7f m7fVar23 = (m7f) obj2;
                                m7fVar23.getClass();
                                ((bsc) obj3).getClass();
                                Object objB9 = ((qre) m7fVar23.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB9.getClass();
                                return (i8) objB9;
                            case 27:
                                m7f m7fVar24 = (m7f) obj2;
                                m7fVar24.getClass();
                                ((bsc) obj3).getClass();
                                Object objB10 = ((qre) m7fVar24.a(jce.a.b(qre.class), null, null)).b(omd.class);
                                objB10.getClass();
                                return (omd) objB10;
                            case 28:
                                m7f m7fVar25 = (m7f) obj2;
                                m7fVar25.getClass();
                                ((bsc) obj3).getClass();
                                Object objB11 = ((qre) m7fVar25.a(jce.a.b(qre.class), null, null)).b(pxd.class);
                                objB11.getClass();
                                return (pxd) objB11;
                            default:
                                m7f m7fVar26 = (m7f) obj2;
                                m7fVar26.getClass();
                                ((bsc) obj3).getClass();
                                Object objB12 = ((qre) m7fVar26.a(jce.a.b(qre.class), null, null)).b(r0h.class);
                                objB12.getClass();
                                return (r0h) objB12;
                        }
                    }
                }, kq9Var10)));
                final int i43 = 0;
                oqbVar11.a(new ge7(new qh1(xaiVar5, kceVar9.b(n9h.class), null, new pz7() { // from class: if0
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) {
                        m7f m7fVar = (m7f) obj2;
                        bsc bscVar = (bsc) obj3;
                        switch (i43) {
                            case 0:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(n9h.class);
                                objB.getClass();
                                return (n9h) objB;
                            case 1:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB2 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(v7i.class);
                                objB2.getClass();
                                return (v7i) objB2;
                            case 2:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB3 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ptf.class);
                                objB3.getClass();
                                return (ptf) objB3;
                            case 3:
                                m7fVar.getClass();
                                bscVar.getClass();
                                return new jf0((rc8) m7fVar.a(jce.a.b(rc8.class), null, null));
                            case 4:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB4 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(kli.class);
                                objB4.getClass();
                                return (kli) objB4;
                            case 5:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB5 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(haj.class);
                                objB5.getClass();
                                return (haj) objB5;
                            case 6:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB6 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ok7.class);
                                objB6.getClass();
                                return (ok7) objB6;
                            case 7:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB7 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ui0.class);
                                objB7.getClass();
                                return (ui0) objB7;
                            case 8:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB8 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(p87.class);
                                objB8.getClass();
                                return (p87) objB8;
                            case 9:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB9 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(nu0.class);
                                objB9.getClass();
                                return (nu0) objB9;
                            case 10:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB10 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(dl2.class);
                                objB10.getClass();
                                return (dl2) objB10;
                            case 11:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB11 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ya3.class);
                                objB11.getClass();
                                return (ya3) objB11;
                            case 12:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB12 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uk4.class);
                                objB12.getClass();
                                return (uk4) objB12;
                            case 13:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB13 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(er4.class);
                                objB13.getClass();
                                return (er4) objB13;
                            case 14:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB14 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uz6.class);
                                objB14.getClass();
                                return (uz6) objB14;
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB15 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(hb7.class);
                                objB15.getClass();
                                y6a.r(objB15);
                                throw null;
                            case 16:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB16 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(tga.class);
                                objB16.getClass();
                                return (tga) objB16;
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB17 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB17.getClass();
                                return (o7) objB17;
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB18 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB18.getClass();
                                return (j2d) objB18;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB19 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB19.getClass();
                                return (o7) objB19;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB20 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB20.getClass();
                                return (i8) objB20;
                            case 21:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB21 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(xjc.class);
                                objB21.getClass();
                                return (xjc) objB21;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB22 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(gae.class);
                                objB22.getClass();
                                return (gae) objB22;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB23 = ((qre) m7fVar.a(jce.a.b(qre.class), nai.s, null)).b(rmb.class);
                                objB23.getClass();
                                y6a.r(objB23);
                                throw null;
                            case 24:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB24 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(uz6.class);
                                objB24.getClass();
                                return (uz6) objB24;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB25 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(p2a.class);
                                objB25.getClass();
                                return (p2a) objB25;
                            case 26:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB26 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(a78.class);
                                objB26.getClass();
                                return (a78) objB26;
                            case 27:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB27 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB27.getClass();
                                return (o7) objB27;
                            case 28:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB28 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uf7.class);
                                objB28.getClass();
                                return (uf7) objB28;
                            default:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB29 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(mk7.class);
                                objB29.getClass();
                                return (mk7) objB29;
                        }
                    }
                }, kq9Var10)));
                final int i44 = 1;
                oqbVar11.a(new ge7(new qh1(xaiVar5, kceVar9.b(v7i.class), null, new pz7() { // from class: if0
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) {
                        m7f m7fVar = (m7f) obj2;
                        bsc bscVar = (bsc) obj3;
                        switch (i44) {
                            case 0:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(n9h.class);
                                objB.getClass();
                                return (n9h) objB;
                            case 1:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB2 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(v7i.class);
                                objB2.getClass();
                                return (v7i) objB2;
                            case 2:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB3 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ptf.class);
                                objB3.getClass();
                                return (ptf) objB3;
                            case 3:
                                m7fVar.getClass();
                                bscVar.getClass();
                                return new jf0((rc8) m7fVar.a(jce.a.b(rc8.class), null, null));
                            case 4:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB4 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(kli.class);
                                objB4.getClass();
                                return (kli) objB4;
                            case 5:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB5 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(haj.class);
                                objB5.getClass();
                                return (haj) objB5;
                            case 6:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB6 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ok7.class);
                                objB6.getClass();
                                return (ok7) objB6;
                            case 7:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB7 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ui0.class);
                                objB7.getClass();
                                return (ui0) objB7;
                            case 8:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB8 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(p87.class);
                                objB8.getClass();
                                return (p87) objB8;
                            case 9:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB9 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(nu0.class);
                                objB9.getClass();
                                return (nu0) objB9;
                            case 10:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB10 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(dl2.class);
                                objB10.getClass();
                                return (dl2) objB10;
                            case 11:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB11 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ya3.class);
                                objB11.getClass();
                                return (ya3) objB11;
                            case 12:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB12 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uk4.class);
                                objB12.getClass();
                                return (uk4) objB12;
                            case 13:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB13 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(er4.class);
                                objB13.getClass();
                                return (er4) objB13;
                            case 14:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB14 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uz6.class);
                                objB14.getClass();
                                return (uz6) objB14;
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB15 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(hb7.class);
                                objB15.getClass();
                                y6a.r(objB15);
                                throw null;
                            case 16:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB16 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(tga.class);
                                objB16.getClass();
                                return (tga) objB16;
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB17 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB17.getClass();
                                return (o7) objB17;
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB18 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB18.getClass();
                                return (j2d) objB18;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB19 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB19.getClass();
                                return (o7) objB19;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB20 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB20.getClass();
                                return (i8) objB20;
                            case 21:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB21 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(xjc.class);
                                objB21.getClass();
                                return (xjc) objB21;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB22 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(gae.class);
                                objB22.getClass();
                                return (gae) objB22;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB23 = ((qre) m7fVar.a(jce.a.b(qre.class), nai.s, null)).b(rmb.class);
                                objB23.getClass();
                                y6a.r(objB23);
                                throw null;
                            case 24:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB24 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(uz6.class);
                                objB24.getClass();
                                return (uz6) objB24;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB25 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(p2a.class);
                                objB25.getClass();
                                return (p2a) objB25;
                            case 26:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB26 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(a78.class);
                                objB26.getClass();
                                return (a78) objB26;
                            case 27:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB27 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB27.getClass();
                                return (o7) objB27;
                            case 28:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB28 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uf7.class);
                                objB28.getClass();
                                return (uf7) objB28;
                            default:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB29 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(mk7.class);
                                objB29.getClass();
                                return (mk7) objB29;
                        }
                    }
                }, kq9Var10)));
                final int i45 = 2;
                oqbVar11.a(new ge7(new qh1(xaiVar5, kceVar9.b(ptf.class), null, new pz7() { // from class: if0
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) {
                        m7f m7fVar = (m7f) obj2;
                        bsc bscVar = (bsc) obj3;
                        switch (i45) {
                            case 0:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(n9h.class);
                                objB.getClass();
                                return (n9h) objB;
                            case 1:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB2 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(v7i.class);
                                objB2.getClass();
                                return (v7i) objB2;
                            case 2:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB3 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ptf.class);
                                objB3.getClass();
                                return (ptf) objB3;
                            case 3:
                                m7fVar.getClass();
                                bscVar.getClass();
                                return new jf0((rc8) m7fVar.a(jce.a.b(rc8.class), null, null));
                            case 4:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB4 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(kli.class);
                                objB4.getClass();
                                return (kli) objB4;
                            case 5:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB5 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(haj.class);
                                objB5.getClass();
                                return (haj) objB5;
                            case 6:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB6 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ok7.class);
                                objB6.getClass();
                                return (ok7) objB6;
                            case 7:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB7 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ui0.class);
                                objB7.getClass();
                                return (ui0) objB7;
                            case 8:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB8 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(p87.class);
                                objB8.getClass();
                                return (p87) objB8;
                            case 9:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB9 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(nu0.class);
                                objB9.getClass();
                                return (nu0) objB9;
                            case 10:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB10 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(dl2.class);
                                objB10.getClass();
                                return (dl2) objB10;
                            case 11:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB11 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ya3.class);
                                objB11.getClass();
                                return (ya3) objB11;
                            case 12:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB12 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uk4.class);
                                objB12.getClass();
                                return (uk4) objB12;
                            case 13:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB13 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(er4.class);
                                objB13.getClass();
                                return (er4) objB13;
                            case 14:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB14 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uz6.class);
                                objB14.getClass();
                                return (uz6) objB14;
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB15 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(hb7.class);
                                objB15.getClass();
                                y6a.r(objB15);
                                throw null;
                            case 16:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB16 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(tga.class);
                                objB16.getClass();
                                return (tga) objB16;
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB17 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB17.getClass();
                                return (o7) objB17;
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB18 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB18.getClass();
                                return (j2d) objB18;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB19 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB19.getClass();
                                return (o7) objB19;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB20 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB20.getClass();
                                return (i8) objB20;
                            case 21:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB21 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(xjc.class);
                                objB21.getClass();
                                return (xjc) objB21;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB22 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(gae.class);
                                objB22.getClass();
                                return (gae) objB22;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB23 = ((qre) m7fVar.a(jce.a.b(qre.class), nai.s, null)).b(rmb.class);
                                objB23.getClass();
                                y6a.r(objB23);
                                throw null;
                            case 24:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB24 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(uz6.class);
                                objB24.getClass();
                                return (uz6) objB24;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB25 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(p2a.class);
                                objB25.getClass();
                                return (p2a) objB25;
                            case 26:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB26 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(a78.class);
                                objB26.getClass();
                                return (a78) objB26;
                            case 27:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB27 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB27.getClass();
                                return (o7) objB27;
                            case 28:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB28 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uf7.class);
                                objB28.getClass();
                                return (uf7) objB28;
                            default:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB29 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(mk7.class);
                                objB29.getClass();
                                return (mk7) objB29;
                        }
                    }
                }, kq9Var10)));
                final int i46 = 3;
                oqbVar11.a(new w7f(new qh1(xaiVar5, kceVar9.b(owf.class), null, new pz7() { // from class: if0
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) {
                        m7f m7fVar = (m7f) obj2;
                        bsc bscVar = (bsc) obj3;
                        switch (i46) {
                            case 0:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(n9h.class);
                                objB.getClass();
                                return (n9h) objB;
                            case 1:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB2 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(v7i.class);
                                objB2.getClass();
                                return (v7i) objB2;
                            case 2:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB3 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ptf.class);
                                objB3.getClass();
                                return (ptf) objB3;
                            case 3:
                                m7fVar.getClass();
                                bscVar.getClass();
                                return new jf0((rc8) m7fVar.a(jce.a.b(rc8.class), null, null));
                            case 4:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB4 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(kli.class);
                                objB4.getClass();
                                return (kli) objB4;
                            case 5:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB5 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(haj.class);
                                objB5.getClass();
                                return (haj) objB5;
                            case 6:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB6 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ok7.class);
                                objB6.getClass();
                                return (ok7) objB6;
                            case 7:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB7 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ui0.class);
                                objB7.getClass();
                                return (ui0) objB7;
                            case 8:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB8 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(p87.class);
                                objB8.getClass();
                                return (p87) objB8;
                            case 9:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB9 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(nu0.class);
                                objB9.getClass();
                                return (nu0) objB9;
                            case 10:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB10 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(dl2.class);
                                objB10.getClass();
                                return (dl2) objB10;
                            case 11:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB11 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ya3.class);
                                objB11.getClass();
                                return (ya3) objB11;
                            case 12:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB12 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uk4.class);
                                objB12.getClass();
                                return (uk4) objB12;
                            case 13:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB13 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(er4.class);
                                objB13.getClass();
                                return (er4) objB13;
                            case 14:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB14 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uz6.class);
                                objB14.getClass();
                                return (uz6) objB14;
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB15 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(hb7.class);
                                objB15.getClass();
                                y6a.r(objB15);
                                throw null;
                            case 16:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB16 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(tga.class);
                                objB16.getClass();
                                return (tga) objB16;
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB17 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB17.getClass();
                                return (o7) objB17;
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB18 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB18.getClass();
                                return (j2d) objB18;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB19 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB19.getClass();
                                return (o7) objB19;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB20 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB20.getClass();
                                return (i8) objB20;
                            case 21:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB21 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(xjc.class);
                                objB21.getClass();
                                return (xjc) objB21;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB22 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(gae.class);
                                objB22.getClass();
                                return (gae) objB22;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB23 = ((qre) m7fVar.a(jce.a.b(qre.class), nai.s, null)).b(rmb.class);
                                objB23.getClass();
                                y6a.r(objB23);
                                throw null;
                            case 24:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB24 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(uz6.class);
                                objB24.getClass();
                                return (uz6) objB24;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB25 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(p2a.class);
                                objB25.getClass();
                                return (p2a) objB25;
                            case 26:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB26 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(a78.class);
                                objB26.getClass();
                                return (a78) objB26;
                            case 27:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB27 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB27.getClass();
                                return (o7) objB27;
                            case 28:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB28 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uf7.class);
                                objB28.getClass();
                                return (uf7) objB28;
                            default:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB29 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(mk7.class);
                                objB29.getClass();
                                return (mk7) objB29;
                        }
                    }
                }, kq9.G)));
                final int i47 = 4;
                oqbVar11.a(new ge7(new qh1(xaiVar5, kceVar9.b(kli.class), null, new pz7() { // from class: if0
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) {
                        m7f m7fVar = (m7f) obj2;
                        bsc bscVar = (bsc) obj3;
                        switch (i47) {
                            case 0:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(n9h.class);
                                objB.getClass();
                                return (n9h) objB;
                            case 1:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB2 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(v7i.class);
                                objB2.getClass();
                                return (v7i) objB2;
                            case 2:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB3 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ptf.class);
                                objB3.getClass();
                                return (ptf) objB3;
                            case 3:
                                m7fVar.getClass();
                                bscVar.getClass();
                                return new jf0((rc8) m7fVar.a(jce.a.b(rc8.class), null, null));
                            case 4:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB4 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(kli.class);
                                objB4.getClass();
                                return (kli) objB4;
                            case 5:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB5 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(haj.class);
                                objB5.getClass();
                                return (haj) objB5;
                            case 6:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB6 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ok7.class);
                                objB6.getClass();
                                return (ok7) objB6;
                            case 7:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB7 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ui0.class);
                                objB7.getClass();
                                return (ui0) objB7;
                            case 8:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB8 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(p87.class);
                                objB8.getClass();
                                return (p87) objB8;
                            case 9:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB9 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(nu0.class);
                                objB9.getClass();
                                return (nu0) objB9;
                            case 10:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB10 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(dl2.class);
                                objB10.getClass();
                                return (dl2) objB10;
                            case 11:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB11 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ya3.class);
                                objB11.getClass();
                                return (ya3) objB11;
                            case 12:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB12 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uk4.class);
                                objB12.getClass();
                                return (uk4) objB12;
                            case 13:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB13 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(er4.class);
                                objB13.getClass();
                                return (er4) objB13;
                            case 14:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB14 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uz6.class);
                                objB14.getClass();
                                return (uz6) objB14;
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB15 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(hb7.class);
                                objB15.getClass();
                                y6a.r(objB15);
                                throw null;
                            case 16:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB16 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(tga.class);
                                objB16.getClass();
                                return (tga) objB16;
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB17 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB17.getClass();
                                return (o7) objB17;
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB18 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB18.getClass();
                                return (j2d) objB18;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB19 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB19.getClass();
                                return (o7) objB19;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB20 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB20.getClass();
                                return (i8) objB20;
                            case 21:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB21 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(xjc.class);
                                objB21.getClass();
                                return (xjc) objB21;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB22 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(gae.class);
                                objB22.getClass();
                                return (gae) objB22;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB23 = ((qre) m7fVar.a(jce.a.b(qre.class), nai.s, null)).b(rmb.class);
                                objB23.getClass();
                                y6a.r(objB23);
                                throw null;
                            case 24:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB24 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(uz6.class);
                                objB24.getClass();
                                return (uz6) objB24;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB25 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(p2a.class);
                                objB25.getClass();
                                return (p2a) objB25;
                            case 26:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB26 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(a78.class);
                                objB26.getClass();
                                return (a78) objB26;
                            case 27:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB27 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB27.getClass();
                                return (o7) objB27;
                            case 28:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB28 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uf7.class);
                                objB28.getClass();
                                return (uf7) objB28;
                            default:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB29 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(mk7.class);
                                objB29.getClass();
                                return (mk7) objB29;
                        }
                    }
                }, kq9Var10)));
                oqbVar11.a(new ge7(new qh1(xaiVar5, kceVar9.b(haj.class), null, new pz7() { // from class: if0
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) {
                        m7f m7fVar = (m7f) obj2;
                        bsc bscVar = (bsc) obj3;
                        switch (i12) {
                            case 0:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(n9h.class);
                                objB.getClass();
                                return (n9h) objB;
                            case 1:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB2 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(v7i.class);
                                objB2.getClass();
                                return (v7i) objB2;
                            case 2:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB3 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ptf.class);
                                objB3.getClass();
                                return (ptf) objB3;
                            case 3:
                                m7fVar.getClass();
                                bscVar.getClass();
                                return new jf0((rc8) m7fVar.a(jce.a.b(rc8.class), null, null));
                            case 4:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB4 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(kli.class);
                                objB4.getClass();
                                return (kli) objB4;
                            case 5:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB5 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(haj.class);
                                objB5.getClass();
                                return (haj) objB5;
                            case 6:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB6 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ok7.class);
                                objB6.getClass();
                                return (ok7) objB6;
                            case 7:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB7 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ui0.class);
                                objB7.getClass();
                                return (ui0) objB7;
                            case 8:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB8 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(p87.class);
                                objB8.getClass();
                                return (p87) objB8;
                            case 9:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB9 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(nu0.class);
                                objB9.getClass();
                                return (nu0) objB9;
                            case 10:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB10 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(dl2.class);
                                objB10.getClass();
                                return (dl2) objB10;
                            case 11:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB11 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ya3.class);
                                objB11.getClass();
                                return (ya3) objB11;
                            case 12:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB12 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uk4.class);
                                objB12.getClass();
                                return (uk4) objB12;
                            case 13:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB13 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(er4.class);
                                objB13.getClass();
                                return (er4) objB13;
                            case 14:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB14 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uz6.class);
                                objB14.getClass();
                                return (uz6) objB14;
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB15 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(hb7.class);
                                objB15.getClass();
                                y6a.r(objB15);
                                throw null;
                            case 16:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB16 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(tga.class);
                                objB16.getClass();
                                return (tga) objB16;
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB17 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB17.getClass();
                                return (o7) objB17;
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB18 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB18.getClass();
                                return (j2d) objB18;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB19 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB19.getClass();
                                return (o7) objB19;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB20 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB20.getClass();
                                return (i8) objB20;
                            case 21:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB21 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(xjc.class);
                                objB21.getClass();
                                return (xjc) objB21;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB22 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(gae.class);
                                objB22.getClass();
                                return (gae) objB22;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB23 = ((qre) m7fVar.a(jce.a.b(qre.class), nai.s, null)).b(rmb.class);
                                objB23.getClass();
                                y6a.r(objB23);
                                throw null;
                            case 24:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB24 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(uz6.class);
                                objB24.getClass();
                                return (uz6) objB24;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB25 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(p2a.class);
                                objB25.getClass();
                                return (p2a) objB25;
                            case 26:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB26 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(a78.class);
                                objB26.getClass();
                                return (a78) objB26;
                            case 27:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB27 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB27.getClass();
                                return (o7) objB27;
                            case 28:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB28 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uf7.class);
                                objB28.getClass();
                                return (uf7) objB28;
                            default:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB29 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(mk7.class);
                                objB29.getClass();
                                return (mk7) objB29;
                        }
                    }
                }, kq9Var10)));
                final int i48 = 6;
                oqbVar11.a(new ge7(new qh1(xaiVar5, kceVar9.b(ok7.class), null, new pz7() { // from class: if0
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) {
                        m7f m7fVar = (m7f) obj2;
                        bsc bscVar = (bsc) obj3;
                        switch (i48) {
                            case 0:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(n9h.class);
                                objB.getClass();
                                return (n9h) objB;
                            case 1:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB2 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(v7i.class);
                                objB2.getClass();
                                return (v7i) objB2;
                            case 2:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB3 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ptf.class);
                                objB3.getClass();
                                return (ptf) objB3;
                            case 3:
                                m7fVar.getClass();
                                bscVar.getClass();
                                return new jf0((rc8) m7fVar.a(jce.a.b(rc8.class), null, null));
                            case 4:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB4 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(kli.class);
                                objB4.getClass();
                                return (kli) objB4;
                            case 5:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB5 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(haj.class);
                                objB5.getClass();
                                return (haj) objB5;
                            case 6:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB6 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ok7.class);
                                objB6.getClass();
                                return (ok7) objB6;
                            case 7:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB7 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ui0.class);
                                objB7.getClass();
                                return (ui0) objB7;
                            case 8:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB8 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(p87.class);
                                objB8.getClass();
                                return (p87) objB8;
                            case 9:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB9 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(nu0.class);
                                objB9.getClass();
                                return (nu0) objB9;
                            case 10:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB10 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(dl2.class);
                                objB10.getClass();
                                return (dl2) objB10;
                            case 11:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB11 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ya3.class);
                                objB11.getClass();
                                return (ya3) objB11;
                            case 12:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB12 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uk4.class);
                                objB12.getClass();
                                return (uk4) objB12;
                            case 13:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB13 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(er4.class);
                                objB13.getClass();
                                return (er4) objB13;
                            case 14:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB14 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uz6.class);
                                objB14.getClass();
                                return (uz6) objB14;
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB15 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(hb7.class);
                                objB15.getClass();
                                y6a.r(objB15);
                                throw null;
                            case 16:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB16 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(tga.class);
                                objB16.getClass();
                                return (tga) objB16;
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB17 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB17.getClass();
                                return (o7) objB17;
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB18 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB18.getClass();
                                return (j2d) objB18;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB19 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB19.getClass();
                                return (o7) objB19;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB20 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB20.getClass();
                                return (i8) objB20;
                            case 21:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB21 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(xjc.class);
                                objB21.getClass();
                                return (xjc) objB21;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB22 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(gae.class);
                                objB22.getClass();
                                return (gae) objB22;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB23 = ((qre) m7fVar.a(jce.a.b(qre.class), nai.s, null)).b(rmb.class);
                                objB23.getClass();
                                y6a.r(objB23);
                                throw null;
                            case 24:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB24 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(uz6.class);
                                objB24.getClass();
                                return (uz6) objB24;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB25 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(p2a.class);
                                objB25.getClass();
                                return (p2a) objB25;
                            case 26:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB26 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(a78.class);
                                objB26.getClass();
                                return (a78) objB26;
                            case 27:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB27 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB27.getClass();
                                return (o7) objB27;
                            case 28:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB28 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uf7.class);
                                objB28.getClass();
                                return (uf7) objB28;
                            default:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB29 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(mk7.class);
                                objB29.getClass();
                                return (mk7) objB29;
                        }
                    }
                }, kq9Var10)));
                ij0.v(new qh1(xaiVar5, kceVar9.b(p87.class), null, new pz7() { // from class: if0
                    @Override // defpackage.pz7
                    public final Object invoke(Object obj2, Object obj3) {
                        m7f m7fVar = (m7f) obj2;
                        bsc bscVar = (bsc) obj3;
                        switch (i14) {
                            case 0:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(n9h.class);
                                objB.getClass();
                                return (n9h) objB;
                            case 1:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB2 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(v7i.class);
                                objB2.getClass();
                                return (v7i) objB2;
                            case 2:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB3 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ptf.class);
                                objB3.getClass();
                                return (ptf) objB3;
                            case 3:
                                m7fVar.getClass();
                                bscVar.getClass();
                                return new jf0((rc8) m7fVar.a(jce.a.b(rc8.class), null, null));
                            case 4:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB4 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(kli.class);
                                objB4.getClass();
                                return (kli) objB4;
                            case 5:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB5 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(haj.class);
                                objB5.getClass();
                                return (haj) objB5;
                            case 6:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB6 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ok7.class);
                                objB6.getClass();
                                return (ok7) objB6;
                            case 7:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB7 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ui0.class);
                                objB7.getClass();
                                return (ui0) objB7;
                            case 8:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB8 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(p87.class);
                                objB8.getClass();
                                return (p87) objB8;
                            case 9:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB9 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(nu0.class);
                                objB9.getClass();
                                return (nu0) objB9;
                            case 10:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB10 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(dl2.class);
                                objB10.getClass();
                                return (dl2) objB10;
                            case 11:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB11 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(ya3.class);
                                objB11.getClass();
                                return (ya3) objB11;
                            case 12:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB12 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uk4.class);
                                objB12.getClass();
                                return (uk4) objB12;
                            case 13:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB13 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(er4.class);
                                objB13.getClass();
                                return (er4) objB13;
                            case 14:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB14 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uz6.class);
                                objB14.getClass();
                                return (uz6) objB14;
                            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB15 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(hb7.class);
                                objB15.getClass();
                                y6a.r(objB15);
                                throw null;
                            case 16:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB16 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(tga.class);
                                objB16.getClass();
                                return (tga) objB16;
                            case g.MAX_FIELD_NUMBER /* 17 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB17 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB17.getClass();
                                return (o7) objB17;
                            case g.AVG_FIELD_NUMBER /* 18 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB18 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(j2d.class);
                                objB18.getClass();
                                return (j2d) objB18;
                            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB19 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB19.getClass();
                                return (o7) objB19;
                            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB20 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(i8.class);
                                objB20.getClass();
                                return (i8) objB20;
                            case 21:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB21 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(xjc.class);
                                objB21.getClass();
                                return (xjc) objB21;
                            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB22 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(gae.class);
                                objB22.getClass();
                                return (gae) objB22;
                            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB23 = ((qre) m7fVar.a(jce.a.b(qre.class), nai.s, null)).b(rmb.class);
                                objB23.getClass();
                                y6a.r(objB23);
                                throw null;
                            case 24:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB24 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(uz6.class);
                                objB24.getClass();
                                return (uz6) objB24;
                            case BuildConfig.VERSION_CODE /* 25 */:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB25 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(p2a.class);
                                objB25.getClass();
                                return (p2a) objB25;
                            case 26:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB26 = ((qre) m7fVar.a(jce.a.b(qre.class), b2c.a, null)).b(a78.class);
                                objB26.getClass();
                                return (a78) objB26;
                            case 27:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB27 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(o7.class);
                                objB27.getClass();
                                return (o7) objB27;
                            case 28:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB28 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(uf7.class);
                                objB28.getClass();
                                return (uf7) objB28;
                            default:
                                m7fVar.getClass();
                                bscVar.getClass();
                                Object objB29 = ((qre) m7fVar.a(jce.a.b(qre.class), null, null)).b(mk7.class);
                                objB29.getClass();
                                return (mk7) objB29;
                        }
                    }
                }, kq9Var10), oqbVar11);
                oqbVar11.d.add(xaiVar5);
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                xe4 xe4Var = eg0.a;
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                oqb oqbVar12 = (oqb) obj;
                oqbVar12.getClass();
                fg0 fg0Var = new fg0(0);
                kce kceVar10 = jce.a;
                pl9 pl9VarB13 = kceVar10.b(b4e.class);
                mrg mrgVar6 = dpf.K;
                kq9 kq9Var11 = kq9.F;
                oqbVar12.a(new ge7(new qh1(mrgVar6, pl9VarB13, null, fg0Var, kq9Var11)));
                ij0.v(new qh1(mrgVar6, kceVar10.b(x89.class), null, new fg0(1), kq9Var11), oqbVar12);
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                oqb oqbVar13 = (oqb) obj;
                oqbVar13.getClass();
                sq6.C(new qh1(dpf.K, jce.a.b(AppEnvironment.class), null, new fg0(2), kq9.E), oqbVar13);
                break;
            case 21:
                oqb oqbVar14 = (oqb) obj;
                oqbVar14.getClass();
                sq6.C(new qh1(dpf.K, jce.a.b(fk0.class), null, new fg0(3), kq9.E), oqbVar14);
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                oqb oqbVar15 = (oqb) obj;
                oqbVar15.getClass();
                fg0 fg0Var2 = new fg0(4);
                kce kceVar11 = jce.a;
                pl9 pl9VarB14 = kceVar11.b(b78.class);
                mrg mrgVar7 = dpf.K;
                kq9 kq9Var12 = kq9.E;
                oqbVar15.a(new t7g(new qh1(mrgVar7, pl9VarB14, null, fg0Var2, kq9Var12)));
                oqbVar15.a(new t7g(new qh1(mrgVar7, kceVar11.b(c78.class), null, new d8(14), kq9Var12)));
                sq6.C(new qh1(mrgVar7, kceVar11.b(g78.class), null, new d8(15), kq9Var12), oqbVar15);
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                oqb oqbVar16 = (oqb) obj;
                oqbVar16.getClass();
                kce kceVar12 = jce.a;
                xai xaiVar6 = new xai(kceVar12.b(j8.class));
                d8 d8Var4 = new d8(i3);
                pl9 pl9VarB15 = kceVar12.b(ok0.class);
                kq9 kq9Var13 = kq9.G;
                oqbVar16.a(new w7f(new qh1(xaiVar6, pl9VarB15, null, d8Var4, kq9Var13)));
                oqbVar16.a(new w7f(new qh1(xaiVar6, kceVar12.b(vob.class), null, new d8(i2), kq9Var13)));
                oqbVar16.a(new w7f(new qh1(xaiVar6, kceVar12.b(yjc.class), null, new fg0(i12), kq9Var13)));
                oqbVar16.a(new w7f(new qh1(xaiVar6, kceVar12.b(vl0.class), null, new fg0(6), kq9Var13)));
                sq6.E(new qh1(xaiVar6, kceVar12.b(tl0.class), null, new d8(13), kq9Var13), oqbVar16);
                oqbVar16.d.add(xaiVar6);
                break;
            case 24:
                oqb oqbVar17 = (oqb) obj;
                oqbVar17.getClass();
                kce kceVar13 = jce.a;
                xai xaiVar7 = new xai(kceVar13.b(zni.class));
                w7f w7fVar = new w7f(new qh1(xaiVar7, kceVar13.b(jk0.class), null, new d8(i4), kq9.G));
                oqbVar17.a(w7fVar);
                pl9 pl9VarB16 = kceVar13.b(n8.class);
                qh1 qh1Var3 = w7fVar.a;
                qh1Var3.f = w44.b1(qh1Var3.f, pl9VarB16);
                rzd rzdVar3 = qh1Var3.c;
                rzd rzdVar4 = qh1Var3.a;
                StringBuilder sb2 = new StringBuilder();
                sq6.D(pl9VarB16, sb2, ':');
                if (rzdVar3 == null || (value2 = rzdVar3.getValue()) == null) {
                    value2 = "";
                }
                oqbVar17.c.put(sq6.w(sb2, value2, ':', rzdVar4), w7fVar);
                oqbVar17.d.add(xaiVar7);
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                oqb oqbVar18 = (oqb) obj;
                oqbVar18.getClass();
                sq6.C(new qh1(dpf.K, jce.a.b(am0.class), null, new fg0(i13), kq9.E), oqbVar18);
                break;
            case 26:
                kq0 kq0Var = (kq0) obj;
                kq0Var.getClass();
                break;
            case 27:
                oqb oqbVar19 = (oqb) obj;
                oqbVar19.getClass();
                kce kceVar14 = jce.a;
                xai xaiVar8 = new xai(kceVar14.b(zni.class));
                fg0 fg0Var3 = new fg0(i14);
                pl9 pl9VarB17 = kceVar14.b(js0.class);
                kq9 kq9Var14 = kq9.G;
                oqbVar19.a(new w7f(new qh1(xaiVar8, pl9VarB17, null, fg0Var3, kq9Var14)));
                oqbVar19.a(new w7f(new qh1(xaiVar8, kceVar14.b(saj.class), null, new fg0(i6), kq9Var14)));
                sq6.E(new qh1(xaiVar8, kceVar14.b(lq0.class), null, new d8(i5), kq9Var14), oqbVar19);
                oqbVar19.d.add(xaiVar8);
                break;
            case 28:
                oqb oqbVar20 = (oqb) obj;
                oqbVar20.getClass();
                d8 d8Var5 = new d8(i11);
                kce kceVar15 = jce.a;
                pl9 pl9VarB18 = kceVar15.b(y31.class);
                mrg mrgVar8 = dpf.K;
                kq9 kq9Var15 = kq9.F;
                oqbVar20.a(new ge7(new qh1(mrgVar8, pl9VarB18, null, d8Var5, kq9Var15)));
                oqbVar20.a(new ge7(new qh1(mrgVar8, kceVar15.b(akb.class), null, new fg0(i10), kq9Var15)));
                oqbVar20.a(new ge7(new qh1(mrgVar8, kceVar15.b(dkb.class), null, new d8(i9), kq9Var15)));
                oqbVar20.a(new ge7(new qh1(mrgVar8, kceVar15.b(x51.class), null, new d8(i8), kq9Var15)));
                sq6.C(new qh1(mrgVar8, kceVar15.b(p41.class), null, new d8(i7), kq9.E), oqbVar20);
                break;
            default:
                int i49 = bg1.b;
                break;
        }
        return ieiVar;
    }
}
