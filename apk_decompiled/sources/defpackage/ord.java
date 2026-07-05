package defpackage;

import kotlin.jvm.KotlinReflectionNotSupportedError;

/* JADX INFO: loaded from: classes.dex */
public abstract class ord extends g92 implements wn9 {
    public final boolean E;

    public ord(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.E = (i & 2) == 2;
    }

    @Override // defpackage.g92
    public final ll9 compute() {
        return this.E ? this : super.compute();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ord) {
            ord ordVar = (ord) obj;
            return getOwner().equals(ordVar.getOwner()) && getName().equals(ordVar.getName()) && getSignature().equals(ordVar.getSignature()) && x44.r(getBoundReceiver(), ordVar.getBoundReceiver());
        }
        if (obj instanceof wn9) {
            return obj.equals(compute());
        }
        return false;
    }

    public final int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // defpackage.g92
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final wn9 getReflected() {
        if (this.E) {
            pmf.n("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
            return null;
        }
        ll9 ll9VarCompute = compute();
        if (ll9VarCompute != this) {
            return (wn9) ll9VarCompute;
        }
        throw new KotlinReflectionNotSupportedError();
    }

    public final String toString() {
        ll9 ll9VarCompute = compute();
        if (ll9VarCompute != this) {
            return ll9VarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
