package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class vd1 implements tp4, n45, Serializable {
    private final tp4<Object> completion;

    public vd1(tp4 tp4Var) {
        this.completion = tp4Var;
    }

    public tp4<iei> create(tp4<?> tp4Var) {
        tp4Var.getClass();
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // defpackage.n45
    public n45 getCallerFrame() {
        tp4<Object> tp4Var = this.completion;
        if (tp4Var instanceof n45) {
            return (n45) tp4Var;
        }
        return null;
    }

    public final tp4<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        return vkc.h(this);
    }

    public abstract Object invokeSuspend(Object obj);

    public void releaseIntercepted() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // defpackage.tp4
    public final void resumeWith(Object obj) {
        ?? r2 = this;
        while (true) {
            vd1 vd1Var = (vd1) r2;
            tp4<Object> tp4Var = vd1Var.completion;
            tp4Var.getClass();
            try {
                obj = vd1Var.invokeSuspend(obj);
                if (obj == m45.E) {
                    return;
                }
            } catch (Throwable th) {
                obj = new hre(th);
            }
            vd1Var.releaseIntercepted();
            if (!(tp4Var instanceof vd1)) {
                tp4Var.resumeWith(obj);
                return;
            }
            r2 = tp4Var;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public tp4<iei> create(Object obj, tp4<?> tp4Var) {
        tp4Var.getClass();
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
