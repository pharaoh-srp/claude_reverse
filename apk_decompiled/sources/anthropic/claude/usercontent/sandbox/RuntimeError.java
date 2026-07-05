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
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\u0013\u001a\u00020\u0002H\u0017b\u0018\b\u0014\u0012\b\b\u0003\u0012\u0004\b\b(\u0015\u0012\n\b\u0016\u0012\u0006\b\n0\u00178\u0018J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0082\u0004J\n\u0010\u001d\u001a\u00020\u001eH\u0096\u0080\u0004J\b\u0010\u001f\u001a\u00020\u0004H\u0016J\u001a\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006RE\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004\u0092\u0002,\b\u000b\u0012\b\b\f\u0012\u0004\b\u0003\u0010\u0002\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\n\b\u000f\u0012\u0006\b\n0\u00108\u0011\u0012\b\b\u0012\u0012\u0004\b\u0003\u0010\u0000¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\""}, d2 = {"Lanthropic/claude/usercontent/sandbox/RuntimeError;", "Lcom/squareup/wire/Message;", "", "message", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getMessage", "()Ljava/lang/String;", "Lcom/squareup/wire/WireField;", "tag", "adapter", "com.squareup.wire.ProtoAdapter#STRING", "label", "Lcom/squareup/wire/WireField$Label;", "OMIT_IDENTITY", "schemaIndex", "newBuilder", "Lkotlin/Deprecated;", "Shouldn't be used in Kotlin", "level", "Lkotlin/DeprecationLevel;", "HIDDEN", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "Claude:protos"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public final class RuntimeError extends Message {
    public static final ProtoAdapter<RuntimeError> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String message;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final pl9 pl9VarB = jce.a.b(RuntimeError.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<RuntimeError>(fieldEncoding, pl9VarB, syntax) { // from class: anthropic.claude.usercontent.sandbox.RuntimeError$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public RuntimeError decode(ProtoReader reader) {
                reader.getClass();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new RuntimeError(strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, RuntimeError value) {
                writer.getClass();
                value.getClass();
                if (!x44.r(value.getMessage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getMessage());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(RuntimeError value) {
                value.getClass();
                int iE = value.unknownFields().e();
                return !x44.r(value.getMessage(), "") ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.getMessage()) + iE : iE;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public RuntimeError redact(RuntimeError value) {
                value.getClass();
                return RuntimeError.copy$default(value, null, ByteString.H, 1, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, RuntimeError value) throws EOFException {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                if (x44.r(value.getMessage(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getMessage());
            }
        };
    }

    public /* synthetic */ RuntimeError(String str, ByteString byteString, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ByteString.H : byteString);
    }

    public static /* synthetic */ RuntimeError copy$default(RuntimeError runtimeError, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = runtimeError.message;
        }
        if ((i & 2) != 0) {
            byteString = runtimeError.unknownFields();
        }
        return runtimeError.copy(str, byteString);
    }

    public final RuntimeError copy(String message, ByteString unknownFields) {
        message.getClass();
        unknownFields.getClass();
        return new RuntimeError(message, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof RuntimeError)) {
            return false;
        }
        RuntimeError runtimeError = (RuntimeError) other;
        return x44.r(unknownFields(), runtimeError.unknownFields()) && x44.r(this.message, runtimeError.message);
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.message.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @lz5
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m86newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ms6.y("message=", Internal.sanitize(this.message), arrayList);
        return w44.S0(arrayList, ", ", "RuntimeError{", "}", null, 56);
    }

    @Override // com.squareup.wire.Message
    @lz5
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m86newBuilder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RuntimeError() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RuntimeError(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        str.getClass();
        byteString.getClass();
        this.message = str;
    }
}
