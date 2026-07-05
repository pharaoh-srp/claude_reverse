package com.squareup.wire;

import com.anthropic.claude.api.experience.ExperienceToggle;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;
import com.squareup.wire.internal.Internal;
import defpackage.ez1;
import defpackage.jce;
import defpackage.mdj;
import defpackage.pl9;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B)\b\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\t\u0010\nB)\b\u0016\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\t\u0010\fB\u0017\b\u0016\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\t\u0010\rB\u001f\b\u0016\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u000eB\u0017\b\u0016\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\t\u0010\u000fB\u001f\b\u0016\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u001bJ\u0017\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020 H\u0016¢\u0006\u0004\b\u001e\u0010!J\u0017\u0010\"\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\"\u0010#J\u0019\u0010$\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0011\u001a\u00020\u0012H$¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/squareup/wire/EnumAdapter;", "Lcom/squareup/wire/WireEnum;", "E", "Lcom/squareup/wire/ProtoAdapter;", "Lpl9;", "type", "Lcom/squareup/wire/Syntax;", "syntax", "identity", "<init>", "(Lpl9;Lcom/squareup/wire/Syntax;Lcom/squareup/wire/WireEnum;)V", "Ljava/lang/Class;", "(Ljava/lang/Class;Lcom/squareup/wire/Syntax;Lcom/squareup/wire/WireEnum;)V", "(Ljava/lang/Class;)V", "(Ljava/lang/Class;Lcom/squareup/wire/Syntax;)V", "(Lpl9;)V", "(Lpl9;Lcom/squareup/wire/Syntax;)V", ExperienceToggle.DEFAULT_PARAM_KEY, "", "encodedSize", "(Lcom/squareup/wire/WireEnum;)I", "Lcom/squareup/wire/ProtoWriter;", "writer", "Liei;", "encode", "(Lcom/squareup/wire/ProtoWriter;Lcom/squareup/wire/WireEnum;)V", "Lcom/squareup/wire/ReverseProtoWriter;", "(Lcom/squareup/wire/ReverseProtoWriter;Lcom/squareup/wire/WireEnum;)V", "Lcom/squareup/wire/ProtoReader;", "reader", "decode", "(Lcom/squareup/wire/ProtoReader;)Lcom/squareup/wire/WireEnum;", "Lcom/squareup/wire/ProtoReader32;", "(Lcom/squareup/wire/ProtoReader32;)Lcom/squareup/wire/WireEnum;", "redact", "(Lcom/squareup/wire/WireEnum;)Lcom/squareup/wire/WireEnum;", "fromValue", "(I)Lcom/squareup/wire/WireEnum;", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
public abstract class EnumAdapter<E extends WireEnum> extends ProtoAdapter<E> {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EnumAdapter(Class<E> cls, Syntax syntax) {
        this(jce.a.b(cls), syntax, Internal.getIdentityOrNull(cls));
        cls.getClass();
        syntax.getClass();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public E decode(ProtoReader reader) {
        reader.getClass();
        int varint32 = reader.readVarint32();
        E e = (E) fromValue(varint32);
        if (e != null) {
            return e;
        }
        throw new ProtoAdapter.EnumConstantNotFoundException(varint32, getType());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, E value) {
        writer.getClass();
        value.getClass();
        writer.writeVarint32(value.getValue());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(E value) {
        value.getClass();
        return ProtoWriter.INSTANCE.varint32Size$wire_runtime(value.getValue());
    }

    public abstract E fromValue(int value);

    @Override // com.squareup.wire.ProtoAdapter
    public E redact(E value) {
        value.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, E value) {
        writer.getClass();
        value.getClass();
        writer.writeVarint32(value.getValue());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EnumAdapter(pl9 pl9Var) {
        this(pl9Var, Syntax.PROTO_2, Internal.getIdentityOrNull(ez1.I(pl9Var)));
        pl9Var.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EnumAdapter(pl9 pl9Var, Syntax syntax) {
        this(pl9Var, syntax, Internal.getIdentityOrNull(ez1.I(pl9Var)));
        pl9Var.getClass();
        syntax.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EnumAdapter(Class<E> cls) {
        this(jce.a.b(cls), Syntax.PROTO_2, Internal.getIdentityOrNull(cls));
        cls.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnumAdapter(pl9 pl9Var, Syntax syntax, E e) {
        super(FieldEncoding.VARINT, pl9Var, (String) null, syntax, e);
        pl9Var.getClass();
        syntax.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EnumAdapter(Class<E> cls, Syntax syntax, E e) {
        this(jce.a.b(cls), syntax, e);
        cls.getClass();
        syntax.getClass();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public E decode(ProtoReader32 reader) {
        reader.getClass();
        int varint32 = reader.readVarint32();
        E e = (E) fromValue(varint32);
        if (e != null) {
            return e;
        }
        throw new ProtoAdapter.EnumConstantNotFoundException(varint32, getType());
    }
}
