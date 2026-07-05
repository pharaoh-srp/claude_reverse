package defpackage;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public abstract class hfd extends s44 {
    public final gfd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hfd(KSerializer kSerializer) {
        super(kSerializer);
        kSerializer.getClass();
        this.b = new gfd(kSerializer.getDescriptor());
    }

    @Override // defpackage.x0
    public final Object a() {
        return (ffd) g(j());
    }

    @Override // defpackage.x0
    public final int b(Object obj) {
        ffd ffdVar = (ffd) obj;
        ffdVar.getClass();
        return ffdVar.d();
    }

    @Override // defpackage.x0
    public final Iterator c(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // defpackage.x0, defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        return e(decoder);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return this.b;
    }

    @Override // defpackage.x0
    public final Object h(Object obj) {
        ffd ffdVar = (ffd) obj;
        ffdVar.getClass();
        return ffdVar.a();
    }

    @Override // defpackage.s44
    public final void i(Object obj, int i, Object obj2) {
        ((ffd) obj).getClass();
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Object j();

    public abstract void k(vd4 vd4Var, Object obj, int i);

    @Override // defpackage.s44, defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        encoder.getClass();
        int iD = d(obj);
        gfd gfdVar = this.b;
        vd4 vd4VarY = encoder.y(gfdVar);
        k(vd4VarY, obj, iD);
        vd4VarY.b(gfdVar);
    }
}
