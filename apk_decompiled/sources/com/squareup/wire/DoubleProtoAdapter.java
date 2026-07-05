package com.squareup.wire;

import com.anthropic.claude.api.experience.ExperienceToggle;
import defpackage.jce;
import defpackage.mdj;
import java.io.EOFException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0012\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/squareup/wire/DoubleProtoAdapter;", "Lcom/squareup/wire/ProtoAdapter;", "", "<init>", "()V", ExperienceToggle.DEFAULT_PARAM_KEY, "", "encodedSize", "(D)I", "Lcom/squareup/wire/ProtoWriter;", "writer", "Liei;", "encode", "(Lcom/squareup/wire/ProtoWriter;D)V", "Lcom/squareup/wire/ReverseProtoWriter;", "(Lcom/squareup/wire/ReverseProtoWriter;D)V", "Lcom/squareup/wire/ProtoReader;", "reader", "decode", "(Lcom/squareup/wire/ProtoReader;)Ljava/lang/Double;", "Lcom/squareup/wire/ProtoReader32;", "(Lcom/squareup/wire/ProtoReader32;)Ljava/lang/Double;", "redact", "(D)Ljava/lang/Double;", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
public final class DoubleProtoAdapter extends ProtoAdapter<Double> {
    public DoubleProtoAdapter() {
        super(FieldEncoding.FIXED64, jce.a.b(Double.TYPE), null, Syntax.PROTO_2, Double.valueOf(0.0d), null, 32, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.wire.ProtoAdapter
    public Double decode(ProtoReader reader) {
        reader.getClass();
        return Double.valueOf(Double.longBitsToDouble(reader.readFixed64()));
    }

    public void encode(ProtoWriter writer, double value) {
        writer.getClass();
        writer.writeFixed64(Double.doubleToLongBits(value));
    }

    @Override // com.squareup.wire.ProtoAdapter
    public /* bridge */ /* synthetic */ int encodedSize(Double d) {
        return encodedSize(d.doubleValue());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public /* bridge */ /* synthetic */ Double redact(Double d) {
        return redact(d.doubleValue());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public /* bridge */ /* synthetic */ void encode(ReverseProtoWriter reverseProtoWriter, Double d) throws EOFException {
        encode(reverseProtoWriter, d.doubleValue());
    }

    public int encodedSize(double value) {
        return 8;
    }

    public Double redact(double value) {
        throw new UnsupportedOperationException();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, Double d) {
        encode(protoWriter, d.doubleValue());
    }

    public void encode(ReverseProtoWriter writer, double value) throws EOFException {
        writer.getClass();
        writer.writeFixed64(Double.doubleToLongBits(value));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.wire.ProtoAdapter
    public Double decode(ProtoReader32 reader) {
        reader.getClass();
        return Double.valueOf(Double.longBitsToDouble(reader.readFixed64()));
    }
}
