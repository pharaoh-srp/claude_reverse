package anthropic.claude.usercontent.sandbox.wire_format;

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
import defpackage.vb7;
import defpackage.w44;
import defpackage.x44;
import java.io.EOFException;
import java.util.ArrayList;
import kotlin.Metadata;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 /2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001/B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\"\u0010!\u001a\u00020\u0002H\u0017b\u0018\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\n\b%\u0012\u0006\b\n0&8'J\u0014\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0096\u0082\u0004J\n\u0010,\u001a\u00020\u0007H\u0096\u0080\u0004J\b\u0010-\u001a\u00020\u0004H\u0016J:\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bRE\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004\u0092\u0002,\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0002\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\n\b\u0014\u0012\u0006\b\n0\u00158\u0016\u0012\b\b\u0017\u0012\u0004\b\u0003\u0010\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fRO\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u0092\u00026\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0004\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\n\b\u0014\u0012\u0006\b\n0\u00158\u0016\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\b\b\u0017\u0012\u0004\b\u0003\u0010\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000fRE\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u0092\u0002,\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0006\u0012\b\b\u0012\u0012\u0004\b\b(\u001d\u0012\n\b\u0014\u0012\u0006\b\n0\u00158\u0016\u0012\b\b\u0017\u0012\u0004\b\u0003\u0010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cRG\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u0092\u0002,\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\b\u0012\b\b\u0012\u0012\u0004\b\b( \u0012\n\b\u0014\u0012\u0006\b\n0\u00158\u0016\u0012\b\b\u0017\u0012\u0004\b\u0003\u0010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00060"}, d2 = {"Lanthropic/claude/usercontent/sandbox/wire_format/Response;", "Lcom/squareup/wire/Message;", "", "channel", "", "request_id", "status", "", "payload", "Lcom/squareup/wire/AnyMessage;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILcom/squareup/wire/AnyMessage;Lokio/ByteString;)V", "getChannel", "()Ljava/lang/String;", "Lcom/squareup/wire/WireField;", "tag", "adapter", "com.squareup.wire.ProtoAdapter#STRING", "label", "Lcom/squareup/wire/WireField$Label;", "OMIT_IDENTITY", "schemaIndex", "getRequest_id", "jsonName", "requestId", "getStatus", "()I", "com.squareup.wire.ProtoAdapter#INT32", "getPayload", "()Lcom/squareup/wire/AnyMessage;", "com.squareup.wire.AnyMessage#ADAPTER", "newBuilder", "Lkotlin/Deprecated;", "message", "Shouldn't be used in Kotlin", "level", "Lkotlin/DeprecationLevel;", "HIDDEN", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "Claude:protos"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public final class Response extends Message {
    public static final ProtoAdapter<Response> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String channel;

    @WireField(adapter = "com.squareup.wire.AnyMessage#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final AnyMessage payload;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "requestId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String request_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final int status;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final pl9 pl9VarB = jce.a.b(Response.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Response>(fieldEncoding, pl9VarB, syntax) { // from class: anthropic.claude.usercontent.sandbox.wire_format.Response$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Response decode(ProtoReader reader) {
                reader.getClass();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                AnyMessage anyMessageDecode = null;
                int iIntValue = 0;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new Response(strDecode, strDecode2, iIntValue, anyMessageDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    } else if (iNextTag != 4) {
                        reader.readUnknownField(iNextTag);
                    } else {
                        anyMessageDecode = AnyMessage.ADAPTER.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Response value) {
                writer.getClass();
                value.getClass();
                if (!x44.r(value.getChannel(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getChannel());
                }
                if (!x44.r(value.getRequest_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, value.getRequest_id());
                }
                if (value.getStatus() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, Integer.valueOf(value.getStatus()));
                }
                if (value.getPayload() != null) {
                    AnyMessage.ADAPTER.encodeWithTag(writer, 4, value.getPayload());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Response value) {
                value.getClass();
                int iE = value.unknownFields().e();
                if (!x44.r(value.getChannel(), "")) {
                    iE += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getChannel());
                }
                if (!x44.r(value.getRequest_id(), "")) {
                    iE += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getRequest_id());
                }
                if (value.getStatus() != 0) {
                    iE += ProtoAdapter.INT32.encodedSizeWithTag(3, Integer.valueOf(value.getStatus()));
                }
                return value.getPayload() != null ? AnyMessage.ADAPTER.encodedSizeWithTag(4, value.getPayload()) + iE : iE;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Response redact(Response value) {
                value.getClass();
                AnyMessage payload = value.getPayload();
                return Response.copy$default(value, null, null, 0, payload != null ? AnyMessage.ADAPTER.redact(payload) : null, ByteString.H, 7, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Response value) throws EOFException {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                if (value.getPayload() != null) {
                    AnyMessage.ADAPTER.encodeWithTag(writer, 4, value.getPayload());
                }
                if (value.getStatus() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 3, Integer.valueOf(value.getStatus()));
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

    public /* synthetic */ Response(String str, String str2, int i, AnyMessage anyMessage, ByteString byteString, int i2, mq5 mq5Var) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : anyMessage, (i2 & 16) != 0 ? ByteString.H : byteString);
    }

    public static /* synthetic */ Response copy$default(Response response, String str, String str2, int i, AnyMessage anyMessage, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = response.channel;
        }
        if ((i2 & 2) != 0) {
            str2 = response.request_id;
        }
        if ((i2 & 4) != 0) {
            i = response.status;
        }
        if ((i2 & 8) != 0) {
            anyMessage = response.payload;
        }
        if ((i2 & 16) != 0) {
            byteString = response.unknownFields();
        }
        ByteString byteString2 = byteString;
        int i3 = i;
        return response.copy(str, str2, i3, anyMessage, byteString2);
    }

    public final Response copy(String channel, String request_id, int status, AnyMessage payload, ByteString unknownFields) {
        channel.getClass();
        request_id.getClass();
        unknownFields.getClass();
        return new Response(channel, request_id, status, payload, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Response)) {
            return false;
        }
        Response response = (Response) other;
        return x44.r(unknownFields(), response.unknownFields()) && x44.r(this.channel, response.channel) && x44.r(this.request_id, response.request_id) && this.status == response.status && x44.r(this.payload, response.payload);
    }

    public final String getChannel() {
        return this.channel;
    }

    public final AnyMessage getPayload() {
        return this.payload;
    }

    public final String getRequest_id() {
        return this.request_id;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iC = vb7.c(this.status, kgh.l(kgh.l(unknownFields().hashCode() * 37, 37, this.channel), 37, this.request_id), 37);
        AnyMessage anyMessage = this.payload;
        int iHashCode = iC + (anyMessage != null ? anyMessage.hashCode() : 0);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @lz5
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m92newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ms6.y("channel=", Internal.sanitize(this.channel), arrayList);
        ms6.y("request_id=", Internal.sanitize(this.request_id), arrayList);
        arrayList.add("status=" + this.status);
        AnyMessage anyMessage = this.payload;
        if (anyMessage != null) {
            arrayList.add("payload=" + anyMessage);
        }
        return w44.S0(arrayList, ", ", "Response{", "}", null, 56);
    }

    @Override // com.squareup.wire.Message
    @lz5
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m92newBuilder();
    }

    public Response() {
        this(null, null, 0, null, null, 31, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Response(String str, String str2, int i, AnyMessage anyMessage, ByteString byteString) {
        super(ADAPTER, byteString);
        str.getClass();
        str2.getClass();
        byteString.getClass();
        this.channel = str;
        this.request_id = str2;
        this.status = i;
        this.payload = anyMessage;
    }
}
