package defpackage;

import android.content.SharedPreferences;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.feature.Feature;
import com.anthropic.claude.models.organization.configtypes.BetaToolsConfig;
import com.anthropic.claude.types.strings.ResearchMode;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tzh implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ q0i F;

    public /* synthetic */ tzh(q0i q0iVar, int i) {
        this.E = i;
        this.F = q0iVar;
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
    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        Object obj = null;
        q0i q0iVar = this.F;
        switch (i) {
            case 0:
                return Boolean.valueOf(q0iVar.p.g() || ((Boolean) q0iVar.n.f.getValue()).booleanValue());
            case 1:
                BetaToolsConfig betaToolsConfigA = q0iVar.a();
                if (betaToolsConfigA != null && betaToolsConfigA.isBeta(qo1.K)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                if (((Boolean) q0iVar.m.c.getValue()).booleanValue() && ((Boolean) q0iVar.r.a().getValue()).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                BetaToolsConfig betaToolsConfigA2 = q0iVar.a();
                if (betaToolsConfigA2 != null && betaToolsConfigA2.isBeta(qo1.I)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 4:
                koi koiVar = q0iVar.p;
                if ((koiVar.g() || ((Boolean) q0iVar.n.f.getValue()).booleanValue()) && ((Boolean) koiVar.j.getValue()).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 5:
                return Boolean.valueOf(q0iVar.m.f());
            case 6:
                BetaToolsConfig betaToolsConfigA3 = q0iVar.a();
                if (betaToolsConfigA3 != null && betaToolsConfigA3.isBeta(qo1.H)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 7:
                ResearchMode researchMode = (ResearchMode) q0iVar.C.getValue();
                String strM1099unboximpl = researchMode != null ? researchMode.m1099unboximpl() : null;
                ResearchMode.Companion.getClass();
                return Boolean.valueOf(strM1099unboximpl != null ? ResearchMode.m1096equalsimpl0(strM1099unboximpl, ResearchMode.ADVANCED) : false);
            case 8:
                dyh dyhVar = q0iVar.o.f;
                mdg mdgVar = dyhVar.b;
                Object obj2 = mdgVar.get("health_connect");
                Object obj3 = obj2;
                if (obj2 == null) {
                    SharedPreferences sharedPreferences = dyhVar.a;
                    eyh eyhVar = eyh.E;
                    String string = sharedPreferences.getString("health_connect", eyhVar.name());
                    Iterator<E> it = eyh.I.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (x44.r(((eyh) next).name(), string)) {
                                obj = next;
                            }
                        }
                    }
                    eyh eyhVar2 = (eyh) obj;
                    eyh eyhVar3 = eyhVar;
                    if (eyhVar2 != null) {
                        eyhVar3 = eyhVar2;
                    }
                    mdgVar.put("health_connect", eyhVar3);
                    obj3 = eyhVar3;
                }
                return Boolean.valueOf(((eyh) obj3).a());
            case 9:
                q0iVar.C.setValue(null);
                return iei.a;
            case 10:
                return q0iVar.p.c();
            case 11:
                if (q0iVar.m.e() && !q0iVar.n.d.i()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 12:
                BetaToolsConfig betaToolsConfigA4 = q0iVar.a();
                if (betaToolsConfigA4 != null && betaToolsConfigA4.isBeta(qo1.J)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 13:
                return Boolean.valueOf(q0iVar.o.m(zxh.F));
            case 14:
                Boolean bool = (Boolean) q0iVar.n.g.getValue();
                bool.getClass();
                return bool;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return Boolean.valueOf(!((Boolean) q0iVar.r.c(Feature.WIGGLE).getValue()).booleanValue());
            case 16:
                Boolean bool2 = (Boolean) q0iVar.m.d.getValue();
                bool2.booleanValue();
                return bool2;
            case g.MAX_FIELD_NUMBER /* 17 */:
                BetaToolsConfig betaToolsConfigA5 = q0iVar.a();
                if (betaToolsConfigA5 != null && betaToolsConfigA5.isBeta(qo1.G)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case g.AVG_FIELD_NUMBER /* 18 */:
                Boolean bool3 = (Boolean) q0iVar.p.k.getValue();
                bool3.getClass();
                return bool3;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return Boolean.valueOf(!((Boolean) q0iVar.r.c(Feature.WEB_SEARCH).getValue()).booleanValue());
            default:
                Boolean bool4 = (Boolean) q0iVar.r.a().getValue();
                bool4.getClass();
                return bool4;
        }
    }
}
