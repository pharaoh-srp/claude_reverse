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
import defpackage.lm6;
import defpackage.lz5;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.ms6;
import defpackage.pl9;
import defpackage.w44;
import defpackage.x44;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 +2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001+B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\u001c\u001a\u00020\u0002H\u0017b\u0018\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\n\b \u0012\u0006\b\n0!8\"J\u0014\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0096\u0082\u0004J\n\u0010'\u001a\u00020(H\u0096\u0080\u0004J\b\u0010)\u001a\u00020\u0004H\u0016J>\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\nRE\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004\u0092\u0002,\b\u000f\u0012\b\b\u0010\u0012\u0004\b\u0003\u0010\u0002\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\n\b\u0013\u0012\u0006\b\n0\u00148\u0015\u0012\b\b\u0016\u0012\u0004\b\u0003\u0010\u0000¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eRE\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u0092\u0002,\b\u000f\u0012\b\b\u0010\u0012\u0004\b\u0003\u0010\u0004\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\n\b\u0013\u0012\u0006\b\n0\u00148\u0015\u0012\b\b\u0016\u0012\u0004\b\u0003\u0010\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000eRE\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004\u0092\u0002,\b\u000f\u0012\b\b\u0010\u0012\u0004\b\u0003\u0010\b\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\n\b\u0013\u0012\u0006\b\n0\u00148\u0015\u0012\b\b\u0016\u0012\u0004\b\u0003\u0010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000eRK\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0006X\u0087\u0004\u0092\u0002,\b\u000f\u0012\b\b\u0010\u0012\u0004\b\u0003\u0010\u0006\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\n\b\u0013\u0012\u0006\b\n0\u00148\u001b\u0012\b\b\u0016\u0012\u0004\b\u0003\u0010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006,"}, d2 = {"Lanthropic/claude/usercontent/sandbox/RunCodeResponse;", "Lcom/squareup/wire/Message;", "", "status", "", "result", "logs", "", "error", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lokio/ByteString;)V", "getStatus", "()Ljava/lang/String;", "Lcom/squareup/wire/WireField;", "tag", "adapter", "com.squareup.wire.ProtoAdapter#STRING", "label", "Lcom/squareup/wire/WireField$Label;", "OMIT_IDENTITY", "schemaIndex", "getResult", "getError", "getLogs", "()Ljava/util/List;", "REPEATED", "newBuilder", "Lkotlin/Deprecated;", "message", "Shouldn't be used in Kotlin", "level", "Lkotlin/DeprecationLevel;", "HIDDEN", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "Claude:protos"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public final class RunCodeResponse extends Message {
    public static final ProtoAdapter<RunCodeResponse> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String error;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<String> logs;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String result;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String status;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final pl9 pl9VarB = jce.a.b(RunCodeResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<RunCodeResponse>(fieldEncoding, pl9VarB, syntax) { // from class: anthropic.claude.usercontent.sandbox.RunCodeResponse$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public RunCodeResponse decode(ProtoReader reader) {
                reader.getClass();
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new RunCodeResponse(strDecode, strDecode2, arrayList, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        arrayList.add(ProtoAdapter.STRING.decode(reader));
                    } else if (iNextTag != 4) {
                        reader.readUnknownField(iNextTag);
                    } else {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, RunCodeResponse value) {
                writer.getClass();
                value.getClass();
                if (!x44.r(value.getStatus(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getStatus());
                }
                if (!x44.r(value.getResult(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, value.getResult());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 3, value.getLogs());
                if (!x44.r(value.getError(), "")) {
                    protoAdapter.encodeWithTag(writer, 4, value.getError());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(RunCodeResponse value) {
                value.getClass();
                int iE = value.unknownFields().e();
                if (!x44.r(value.getStatus(), "")) {
                    iE += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getStatus());
                }
                if (!x44.r(value.getResult(), "")) {
                    iE += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getResult());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = protoAdapter.asRepeated().encodedSizeWithTag(3, value.getLogs()) + iE;
                return !x44.r(value.getError(), "") ? protoAdapter.encodedSizeWithTag(4, value.getError()) + iEncodedSizeWithTag : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public RunCodeResponse redact(RunCodeResponse value) {
                value.getClass();
                return RunCodeResponse.copy$default(value, null, null, null, null, ByteString.H, 15, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, RunCodeResponse value) throws EOFException {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                if (!x44.r(value.getError(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, value.getError());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 3, value.getLogs());
                if (!x44.r(value.getResult(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, value.getResult());
                }
                if (x44.r(value.getStatus(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, value.getStatus());
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RunCodeResponse(String str, String str2, List<String> list, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        str.getClass();
        str2.getClass();
        list.getClass();
        str3.getClass();
        byteString.getClass();
        this.status = str;
        this.result = str2;
        this.error = str3;
        this.logs = Internal.immutableCopyOf("logs", list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RunCodeResponse copy$default(RunCodeResponse runCodeResponse, String str, String str2, List list, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = runCodeResponse.status;
        }
        if ((i & 2) != 0) {
            str2 = runCodeResponse.result;
        }
        if ((i & 4) != 0) {
            list = runCodeResponse.logs;
        }
        if ((i & 8) != 0) {
            str3 = runCodeResponse.error;
        }
        if ((i & 16) != 0) {
            byteString = runCodeResponse.unknownFields();
        }
        ByteString byteString2 = byteString;
        List list2 = list;
        return runCodeResponse.copy(str, str2, list2, str3, byteString2);
    }

    public final RunCodeResponse copy(String status, String result, List<String> logs, String error, ByteString unknownFields) {
        status.getClass();
        result.getClass();
        logs.getClass();
        error.getClass();
        unknownFields.getClass();
        return new RunCodeResponse(status, result, logs, error, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof RunCodeResponse)) {
            return false;
        }
        RunCodeResponse runCodeResponse = (RunCodeResponse) other;
        return x44.r(unknownFields(), runCodeResponse.unknownFields()) && x44.r(this.status, runCodeResponse.status) && x44.r(this.result, runCodeResponse.result) && x44.r(this.logs, runCodeResponse.logs) && x44.r(this.error, runCodeResponse.error);
    }

    public final String getError() {
        return this.error;
    }

    public final List<String> getLogs() {
        return this.logs;
    }

    public final String getResult() {
        return this.result;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.error.hashCode() + kgh.m(kgh.l(kgh.l(unknownFields().hashCode() * 37, 37, this.status), 37, this.result), 37, this.logs);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @lz5
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m85newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ms6.y("status=", Internal.sanitize(this.status), arrayList);
        ms6.y("result=", Internal.sanitize(this.result), arrayList);
        if (!this.logs.isEmpty()) {
            ms6.y("logs=", Internal.sanitize(this.logs), arrayList);
        }
        ms6.y("error=", Internal.sanitize(this.error), arrayList);
        return w44.S0(arrayList, ", ", "RunCodeResponse{", "}", null, 56);
    }

    @Override // com.squareup.wire.Message
    @lz5
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m85newBuilder();
    }

    public /* synthetic */ RunCodeResponse(String str, String str2, List list, String str3, ByteString byteString, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? lm6.E : list, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? ByteString.H : byteString);
    }

    public RunCodeResponse() {
        this(null, null, null, null, null, 31, null);
    }
}
