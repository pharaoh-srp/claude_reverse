package defpackage;

import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class th9 implements SerialDescriptor {
    public static final th9 b = new th9();
    public static final String c = "kotlinx.serialization.json.JsonObject";
    public final /* synthetic */ e7a a = d4c.u(srg.a, eh9.a).c;

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a() {
        return c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean c() {
        this.a.getClass();
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d(String str) {
        str.getClass();
        return this.a.d(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int e() {
        this.a.getClass();
        return 2;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String f(int i) {
        this.a.getClass();
        return String.valueOf(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List g(int i) {
        this.a.g(i);
        return lm6.E;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        this.a.getClass();
        return lm6.E;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final u00 getKind() {
        this.a.getClass();
        return vsg.n;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor h(int i) {
        return this.a.h(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i) {
        this.a.i(i);
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        this.a.getClass();
        return false;
    }
}
