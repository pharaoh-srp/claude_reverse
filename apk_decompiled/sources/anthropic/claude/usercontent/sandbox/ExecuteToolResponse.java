package anthropic.claude.usercontent.sandbox;

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
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u0017\u001a\u00020\u0002H\u0017b\u0018\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\n\b\u001b\u0012\u0006\b\n0\u001c8\u001dJ\u0014\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0082\u0004J\n\u0010\"\u001a\u00020#H\u0096\u0080\u0004J\b\u0010$\u001a\u00020\u0004H\u0016J.\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bRE\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004\u0092\u0002,\b\r\u0012\b\b\u000e\u0012\u0004\b\u0003\u0010\u0002\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\n\b\u0011\u0012\u0006\b\n0\u00128\u0013\u0012\b\b\u0014\u0012\u0004\b\u0003\u0010\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fRE\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u0092\u0002,\b\r\u0012\b\b\u000e\u0012\u0004\b\u0003\u0010\u0004\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\n\b\u0011\u0012\u0006\b\n0\u00128\u0013\u0012\b\b\u0014\u0012\u0004\b\u0003\u0010\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\fRE\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004\u0092\u0002,\b\r\u0012\b\b\u000e\u0012\u0004\b\u0003\u0010\u0006\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\n\b\u0011\u0012\u0006\b\n0\u00128\u0013\u0012\b\b\u0014\u0012\u0004\b\u0003\u0010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\f¨\u0006'"}, d2 = {"Lanthropic/claude/usercontent/sandbox/ExecuteToolResponse;", "Lcom/squareup/wire/Message;", "", "status", "", "error", "tool_id", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getStatus", "()Ljava/lang/String;", "Lcom/squareup/wire/WireField;", "tag", "adapter", "com.squareup.wire.ProtoAdapter#STRING", "label", "Lcom/squareup/wire/WireField$Label;", "OMIT_IDENTITY", "schemaIndex", "getError", "getTool_id", "newBuilder", "Lkotlin/Deprecated;", "message", "Shouldn't be used in Kotlin", "level", "Lkotlin/DeprecationLevel;", "HIDDEN", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "Claude:protos"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public final class ExecuteToolResponse extends Message {
    public static final ProtoAdapter<ExecuteToolResponse> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String error;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String tool_id;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final pl9 pl9VarB = jce.a.b(ExecuteToolResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ExecuteToolResponse>(fieldEncoding, pl9VarB, syntax) { // from class: anthropic.claude.usercontent.sandbox.ExecuteToolResponse$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ExecuteToolResponse decode(ProtoReader reader) {
                reader.getClass();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ExecuteToolResponse(strDecode, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag != 3) {
                        reader.readUnknownField(iNextTag);
                    } else {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ExecuteToolResponse value) {
                writer.getClass();
                value.getClass();
                if (!x44.r(value.getStatus(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getStatus());
                }
                if (!x44.r(value.getError(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, value.getError());
                }
                if (!x44.r(value.getTool_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, value.getTool_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ExecuteToolResponse value) {
                value.getClass();
                int iE = value.unknownFields().e();
                if (!x44.r(value.getStatus(), "")) {
                    iE += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getStatus());
                }
                if (!x44.r(value.getError(), "")) {
                    iE += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getError());
                }
                return !x44.r(value.getTool_id(), "") ? ProtoAdapter.STRING.encodedSizeWithTag(3, value.getTool_id()) + iE : iE;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ExecuteToolResponse redact(ExecuteToolResponse value) {
                value.getClass();
                return ExecuteToolResponse.copy$default(value, null, null, null, ByteString.H, 7, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ExecuteToolResponse value) throws EOFException {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                if (!x44.r(value.getTool_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, value.getTool_id());
                }
                if (!x44.r(value.getError(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, value.getError());
                }
                if (x44.r(value.getStatus(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getStatus());
            }
        };
    }

    public /* synthetic */ ExecuteToolResponse(String str, String str2, String str3, ByteString byteString, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? ByteString.H : byteString);
    }

    public static /* synthetic */ ExecuteToolResponse copy$default(ExecuteToolResponse executeToolResponse, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = executeToolResponse.status;
        }
        if ((i & 2) != 0) {
            str2 = executeToolResponse.error;
        }
        if ((i & 4) != 0) {
            str3 = executeToolResponse.tool_id;
        }
        if ((i & 8) != 0) {
            byteString = executeToolResponse.unknownFields();
        }
        return executeToolResponse.copy(str, str2, str3, byteString);
    }

    public final ExecuteToolResponse copy(String status, String error, String tool_id, ByteString unknownFields) {
        status.getClass();
        error.getClass();
        tool_id.getClass();
        unknownFields.getClass();
        return new ExecuteToolResponse(status, error, tool_id, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ExecuteToolResponse)) {
            return false;
        }
        ExecuteToolResponse executeToolResponse = (ExecuteToolResponse) other;
        return x44.r(unknownFields(), executeToolResponse.unknownFields()) && x44.r(this.status, executeToolResponse.status) && x44.r(this.error, executeToolResponse.error) && x44.r(this.tool_id, executeToolResponse.tool_id);
    }

    public final String getError() {
        return this.error;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getTool_id() {
        return this.tool_id;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.tool_id.hashCode() + kgh.l(kgh.l(unknownFields().hashCode() * 37, 37, this.status), 37, this.error);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @lz5
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m74newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ms6.y("status=", Internal.sanitize(this.status), arrayList);
        ms6.y("error=", Internal.sanitize(this.error), arrayList);
        ms6.y("tool_id=", Internal.sanitize(this.tool_id), arrayList);
        return w44.S0(arrayList, ", ", "ExecuteToolResponse{", "}", null, 56);
    }

    @Override // com.squareup.wire.Message
    @lz5
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m74newBuilder();
    }

    public ExecuteToolResponse() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExecuteToolResponse(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        str.getClass();
        str2.getClass();
        str3.getClass();
        byteString.getClass();
        this.status = str;
        this.error = str2;
        this.tool_id = str3;
    }
}
