package defpackage;

import com.anthropic.claude.analytics.events.CodeEvents$AutoDefaultModeApplied;
import com.anthropic.claude.code.remote.i;
import com.anthropic.claude.code.remote.j;
import com.anthropic.claude.sessions.types.AskUserQuestionInput;
import com.anthropic.claude.sessions.types.ConnectionStatus;
import com.anthropic.claude.sessions.types.PermissionMode;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes2.dex */
public final class n14 implements lp7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ i F;

    public /* synthetic */ n14(i iVar, int i) {
        this.E = i;
        this.F = iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // defpackage.lp7
    public final Object g(Object obj, tp4 tp4Var) {
        int i = this.E;
        boolean z = false;
        Long lValueOf = null;
        Object[] objArr = 0;
        iei ieiVar = iei.a;
        i iVar = this.F;
        switch (i) {
            case 0:
                ConnectionStatus connectionStatus = (ConnectionStatus) obj;
                if (iVar.Z != null && connectionStatus == ConnectionStatus.CONNECTED) {
                    iVar.g0("connected");
                }
                break;
            case 1:
                iVar.r1.setValue((x36) obj);
                break;
            case 2:
                qsf qsfVar = (qsf) obj;
                iVar.t1(qsfVar.b);
                Map map = qsfVar.d;
                mdg mdgVar = iVar.R1;
                ih9 ih9VarC = u00.c(new i04(6));
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    JsonElement jsonElement = (JsonElement) entry.getValue();
                    if (!mdgVar.containsKey(str)) {
                        try {
                            mdgVar.put(str, (AskUserQuestionInput) ih9VarC.a(AskUserQuestionInput.Companion.serializer(), jsonElement));
                        } catch (Exception unused) {
                        }
                    }
                }
                break;
            case 3:
                if (((Boolean) obj).booleanValue()) {
                    iVar.s1.setValue(PermissionMode.Default);
                    iVar.B1.F = null;
                }
                break;
            case 4:
                cpc cpcVar = (cpc) obj;
                boolean zBooleanValue = ((Boolean) cpcVar.E).booleanValue();
                boolean zBooleanValue2 = ((Boolean) cpcVar.F).booleanValue();
                if (!zBooleanValue && zBooleanValue2) {
                    lsc lscVar = iVar.k2;
                    String str2 = (String) lscVar.getValue();
                    if (str2 != null) {
                        if (iVar.A0.d().G.length() <= 0 && iVar.W1.isEmpty() && iVar.A0().isEmpty()) {
                            lscVar.setValue(null);
                            boolean z2 = iVar.l2;
                            iVar.l2 = false;
                            if (!iVar.l1(str2, z2)) {
                                iVar.k1(str2);
                            }
                        } else {
                            iVar.d0();
                        }
                    }
                }
                break;
            case 5:
                nuf nufVar = (nuf) obj;
                iVar.U1.setValue(Boolean.valueOf(nufVar.a));
                iVar.V1.setValue(Boolean.valueOf(nufVar.b));
                break;
            case 6:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                Long l = (Long) iVar.r2.getValue();
                zpf zpfVarT0 = iVar.t0();
                leb lebVar = zpfVarT0 instanceof leb ? (leb) zpfVarT0 : null;
                if (lebVar != null && lebVar.e) {
                    z = true;
                }
                long jA = iVar.F.a();
                ide ideVar = j.b;
                if (zBooleanValue3) {
                    if (l != null) {
                        jA = l.longValue();
                    }
                    lValueOf = Long.valueOf(jA);
                } else if (!z) {
                    lValueOf = l;
                }
                iVar.z1(lValueOf);
                break;
            case 7:
                boolean zBooleanValue4 = ((Boolean) ((r7i) obj).E).booleanValue();
                fkg fkgVar = iVar.C0;
                if (fkgVar != null) {
                    fkgVar.d(null);
                }
                iVar.C0 = null;
                if (zBooleanValue4) {
                    iVar.C0 = gb9.D(iVar.a, null, null, new o14(iVar, objArr == true ? 1 : 0, 20), 3);
                }
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    iVar.s1.setValue(PermissionMode.Auto);
                    iVar.B1.F = null;
                    boolean zBooleanValue5 = ((Boolean) iVar.k.i.getValue()).booleanValue();
                    boolean z3 = !zBooleanValue5;
                    if (!zBooleanValue5) {
                        iVar.D1.setValue(Boolean.TRUE);
                    }
                    iVar.l.e(new CodeEvents$AutoDefaultModeApplied(iVar.m, z3), CodeEvents$AutoDefaultModeApplied.Companion.serializer());
                }
                break;
        }
        return ieiVar;
    }
}
