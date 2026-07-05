package defpackage;

import android.content.SharedPreferences;
import com.anthropic.claude.models.organization.configtypes.HealthConsentConfig;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class kl8 extends iwe {
    public final uk4 b;
    public final dyh c;
    public final rc8 d;
    public final qi3 e;
    public final gh2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kl8(uk4 uk4Var, dyh dyhVar, rc8 rc8Var, qi3 qi3Var, gh2 gh2Var, h86 h86Var) {
        super(h86Var);
        gh2Var.getClass();
        this.b = uk4Var;
        this.c = dyhVar;
        this.d = rc8Var;
        this.e = qi3Var;
        this.f = gh2Var;
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
    public final void O(eyh eyhVar) {
        Object next;
        eyhVar.getClass();
        dyh dyhVar = this.c;
        mdg mdgVar = dyhVar.b;
        Object obj = mdgVar.get("health_connect");
        Object obj2 = obj;
        if (obj == null) {
            SharedPreferences sharedPreferences = dyhVar.a;
            eyh eyhVar2 = eyh.E;
            String string = sharedPreferences.getString("health_connect", eyhVar2.name());
            Iterator<E> it = eyh.I.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (x44.r(((eyh) next).name(), string)) {
                        break;
                    }
                }
            }
            eyh eyhVar3 = (eyh) next;
            eyh eyhVar4 = eyhVar2;
            if (eyhVar3 != null) {
                eyhVar4 = eyhVar3;
            }
            mdgVar.put("health_connect", eyhVar4);
            obj2 = eyhVar4;
        }
        eyh eyhVar5 = (eyh) obj2;
        HealthConsentConfig healthConsentConfig = (HealthConsentConfig) this.d.f("mobile_ha_config", iv1.J(jce.b(HealthConsentConfig.class))).getValue();
        String strValueOf = healthConsentConfig != null ? String.valueOf(healthConsentConfig.getConsent_config_android().getVersion()) : null;
        if (strValueOf == null) {
            this.f.r(new tt6(true));
        } else {
            gb9.D(this.a, null, null, new w14(this, eyhVar, eyhVar5, strValueOf, (tp4) null), 3);
        }
    }
}
