package com.squareup.wire;

import com.anthropic.claude.api.experience.ExperienceToggle;
import com.squareup.wire.Message;
import defpackage.jce;
import defpackage.kgh;
import defpackage.lz5;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.pl9;
import defpackage.x44;
import kotlin.Metadata;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0010¢\u0006\u0002\u0010\u0011J!\u0010\u0012\u001a\u0004\u0018\u0001H\u000e\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0010¢\u0006\u0002\u0010\u0011J\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J\u001a\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/squareup/wire/AnyMessage;", "Lcom/squareup/wire/Message;", "", "typeUrl", "", ExperienceToggle.DEFAULT_PARAM_KEY, "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getTypeUrl", "()Ljava/lang/String;", "getValue", "()Lokio/ByteString;", "unpack", "T", "adapter", "Lcom/squareup/wire/ProtoAdapter;", "(Lcom/squareup/wire/ProtoAdapter;)Ljava/lang/Object;", "unpackOrNull", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
public final class AnyMessage extends Message {
    public static final ProtoAdapter<AnyMessage> ADAPTER;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String typeUrl;
    private final ByteString value;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final pl9 pl9VarB = jce.a.b(AnyMessage.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AnyMessage>(fieldEncoding, pl9VarB, syntax) { // from class: com.squareup.wire.AnyMessage$Companion$ADAPTER$1
            {
                int i = 48;
                mq5 mq5Var = null;
                String str = "type.googleapis.com/google.protobuf.Any";
                Object obj = null;
                String str2 = null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AnyMessage decode(ProtoReader reader) {
                reader.getClass();
                ByteString byteStringDecode = ByteString.H;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        reader.endMessageAndGetUnknownFields(jBeginMessage);
                        return new AnyMessage(strDecode, byteStringDecode);
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag != 2) {
                        reader.readUnknownField(iNextTag);
                    } else {
                        byteStringDecode = ProtoAdapter.BYTES.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AnyMessage value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getTypeUrl());
                ProtoAdapter.BYTES.encodeWithTag(writer, 2, value.getValue());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AnyMessage value) {
                value.getClass();
                return ProtoAdapter.BYTES.encodedSizeWithTag(2, value.getValue()) + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTypeUrl());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AnyMessage redact(AnyMessage value) {
                value.getClass();
                return new AnyMessage("square.github.io/wire/redacted", ByteString.H);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AnyMessage value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter.BYTES.encodeWithTag(writer, 2, value.getValue());
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getTypeUrl());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AnyMessage decode(ProtoReader32 reader) {
                reader.getClass();
                ByteString byteStringDecode = ByteString.H;
                int iBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        reader.endMessageAndGetUnknownFields(iBeginMessage);
                        return new AnyMessage(strDecode, byteStringDecode);
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag != 2) {
                        reader.readUnknownField(iNextTag);
                    } else {
                        byteStringDecode = ProtoAdapter.BYTES.decode(reader);
                    }
                }
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnyMessage(String str, ByteString byteString) {
        super(ADAPTER, ByteString.H);
        str.getClass();
        byteString.getClass();
        this.typeUrl = str;
        this.value = byteString;
    }

    public static /* synthetic */ AnyMessage copy$default(AnyMessage anyMessage, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = anyMessage.typeUrl;
        }
        if ((i & 2) != 0) {
            byteString = anyMessage.value;
        }
        return anyMessage.copy(str, byteString);
    }

    public final AnyMessage copy(String typeUrl, ByteString value) {
        typeUrl.getClass();
        value.getClass();
        return new AnyMessage(typeUrl, value);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AnyMessage)) {
            return false;
        }
        AnyMessage anyMessage = (AnyMessage) other;
        return x44.r(this.typeUrl, anyMessage.typeUrl) && x44.r(this.value, anyMessage.value);
    }

    public final String getTypeUrl() {
        return this.typeUrl;
    }

    public final ByteString getValue() {
        return this.value;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.value.hashCode() + kgh.l(i * 37, 37, this.typeUrl);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m1171newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        return "Any{type_url=" + this.typeUrl + ", value=" + this.value + '}';
    }

    public final <T> T unpack(ProtoAdapter<T> adapter) {
        adapter.getClass();
        if (x44.r(this.typeUrl, adapter.getTypeUrl())) {
            return adapter.decode(this.value);
        }
        throw new IllegalStateException(("type mismatch: " + this.typeUrl + " != " + adapter.getTypeUrl()).toString());
    }

    public final <T> T unpackOrNull(ProtoAdapter<T> adapter) {
        adapter.getClass();
        if (x44.r(this.typeUrl, adapter.getTypeUrl())) {
            return adapter.decode(this.value);
        }
        return null;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0007R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/wire/AnyMessage$Companion;", "", "<init>", "()V", "pack", "Lcom/squareup/wire/AnyMessage;", "message", "Lcom/squareup/wire/Message;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "wire-runtime"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
    public static final class Companion {
        public /* synthetic */ Companion(mq5 mq5Var) {
            this();
        }

        public final AnyMessage pack(Message<?, ?> message) {
            message.getClass();
            String typeUrl = message.adapter().getTypeUrl();
            if (typeUrl != null) {
                return new AnyMessage(typeUrl, message.encodeByteString());
            }
            throw new IllegalStateException(("recompile " + jce.a.b(message.getClass()) + " to use it with AnyMessage").toString());
        }

        private Companion() {
        }
    }

    @lz5
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m1171newBuilder() {
        throw new AssertionError();
    }

    public /* synthetic */ AnyMessage(String str, ByteString byteString, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? ByteString.H : byteString);
    }
}
