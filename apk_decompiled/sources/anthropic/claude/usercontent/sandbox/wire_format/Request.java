package anthropic.claude.usercontent.sandbox.wire_format;

import com.anthropic.claude.api.login.VerifyMagicLinkRequest;
import com.squareup.wire.AnyMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import defpackage.jce;
import defpackage.kgh;
import defpackage.lz5;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.ms6;
import defpackage.pl9;
import defpackage.w44;
import defpackage.x44;
import java.io.EOFException;
import java.util.ArrayList;
import kotlin.Metadata;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 -2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\u001e\u001a\u00020\u0002H\u0017b\u0018\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\n\b\"\u0012\u0006\b\n0#8$J\u0014\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0096\u0082\u0004J\n\u0010)\u001a\u00020*H\u0096\u0080\u0004J\b\u0010+\u001a\u00020\u0004H\u0016J:\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nRE\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004\u0092\u0002,\b\u000f\u0012\b\b\u0010\u0012\u0004\b\u0003\u0010\u0002\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\n\b\u0013\u0012\u0006\b\n0\u00148\u0015\u0012\b\b\u0016\u0012\u0004\b\u0003\u0010\u0000¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eRO\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u0092\u00026\b\u000f\u0012\b\b\u0010\u0012\u0004\b\u0003\u0010\u0004\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\n\b\u0013\u0012\u0006\b\n0\u00148\u0015\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\b\b\u0016\u0012\u0004\b\u0003\u0010\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000eRE\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004\u0092\u0002,\b\u000f\u0012\b\b\u0010\u0012\u0004\b\u0003\u0010\u0006\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\n\b\u0013\u0012\u0006\b\n0\u00148\u0015\u0012\b\b\u0016\u0012\u0004\b\u0003\u0010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000eRG\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u0092\u0002,\b\u000f\u0012\b\b\u0010\u0012\u0004\b\u0003\u0010\b\u0012\b\b\u0011\u0012\u0004\b\b(\u001d\u0012\n\b\u0013\u0012\u0006\b\n0\u00148\u0015\u0012\b\b\u0016\u0012\u0004\b\u0003\u0010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006."}, d2 = {"Lanthropic/claude/usercontent/sandbox/wire_format/Request;", "Lcom/squareup/wire/Message;", "", "channel", "", "request_id", VerifyMagicLinkRequest.Credentials.DISCRIMINATOR, "payload", "Lcom/squareup/wire/AnyMessage;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/squareup/wire/AnyMessage;Lokio/ByteString;)V", "getChannel", "()Ljava/lang/String;", "Lcom/squareup/wire/WireField;", "tag", "adapter", "com.squareup.wire.ProtoAdapter#STRING", "label", "Lcom/squareup/wire/WireField$Label;", "OMIT_IDENTITY", "schemaIndex", "getRequest_id", "jsonName", "requestId", "getMethod", "getPayload", "()Lcom/squareup/wire/AnyMessage;", "com.squareup.wire.AnyMessage#ADAPTER", "newBuilder", "Lkotlin/Deprecated;", "message", "Shouldn't be used in Kotlin", "level", "Lkotlin/DeprecationLevel;", "HIDDEN", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "Claude:protos"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public final class Request extends Message {
    public static final ProtoAdapter<Request> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String channel;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String method;

    @WireField(adapter = "com.squareup.wire.AnyMessage#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final AnyMessage payload;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "requestId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String request_id;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final pl9 pl9VarB = jce.a.b(Request.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Request>(fieldEncoding, pl9VarB, syntax) { // from class: anthropic.claude.usercontent.sandbox.wire_format.Request$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Request decode(ProtoReader reader) {
                reader.getClass();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                AnyMessage anyMessageDecode = null;
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new Request(strDecode, strDecode3, strDecode2, anyMessageDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag != 4) {
                        reader.readUnknownField(iNextTag);
                    } else {
                        anyMessageDecode = AnyMessage.ADAPTER.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Request value) {
                writer.getClass();
                value.getClass();
                if (!x44.r(value.getChannel(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getChannel());
                }
                if (!x44.r(value.getRequest_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, value.getRequest_id());
                }
                if (!x44.r(value.getMethod(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, value.getMethod());
                }
                if (value.getPayload() != null) {
                    AnyMessage.ADAPTER.encodeWithTag(writer, 4, value.getPayload());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Request value) {
                value.getClass();
                int iE = value.unknownFields().e();
                if (!x44.r(value.getChannel(), "")) {
                    iE += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getChannel());
                }
                if (!x44.r(value.getRequest_id(), "")) {
                    iE += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getRequest_id());
                }
                if (!x44.r(value.getMethod(), "")) {
                    iE += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getMethod());
                }
                return value.getPayload() != null ? AnyMessage.ADAPTER.encodedSizeWithTag(4, value.getPayload()) + iE : iE;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Request redact(Request value) {
                value.getClass();
                AnyMessage payload = value.getPayload();
                return Request.copy$default(value, null, null, null, payload != null ? AnyMessage.ADAPTER.redact(payload) : null, ByteString.H, 7, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Request value) throws EOFException {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                if (value.getPayload() != null) {
                    AnyMessage.ADAPTER.encodeWithTag(writer, 4, value.getPayload());
                }
                if (!x44.r(value.getMethod(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, value.getMethod());
                }
                if (!x44.r(value.getRequest_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, value.getRequest_id());
                }
                if (x44.r(value.getChannel(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getChannel());
            }
        };
    }

    public /* synthetic */ Request(String str, String str2, String str3, AnyMessage anyMessage, ByteString byteString, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : anyMessage, (i & 16) != 0 ? ByteString.H : byteString);
    }

    public static /* synthetic */ Request copy$default(Request request, String str, String str2, String str3, AnyMessage anyMessage, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = request.channel;
        }
        if ((i & 2) != 0) {
            str2 = request.request_id;
        }
        if ((i & 4) != 0) {
            str3 = request.method;
        }
        if ((i & 8) != 0) {
            anyMessage = request.payload;
        }
        if ((i & 16) != 0) {
            byteString = request.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str4 = str3;
        return request.copy(str, str2, str4, anyMessage, byteString2);
    }

    public final Request copy(String channel, String request_id, String method, AnyMessage payload, ByteString unknownFields) {
        channel.getClass();
        request_id.getClass();
        method.getClass();
        unknownFields.getClass();
        return new Request(channel, request_id, method, payload, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Request)) {
            return false;
        }
        Request request = (Request) other;
        return x44.r(unknownFields(), request.unknownFields()) && x44.r(this.channel, request.channel) && x44.r(this.request_id, request.request_id) && x44.r(this.method, request.method) && x44.r(this.payload, request.payload);
    }

    public final String getChannel() {
        return this.channel;
    }

    public final String getMethod() {
        return this.method;
    }

    public final AnyMessage getPayload() {
        return this.payload;
    }

    public final String getRequest_id() {
        return this.request_id;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iL = kgh.l(kgh.l(kgh.l(unknownFields().hashCode() * 37, 37, this.channel), 37, this.request_id), 37, this.method);
        AnyMessage anyMessage = this.payload;
        int iHashCode = iL + (anyMessage != null ? anyMessage.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @lz5
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m91newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ms6.y("channel=", Internal.sanitize(this.channel), arrayList);
        ms6.y("request_id=", Internal.sanitize(this.request_id), arrayList);
        ms6.y("method=", Internal.sanitize(this.method), arrayList);
        AnyMessage anyMessage = this.payload;
        if (anyMessage != null) {
            arrayList.add("payload=" + anyMessage);
        }
        return w44.S0(arrayList, ", ", "Request{", "}", null, 56);
    }

    @Override // com.squareup.wire.Message
    @lz5
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m91newBuilder();
    }

    public Request() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Request(String str, String str2, String str3, AnyMessage anyMessage, ByteString byteString) {
        super(ADAPTER, byteString);
        str.getClass();
        str2.getClass();
        str3.getClass();
        byteString.getClass();
        this.channel = str;
        this.request_id = str2;
        this.method = str3;
        this.payload = anyMessage;
    }
}
