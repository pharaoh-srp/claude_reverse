package defpackage;

import com.anthropic.claude.analytics.events.SettingsEvents$SettingsAdvancedResearchToggle;
import com.anthropic.claude.analytics.events.SettingsEvents$SettingsAiArtifactsToggle;
import com.anthropic.claude.analytics.events.SettingsEvents$SettingsArtifactsToggle;
import com.anthropic.claude.analytics.events.SettingsEvents$SettingsRemoteTerminalToggle;
import com.anthropic.claude.analytics.events.SettingsEvents$SettingsWebSearchToggle;
import com.anthropic.claude.api.model.ModelOption;
import com.anthropic.claude.models.organization.configtypes.BetaToolsConfig;
import com.anthropic.claude.types.strings.ModelId;
import com.anthropic.claude.types.strings.ResearchMode;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class q0i {
    public static final o0i G;
    public static final long H;
    public final jk5 A;
    public final jk5 B;
    public final lsc C;
    public final g5c D;
    public final ra4 E;
    public final p60 F;
    public final o7 a;
    public final f9 b;
    public final qi3 c;
    public final vd3 d;
    public final xa3 e;
    public final uf7 f;
    public final tg7 g;
    public final swa h;
    public final l0b i;
    public final pkc j;
    public final rc8 k;
    public final uk4 l;
    public final b1i m;
    public final abj n;
    public final myh o;
    public final koi p;
    public final String q;
    public final nf7 r;
    public final loi s;
    public final smh t;
    public final vn5 u;
    public final zy1 v;
    public final jxb w;
    public fkg x;
    public final g5c y;
    public final p60 z;

    static {
        iec iecVar = new iec(9);
        String.CASE_INSENSITIVE_ORDER.getClass();
        G = new o0i(iecVar);
        lz1 lz1Var = uh6.F;
        H = v40.Q(30, zh6.SECONDS);
    }

    public q0i(o7 o7Var, f9 f9Var, qi3 qi3Var, vd3 vd3Var, xa3 xa3Var, uf7 uf7Var, tg7 tg7Var, swa swaVar, l0b l0bVar, pkc pkcVar, rc8 rc8Var, uk4 uk4Var, b1i b1iVar, abj abjVar, myh myhVar, koi koiVar, String str, nf7 nf7Var, loi loiVar, smh smhVar, vn5 vn5Var) {
        str.getClass();
        this.a = o7Var;
        this.b = f9Var;
        this.c = qi3Var;
        this.d = vd3Var;
        this.e = xa3Var;
        this.f = uf7Var;
        this.g = tg7Var;
        this.h = swaVar;
        this.i = l0bVar;
        this.j = pkcVar;
        this.k = rc8Var;
        this.l = uk4Var;
        this.m = b1iVar;
        this.n = abjVar;
        this.o = myhVar;
        this.p = koiVar;
        this.q = str;
        this.r = nf7Var;
        this.s = loiVar;
        this.t = smhVar;
        this.u = vn5Var;
        this.v = x44.a();
        this.w = new jxb();
        final int i = 13;
        final int i2 = 1;
        tp4 tp4Var = null;
        final int i3 = 0;
        final int i4 = 9;
        int i5 = 20;
        this.y = knk.c(new tzh(this, i), new tzh(this, i2), new wzh(this, 2), new tzh(this, 8), new yeg(24), new w3c(new zzh(this, tp4Var, i3), new zzh(this, tp4Var, i2), new bz7(this) { // from class: uzh
            public final /* synthetic */ q0i F;

            {
                this.F = this;
            }

            @Override // defpackage.bz7
            public final Object invoke(Object obj) {
                String str2;
                int i6 = i4;
                int i7 = 0;
                iei ieiVar = iei.a;
                q0i q0iVar = this.F;
                switch (i6) {
                    case 0:
                        q0iVar.c.e(new SettingsEvents$SettingsArtifactsToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsArtifactsToggle.class)));
                        break;
                    case 1:
                        q0iVar.b.d(new q8(((Boolean) obj).booleanValue(), 9));
                        break;
                    case 2:
                        q0iVar.c.e(new SettingsEvents$SettingsAiArtifactsToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsAiArtifactsToggle.class)));
                        break;
                    case 3:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        lsc lscVar = q0iVar.C;
                        if (zBooleanValue) {
                            ResearchMode.Companion.getClass();
                            str2 = ResearchMode.ADVANCED;
                        } else {
                            ResearchMode.Companion.getClass();
                            str2 = ResearchMode.NONE;
                        }
                        lscVar.setValue(str2 != null ? ResearchMode.m1093boximpl(str2) : null);
                        break;
                    case 4:
                        znb znbVar = (znb) obj;
                        znbVar.getClass();
                        ModelOption modelOptionC = q0iVar.c(znbVar);
                        break;
                    case 5:
                        q0iVar.c.e(new SettingsEvents$SettingsAdvancedResearchToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsAdvancedResearchToggle.class)));
                        break;
                    case 6:
                        Map map = (Map) obj;
                        map.getClass();
                        q0iVar.b.d(new t8(i7, map));
                        break;
                    case 7:
                        q0iVar.b.d(new q8(((Boolean) obj).booleanValue(), 12));
                        break;
                    case 8:
                        q0iVar.c.e(new SettingsEvents$SettingsRemoteTerminalToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsRemoteTerminalToggle.class)));
                        break;
                    case 9:
                        q0iVar.o.q(((Boolean) obj).booleanValue());
                        break;
                    case 10:
                        znb znbVar2 = (znb) obj;
                        znbVar2.getClass();
                        ModelOption modelOptionC2 = q0iVar.c(znbVar2);
                        break;
                    case 11:
                        q0iVar.b.d(new s8(((Boolean) obj).booleanValue(), 0));
                        break;
                    case 12:
                        q0iVar.c.e(new SettingsEvents$SettingsWebSearchToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsWebSearchToggle.class)));
                        break;
                    default:
                        q0iVar.b.d(new q8(((Boolean) obj).booleanValue(), 8));
                        break;
                }
                return ieiVar;
            }
        }), new nlh(i5), null, new yeg(25), null, 512);
        final int i6 = 10;
        final int i7 = 11;
        Class<xa3> cls = xa3.class;
        String str2 = "updateWebSearchEnabledCache";
        String str3 = "updateWebSearchEnabledCache-8oKUXRw(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;";
        final int i8 = 12;
        this.z = knk.a(new tzh(this, 16), new tzh(this, 17), new tzh(this, 18), new wzh(this, 7), new bz7(this) { // from class: uzh
            public final /* synthetic */ q0i F;

            {
                this.F = this;
            }

            @Override // defpackage.bz7
            public final Object invoke(Object obj) {
                String str22;
                int i62 = i6;
                int i72 = 0;
                iei ieiVar = iei.a;
                q0i q0iVar = this.F;
                switch (i62) {
                    case 0:
                        q0iVar.c.e(new SettingsEvents$SettingsArtifactsToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsArtifactsToggle.class)));
                        break;
                    case 1:
                        q0iVar.b.d(new q8(((Boolean) obj).booleanValue(), 9));
                        break;
                    case 2:
                        q0iVar.c.e(new SettingsEvents$SettingsAiArtifactsToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsAiArtifactsToggle.class)));
                        break;
                    case 3:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        lsc lscVar = q0iVar.C;
                        if (zBooleanValue) {
                            ResearchMode.Companion.getClass();
                            str22 = ResearchMode.ADVANCED;
                        } else {
                            ResearchMode.Companion.getClass();
                            str22 = ResearchMode.NONE;
                        }
                        lscVar.setValue(str22 != null ? ResearchMode.m1093boximpl(str22) : null);
                        break;
                    case 4:
                        znb znbVar = (znb) obj;
                        znbVar.getClass();
                        ModelOption modelOptionC = q0iVar.c(znbVar);
                        break;
                    case 5:
                        q0iVar.c.e(new SettingsEvents$SettingsAdvancedResearchToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsAdvancedResearchToggle.class)));
                        break;
                    case 6:
                        Map map = (Map) obj;
                        map.getClass();
                        q0iVar.b.d(new t8(i72, map));
                        break;
                    case 7:
                        q0iVar.b.d(new q8(((Boolean) obj).booleanValue(), 12));
                        break;
                    case 8:
                        q0iVar.c.e(new SettingsEvents$SettingsRemoteTerminalToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsRemoteTerminalToggle.class)));
                        break;
                    case 9:
                        q0iVar.o.q(((Boolean) obj).booleanValue());
                        break;
                    case 10:
                        znb znbVar2 = (znb) obj;
                        znbVar2.getClass();
                        ModelOption modelOptionC2 = q0iVar.c(znbVar2);
                        break;
                    case 11:
                        q0iVar.b.d(new s8(((Boolean) obj).booleanValue(), 0));
                        break;
                    case 12:
                        q0iVar.c.e(new SettingsEvents$SettingsWebSearchToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsWebSearchToggle.class)));
                        break;
                    default:
                        q0iVar.b.d(new q8(((Boolean) obj).booleanValue(), 8));
                        break;
                }
                return ieiVar;
            }
        }, new w3c(new vzh(this, tp4Var, 3), new bz7(this) { // from class: uzh
            public final /* synthetic */ q0i F;

            {
                this.F = this;
            }

            @Override // defpackage.bz7
            public final Object invoke(Object obj) {
                String str22;
                int i62 = i7;
                int i72 = 0;
                iei ieiVar = iei.a;
                q0i q0iVar = this.F;
                switch (i62) {
                    case 0:
                        q0iVar.c.e(new SettingsEvents$SettingsArtifactsToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsArtifactsToggle.class)));
                        break;
                    case 1:
                        q0iVar.b.d(new q8(((Boolean) obj).booleanValue(), 9));
                        break;
                    case 2:
                        q0iVar.c.e(new SettingsEvents$SettingsAiArtifactsToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsAiArtifactsToggle.class)));
                        break;
                    case 3:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        lsc lscVar = q0iVar.C;
                        if (zBooleanValue) {
                            ResearchMode.Companion.getClass();
                            str22 = ResearchMode.ADVANCED;
                        } else {
                            ResearchMode.Companion.getClass();
                            str22 = ResearchMode.NONE;
                        }
                        lscVar.setValue(str22 != null ? ResearchMode.m1093boximpl(str22) : null);
                        break;
                    case 4:
                        znb znbVar = (znb) obj;
                        znbVar.getClass();
                        ModelOption modelOptionC = q0iVar.c(znbVar);
                        break;
                    case 5:
                        q0iVar.c.e(new SettingsEvents$SettingsAdvancedResearchToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsAdvancedResearchToggle.class)));
                        break;
                    case 6:
                        Map map = (Map) obj;
                        map.getClass();
                        q0iVar.b.d(new t8(i72, map));
                        break;
                    case 7:
                        q0iVar.b.d(new q8(((Boolean) obj).booleanValue(), 12));
                        break;
                    case 8:
                        q0iVar.c.e(new SettingsEvents$SettingsRemoteTerminalToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsRemoteTerminalToggle.class)));
                        break;
                    case 9:
                        q0iVar.o.q(((Boolean) obj).booleanValue());
                        break;
                    case 10:
                        znb znbVar2 = (znb) obj;
                        znbVar2.getClass();
                        ModelOption modelOptionC2 = q0iVar.c(znbVar2);
                        break;
                    case 11:
                        q0iVar.b.d(new s8(((Boolean) obj).booleanValue(), 0));
                        break;
                    case 12:
                        q0iVar.c.e(new SettingsEvents$SettingsWebSearchToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsWebSearchToggle.class)));
                        break;
                    default:
                        q0iVar.b.d(new q8(((Boolean) obj).booleanValue(), 8));
                        break;
                }
                return ieiVar;
            }
        }, new l0i(3, xa3Var, xa3.class, "updateWebSearchEnabled", "updateWebSearchEnabled-8oKUXRw(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", 8, 2), new m0i(3, xa3Var, cls, str2, str3, 0, 2)), new tzh(this, 19), null, new bz7(this) { // from class: uzh
            public final /* synthetic */ q0i F;

            {
                this.F = this;
            }

            @Override // defpackage.bz7
            public final Object invoke(Object obj) {
                String str22;
                int i62 = i8;
                int i72 = 0;
                iei ieiVar = iei.a;
                q0i q0iVar = this.F;
                switch (i62) {
                    case 0:
                        q0iVar.c.e(new SettingsEvents$SettingsArtifactsToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsArtifactsToggle.class)));
                        break;
                    case 1:
                        q0iVar.b.d(new q8(((Boolean) obj).booleanValue(), 9));
                        break;
                    case 2:
                        q0iVar.c.e(new SettingsEvents$SettingsAiArtifactsToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsAiArtifactsToggle.class)));
                        break;
                    case 3:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        lsc lscVar = q0iVar.C;
                        if (zBooleanValue) {
                            ResearchMode.Companion.getClass();
                            str22 = ResearchMode.ADVANCED;
                        } else {
                            ResearchMode.Companion.getClass();
                            str22 = ResearchMode.NONE;
                        }
                        lscVar.setValue(str22 != null ? ResearchMode.m1093boximpl(str22) : null);
                        break;
                    case 4:
                        znb znbVar = (znb) obj;
                        znbVar.getClass();
                        ModelOption modelOptionC = q0iVar.c(znbVar);
                        break;
                    case 5:
                        q0iVar.c.e(new SettingsEvents$SettingsAdvancedResearchToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsAdvancedResearchToggle.class)));
                        break;
                    case 6:
                        Map map = (Map) obj;
                        map.getClass();
                        q0iVar.b.d(new t8(i72, map));
                        break;
                    case 7:
                        q0iVar.b.d(new q8(((Boolean) obj).booleanValue(), 12));
                        break;
                    case 8:
                        q0iVar.c.e(new SettingsEvents$SettingsRemoteTerminalToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsRemoteTerminalToggle.class)));
                        break;
                    case 9:
                        q0iVar.o.q(((Boolean) obj).booleanValue());
                        break;
                    case 10:
                        znb znbVar2 = (znb) obj;
                        znbVar2.getClass();
                        ModelOption modelOptionC2 = q0iVar.c(znbVar2);
                        break;
                    case 11:
                        q0iVar.b.d(new s8(((Boolean) obj).booleanValue(), 0));
                        break;
                    case 12:
                        q0iVar.c.e(new SettingsEvents$SettingsWebSearchToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsWebSearchToggle.class)));
                        break;
                    default:
                        q0iVar.b.d(new q8(((Boolean) obj).booleanValue(), 8));
                        break;
                }
                return ieiVar;
            }
        }, 384);
        this.A = new jk5(new cbf(new bz7(this) { // from class: uzh
            public final /* synthetic */ q0i F;

            {
                this.F = this;
            }

            @Override // defpackage.bz7
            public final Object invoke(Object obj) {
                String str22;
                int i62 = i;
                int i72 = 0;
                iei ieiVar = iei.a;
                q0i q0iVar = this.F;
                switch (i62) {
                    case 0:
                        q0iVar.c.e(new SettingsEvents$SettingsArtifactsToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsArtifactsToggle.class)));
                        break;
                    case 1:
                        q0iVar.b.d(new q8(((Boolean) obj).booleanValue(), 9));
                        break;
                    case 2:
                        q0iVar.c.e(new SettingsEvents$SettingsAiArtifactsToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsAiArtifactsToggle.class)));
                        break;
                    case 3:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        lsc lscVar = q0iVar.C;
                        if (zBooleanValue) {
                            ResearchMode.Companion.getClass();
                            str22 = ResearchMode.ADVANCED;
                        } else {
                            ResearchMode.Companion.getClass();
                            str22 = ResearchMode.NONE;
                        }
                        lscVar.setValue(str22 != null ? ResearchMode.m1093boximpl(str22) : null);
                        break;
                    case 4:
                        znb znbVar = (znb) obj;
                        znbVar.getClass();
                        ModelOption modelOptionC = q0iVar.c(znbVar);
                        break;
                    case 5:
                        q0iVar.c.e(new SettingsEvents$SettingsAdvancedResearchToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsAdvancedResearchToggle.class)));
                        break;
                    case 6:
                        Map map = (Map) obj;
                        map.getClass();
                        q0iVar.b.d(new t8(i72, map));
                        break;
                    case 7:
                        q0iVar.b.d(new q8(((Boolean) obj).booleanValue(), 12));
                        break;
                    case 8:
                        q0iVar.c.e(new SettingsEvents$SettingsRemoteTerminalToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsRemoteTerminalToggle.class)));
                        break;
                    case 9:
                        q0iVar.o.q(((Boolean) obj).booleanValue());
                        break;
                    case 10:
                        znb znbVar2 = (znb) obj;
                        znbVar2.getClass();
                        ModelOption modelOptionC2 = q0iVar.c(znbVar2);
                        break;
                    case 11:
                        q0iVar.b.d(new s8(((Boolean) obj).booleanValue(), 0));
                        break;
                    case 12:
                        q0iVar.c.e(new SettingsEvents$SettingsWebSearchToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsWebSearchToggle.class)));
                        break;
                    default:
                        q0iVar.b.d(new q8(((Boolean) obj).booleanValue(), 8));
                        break;
                }
                return ieiVar;
            }
        }, new vzh(this, tp4Var, i2)), new tzh(this, i5), new nlh(i5), new xzh(this, i2), new wzh(this, i2), new tzh(this, i3), new bz7(this) { // from class: uzh
            public final /* synthetic */ q0i F;

            {
                this.F = this;
            }

            @Override // defpackage.bz7
            public final Object invoke(Object obj) {
                String str22;
                int i62 = i3;
                int i72 = 0;
                iei ieiVar = iei.a;
                q0i q0iVar = this.F;
                switch (i62) {
                    case 0:
                        q0iVar.c.e(new SettingsEvents$SettingsArtifactsToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsArtifactsToggle.class)));
                        break;
                    case 1:
                        q0iVar.b.d(new q8(((Boolean) obj).booleanValue(), 9));
                        break;
                    case 2:
                        q0iVar.c.e(new SettingsEvents$SettingsAiArtifactsToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsAiArtifactsToggle.class)));
                        break;
                    case 3:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        lsc lscVar = q0iVar.C;
                        if (zBooleanValue) {
                            ResearchMode.Companion.getClass();
                            str22 = ResearchMode.ADVANCED;
                        } else {
                            ResearchMode.Companion.getClass();
                            str22 = ResearchMode.NONE;
                        }
                        lscVar.setValue(str22 != null ? ResearchMode.m1093boximpl(str22) : null);
                        break;
                    case 4:
                        znb znbVar = (znb) obj;
                        znbVar.getClass();
                        ModelOption modelOptionC = q0iVar.c(znbVar);
                        break;
                    case 5:
                        q0iVar.c.e(new SettingsEvents$SettingsAdvancedResearchToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsAdvancedResearchToggle.class)));
                        break;
                    case 6:
                        Map map = (Map) obj;
                        map.getClass();
                        q0iVar.b.d(new t8(i72, map));
                        break;
                    case 7:
                        q0iVar.b.d(new q8(((Boolean) obj).booleanValue(), 12));
                        break;
                    case 8:
                        q0iVar.c.e(new SettingsEvents$SettingsRemoteTerminalToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsRemoteTerminalToggle.class)));
                        break;
                    case 9:
                        q0iVar.o.q(((Boolean) obj).booleanValue());
                        break;
                    case 10:
                        znb znbVar2 = (znb) obj;
                        znbVar2.getClass();
                        ModelOption modelOptionC2 = q0iVar.c(znbVar2);
                        break;
                    case 11:
                        q0iVar.b.d(new s8(((Boolean) obj).booleanValue(), 0));
                        break;
                    case 12:
                        q0iVar.c.e(new SettingsEvents$SettingsWebSearchToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsWebSearchToggle.class)));
                        break;
                    default:
                        q0iVar.b.d(new q8(((Boolean) obj).booleanValue(), 8));
                        break;
                }
                return ieiVar;
            }
        });
        final int i9 = 2;
        final int i10 = 4;
        this.B = new jk5(new cbf(new bz7(this) { // from class: uzh
            public final /* synthetic */ q0i F;

            {
                this.F = this;
            }

            @Override // defpackage.bz7
            public final Object invoke(Object obj) {
                String str22;
                int i62 = i2;
                int i72 = 0;
                iei ieiVar = iei.a;
                q0i q0iVar = this.F;
                switch (i62) {
                    case 0:
                        q0iVar.c.e(new SettingsEvents$SettingsArtifactsToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsArtifactsToggle.class)));
                        break;
                    case 1:
                        q0iVar.b.d(new q8(((Boolean) obj).booleanValue(), 9));
                        break;
                    case 2:
                        q0iVar.c.e(new SettingsEvents$SettingsAiArtifactsToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsAiArtifactsToggle.class)));
                        break;
                    case 3:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        lsc lscVar = q0iVar.C;
                        if (zBooleanValue) {
                            ResearchMode.Companion.getClass();
                            str22 = ResearchMode.ADVANCED;
                        } else {
                            ResearchMode.Companion.getClass();
                            str22 = ResearchMode.NONE;
                        }
                        lscVar.setValue(str22 != null ? ResearchMode.m1093boximpl(str22) : null);
                        break;
                    case 4:
                        znb znbVar = (znb) obj;
                        znbVar.getClass();
                        ModelOption modelOptionC = q0iVar.c(znbVar);
                        break;
                    case 5:
                        q0iVar.c.e(new SettingsEvents$SettingsAdvancedResearchToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsAdvancedResearchToggle.class)));
                        break;
                    case 6:
                        Map map = (Map) obj;
                        map.getClass();
                        q0iVar.b.d(new t8(i72, map));
                        break;
                    case 7:
                        q0iVar.b.d(new q8(((Boolean) obj).booleanValue(), 12));
                        break;
                    case 8:
                        q0iVar.c.e(new SettingsEvents$SettingsRemoteTerminalToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsRemoteTerminalToggle.class)));
                        break;
                    case 9:
                        q0iVar.o.q(((Boolean) obj).booleanValue());
                        break;
                    case 10:
                        znb znbVar2 = (znb) obj;
                        znbVar2.getClass();
                        ModelOption modelOptionC2 = q0iVar.c(znbVar2);
                        break;
                    case 11:
                        q0iVar.b.d(new s8(((Boolean) obj).booleanValue(), 0));
                        break;
                    case 12:
                        q0iVar.c.e(new SettingsEvents$SettingsWebSearchToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsWebSearchToggle.class)));
                        break;
                    default:
                        q0iVar.b.d(new q8(((Boolean) obj).booleanValue(), 8));
                        break;
                }
                return ieiVar;
            }
        }, new vzh(this, tp4Var, i3)), new tzh(this, i9), new tzh(this, 3), new xzh(this, i3), new wzh(this, i3), new tzh(this, i10), new bz7(this) { // from class: uzh
            public final /* synthetic */ q0i F;

            {
                this.F = this;
            }

            @Override // defpackage.bz7
            public final Object invoke(Object obj) {
                String str22;
                int i62 = i9;
                int i72 = 0;
                iei ieiVar = iei.a;
                q0i q0iVar = this.F;
                switch (i62) {
                    case 0:
                        q0iVar.c.e(new SettingsEvents$SettingsArtifactsToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsArtifactsToggle.class)));
                        break;
                    case 1:
                        q0iVar.b.d(new q8(((Boolean) obj).booleanValue(), 9));
                        break;
                    case 2:
                        q0iVar.c.e(new SettingsEvents$SettingsAiArtifactsToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsAiArtifactsToggle.class)));
                        break;
                    case 3:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        lsc lscVar = q0iVar.C;
                        if (zBooleanValue) {
                            ResearchMode.Companion.getClass();
                            str22 = ResearchMode.ADVANCED;
                        } else {
                            ResearchMode.Companion.getClass();
                            str22 = ResearchMode.NONE;
                        }
                        lscVar.setValue(str22 != null ? ResearchMode.m1093boximpl(str22) : null);
                        break;
                    case 4:
                        znb znbVar = (znb) obj;
                        znbVar.getClass();
                        ModelOption modelOptionC = q0iVar.c(znbVar);
                        break;
                    case 5:
                        q0iVar.c.e(new SettingsEvents$SettingsAdvancedResearchToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsAdvancedResearchToggle.class)));
                        break;
                    case 6:
                        Map map = (Map) obj;
                        map.getClass();
                        q0iVar.b.d(new t8(i72, map));
                        break;
                    case 7:
                        q0iVar.b.d(new q8(((Boolean) obj).booleanValue(), 12));
                        break;
                    case 8:
                        q0iVar.c.e(new SettingsEvents$SettingsRemoteTerminalToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsRemoteTerminalToggle.class)));
                        break;
                    case 9:
                        q0iVar.o.q(((Boolean) obj).booleanValue());
                        break;
                    case 10:
                        znb znbVar2 = (znb) obj;
                        znbVar2.getClass();
                        ModelOption modelOptionC2 = q0iVar.c(znbVar2);
                        break;
                    case 11:
                        q0iVar.b.d(new s8(((Boolean) obj).booleanValue(), 0));
                        break;
                    case 12:
                        q0iVar.c.e(new SettingsEvents$SettingsWebSearchToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsWebSearchToggle.class)));
                        break;
                    default:
                        q0iVar.b.d(new q8(((Boolean) obj).booleanValue(), 8));
                        break;
                }
                return ieiVar;
            }
        });
        this.C = mpk.P(null);
        l0i l0iVar = new l0i(3, xa3Var, xa3.class, "updateResearchEnabled", "updateResearchEnabled-8oKUXRw(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", 8, 1);
        m0i m0iVar = new m0i(3, xa3Var, xa3.class, "updateResearchEnabledCache", "updateResearchEnabledCache-8oKUXRw(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 1);
        final int i11 = 3;
        w3c w3cVar = new w3c(l0iVar, m0iVar, new bz7(this) { // from class: uzh
            public final /* synthetic */ q0i F;

            {
                this.F = this;
            }

            @Override // defpackage.bz7
            public final Object invoke(Object obj) {
                String str22;
                int i62 = i11;
                int i72 = 0;
                iei ieiVar = iei.a;
                q0i q0iVar = this.F;
                switch (i62) {
                    case 0:
                        q0iVar.c.e(new SettingsEvents$SettingsArtifactsToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsArtifactsToggle.class)));
                        break;
                    case 1:
                        q0iVar.b.d(new q8(((Boolean) obj).booleanValue(), 9));
                        break;
                    case 2:
                        q0iVar.c.e(new SettingsEvents$SettingsAiArtifactsToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsAiArtifactsToggle.class)));
                        break;
                    case 3:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        lsc lscVar = q0iVar.C;
                        if (zBooleanValue) {
                            ResearchMode.Companion.getClass();
                            str22 = ResearchMode.ADVANCED;
                        } else {
                            ResearchMode.Companion.getClass();
                            str22 = ResearchMode.NONE;
                        }
                        lscVar.setValue(str22 != null ? ResearchMode.m1093boximpl(str22) : null);
                        break;
                    case 4:
                        znb znbVar = (znb) obj;
                        znbVar.getClass();
                        ModelOption modelOptionC = q0iVar.c(znbVar);
                        break;
                    case 5:
                        q0iVar.c.e(new SettingsEvents$SettingsAdvancedResearchToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsAdvancedResearchToggle.class)));
                        break;
                    case 6:
                        Map map = (Map) obj;
                        map.getClass();
                        q0iVar.b.d(new t8(i72, map));
                        break;
                    case 7:
                        q0iVar.b.d(new q8(((Boolean) obj).booleanValue(), 12));
                        break;
                    case 8:
                        q0iVar.c.e(new SettingsEvents$SettingsRemoteTerminalToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsRemoteTerminalToggle.class)));
                        break;
                    case 9:
                        q0iVar.o.q(((Boolean) obj).booleanValue());
                        break;
                    case 10:
                        znb znbVar2 = (znb) obj;
                        znbVar2.getClass();
                        ModelOption modelOptionC2 = q0iVar.c(znbVar2);
                        break;
                    case 11:
                        q0iVar.b.d(new s8(((Boolean) obj).booleanValue(), 0));
                        break;
                    case 12:
                        q0iVar.c.e(new SettingsEvents$SettingsWebSearchToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsWebSearchToggle.class)));
                        break;
                    default:
                        q0iVar.b.d(new q8(((Boolean) obj).booleanValue(), 8));
                        break;
                }
                return ieiVar;
            }
        });
        final int i12 = 5;
        final int i13 = 6;
        this.D = knk.c(new tzh(this, i12), new tzh(this, i13), new wzh(this, i13), new tzh(this, 7), new bz7(this) { // from class: uzh
            public final /* synthetic */ q0i F;

            {
                this.F = this;
            }

            @Override // defpackage.bz7
            public final Object invoke(Object obj) {
                String str22;
                int i62 = i10;
                int i72 = 0;
                iei ieiVar = iei.a;
                q0i q0iVar = this.F;
                switch (i62) {
                    case 0:
                        q0iVar.c.e(new SettingsEvents$SettingsArtifactsToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsArtifactsToggle.class)));
                        break;
                    case 1:
                        q0iVar.b.d(new q8(((Boolean) obj).booleanValue(), 9));
                        break;
                    case 2:
                        q0iVar.c.e(new SettingsEvents$SettingsAiArtifactsToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsAiArtifactsToggle.class)));
                        break;
                    case 3:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        lsc lscVar = q0iVar.C;
                        if (zBooleanValue) {
                            ResearchMode.Companion.getClass();
                            str22 = ResearchMode.ADVANCED;
                        } else {
                            ResearchMode.Companion.getClass();
                            str22 = ResearchMode.NONE;
                        }
                        lscVar.setValue(str22 != null ? ResearchMode.m1093boximpl(str22) : null);
                        break;
                    case 4:
                        znb znbVar = (znb) obj;
                        znbVar.getClass();
                        ModelOption modelOptionC = q0iVar.c(znbVar);
                        break;
                    case 5:
                        q0iVar.c.e(new SettingsEvents$SettingsAdvancedResearchToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsAdvancedResearchToggle.class)));
                        break;
                    case 6:
                        Map map = (Map) obj;
                        map.getClass();
                        q0iVar.b.d(new t8(i72, map));
                        break;
                    case 7:
                        q0iVar.b.d(new q8(((Boolean) obj).booleanValue(), 12));
                        break;
                    case 8:
                        q0iVar.c.e(new SettingsEvents$SettingsRemoteTerminalToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsRemoteTerminalToggle.class)));
                        break;
                    case 9:
                        q0iVar.o.q(((Boolean) obj).booleanValue());
                        break;
                    case 10:
                        znb znbVar2 = (znb) obj;
                        znbVar2.getClass();
                        ModelOption modelOptionC2 = q0iVar.c(znbVar2);
                        break;
                    case 11:
                        q0iVar.b.d(new s8(((Boolean) obj).booleanValue(), 0));
                        break;
                    case 12:
                        q0iVar.c.e(new SettingsEvents$SettingsWebSearchToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsWebSearchToggle.class)));
                        break;
                    default:
                        q0iVar.b.d(new q8(((Boolean) obj).booleanValue(), 8));
                        break;
                }
                return ieiVar;
            }
        }, w3cVar, null, new xzh(this, 3), new bz7(this) { // from class: uzh
            public final /* synthetic */ q0i F;

            {
                this.F = this;
            }

            @Override // defpackage.bz7
            public final Object invoke(Object obj) {
                String str22;
                int i62 = i12;
                int i72 = 0;
                iei ieiVar = iei.a;
                q0i q0iVar = this.F;
                switch (i62) {
                    case 0:
                        q0iVar.c.e(new SettingsEvents$SettingsArtifactsToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsArtifactsToggle.class)));
                        break;
                    case 1:
                        q0iVar.b.d(new q8(((Boolean) obj).booleanValue(), 9));
                        break;
                    case 2:
                        q0iVar.c.e(new SettingsEvents$SettingsAiArtifactsToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsAiArtifactsToggle.class)));
                        break;
                    case 3:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        lsc lscVar = q0iVar.C;
                        if (zBooleanValue) {
                            ResearchMode.Companion.getClass();
                            str22 = ResearchMode.ADVANCED;
                        } else {
                            ResearchMode.Companion.getClass();
                            str22 = ResearchMode.NONE;
                        }
                        lscVar.setValue(str22 != null ? ResearchMode.m1093boximpl(str22) : null);
                        break;
                    case 4:
                        znb znbVar = (znb) obj;
                        znbVar.getClass();
                        ModelOption modelOptionC = q0iVar.c(znbVar);
                        break;
                    case 5:
                        q0iVar.c.e(new SettingsEvents$SettingsAdvancedResearchToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsAdvancedResearchToggle.class)));
                        break;
                    case 6:
                        Map map = (Map) obj;
                        map.getClass();
                        q0iVar.b.d(new t8(i72, map));
                        break;
                    case 7:
                        q0iVar.b.d(new q8(((Boolean) obj).booleanValue(), 12));
                        break;
                    case 8:
                        q0iVar.c.e(new SettingsEvents$SettingsRemoteTerminalToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsRemoteTerminalToggle.class)));
                        break;
                    case 9:
                        q0iVar.o.q(((Boolean) obj).booleanValue());
                        break;
                    case 10:
                        znb znbVar2 = (znb) obj;
                        znbVar2.getClass();
                        ModelOption modelOptionC2 = q0iVar.c(znbVar2);
                        break;
                    case 11:
                        q0iVar.b.d(new s8(((Boolean) obj).booleanValue(), 0));
                        break;
                    case 12:
                        q0iVar.c.e(new SettingsEvents$SettingsWebSearchToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsWebSearchToggle.class)));
                        break;
                    default:
                        q0iVar.b.d(new q8(((Boolean) obj).booleanValue(), 8));
                        break;
                }
                return ieiVar;
            }
        }, new tzh(this, 9), 64);
        tzh tzhVar = new tzh(this, 10);
        wzh wzhVar = new wzh(this, 3);
        this.E = new ra4(new w3c(new rrb(this, tp4Var, 17), new bz7(this) { // from class: uzh
            public final /* synthetic */ q0i F;

            {
                this.F = this;
            }

            @Override // defpackage.bz7
            public final Object invoke(Object obj) {
                String str22;
                int i62 = i13;
                int i72 = 0;
                iei ieiVar = iei.a;
                q0i q0iVar = this.F;
                switch (i62) {
                    case 0:
                        q0iVar.c.e(new SettingsEvents$SettingsArtifactsToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsArtifactsToggle.class)));
                        break;
                    case 1:
                        q0iVar.b.d(new q8(((Boolean) obj).booleanValue(), 9));
                        break;
                    case 2:
                        q0iVar.c.e(new SettingsEvents$SettingsAiArtifactsToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsAiArtifactsToggle.class)));
                        break;
                    case 3:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        lsc lscVar = q0iVar.C;
                        if (zBooleanValue) {
                            ResearchMode.Companion.getClass();
                            str22 = ResearchMode.ADVANCED;
                        } else {
                            ResearchMode.Companion.getClass();
                            str22 = ResearchMode.NONE;
                        }
                        lscVar.setValue(str22 != null ? ResearchMode.m1093boximpl(str22) : null);
                        break;
                    case 4:
                        znb znbVar = (znb) obj;
                        znbVar.getClass();
                        ModelOption modelOptionC = q0iVar.c(znbVar);
                        break;
                    case 5:
                        q0iVar.c.e(new SettingsEvents$SettingsAdvancedResearchToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsAdvancedResearchToggle.class)));
                        break;
                    case 6:
                        Map map = (Map) obj;
                        map.getClass();
                        q0iVar.b.d(new t8(i72, map));
                        break;
                    case 7:
                        q0iVar.b.d(new q8(((Boolean) obj).booleanValue(), 12));
                        break;
                    case 8:
                        q0iVar.c.e(new SettingsEvents$SettingsRemoteTerminalToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsRemoteTerminalToggle.class)));
                        break;
                    case 9:
                        q0iVar.o.q(((Boolean) obj).booleanValue());
                        break;
                    case 10:
                        znb znbVar2 = (znb) obj;
                        znbVar2.getClass();
                        ModelOption modelOptionC2 = q0iVar.c(znbVar2);
                        break;
                    case 11:
                        q0iVar.b.d(new s8(((Boolean) obj).booleanValue(), 0));
                        break;
                    case 12:
                        q0iVar.c.e(new SettingsEvents$SettingsWebSearchToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsWebSearchToggle.class)));
                        break;
                    default:
                        q0iVar.b.d(new q8(((Boolean) obj).booleanValue(), 8));
                        break;
                }
                return ieiVar;
            }
        }, new a0i(this, tp4Var, i3), new a0i(this, tp4Var, i2)), new wzh(this, i10), tzhVar, wzhVar, new yga(i2, this), new u9g(i2, this));
        final int i14 = 7;
        final int i15 = 8;
        this.F = knk.a(new tzh(this, 11), new tzh(this, 12), new tzh(this, 14), new wzh(this, 5), new yeg(23), new w3c(new vzh(this, tp4Var, 2), new bz7(this) { // from class: uzh
            public final /* synthetic */ q0i F;

            {
                this.F = this;
            }

            @Override // defpackage.bz7
            public final Object invoke(Object obj) {
                String str22;
                int i62 = i14;
                int i72 = 0;
                iei ieiVar = iei.a;
                q0i q0iVar = this.F;
                switch (i62) {
                    case 0:
                        q0iVar.c.e(new SettingsEvents$SettingsArtifactsToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsArtifactsToggle.class)));
                        break;
                    case 1:
                        q0iVar.b.d(new q8(((Boolean) obj).booleanValue(), 9));
                        break;
                    case 2:
                        q0iVar.c.e(new SettingsEvents$SettingsAiArtifactsToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsAiArtifactsToggle.class)));
                        break;
                    case 3:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        lsc lscVar = q0iVar.C;
                        if (zBooleanValue) {
                            ResearchMode.Companion.getClass();
                            str22 = ResearchMode.ADVANCED;
                        } else {
                            ResearchMode.Companion.getClass();
                            str22 = ResearchMode.NONE;
                        }
                        lscVar.setValue(str22 != null ? ResearchMode.m1093boximpl(str22) : null);
                        break;
                    case 4:
                        znb znbVar = (znb) obj;
                        znbVar.getClass();
                        ModelOption modelOptionC = q0iVar.c(znbVar);
                        break;
                    case 5:
                        q0iVar.c.e(new SettingsEvents$SettingsAdvancedResearchToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsAdvancedResearchToggle.class)));
                        break;
                    case 6:
                        Map map = (Map) obj;
                        map.getClass();
                        q0iVar.b.d(new t8(i72, map));
                        break;
                    case 7:
                        q0iVar.b.d(new q8(((Boolean) obj).booleanValue(), 12));
                        break;
                    case 8:
                        q0iVar.c.e(new SettingsEvents$SettingsRemoteTerminalToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsRemoteTerminalToggle.class)));
                        break;
                    case 9:
                        q0iVar.o.q(((Boolean) obj).booleanValue());
                        break;
                    case 10:
                        znb znbVar2 = (znb) obj;
                        znbVar2.getClass();
                        ModelOption modelOptionC2 = q0iVar.c(znbVar2);
                        break;
                    case 11:
                        q0iVar.b.d(new s8(((Boolean) obj).booleanValue(), 0));
                        break;
                    case 12:
                        q0iVar.c.e(new SettingsEvents$SettingsWebSearchToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsWebSearchToggle.class)));
                        break;
                    default:
                        q0iVar.b.d(new q8(((Boolean) obj).booleanValue(), 8));
                        break;
                }
                return ieiVar;
            }
        }, new l0i(3, xa3Var, xa3.class, "updateRemoteTerminalEnabled", "updateRemoteTerminalEnabled-8oKUXRw(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", 8, 0), new m0i(3, xa3Var, xa3.class, "updateRemoteTerminalEnabledCache", "updateRemoteTerminalEnabledCache-8oKUXRw(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0)), new tzh(this, 15), new xzh(this, 2), new bz7(this) { // from class: uzh
            public final /* synthetic */ q0i F;

            {
                this.F = this;
            }

            @Override // defpackage.bz7
            public final Object invoke(Object obj) {
                String str22;
                int i62 = i15;
                int i72 = 0;
                iei ieiVar = iei.a;
                q0i q0iVar = this.F;
                switch (i62) {
                    case 0:
                        q0iVar.c.e(new SettingsEvents$SettingsArtifactsToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsArtifactsToggle.class)));
                        break;
                    case 1:
                        q0iVar.b.d(new q8(((Boolean) obj).booleanValue(), 9));
                        break;
                    case 2:
                        q0iVar.c.e(new SettingsEvents$SettingsAiArtifactsToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsAiArtifactsToggle.class)));
                        break;
                    case 3:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        lsc lscVar = q0iVar.C;
                        if (zBooleanValue) {
                            ResearchMode.Companion.getClass();
                            str22 = ResearchMode.ADVANCED;
                        } else {
                            ResearchMode.Companion.getClass();
                            str22 = ResearchMode.NONE;
                        }
                        lscVar.setValue(str22 != null ? ResearchMode.m1093boximpl(str22) : null);
                        break;
                    case 4:
                        znb znbVar = (znb) obj;
                        znbVar.getClass();
                        ModelOption modelOptionC = q0iVar.c(znbVar);
                        break;
                    case 5:
                        q0iVar.c.e(new SettingsEvents$SettingsAdvancedResearchToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsAdvancedResearchToggle.class)));
                        break;
                    case 6:
                        Map map = (Map) obj;
                        map.getClass();
                        q0iVar.b.d(new t8(i72, map));
                        break;
                    case 7:
                        q0iVar.b.d(new q8(((Boolean) obj).booleanValue(), 12));
                        break;
                    case 8:
                        q0iVar.c.e(new SettingsEvents$SettingsRemoteTerminalToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsRemoteTerminalToggle.class)));
                        break;
                    case 9:
                        q0iVar.o.q(((Boolean) obj).booleanValue());
                        break;
                    case 10:
                        znb znbVar2 = (znb) obj;
                        znbVar2.getClass();
                        ModelOption modelOptionC2 = q0iVar.c(znbVar2);
                        break;
                    case 11:
                        q0iVar.b.d(new s8(((Boolean) obj).booleanValue(), 0));
                        break;
                    case 12:
                        q0iVar.c.e(new SettingsEvents$SettingsWebSearchToggle(((Boolean) obj).booleanValue()), iv1.J(jce.b(SettingsEvents$SettingsWebSearchToggle.class)));
                        break;
                    default:
                        q0iVar.b.d(new q8(((Boolean) obj).booleanValue(), 8));
                        break;
                }
                return ieiVar;
            }
        }, FreeTypeConstants.FT_LOAD_PEDANTIC);
    }

    public final BetaToolsConfig a() {
        return (BetaToolsConfig) this.k.g("claude_ai_beta_tools", iv1.J(jce.b(BetaToolsConfig.class))).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r8, defpackage.vp4 r9) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q0i.b(java.lang.String, vp4):java.lang.Object");
    }

    public final ModelOption c(znb znbVar) {
        Object obj = null;
        if (!(znbVar instanceof xnb)) {
            if (znbVar instanceof ynb) {
                return null;
            }
            mr9.b();
            return null;
        }
        okc okcVarA = this.j.a();
        String strB = ((xnb) znbVar).a;
        if (strB == null) {
            strB = okcVarA.b();
        }
        Iterator it = ((List) okcVarA.i.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (strB == null ? false : ModelId.m1061equalsimpl0(((ModelOption) next).m356getModeli4oh0I(), strB)) {
                obj = next;
                break;
            }
        }
        return (ModelOption) obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.vp4 r23) {
        /*
            Method dump skipped, instruction units count: 740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q0i.d(vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.vp4 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.c0i
            if (r0 == 0) goto L13
            r0 = r5
            c0i r0 = (defpackage.c0i) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            c0i r0 = new c0i
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.E
            int r1 = r0.G
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.sf5.h0(r5)
            goto L40
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r2
        L2c:
            defpackage.sf5.h0(r5)
            e0i r5 = new e0i
            r1 = 0
            r5.<init>(r4, r2, r1)
            r0.G = r3
            java.lang.Object r4 = defpackage.iuj.N(r5, r0)
            m45 r5 = defpackage.m45.E
            if (r4 != r5) goto L40
            return r5
        L40:
            iei r4 = defpackage.iei.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q0i.e(vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.vp4 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.f0i
            if (r0 == 0) goto L13
            r0 = r5
            f0i r0 = (defpackage.f0i) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            f0i r0 = new f0i
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.F
            int r1 = r0.H
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L28
            jxb r0 = r0.E
            defpackage.sf5.h0(r5)
            goto L41
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r3
        L2e:
            defpackage.sf5.h0(r5)
            jxb r5 = r4.w
            r0.E = r5
            r0.H = r2
            java.lang.Object r0 = r5.c(r0)
            m45 r1 = defpackage.m45.E
            if (r0 != r1) goto L40
            return r1
        L40:
            r0 = r5
        L41:
            fkg r5 = r4.x     // Catch: java.lang.Throwable -> L49
            if (r5 == 0) goto L4b
            r5.d(r3)     // Catch: java.lang.Throwable -> L49
            goto L4b
        L49:
            r4 = move-exception
            goto L5e
        L4b:
            loi r5 = r4.s     // Catch: java.lang.Throwable -> L49
            d0i r1 = new d0i     // Catch: java.lang.Throwable -> L49
            r2 = 5
            r1.<init>(r4, r3, r2)     // Catch: java.lang.Throwable -> L49
            r2 = 3
            fkg r5 = defpackage.gb9.D(r5, r3, r3, r1, r2)     // Catch: java.lang.Throwable -> L49
            r4.x = r5     // Catch: java.lang.Throwable -> L49
            r0.d(r3)
            return r5
        L5e:
            r0.d(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q0i.f(vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.vp4 r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.i0i
            if (r0 == 0) goto L13
            r0 = r10
            i0i r0 = (defpackage.i0i) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            i0i r0 = new i0i
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.E
            int r1 = r0.G
            r2 = 0
            r3 = 1
            myh r4 = r9.o
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            defpackage.sf5.h0(r10)
            goto L7d
        L28:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r9)
            return r2
        L2e:
            defpackage.sf5.h0(r10)
            zxh r10 = defpackage.zxh.F
            boolean r1 = r4.m(r10)
            if (r1 == 0) goto Lab
            dyh r1 = r4.f
            eyh r10 = r1.b(r10)
            boolean r10 = r10.a()
            if (r10 == 0) goto Lab
            com.anthropic.claude.api.consent.CheckConsentRequest r10 = new com.anthropic.claude.api.consent.CheckConsentRequest
            com.anthropic.claude.api.consent.ConsentType r1 = com.anthropic.claude.api.consent.ConsentType.CONSUMER_HEALTH
            com.anthropic.claude.api.consent.EntityType r5 = com.anthropic.claude.api.consent.EntityType.LOCAL_TOOL
            java.lang.Class<com.anthropic.claude.models.organization.configtypes.HealthConsentConfig> r6 = com.anthropic.claude.models.organization.configtypes.HealthConsentConfig.class
            eo9 r6 = defpackage.jce.b(r6)
            kotlinx.serialization.KSerializer r6 = defpackage.iv1.J(r6)
            rc8 r7 = r9.k
            java.lang.String r8 = "mobile_ha_config"
            wlg r6 = r7.f(r8, r6)
            java.lang.Object r6 = r6.getValue()
            com.anthropic.claude.models.organization.configtypes.HealthConsentConfig r6 = (com.anthropic.claude.models.organization.configtypes.HealthConsentConfig) r6
            if (r6 == 0) goto L6a
            java.lang.String r6 = defpackage.fsk.d(r6)
            goto L6b
        L6a:
            r6 = r2
        L6b:
            java.lang.String r7 = "mobile_health_tools_android"
            r10.<init>(r1, r5, r7, r6)
            r0.G = r3
            uk4 r9 = r9.l
            java.lang.Object r10 = r9.c(r10, r0)
            m45 r9 = defpackage.m45.E
            if (r10 != r9) goto L7d
            return r9
        L7d:
            com.anthropic.claude.api.result.ApiResult r10 = (com.anthropic.claude.api.result.ApiResult) r10
            boolean r9 = r10 instanceof defpackage.of0
            r0 = 0
            if (r9 == 0) goto L95
            r1 = r10
            of0 r1 = (defpackage.of0) r1
            java.lang.Object r1 = r1.b
            com.anthropic.claude.api.consent.HasConsentResponse r1 = (com.anthropic.claude.api.consent.HasConsentResponse) r1
            boolean r1 = r1.getHas_consent()
            if (r1 != 0) goto L99
            r4.q(r0)
            goto L99
        L95:
            boolean r1 = r10 instanceof defpackage.nf0
            if (r1 == 0) goto La7
        L99:
            if (r9 != 0) goto Lab
            boolean r9 = r10 instanceof defpackage.nf0
            if (r9 == 0) goto La3
            r4.q(r0)
            goto Lab
        La3:
            defpackage.mr9.b()
            return r2
        La7:
            defpackage.mr9.b()
            return r2
        Lab:
            iei r9 = defpackage.iei.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q0i.g(vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.tp4 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.j0i
            if (r0 == 0) goto L13
            r0 = r5
            j0i r0 = (defpackage.j0i) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            j0i r0 = new j0i
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.E
            int r1 = r0.G
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.sf5.h0(r5)
            goto L44
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r2
        L2c:
            defpackage.sf5.h0(r5)
            w73 r5 = new w73
            r1 = 4
            r5.<init>(r4, r2, r1)
            r0.G = r3
            vn5 r4 = r4.u
            long r1 = defpackage.q0i.H
            java.lang.Object r4 = r4.a(r1, r5, r0)
            m45 r5 = defpackage.m45.E
            if (r4 != r5) goto L44
            return r5
        L44:
            iei r4 = defpackage.iei.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q0i.h(tp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0094 A[Catch: all -> 0x005b, TryCatch #1 {all -> 0x005b, blocks: (B:10:0x001f, B:11:0x0023, B:13:0x0029, B:14:0x0038, B:16:0x0043, B:24:0x0062, B:26:0x006a, B:28:0x0070, B:30:0x0079, B:38:0x008e, B:40:0x0094, B:48:0x00aa, B:50:0x00b0, B:58:0x00c6, B:57:0x00c1, B:47:0x00a5, B:37:0x0089, B:59:0x00da, B:60:0x00de, B:62:0x00e7, B:65:0x00f8, B:67:0x00fd, B:68:0x0101, B:19:0x0058), top: B:84:0x001f, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a5 A[Catch: all -> 0x005b, TryCatch #1 {all -> 0x005b, blocks: (B:10:0x001f, B:11:0x0023, B:13:0x0029, B:14:0x0038, B:16:0x0043, B:24:0x0062, B:26:0x006a, B:28:0x0070, B:30:0x0079, B:38:0x008e, B:40:0x0094, B:48:0x00aa, B:50:0x00b0, B:58:0x00c6, B:57:0x00c1, B:47:0x00a5, B:37:0x0089, B:59:0x00da, B:60:0x00de, B:62:0x00e7, B:65:0x00f8, B:67:0x00fd, B:68:0x0101, B:19:0x0058), top: B:84:0x001f, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b0 A[Catch: all -> 0x005b, TryCatch #1 {all -> 0x005b, blocks: (B:10:0x001f, B:11:0x0023, B:13:0x0029, B:14:0x0038, B:16:0x0043, B:24:0x0062, B:26:0x006a, B:28:0x0070, B:30:0x0079, B:38:0x008e, B:40:0x0094, B:48:0x00aa, B:50:0x00b0, B:58:0x00c6, B:57:0x00c1, B:47:0x00a5, B:37:0x0089, B:59:0x00da, B:60:0x00de, B:62:0x00e7, B:65:0x00f8, B:67:0x00fd, B:68:0x0101, B:19:0x0058), top: B:84:0x001f, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c1 A[Catch: all -> 0x005b, TryCatch #1 {all -> 0x005b, blocks: (B:10:0x001f, B:11:0x0023, B:13:0x0029, B:14:0x0038, B:16:0x0043, B:24:0x0062, B:26:0x006a, B:28:0x0070, B:30:0x0079, B:38:0x008e, B:40:0x0094, B:48:0x00aa, B:50:0x00b0, B:58:0x00c6, B:57:0x00c1, B:47:0x00a5, B:37:0x0089, B:59:0x00da, B:60:0x00de, B:62:0x00e7, B:65:0x00f8, B:67:0x00fd, B:68:0x0101, B:19:0x0058), top: B:84:0x001f, outer: #0 }] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.util.List r25, boolean r26) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q0i.i(java.util.List, boolean):void");
    }
}
