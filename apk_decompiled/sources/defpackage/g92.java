package defpackage;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericDeclaration;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class g92 implements ll9, Serializable {
    public static final Object NO_RECEIVER = f92.E;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient ll9 reflected;
    private final String signature;

    public g92(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    @Override // defpackage.ll9
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // defpackage.ll9
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public ll9 compute() {
        ll9 ll9Var = this.reflected;
        if (ll9Var != null) {
            return ll9Var;
        }
        ll9 ll9VarComputeReflected = computeReflected();
        this.reflected = ll9VarComputeReflected;
        return ll9VarComputeReflected;
    }

    public abstract ll9 computeReflected();

    public GenericDeclaration findJavaDeclaration() {
        return stj.m(getOwner(), getSignature());
    }

    @Override // defpackage.kl9
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // defpackage.ll9
    public String getName() {
        return this.name;
    }

    public fm9 getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? jce.a.c(cls, "") : jce.a.b(cls);
    }

    @Override // defpackage.ll9
    public List<in9> getParameters() {
        return getReflected().getParameters();
    }

    public abstract ll9 getReflected();

    @Override // defpackage.ll9
    public eo9 getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // defpackage.ll9
    public List<go9> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // defpackage.ll9
    public mo9 getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // defpackage.ll9
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // defpackage.ll9
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // defpackage.ll9
    public boolean isOpen() {
        return getReflected().isOpen();
    }
}
