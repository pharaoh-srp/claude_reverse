package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class yxe {
    public final float a;
    public final List b;
    public final m4c c;
    public final pyi d;
    public final m4i e;
    public final c07 f;
    public final c07 g;
    public final c07 h;
    public final c07 i;
    public final c07 j;
    public final c07 k;
    public final c07 l;
    public final c07 m;
    public final boolean n;
    public final boolean o;
    public final lye p;
    public final o29 q;
    public final nph r;
    public final sb s;
    public final Map t;
    public final lja u;
    public final dd8 v;
    public final int w;

    public yxe(float f, List list, m4c m4cVar, pyi pyiVar, m4i m4iVar, c07 c07Var, c07 c07Var2, c07 c07Var3, c07 c07Var4, c07 c07Var5, c07 c07Var6, c07 c07Var7, c07 c07Var8, boolean z, boolean z2, int i, lye lyeVar, o29 o29Var, nph nphVar, sb sbVar, Map map, lja ljaVar, dd8 dd8Var) {
        sq6.a(i);
        this.a = f;
        this.b = list;
        this.c = m4cVar;
        this.d = pyiVar;
        this.e = m4iVar;
        this.f = c07Var;
        this.g = c07Var2;
        this.h = c07Var3;
        this.i = c07Var4;
        this.j = c07Var5;
        this.k = c07Var6;
        this.l = c07Var7;
        this.m = c07Var8;
        this.n = z;
        this.o = z2;
        this.w = i;
        this.p = lyeVar;
        this.q = o29Var;
        this.r = nphVar;
        this.s = sbVar;
        this.t = map;
        this.u = ljaVar;
        this.v = dd8Var;
    }

    public static yxe a(yxe yxeVar, float f, List list, m4c m4cVar, vpa vpaVar, zj5 zj5Var, int i) {
        yxeVar.getClass();
        yxeVar.getClass();
        yxeVar.getClass();
        float f2 = (i & 8) != 0 ? yxeVar.a : f;
        yxeVar.getClass();
        List list2 = (i & 32) != 0 ? yxeVar.b : list;
        m4c m4cVar2 = (i & 64) != 0 ? yxeVar.c : m4cVar;
        pyi pyiVar = (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? yxeVar.d : null;
        m4i m4iVar = (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? yxeVar.e : vpaVar;
        c07 c07Var = yxeVar.f;
        c07 c07Var2 = (i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? yxeVar.g : bk5.E;
        c07 c07Var3 = (i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? yxeVar.h : zj5Var;
        c07 c07Var4 = yxeVar.i;
        c07 c07Var5 = yxeVar.j;
        c07 c07Var6 = yxeVar.k;
        c07 c07Var7 = yxeVar.l;
        c07 c07Var8 = yxeVar.m;
        boolean z = (131072 & i) != 0 ? yxeVar.n : true;
        yxeVar.getClass();
        boolean z2 = (i & 524288) != 0 ? yxeVar.o : true;
        int i2 = yxeVar.w;
        lye lyeVar = yxeVar.p;
        o29 o29Var = yxeVar.q;
        nph nphVar = yxeVar.r;
        yxeVar.getClass();
        sb sbVar = yxeVar.s;
        Map map = yxeVar.t;
        yxeVar.getClass();
        yxeVar.getClass();
        yxeVar.getClass();
        yxeVar.getClass();
        lja ljaVar = yxeVar.u;
        dd8 dd8Var = yxeVar.v;
        yxeVar.getClass();
        sq6.a(i2);
        return new yxe(f2, list2, m4cVar2, pyiVar, m4iVar, c07Var, c07Var2, c07Var3, c07Var4, c07Var5, c07Var6, c07Var7, c07Var8, z, z2, i2, lyeVar, o29Var, nphVar, sbVar, map, ljaVar, dd8Var);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yxe) {
            yxe yxeVar = (yxe) obj;
            if (Float.compare(100.0f, 100.0f) == 0 && Float.compare(20.0f, 20.0f) == 0 && Float.compare(this.a, yxeVar.a) == 0 && this.b.equals(yxeVar.b) && this.c.equals(yxeVar.c) && x44.r(this.d, yxeVar.d) && x44.r(this.e, yxeVar.e) && this.f.equals(yxeVar.f) && this.g.equals(yxeVar.g) && this.h.equals(yxeVar.h) && this.i.equals(yxeVar.i) && this.j.equals(yxeVar.j) && this.k.equals(yxeVar.k) && this.l.equals(yxeVar.l) && this.m.equals(yxeVar.m) && this.n == yxeVar.n && this.o == yxeVar.o && this.w == yxeVar.w && this.p.equals(yxeVar.p) && this.q.equals(yxeVar.q) && this.r.equals(yxeVar.r)) {
                xag xagVar = xag.a;
                return xagVar.equals(xagVar) && this.s.equals(yxeVar.s) && this.t.equals(yxeVar.t) && this.u == yxeVar.u && this.v == yxeVar.v;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM = kgh.m(fsh.p(vb7.b(this.a, vb7.b(20.0f, Float.hashCode(100.0f) * 31, 31), 31), 31, true), 961, this.b);
        pyi pyiVar = this.d;
        int iHashCode = (iM + (pyiVar == null ? 0 : pyiVar.hashCode())) * 31;
        m4i m4iVar = this.e;
        return this.v.hashCode() + ((this.u.hashCode() + fsh.p(fsh.p(fsh.p(ebh.g((this.s.hashCode() + ((xag.a.hashCode() + vb7.e((this.q.hashCode() + ((this.p.hashCode() + qy1.c(this.w, fsh.p(fsh.p(fsh.p((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((iHashCode + (m4iVar == null ? 0 : m4iVar.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.n), 31, true), 31, this.o), 31)) * 31)) * 31, 31, this.r.E)) * 31)) * 31, 31, this.t), 961, true), 31, false), 31, false)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configuration(customEndpointUrl=null, sampleRate=100.0, telemetrySampleRate=20.0, telemetryConfigurationSampleRate=");
        sb.append(this.a);
        sb.append(", userActionTracking=true, touchTargetExtraAttributesProviders=");
        sb.append(this.b);
        sb.append(", interactionPredicate=");
        sb.append(this.c);
        sb.append(", viewTrackingStrategy=");
        sb.append(this.d);
        sb.append(", longTaskTrackingStrategy=");
        sb.append(this.e);
        sb.append(", viewEventMapper=");
        sb.append(this.f);
        sb.append(", errorEventMapper=");
        sb.append(this.g);
        sb.append(", resourceEventMapper=");
        sb.append(this.h);
        sb.append(", actionEventMapper=");
        sb.append(this.i);
        sb.append(", longTaskEventMapper=");
        sb.append(this.j);
        sb.append(", vitalOperationStepEventMapper=");
        sb.append(this.k);
        sb.append(", vitalAppLaunchEventMapper=");
        sb.append(this.l);
        sb.append(", telemetryConfigurationMapper=");
        sb.append(this.m);
        sb.append(", backgroundEventTracking=");
        sb.append(this.n);
        sb.append(", trackFrustrations=true, trackNonFatalAnrs=");
        sb.append(this.o);
        sb.append(", vitalsMonitorUpdateFrequency=");
        int i = this.w;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "NEVER" : "RARE" : "AVERAGE" : "FREQUENT");
        sb.append(", sessionListener=");
        sb.append(this.p);
        sb.append(", initialResourceIdentifier=");
        sb.append(this.q);
        sb.append(", lastInteractionIdentifier=");
        sb.append(this.r);
        sb.append(", slowFramesConfiguration=");
        sb.append(xag.a);
        sb.append(", composeActionTrackingStrategy=");
        sb.append(this.s);
        sb.append(", additionalConfig=");
        sb.append(this.t);
        sb.append(", trackAnonymousUser=true, rumSessionTypeOverride=");
        sb.append(gid.x(0));
        sb.append(", collectAccessibility=false, disableJankStats=false, insightsCollector=");
        sb.append(this.u);
        sb.append(", appStartupActivityPredicate=");
        sb.append(this.v);
        sb.append(")");
        return sb.toString();
    }
}
