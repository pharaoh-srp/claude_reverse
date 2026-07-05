package anthropic.claude.usercontent.sandbox;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import defpackage.jce;
import defpackage.lz5;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.pl9;
import defpackage.w44;
import defpackage.x44;
import java.io.EOFException;
import java.util.ArrayList;
import kotlin.Metadata;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\u0013\u001a\u00020\u0002H\u0017b\u0018\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\n\b\u0017\u0012\u0006\b\n0\u00188\u0019J\u0014\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0082\u0004J\n\u0010\u001e\u001a\u00020\u001fH\u0096\u0080\u0004J\b\u0010 \u001a\u00020!H\u0016J\u001c\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006RG\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u0092\u0002,\b\u000b\u0012\b\b\f\u0012\u0004\b\u0003\u0010\u0002\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\n\b\u000f\u0012\u0006\b\n0\u00108\u0011\u0012\b\b\u0012\u0012\u0004\b\u0003\u0010\u0000¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006$"}, d2 = {"Lanthropic/claude/usercontent/sandbox/ReportErrorRequest;", "Lcom/squareup/wire/Message;", "", "error", "Lanthropic/claude/usercontent/sandbox/SandboxError;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lanthropic/claude/usercontent/sandbox/SandboxError;Lokio/ByteString;)V", "getError", "()Lanthropic/claude/usercontent/sandbox/SandboxError;", "Lcom/squareup/wire/WireField;", "tag", "adapter", "anthropic.claude.usercontent.sandbox.SandboxError#ADAPTER", "label", "Lcom/squareup/wire/WireField$Label;", "OMIT_IDENTITY", "schemaIndex", "newBuilder", "Lkotlin/Deprecated;", "message", "Shouldn't be used in Kotlin", "level", "Lkotlin/DeprecationLevel;", "HIDDEN", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "Claude:protos"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public final class ReportErrorRequest extends Message {
    public static final ProtoAdapter<ReportErrorRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "anthropic.claude.usercontent.sandbox.SandboxError#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final SandboxError error;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final pl9 pl9VarB = jce.a.b(ReportErrorRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ReportErrorRequest>(fieldEncoding, pl9VarB, syntax) { // from class: anthropic.claude.usercontent.sandbox.ReportErrorRequest$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ReportErrorRequest decode(ProtoReader reader) {
                reader.getClass();
                long jBeginMessage = reader.beginMessage();
                SandboxError sandboxErrorDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ReportErrorRequest(sandboxErrorDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        sandboxErrorDecode = SandboxError.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ReportErrorRequest value) {
                writer.getClass();
                value.getClass();
                if (value.getError() != null) {
                    SandboxError.ADAPTER.encodeWithTag(writer, 1, value.getError());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ReportErrorRequest value) {
                value.getClass();
                int iE = value.unknownFields().e();
                return value.getError() != null ? SandboxError.ADAPTER.encodedSizeWithTag(1, value.getError()) + iE : iE;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ReportErrorRequest redact(ReportErrorRequest value) {
                value.getClass();
                SandboxError error = value.getError();
                return value.copy(error != null ? SandboxError.ADAPTER.redact(error) : null, ByteString.H);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ReportErrorRequest value) throws EOFException {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                if (value.getError() != null) {
                    SandboxError.ADAPTER.encodeWithTag(writer, 1, value.getError());
                }
            }
        };
    }

    public /* synthetic */ ReportErrorRequest(SandboxError sandboxError, ByteString byteString, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : sandboxError, (i & 2) != 0 ? ByteString.H : byteString);
    }

    public static /* synthetic */ ReportErrorRequest copy$default(ReportErrorRequest reportErrorRequest, SandboxError sandboxError, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            sandboxError = reportErrorRequest.error;
        }
        if ((i & 2) != 0) {
            byteString = reportErrorRequest.unknownFields();
        }
        return reportErrorRequest.copy(sandboxError, byteString);
    }

    public final ReportErrorRequest copy(SandboxError error, ByteString unknownFields) {
        unknownFields.getClass();
        return new ReportErrorRequest(error, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ReportErrorRequest)) {
            return false;
        }
        ReportErrorRequest reportErrorRequest = (ReportErrorRequest) other;
        return x44.r(unknownFields(), reportErrorRequest.unknownFields()) && x44.r(this.error, reportErrorRequest.error);
    }

    public final SandboxError getError() {
        return this.error;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        SandboxError sandboxError = this.error;
        int iHashCode2 = iHashCode + (sandboxError != null ? sandboxError.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @lz5
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m83newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        SandboxError sandboxError = this.error;
        if (sandboxError != null) {
            arrayList.add("error=" + sandboxError);
        }
        return w44.S0(arrayList, ", ", "ReportErrorRequest{", "}", null, 56);
    }

    @Override // com.squareup.wire.Message
    @lz5
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m83newBuilder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReportErrorRequest() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportErrorRequest(SandboxError sandboxError, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.error = sandboxError;
    }
}
