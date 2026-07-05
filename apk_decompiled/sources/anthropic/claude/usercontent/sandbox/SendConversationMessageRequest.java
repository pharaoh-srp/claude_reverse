package anthropic.claude.usercontent.sandbox;

import anthropic.claude.usercontent.sandbox.SendConversationMessageRequest;
import com.anthropic.claude.api.experience.ExperienceToggle;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import defpackage.fq6;
import defpackage.jce;
import defpackage.kgh;
import defpackage.lz5;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.ms6;
import defpackage.pl9;
import defpackage.w44;
import defpackage.wd6;
import defpackage.x44;
import java.io.EOFException;
import java.util.ArrayList;
import kotlin.Metadata;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002&'B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u0018\u001a\u00020\u0002H\u0017b\u0018\b\u0019\u0012\b\b\u0003\u0012\u0004\b\b(\u001a\u0012\n\b\u001b\u0012\u0006\b\n0\u001c8\u001dJ\u0014\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0082\u0004J\n\u0010\"\u001a\u00020#H\u0096\u0080\u0004J\b\u0010$\u001a\u00020\u0004H\u0016J$\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bRE\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004\u0092\u0002,\b\r\u0012\b\b\u000e\u0012\u0004\b\u0003\u0010\u0002\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\n\b\u0011\u0012\u0006\b\n0\u00128\u0013\u0012\b\b\u0014\u0012\u0004\b\u0003\u0010\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fRE\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u0092\u0002,\b\r\u0012\b\b\u000e\u0012\u0004\b\u0003\u0010\u0004\u0012\b\b\u000f\u0012\u0004\b\b(\u0017\u0012\n\b\u0011\u0012\u0006\b\n0\u00128\u0013\u0012\b\b\u0014\u0012\u0004\b\u0003\u0010\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006("}, d2 = {"Lanthropic/claude/usercontent/sandbox/SendConversationMessageRequest;", "Lcom/squareup/wire/Message;", "", "message", "", "message_type", "Lanthropic/claude/usercontent/sandbox/SendConversationMessageRequest$MessageType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lanthropic/claude/usercontent/sandbox/SendConversationMessageRequest$MessageType;Lokio/ByteString;)V", "getMessage", "()Ljava/lang/String;", "Lcom/squareup/wire/WireField;", "tag", "adapter", "com.squareup.wire.ProtoAdapter#STRING", "label", "Lcom/squareup/wire/WireField$Label;", "OMIT_IDENTITY", "schemaIndex", "getMessage_type", "()Lanthropic/claude/usercontent/sandbox/SendConversationMessageRequest$MessageType;", "anthropic.claude.usercontent.sandbox.SendConversationMessageRequest$MessageType#ADAPTER", "newBuilder", "Lkotlin/Deprecated;", "Shouldn't be used in Kotlin", "level", "Lkotlin/DeprecationLevel;", "HIDDEN", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "MessageType", "Claude:protos"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public final class SendConversationMessageRequest extends Message {
    public static final ProtoAdapter<SendConversationMessageRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String message;

    @WireField(adapter = "anthropic.claude.usercontent.sandbox.SendConversationMessageRequest$MessageType#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final MessageType message_type;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final pl9 pl9VarB = jce.a.b(SendConversationMessageRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SendConversationMessageRequest>(fieldEncoding, pl9VarB, syntax) { // from class: anthropic.claude.usercontent.sandbox.SendConversationMessageRequest$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public SendConversationMessageRequest decode(ProtoReader reader) {
                reader.getClass();
                SendConversationMessageRequest.MessageType messageTypeDecode = SendConversationMessageRequest.MessageType.MESSAGE_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new SendConversationMessageRequest(strDecode, messageTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag != 2) {
                        reader.readUnknownField(iNextTag);
                    } else {
                        try {
                            messageTypeDecode = SendConversationMessageRequest.MessageType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SendConversationMessageRequest value) {
                writer.getClass();
                value.getClass();
                if (!x44.r(value.getMessage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getMessage());
                }
                if (value.getMessage_type() != SendConversationMessageRequest.MessageType.MESSAGE_TYPE_UNSPECIFIED) {
                    SendConversationMessageRequest.MessageType.ADAPTER.encodeWithTag(writer, 2, value.getMessage_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SendConversationMessageRequest value) {
                value.getClass();
                int iE = value.unknownFields().e();
                if (!x44.r(value.getMessage(), "")) {
                    iE += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getMessage());
                }
                return value.getMessage_type() != SendConversationMessageRequest.MessageType.MESSAGE_TYPE_UNSPECIFIED ? SendConversationMessageRequest.MessageType.ADAPTER.encodedSizeWithTag(2, value.getMessage_type()) + iE : iE;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SendConversationMessageRequest redact(SendConversationMessageRequest value) {
                value.getClass();
                return SendConversationMessageRequest.copy$default(value, null, null, ByteString.H, 3, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SendConversationMessageRequest value) throws EOFException {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                if (value.getMessage_type() != SendConversationMessageRequest.MessageType.MESSAGE_TYPE_UNSPECIFIED) {
                    SendConversationMessageRequest.MessageType.ADAPTER.encodeWithTag(writer, 2, value.getMessage_type());
                }
                if (x44.r(value.getMessage(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getMessage());
            }
        };
    }

    public /* synthetic */ SendConversationMessageRequest(String str, MessageType messageType, ByteString byteString, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? MessageType.MESSAGE_TYPE_UNSPECIFIED : messageType, (i & 4) != 0 ? ByteString.H : byteString);
    }

    public static /* synthetic */ SendConversationMessageRequest copy$default(SendConversationMessageRequest sendConversationMessageRequest, String str, MessageType messageType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sendConversationMessageRequest.message;
        }
        if ((i & 2) != 0) {
            messageType = sendConversationMessageRequest.message_type;
        }
        if ((i & 4) != 0) {
            byteString = sendConversationMessageRequest.unknownFields();
        }
        return sendConversationMessageRequest.copy(str, messageType, byteString);
    }

    public final SendConversationMessageRequest copy(String message, MessageType message_type, ByteString unknownFields) {
        message.getClass();
        message_type.getClass();
        unknownFields.getClass();
        return new SendConversationMessageRequest(message, message_type, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SendConversationMessageRequest)) {
            return false;
        }
        SendConversationMessageRequest sendConversationMessageRequest = (SendConversationMessageRequest) other;
        return x44.r(unknownFields(), sendConversationMessageRequest.unknownFields()) && x44.r(this.message, sendConversationMessageRequest.message) && this.message_type == sendConversationMessageRequest.message_type;
    }

    public final String getMessage() {
        return this.message;
    }

    public final MessageType getMessage_type() {
        return this.message_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.message_type.hashCode() + kgh.l(unknownFields().hashCode() * 37, 37, this.message);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @lz5
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m89newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ms6.y("message=", Internal.sanitize(this.message), arrayList);
        arrayList.add("message_type=" + this.message_type);
        return w44.S0(arrayList, ", ", "SendConversationMessageRequest{", "}", null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lanthropic/claude/usercontent/sandbox/SendConversationMessageRequest$MessageType;", "Lcom/squareup/wire/WireEnum;", "", ExperienceToggle.DEFAULT_PARAM_KEY, "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "MESSAGE_TYPE_UNSPECIFIED", "TEXT", "ERROR", "Companion", "Claude:protos"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
    public static final class MessageType implements WireEnum {
        private static final /* synthetic */ fq6 $ENTRIES;
        private static final /* synthetic */ MessageType[] $VALUES;
        public static final ProtoAdapter<MessageType> ADAPTER;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final MessageType ERROR;
        public static final MessageType MESSAGE_TYPE_UNSPECIFIED;
        public static final MessageType TEXT;
        private final int value;

        private static final /* synthetic */ MessageType[] $values() {
            return new MessageType[]{MESSAGE_TYPE_UNSPECIFIED, TEXT, ERROR};
        }

        static {
            final MessageType messageType = new MessageType("MESSAGE_TYPE_UNSPECIFIED", 0, 0);
            MESSAGE_TYPE_UNSPECIFIED = messageType;
            TEXT = new MessageType("TEXT", 1, 1);
            ERROR = new MessageType("ERROR", 2, 2);
            MessageType[] messageTypeArr$values = $values();
            $VALUES = messageTypeArr$values;
            $ENTRIES = wd6.n0(messageTypeArr$values);
            INSTANCE = new Companion(null);
            final pl9 pl9VarB = jce.a.b(MessageType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<MessageType>(pl9VarB, syntax, messageType) { // from class: anthropic.claude.usercontent.sandbox.SendConversationMessageRequest$MessageType$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public SendConversationMessageRequest.MessageType fromValue(int value) {
                    return SendConversationMessageRequest.MessageType.INSTANCE.fromValue(value);
                }
            };
        }

        private MessageType(String str, int i, int i2) {
            this.value = i2;
        }

        public static final MessageType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static fq6 getEntries() {
            return $ENTRIES;
        }

        public static MessageType valueOf(String str) {
            return (MessageType) Enum.valueOf(MessageType.class, str);
        }

        public static MessageType[] values() {
            return (MessageType[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\nH\u0007b\u0002\b\u000bR\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0007¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lanthropic/claude/usercontent/sandbox/SendConversationMessageRequest$MessageType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lanthropic/claude/usercontent/sandbox/SendConversationMessageRequest$MessageType;", "Lkotlin/jvm/JvmField;", "fromValue", ExperienceToggle.DEFAULT_PARAM_KEY, "", "Lkotlin/jvm/JvmStatic;", "Claude:protos"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
        public static final class Companion {
            public /* synthetic */ Companion(mq5 mq5Var) {
                this();
            }

            public final MessageType fromValue(int value) {
                if (value == 0) {
                    return MessageType.MESSAGE_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return MessageType.TEXT;
                }
                if (value != 2) {
                    return null;
                }
                return MessageType.ERROR;
            }

            private Companion() {
            }
        }
    }

    @Override // com.squareup.wire.Message
    @lz5
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m89newBuilder();
    }

    public SendConversationMessageRequest() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendConversationMessageRequest(String str, MessageType messageType, ByteString byteString) {
        super(ADAPTER, byteString);
        str.getClass();
        messageType.getClass();
        byteString.getClass();
        this.message = str;
        this.message_type = messageType;
    }
}
