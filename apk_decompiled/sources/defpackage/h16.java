package defpackage;

import io.sentry.android.replay.capture.c;
import io.sentry.android.replay.l;
import io.sentry.x6;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Type;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;

/* JADX INFO: loaded from: classes3.dex */
public final class h16 extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h16(Object obj, Object obj2, Object obj3, int i) {
        super(0);
        this.F = i;
        this.G = obj;
        this.H = obj2;
        this.I = obj3;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.F;
        iei ieiVar = iei.a;
        Object obj = this.G;
        Object obj2 = this.I;
        Object obj3 = this.H;
        switch (i) {
            case 0:
                return ((i3) obj).a((ByteArrayInputStream) obj3, ((r06) ((m16) obj2).b.d).p);
            case 1:
                ul9 ul9Var = (ul9) obj3;
                xl9 xl9Var = (xl9) obj2;
                xh3 xh3VarA = ((yr9) obj).O().a();
                if (!(xh3VarA instanceof qqb)) {
                    rl7.n("Supertype not a class: ", xh3VarA);
                    return null;
                }
                Class clsJ = vpi.j((qqb) xh3VarA);
                if (clsJ == null) {
                    throw new KotlinReflectionInternalError("Unsupported superclass of " + ul9Var + ": " + xh3VarA);
                }
                Class cls = xl9Var.F;
                if (x44.r(cls.getSuperclass(), clsJ)) {
                    Type genericSuperclass = cls.getGenericSuperclass();
                    genericSuperclass.getClass();
                    return genericSuperclass;
                }
                Class<?>[] interfaces = cls.getInterfaces();
                interfaces.getClass();
                int iJ0 = mp0.J0(clsJ, interfaces);
                if (iJ0 >= 0) {
                    Type type = cls.getGenericInterfaces()[iJ0];
                    type.getClass();
                    return type;
                }
                throw new KotlinReflectionInternalError("No superclass of " + ul9Var + " in Java reflection for " + xh3VarA);
            case 2:
                ly9 ly9Var = (ly9) obj;
                gfa gfaVar = ((ke9) ly9Var.b.E).a;
                v01 v01Var = new v01(ly9Var, (qbe) obj3, (je9) obj2);
                gfaVar.getClass();
                return new cfa(gfaVar, v01Var);
            case 3:
                String str = (String) obj3;
                ((ov5) obj).getClass();
                String str2 = ((mxi) obj2).j.c;
                return ij0.k("Failed to track ", x44.r(str2, "com/datadog/application-launch/view") ? "AppLaunch" : x44.r(str2, "com/datadog/background/view") ? "Background" : "Custom", " view in session with different UUID ", str);
            case 4:
                Integer num = (Integer) obj3;
                l lVar = ((c) obj2).h;
                if (lVar != null) {
                    lVar.f("segment.id", String.valueOf(num));
                }
                return ieiVar;
            default:
                x6 x6Var = (x6) obj3;
                l lVar2 = ((c) obj2).h;
                if (lVar2 != null) {
                    lVar2.f("replay.type", String.valueOf(x6Var));
                }
                return ieiVar;
        }
    }
}
