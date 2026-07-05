package defpackage;

import java.util.ArrayList;
import org.koin.core.error.InstanceCreationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class x59 {
    public final qh1 a;

    public x59(qh1 qh1Var) {
        this.a = qh1Var;
    }

    public Object a(ra4 ra4Var) throws InstanceCreationException {
        rok rokVar = (rok) ra4Var.E;
        StringBuilder sb = new StringBuilder("| (+) '");
        qh1 qh1Var = this.a;
        sb.append(qh1Var);
        sb.append('\'');
        String string = sb.toString();
        rokVar.getClass();
        rokVar.u0(k3a.E, string);
        try {
            bsc bscVar = (bsc) ra4Var.I;
            if (bscVar == null) {
                bscVar = new bsc();
            }
            return qh1Var.d.invoke((m7f) ra4Var.F, bscVar);
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(e);
            sb2.append("\n\t");
            StackTraceElement[] stackTrace = e.getStackTrace();
            stackTrace.getClass();
            ArrayList arrayList = new ArrayList();
            for (StackTraceElement stackTraceElement : stackTrace) {
                String className = stackTraceElement.getClassName();
                className.getClass();
                if (bsg.u0(className, "sun.reflect", false)) {
                    break;
                }
                arrayList.add(stackTraceElement);
            }
            sb2.append(w44.S0(arrayList, "\n\t", null, null, null, 62));
            rokVar.u0(k3a.H, "* Instance creation error : could not create instance for '" + qh1Var + "': " + sb2.toString());
            throw new InstanceCreationException("Could not create instance for '" + qh1Var + '\'', e);
        }
    }

    public abstract Object b(ra4 ra4Var);
}
