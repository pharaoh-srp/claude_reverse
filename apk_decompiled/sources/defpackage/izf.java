package defpackage;

import com.anthropic.claude.api.mcp.McpServer;
import com.anthropic.claude.configs.flags.ToolSearchConfig;
import com.anthropic.claude.configs.flags.ToolSearchModeConfig;
import com.anthropic.claude.models.organization.configtypes.OctopusConfig;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class izf extends iwe {
    public final wlg A;
    public final qi3 b;
    public final fk0 c;
    public final myh d;
    public final pkc e;
    public final ysg f;
    public final q0i g;
    public final koi h;
    public final ole i;
    public final b1i j;
    public final qs2 k;
    public final x89 l;
    public final dnh m;
    public final tae n;
    public final kae o;
    public final zy1 p;
    public final boolean q;
    public final wz5 r;
    public final wz5 s;
    public final wz5 t;
    public final wlg u;
    public final wz5 v;
    public final wz5 w;
    public final wz5 x;
    public final wz5 y;
    public final wz5 z;

    public izf(qi3 qi3Var, fk0 fk0Var, myh myhVar, pkc pkcVar, rc8 rc8Var, ysg ysgVar, q0i q0iVar, koi koiVar, ole oleVar, b1i b1iVar, qs2 qs2Var, dyh dyhVar, x89 x89Var, dnh dnhVar, tae taeVar, kae kaeVar, h86 h86Var) {
        super(h86Var);
        this.b = qi3Var;
        this.c = fk0Var;
        this.d = myhVar;
        this.e = pkcVar;
        this.f = ysgVar;
        this.g = q0iVar;
        this.h = koiVar;
        this.i = oleVar;
        this.j = b1iVar;
        this.k = qs2Var;
        this.l = x89Var;
        this.m = dnhVar;
        this.n = taeVar;
        this.o = kaeVar;
        this.p = x44.a();
        this.q = ((Boolean) rc8Var.m("mobile_subscription_max_plan_enabled").getValue()).booleanValue();
        final int i = 0;
        this.r = mpk.w(new zy7(this) { // from class: hzf
            public final /* synthetic */ izf F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                McpServer mcpServerR;
                ToolSearchConfig toolSearchConfig;
                List<ToolSearchModeConfig> modes;
                int i2 = i;
                boolean z = false;
                izf izfVar = this.F;
                switch (i2) {
                    case 0:
                        izfVar.e.a();
                        koi koiVar2 = izfVar.h;
                        if (okc.a(koiVar2)) {
                            int iOrdinal = eve.C(koiVar2.e()).ordinal();
                            if (iOrdinal == 0) {
                                z = true;
                            } else if (iOrdinal == 1) {
                                z = izfVar.q;
                            } else if (iOrdinal != 2 && iOrdinal != 3) {
                                wg6.i();
                                return null;
                            }
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        if (izfVar.i.a() && izfVar.j.f()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 2:
                        return eve.C(izfVar.h.e());
                    case 3:
                        return izfVar.h.e().getRaven_type();
                    case 4:
                        return Boolean.valueOf(izfVar.c.m());
                    case 5:
                        Boolean bool = (Boolean) izfVar.e.a().r.getValue();
                        bool.booleanValue();
                        return bool;
                    case 6:
                        q0i q0iVar2 = izfVar.g;
                        b1i b1iVar2 = izfVar.j;
                        if (q0iVar2.z.isVisible() || q0iVar2.A.isVisible() || q0iVar2.B.isVisible() || q0iVar2.F.isVisible() || (((mcpServerR = izfVar.R()) != null && (!qok.f(mcpServerR).isEmpty())) || izfVar.k.b() || b1iVar2.d() || b1iVar2.c() || (((Boolean) b1iVar2.C.getValue()).booleanValue() && (toolSearchConfig = (ToolSearchConfig) b1iVar2.D.getValue()) != null && (modes = toolSearchConfig.getModes()) != null && (!modes.isEmpty())))) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    default:
                        return Boolean.valueOf(!izfVar.h.f().isEmpty());
                }
            }
        });
        final int i2 = 1;
        this.s = mpk.w(new zy7(this) { // from class: hzf
            public final /* synthetic */ izf F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                McpServer mcpServerR;
                ToolSearchConfig toolSearchConfig;
                List<ToolSearchModeConfig> modes;
                int i22 = i2;
                boolean z = false;
                izf izfVar = this.F;
                switch (i22) {
                    case 0:
                        izfVar.e.a();
                        koi koiVar2 = izfVar.h;
                        if (okc.a(koiVar2)) {
                            int iOrdinal = eve.C(koiVar2.e()).ordinal();
                            if (iOrdinal == 0) {
                                z = true;
                            } else if (iOrdinal == 1) {
                                z = izfVar.q;
                            } else if (iOrdinal != 2 && iOrdinal != 3) {
                                wg6.i();
                                return null;
                            }
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        if (izfVar.i.a() && izfVar.j.f()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 2:
                        return eve.C(izfVar.h.e());
                    case 3:
                        return izfVar.h.e().getRaven_type();
                    case 4:
                        return Boolean.valueOf(izfVar.c.m());
                    case 5:
                        Boolean bool = (Boolean) izfVar.e.a().r.getValue();
                        bool.booleanValue();
                        return bool;
                    case 6:
                        q0i q0iVar2 = izfVar.g;
                        b1i b1iVar2 = izfVar.j;
                        if (q0iVar2.z.isVisible() || q0iVar2.A.isVisible() || q0iVar2.B.isVisible() || q0iVar2.F.isVisible() || (((mcpServerR = izfVar.R()) != null && (!qok.f(mcpServerR).isEmpty())) || izfVar.k.b() || b1iVar2.d() || b1iVar2.c() || (((Boolean) b1iVar2.C.getValue()).booleanValue() && (toolSearchConfig = (ToolSearchConfig) b1iVar2.D.getValue()) != null && (modes = toolSearchConfig.getModes()) != null && (!modes.isEmpty())))) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    default:
                        return Boolean.valueOf(!izfVar.h.f().isEmpty());
                }
            }
        });
        final int i3 = 2;
        this.t = mpk.w(new fgd(rc8Var, i3));
        this.u = rc8Var.m("claudeai_usage");
        this.v = mpk.w(new zy7(this) { // from class: hzf
            public final /* synthetic */ izf F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                McpServer mcpServerR;
                ToolSearchConfig toolSearchConfig;
                List<ToolSearchModeConfig> modes;
                int i22 = i3;
                boolean z = false;
                izf izfVar = this.F;
                switch (i22) {
                    case 0:
                        izfVar.e.a();
                        koi koiVar2 = izfVar.h;
                        if (okc.a(koiVar2)) {
                            int iOrdinal = eve.C(koiVar2.e()).ordinal();
                            if (iOrdinal == 0) {
                                z = true;
                            } else if (iOrdinal == 1) {
                                z = izfVar.q;
                            } else if (iOrdinal != 2 && iOrdinal != 3) {
                                wg6.i();
                                return null;
                            }
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        if (izfVar.i.a() && izfVar.j.f()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 2:
                        return eve.C(izfVar.h.e());
                    case 3:
                        return izfVar.h.e().getRaven_type();
                    case 4:
                        return Boolean.valueOf(izfVar.c.m());
                    case 5:
                        Boolean bool = (Boolean) izfVar.e.a().r.getValue();
                        bool.booleanValue();
                        return bool;
                    case 6:
                        q0i q0iVar2 = izfVar.g;
                        b1i b1iVar2 = izfVar.j;
                        if (q0iVar2.z.isVisible() || q0iVar2.A.isVisible() || q0iVar2.B.isVisible() || q0iVar2.F.isVisible() || (((mcpServerR = izfVar.R()) != null && (!qok.f(mcpServerR).isEmpty())) || izfVar.k.b() || b1iVar2.d() || b1iVar2.c() || (((Boolean) b1iVar2.C.getValue()).booleanValue() && (toolSearchConfig = (ToolSearchConfig) b1iVar2.D.getValue()) != null && (modes = toolSearchConfig.getModes()) != null && (!modes.isEmpty())))) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    default:
                        return Boolean.valueOf(!izfVar.h.f().isEmpty());
                }
            }
        });
        final int i4 = 3;
        this.w = mpk.w(new zy7(this) { // from class: hzf
            public final /* synthetic */ izf F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                McpServer mcpServerR;
                ToolSearchConfig toolSearchConfig;
                List<ToolSearchModeConfig> modes;
                int i22 = i4;
                boolean z = false;
                izf izfVar = this.F;
                switch (i22) {
                    case 0:
                        izfVar.e.a();
                        koi koiVar2 = izfVar.h;
                        if (okc.a(koiVar2)) {
                            int iOrdinal = eve.C(koiVar2.e()).ordinal();
                            if (iOrdinal == 0) {
                                z = true;
                            } else if (iOrdinal == 1) {
                                z = izfVar.q;
                            } else if (iOrdinal != 2 && iOrdinal != 3) {
                                wg6.i();
                                return null;
                            }
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        if (izfVar.i.a() && izfVar.j.f()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 2:
                        return eve.C(izfVar.h.e());
                    case 3:
                        return izfVar.h.e().getRaven_type();
                    case 4:
                        return Boolean.valueOf(izfVar.c.m());
                    case 5:
                        Boolean bool = (Boolean) izfVar.e.a().r.getValue();
                        bool.booleanValue();
                        return bool;
                    case 6:
                        q0i q0iVar2 = izfVar.g;
                        b1i b1iVar2 = izfVar.j;
                        if (q0iVar2.z.isVisible() || q0iVar2.A.isVisible() || q0iVar2.B.isVisible() || q0iVar2.F.isVisible() || (((mcpServerR = izfVar.R()) != null && (!qok.f(mcpServerR).isEmpty())) || izfVar.k.b() || b1iVar2.d() || b1iVar2.c() || (((Boolean) b1iVar2.C.getValue()).booleanValue() && (toolSearchConfig = (ToolSearchConfig) b1iVar2.D.getValue()) != null && (modes = toolSearchConfig.getModes()) != null && (!modes.isEmpty())))) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    default:
                        return Boolean.valueOf(!izfVar.h.f().isEmpty());
                }
            }
        });
        final int i5 = 4;
        mpk.w(new zy7(this) { // from class: hzf
            public final /* synthetic */ izf F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                McpServer mcpServerR;
                ToolSearchConfig toolSearchConfig;
                List<ToolSearchModeConfig> modes;
                int i22 = i5;
                boolean z = false;
                izf izfVar = this.F;
                switch (i22) {
                    case 0:
                        izfVar.e.a();
                        koi koiVar2 = izfVar.h;
                        if (okc.a(koiVar2)) {
                            int iOrdinal = eve.C(koiVar2.e()).ordinal();
                            if (iOrdinal == 0) {
                                z = true;
                            } else if (iOrdinal == 1) {
                                z = izfVar.q;
                            } else if (iOrdinal != 2 && iOrdinal != 3) {
                                wg6.i();
                                return null;
                            }
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        if (izfVar.i.a() && izfVar.j.f()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 2:
                        return eve.C(izfVar.h.e());
                    case 3:
                        return izfVar.h.e().getRaven_type();
                    case 4:
                        return Boolean.valueOf(izfVar.c.m());
                    case 5:
                        Boolean bool = (Boolean) izfVar.e.a().r.getValue();
                        bool.booleanValue();
                        return bool;
                    case 6:
                        q0i q0iVar2 = izfVar.g;
                        b1i b1iVar2 = izfVar.j;
                        if (q0iVar2.z.isVisible() || q0iVar2.A.isVisible() || q0iVar2.B.isVisible() || q0iVar2.F.isVisible() || (((mcpServerR = izfVar.R()) != null && (!qok.f(mcpServerR).isEmpty())) || izfVar.k.b() || b1iVar2.d() || b1iVar2.c() || (((Boolean) b1iVar2.C.getValue()).booleanValue() && (toolSearchConfig = (ToolSearchConfig) b1iVar2.D.getValue()) != null && (modes = toolSearchConfig.getModes()) != null && (!modes.isEmpty())))) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    default:
                        return Boolean.valueOf(!izfVar.h.f().isEmpty());
                }
            }
        });
        final int i6 = 5;
        this.x = mpk.w(new zy7(this) { // from class: hzf
            public final /* synthetic */ izf F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                McpServer mcpServerR;
                ToolSearchConfig toolSearchConfig;
                List<ToolSearchModeConfig> modes;
                int i22 = i6;
                boolean z = false;
                izf izfVar = this.F;
                switch (i22) {
                    case 0:
                        izfVar.e.a();
                        koi koiVar2 = izfVar.h;
                        if (okc.a(koiVar2)) {
                            int iOrdinal = eve.C(koiVar2.e()).ordinal();
                            if (iOrdinal == 0) {
                                z = true;
                            } else if (iOrdinal == 1) {
                                z = izfVar.q;
                            } else if (iOrdinal != 2 && iOrdinal != 3) {
                                wg6.i();
                                return null;
                            }
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        if (izfVar.i.a() && izfVar.j.f()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 2:
                        return eve.C(izfVar.h.e());
                    case 3:
                        return izfVar.h.e().getRaven_type();
                    case 4:
                        return Boolean.valueOf(izfVar.c.m());
                    case 5:
                        Boolean bool = (Boolean) izfVar.e.a().r.getValue();
                        bool.booleanValue();
                        return bool;
                    case 6:
                        q0i q0iVar2 = izfVar.g;
                        b1i b1iVar2 = izfVar.j;
                        if (q0iVar2.z.isVisible() || q0iVar2.A.isVisible() || q0iVar2.B.isVisible() || q0iVar2.F.isVisible() || (((mcpServerR = izfVar.R()) != null && (!qok.f(mcpServerR).isEmpty())) || izfVar.k.b() || b1iVar2.d() || b1iVar2.c() || (((Boolean) b1iVar2.C.getValue()).booleanValue() && (toolSearchConfig = (ToolSearchConfig) b1iVar2.D.getValue()) != null && (modes = toolSearchConfig.getModes()) != null && (!modes.isEmpty())))) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    default:
                        return Boolean.valueOf(!izfVar.h.f().isEmpty());
                }
            }
        });
        final int i7 = 6;
        this.y = mpk.w(new zy7(this) { // from class: hzf
            public final /* synthetic */ izf F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                McpServer mcpServerR;
                ToolSearchConfig toolSearchConfig;
                List<ToolSearchModeConfig> modes;
                int i22 = i7;
                boolean z = false;
                izf izfVar = this.F;
                switch (i22) {
                    case 0:
                        izfVar.e.a();
                        koi koiVar2 = izfVar.h;
                        if (okc.a(koiVar2)) {
                            int iOrdinal = eve.C(koiVar2.e()).ordinal();
                            if (iOrdinal == 0) {
                                z = true;
                            } else if (iOrdinal == 1) {
                                z = izfVar.q;
                            } else if (iOrdinal != 2 && iOrdinal != 3) {
                                wg6.i();
                                return null;
                            }
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        if (izfVar.i.a() && izfVar.j.f()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 2:
                        return eve.C(izfVar.h.e());
                    case 3:
                        return izfVar.h.e().getRaven_type();
                    case 4:
                        return Boolean.valueOf(izfVar.c.m());
                    case 5:
                        Boolean bool = (Boolean) izfVar.e.a().r.getValue();
                        bool.booleanValue();
                        return bool;
                    case 6:
                        q0i q0iVar2 = izfVar.g;
                        b1i b1iVar2 = izfVar.j;
                        if (q0iVar2.z.isVisible() || q0iVar2.A.isVisible() || q0iVar2.B.isVisible() || q0iVar2.F.isVisible() || (((mcpServerR = izfVar.R()) != null && (!qok.f(mcpServerR).isEmpty())) || izfVar.k.b() || b1iVar2.d() || b1iVar2.c() || (((Boolean) b1iVar2.C.getValue()).booleanValue() && (toolSearchConfig = (ToolSearchConfig) b1iVar2.D.getValue()) != null && (modes = toolSearchConfig.getModes()) != null && (!modes.isEmpty())))) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    default:
                        return Boolean.valueOf(!izfVar.h.f().isEmpty());
                }
            }
        });
        final int i8 = 7;
        this.z = mpk.w(new zy7(this) { // from class: hzf
            public final /* synthetic */ izf F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                McpServer mcpServerR;
                ToolSearchConfig toolSearchConfig;
                List<ToolSearchModeConfig> modes;
                int i22 = i8;
                boolean z = false;
                izf izfVar = this.F;
                switch (i22) {
                    case 0:
                        izfVar.e.a();
                        koi koiVar2 = izfVar.h;
                        if (okc.a(koiVar2)) {
                            int iOrdinal = eve.C(koiVar2.e()).ordinal();
                            if (iOrdinal == 0) {
                                z = true;
                            } else if (iOrdinal == 1) {
                                z = izfVar.q;
                            } else if (iOrdinal != 2 && iOrdinal != 3) {
                                wg6.i();
                                return null;
                            }
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        if (izfVar.i.a() && izfVar.j.f()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 2:
                        return eve.C(izfVar.h.e());
                    case 3:
                        return izfVar.h.e().getRaven_type();
                    case 4:
                        return Boolean.valueOf(izfVar.c.m());
                    case 5:
                        Boolean bool = (Boolean) izfVar.e.a().r.getValue();
                        bool.booleanValue();
                        return bool;
                    case 6:
                        q0i q0iVar2 = izfVar.g;
                        b1i b1iVar2 = izfVar.j;
                        if (q0iVar2.z.isVisible() || q0iVar2.A.isVisible() || q0iVar2.B.isVisible() || q0iVar2.F.isVisible() || (((mcpServerR = izfVar.R()) != null && (!qok.f(mcpServerR).isEmpty())) || izfVar.k.b() || b1iVar2.d() || b1iVar2.c() || (((Boolean) b1iVar2.C.getValue()).booleanValue() && (toolSearchConfig = (ToolSearchConfig) b1iVar2.D.getValue()) != null && (modes = toolSearchConfig.getModes()) != null && (!modes.isEmpty())))) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    default:
                        return Boolean.valueOf(!izfVar.h.f().isEmpty());
                }
            }
        });
        this.A = rc8Var.f("android_octopus_config", OctopusConfig.Companion.serializer());
    }

    public final int O() {
        List listF = this.h.f();
        int i = 0;
        if ((listF instanceof Collection) && listF.isEmpty()) {
            return 0;
        }
        Iterator it = listF.iterator();
        while (it.hasNext()) {
            if (x44.r(((McpServer) it.next()).getConnected(), Boolean.TRUE) && (i = i + 1) < 0) {
                x44.m0();
                throw null;
            }
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0018  */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int P() {
        /*
            r2 = this;
            ayh r0 = defpackage.ayh.F
            myh r2 = r2.d
            boolean r0 = r2.l(r0)
            xxh r1 = defpackage.xxh.F
            boolean r1 = r2.l(r1)
            if (r1 != 0) goto L18
            yxh r1 = defpackage.yxh.F
            boolean r1 = r2.l(r1)
            if (r1 == 0) goto L1a
        L18:
            int r0 = r0 + 1
        L1a:
            zxh r1 = defpackage.zxh.F
            boolean r2 = r2.l(r1)
            if (r2 == 0) goto L24
            int r0 = r0 + 1
        L24:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.izf.P():int");
    }

    public final int Q() {
        McpServer mcpServerR;
        q0i q0iVar = this.g;
        int iA = q0iVar.F.a() + q0iVar.B.a() + q0iVar.A.a() + q0iVar.z.a();
        if (R() != null && (!qok.f(r1).isEmpty()) && (mcpServerR = R()) != null && q0iVar.E.f(null, mcpServerR.m346getUuidowoRr7k()) > 0) {
            iA++;
        }
        return (this.k.b() && this.h.k()) ? iA + 1 : iA;
    }

    public final McpServer R() {
        Object next;
        Iterator<E> it = this.h.q.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (x44.r(((McpServer) next).getName(), "visualize")) {
                break;
            }
        }
        return (McpServer) next;
    }
}
