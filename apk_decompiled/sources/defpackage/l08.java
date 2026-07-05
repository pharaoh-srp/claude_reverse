package defpackage;

import kotlin.jvm.KotlinReflectionNotSupportedError;

/* JADX INFO: loaded from: classes.dex */
public abstract class l08 extends g92 implements a08, jm9 {
    private final int arity;

    public l08(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
    }

    @Override // defpackage.g92
    public ll9 computeReflected() {
        return jce.a.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l08) {
            l08 l08Var = (l08) obj;
            return getName().equals(l08Var.getName()) && getSignature().equals(l08Var.getSignature()) && x44.r(getBoundReceiver(), l08Var.getBoundReceiver()) && x44.r(getOwner(), l08Var.getOwner());
        }
        if (obj instanceof jm9) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // defpackage.a08
    public int getArity() {
        return this.arity;
    }

    @Override // defpackage.g92
    public jm9 getReflected() {
        ll9 ll9VarCompute = compute();
        if (ll9VarCompute != this) {
            return (jm9) ll9VarCompute;
        }
        throw new KotlinReflectionNotSupportedError();
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // defpackage.jm9
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // defpackage.jm9
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // defpackage.jm9
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // defpackage.jm9
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // defpackage.ll9
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        ll9 ll9VarCompute = compute();
        if (ll9VarCompute != this) {
            return ll9VarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public l08(int i, Object obj) {
        this(i, 0, null, obj, null, null);
    }

    public l08(int i) {
        this(i, 0, null, g92.NO_RECEIVER, null, null);
    }
}
