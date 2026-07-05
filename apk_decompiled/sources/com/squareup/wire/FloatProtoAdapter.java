package com.squareup.wire;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.api.experience.ExperienceToggle;
import defpackage.jce;
import defpackage.mdj;
import java.io.EOFException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u000f\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/squareup/wire/FloatProtoAdapter;", "Lcom/squareup/wire/ProtoAdapter;", "", "<init>", "()V", "Lcom/squareup/wire/ProtoWriter;", "writer", ExperienceToggle.DEFAULT_PARAM_KEY, "Liei;", "encode", "(Lcom/squareup/wire/ProtoWriter;F)V", "Lcom/squareup/wire/ReverseProtoWriter;", "(Lcom/squareup/wire/ReverseProtoWriter;F)V", "Lcom/squareup/wire/ProtoReader;", "reader", "decode", "(Lcom/squareup/wire/ProtoReader;)Ljava/lang/Float;", "Lcom/squareup/wire/ProtoReader32;", "(Lcom/squareup/wire/ProtoReader32;)Ljava/lang/Float;", "", "encodedSize", "(F)I", "redact", "(F)Ljava/lang/Float;", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
public final class FloatProtoAdapter extends ProtoAdapter<Float> {
    public FloatProtoAdapter() {
        super(FieldEncoding.FIXED32, jce.a.b(Float.TYPE), null, Syntax.PROTO_2, Float.valueOf(MTTypesetterKt.kLineSkipLimitMultiplier), null, 32, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.wire.ProtoAdapter
    public Float decode(ProtoReader reader) {
        reader.getClass();
        return Float.valueOf(Float.intBitsToFloat(reader.readFixed32()));
    }

    public void encode(ProtoWriter writer, float value) {
        writer.getClass();
        writer.writeFixed32(Float.floatToIntBits(value));
    }

    @Override // com.squareup.wire.ProtoAdapter
    public /* bridge */ /* synthetic */ int encodedSize(Float f) {
        return encodedSize(f.floatValue());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public /* bridge */ /* synthetic */ Float redact(Float f) {
        return redact(f.floatValue());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Float f) throws EOFException {
        encode(reverseProtoWriter, f.floatValue());
    }

    public int encodedSize(float value) {
        return 4;
    }

    public Float redact(float value) {
        throw new UnsupportedOperationException();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Float f) {
        encode(protoWriter, f.floatValue());
    }

    public void encode(ReverseProtoWriter writer, float value) throws EOFException {
        writer.getClass();
        writer.writeFixed32(Float.floatToIntBits(value));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.wire.ProtoAdapter
    public Float decode(ProtoReader32 reader) {
        reader.getClass();
        return Float.valueOf(Float.intBitsToFloat(reader.readFixed32()));
    }
}
