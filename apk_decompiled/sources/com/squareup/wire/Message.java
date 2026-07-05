package com.squareup.wire;

import com.anthropic.claude.api.experience.ExperienceToggle;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import defpackage.mdj;
import defpackage.mq5;
import java.io.EOFException;
import java.io.OutputStream;
import java.io.Serializable;
import kotlin.Metadata;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\n\b&\u0018\u0000 .*\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000*\u0014\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u00020\u0004:\u0002/.B\u001f\b\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00028\u0001H&¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u0018\u001a\u00020\u001a¢\u0006\u0004\b\u0018\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u0018\u0010 R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058G¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\u0006\u0010\"R \u0010\b\u001a\u00020\u00078WX\u0096\u0004¢\u0006\u0012\n\u0004\b\b\u0010#\u0012\u0004\b$\u0010%\u001a\u0004\b\b\u0010\u001dR\"\u0010'\u001a\u00020&8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020&8\u0004@\u0004X\u0085\u000e¢\u0006\u0006\n\u0004\b-\u0010(¨\u00060"}, d2 = {"Lcom/squareup/wire/Message;", "M", "Lcom/squareup/wire/Message$Builder;", "B", "Ljava/io/Serializable;", "Lcom/squareup/wire/ProtoAdapter;", "adapter", "Lokio/ByteString;", "unknownFields", "<init>", "(Lcom/squareup/wire/ProtoAdapter;Lokio/ByteString;)V", "newBuilder", "()Lcom/squareup/wire/Message$Builder;", "withoutUnknownFields", "()Lcom/squareup/wire/Message;", "", "toString", "()Ljava/lang/String;", "", "writeReplace", "()Ljava/lang/Object;", "Lokio/BufferedSink;", "sink", "Liei;", "encode", "(Lokio/BufferedSink;)V", "", "()[B", "encodeByteString", "()Lokio/ByteString;", "Ljava/io/OutputStream;", "stream", "(Ljava/io/OutputStream;)V", "Lcom/squareup/wire/ProtoAdapter;", "()Lcom/squareup/wire/ProtoAdapter;", "Lokio/ByteString;", "unknownFields$annotations", "()V", "", "cachedSerializedSize", "I", "getCachedSerializedSize$wire_runtime", "()I", "setCachedSerializedSize$wire_runtime", "(I)V", "hashCode", "Companion", "Builder", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
public abstract class Message<M extends Message<M, B>, B extends Builder<M, B>> implements Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;
    private final transient ProtoAdapter<M> adapter;
    private transient int cachedSerializedSize;
    protected transient int hashCode;
    private final transient ByteString unknownFields;

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\u0014\b\u0002\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0001*\u0014\b\u0003\u0010\u0003*\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002\u00020\u0004B\t\b\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J!\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00028\u0002H&¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u001a\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u001eR$\u0010 \u001a\u0004\u0018\u00010\u001f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010'\u001a\u0004\u0018\u00010&8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/wire/Message;", "M", "B", "", "<init>", "()V", "Liei;", "prepareForNewUnknownFields", "Lokio/ByteString;", "unknownFields", "addUnknownFields", "(Lokio/ByteString;)Lcom/squareup/wire/Message$Builder;", "", "tag", "Lcom/squareup/wire/FieldEncoding;", "fieldEncoding", ExperienceToggle.DEFAULT_PARAM_KEY, "addUnknownField", "(ILcom/squareup/wire/FieldEncoding;Ljava/lang/Object;)Lcom/squareup/wire/Message$Builder;", "clearUnknownFields", "()Lcom/squareup/wire/Message$Builder;", "buildUnknownFields", "()Lokio/ByteString;", "build", "()Lcom/squareup/wire/Message;", "unknownFieldsByteString", "Lokio/ByteString;", "getUnknownFieldsByteString$wire_runtime", "setUnknownFieldsByteString$wire_runtime", "(Lokio/ByteString;)V", "Lokio/Buffer;", "unknownFieldsBuffer", "Lokio/Buffer;", "getUnknownFieldsBuffer$wire_runtime", "()Lokio/Buffer;", "setUnknownFieldsBuffer$wire_runtime", "(Lokio/Buffer;)V", "Lcom/squareup/wire/ProtoWriter;", "unknownFieldsWriter", "Lcom/squareup/wire/ProtoWriter;", "getUnknownFieldsWriter$wire_runtime", "()Lcom/squareup/wire/ProtoWriter;", "setUnknownFieldsWriter$wire_runtime", "(Lcom/squareup/wire/ProtoWriter;)V", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
    public static abstract class Builder<M extends Message<M, B>, B extends Builder<M, B>> {
        private transient Buffer unknownFieldsBuffer;
        private transient ByteString unknownFieldsByteString = ByteString.H;
        private transient ProtoWriter unknownFieldsWriter;

        private final void prepareForNewUnknownFields() {
            if (this.unknownFieldsBuffer == null) {
                this.unknownFieldsBuffer = new Buffer();
                Buffer buffer = this.unknownFieldsBuffer;
                buffer.getClass();
                ProtoWriter protoWriter = new ProtoWriter(buffer);
                this.unknownFieldsWriter = protoWriter;
                protoWriter.writeBytes(this.unknownFieldsByteString);
                this.unknownFieldsByteString = ByteString.H;
            }
        }

        public final Builder<M, B> addUnknownField(int tag, FieldEncoding fieldEncoding, Object value) {
            fieldEncoding.getClass();
            prepareForNewUnknownFields();
            ProtoAdapter<?> protoAdapterRawProtoAdapter = fieldEncoding.rawProtoAdapter();
            protoAdapterRawProtoAdapter.getClass();
            ProtoWriter protoWriter = this.unknownFieldsWriter;
            protoWriter.getClass();
            protoAdapterRawProtoAdapter.encodeWithTag(protoWriter, tag, value);
            return this;
        }

        public final Builder<M, B> addUnknownFields(ByteString unknownFields) {
            unknownFields.getClass();
            if (unknownFields.e() > 0) {
                prepareForNewUnknownFields();
                ProtoWriter protoWriter = this.unknownFieldsWriter;
                protoWriter.getClass();
                protoWriter.writeBytes(unknownFields);
            }
            return this;
        }

        public abstract M build();

        public final ByteString buildUnknownFields() {
            Buffer buffer = this.unknownFieldsBuffer;
            if (buffer != null) {
                buffer.getClass();
                this.unknownFieldsByteString = buffer.t(buffer.F);
                this.unknownFieldsBuffer = null;
                this.unknownFieldsWriter = null;
            }
            return this.unknownFieldsByteString;
        }

        public final Builder<M, B> clearUnknownFields() throws EOFException {
            this.unknownFieldsByteString = ByteString.H;
            Buffer buffer = this.unknownFieldsBuffer;
            if (buffer != null) {
                buffer.getClass();
                buffer.c();
                this.unknownFieldsBuffer = null;
            }
            this.unknownFieldsWriter = null;
            return this;
        }

        /* JADX INFO: renamed from: getUnknownFieldsBuffer$wire_runtime, reason: from getter */
        public final Buffer getUnknownFieldsBuffer() {
            return this.unknownFieldsBuffer;
        }

        /* JADX INFO: renamed from: getUnknownFieldsByteString$wire_runtime, reason: from getter */
        public final ByteString getUnknownFieldsByteString() {
            return this.unknownFieldsByteString;
        }

        /* JADX INFO: renamed from: getUnknownFieldsWriter$wire_runtime, reason: from getter */
        public final ProtoWriter getUnknownFieldsWriter() {
            return this.unknownFieldsWriter;
        }

        public final void setUnknownFieldsBuffer$wire_runtime(Buffer buffer) {
            this.unknownFieldsBuffer = buffer;
        }

        public final void setUnknownFieldsByteString$wire_runtime(ByteString byteString) {
            byteString.getClass();
            this.unknownFieldsByteString = byteString;
        }

        public final void setUnknownFieldsWriter$wire_runtime(ProtoWriter protoWriter) {
            this.unknownFieldsWriter = protoWriter;
        }
    }

    public Message(ProtoAdapter<M> protoAdapter, ByteString byteString) {
        protoAdapter.getClass();
        byteString.getClass();
        this.adapter = protoAdapter;
        this.unknownFields = byteString;
    }

    public static /* synthetic */ void unknownFields$annotations() {
    }

    public final ProtoAdapter<M> adapter() {
        return this.adapter;
    }

    public final void encode(BufferedSink sink) {
        sink.getClass();
        this.adapter.encode(sink, this);
    }

    public final ByteString encodeByteString() {
        return this.adapter.encodeByteString(this);
    }

    /* JADX INFO: renamed from: getCachedSerializedSize$wire_runtime, reason: from getter */
    public final int getCachedSerializedSize() {
        return this.cachedSerializedSize;
    }

    public abstract B newBuilder();

    public final void setCachedSerializedSize$wire_runtime(int i) {
        this.cachedSerializedSize = i;
    }

    public String toString() {
        return this.adapter.toString(this);
    }

    public ByteString unknownFields() {
        ByteString byteString = this.unknownFields;
        return byteString == null ? ByteString.H : byteString;
    }

    public final M withoutUnknownFields() {
        return (M) newBuilder().clearUnknownFields().build();
    }

    public final Object writeReplace() {
        return new MessageSerializedForm(encode(), getClass());
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/squareup/wire/Message$Companion;", "", "<init>", "()V", "serialVersionUID", "", "getSerialVersionUID$annotations", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
    public static final class Companion {
        public /* synthetic */ Companion(mq5 mq5Var) {
            this();
        }

        private static /* synthetic */ void getSerialVersionUID$annotations() {
        }

        private Companion() {
        }
    }

    public final byte[] encode() {
        return this.adapter.encode(this);
    }

    public final void encode(OutputStream stream) {
        stream.getClass();
        this.adapter.encode(stream, this);
    }
}
