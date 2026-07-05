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
import defpackage.pl9;
import defpackage.sz6;
import defpackage.w44;
import defpackage.x44;
import java.io.EOFException;
import java.util.ArrayList;
import kotlin.Metadata;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 12\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00011BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010!\u001a\u00020\u0002H\u0017b\u0018\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\n\b%\u0012\u0006\b\n0&8'J\u0014\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0096\u0082\u0004J\n\u0010,\u001a\u00020-H\u0096\u0080\u0004J\b\u0010.\u001a\u00020/H\u0016J@\u00100\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fRE\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u0092\u0002*\b\u0011\u0012\b\b\u0012\u0012\u0004\b\u0003\u0010\u0002\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\b\b\u0017\u0012\u0004\b\u0003\u0010\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010RE\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u0092\u0002*\b\u0011\u0012\b\b\u0012\u0012\u0004\b\u0003\u0010\u0004\u0012\b\b\u0013\u0012\u0004\b\b(\u001a\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\b\b\u0017\u0012\u0004\b\u0003\u0010\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019RE\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u0092\u0002*\b\u0011\u0012\b\b\u0012\u0012\u0004\b\u0003\u0010\u0006\u0012\b\b\u0013\u0012\u0004\b\b(\u001d\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\b\b\u0017\u0012\u0004\b\u0003\u0010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cRE\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u0092\u0002*\b\u0011\u0012\b\b\u0012\u0012\u0004\b\u0003\u0010\b\u0012\b\b\u0013\u0012\u0004\b\b( \u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\b\b\u0017\u0012\u0004\b\u0003\u0010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00062"}, d2 = {"Lanthropic/claude/usercontent/sandbox/SandboxError;", "Lcom/squareup/wire/Message;", "", "unsupported_imports", "Lanthropic/claude/usercontent/sandbox/UnsupportedImportsError;", "runtime_error", "Lanthropic/claude/usercontent/sandbox/RuntimeError;", "file_not_found", "Lanthropic/claude/usercontent/sandbox/FileNotFoundError;", "claude_completion_error", "Lanthropic/claude/usercontent/sandbox/ClaudeCompletionError;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lanthropic/claude/usercontent/sandbox/UnsupportedImportsError;Lanthropic/claude/usercontent/sandbox/RuntimeError;Lanthropic/claude/usercontent/sandbox/FileNotFoundError;Lanthropic/claude/usercontent/sandbox/ClaudeCompletionError;Lokio/ByteString;)V", "getUnsupported_imports", "()Lanthropic/claude/usercontent/sandbox/UnsupportedImportsError;", "Lcom/squareup/wire/WireField;", "tag", "adapter", "anthropic.claude.usercontent.sandbox.UnsupportedImportsError#ADAPTER", "oneofName", "error", "schemaIndex", "getRuntime_error", "()Lanthropic/claude/usercontent/sandbox/RuntimeError;", "anthropic.claude.usercontent.sandbox.RuntimeError#ADAPTER", "getFile_not_found", "()Lanthropic/claude/usercontent/sandbox/FileNotFoundError;", "anthropic.claude.usercontent.sandbox.FileNotFoundError#ADAPTER", "getClaude_completion_error", "()Lanthropic/claude/usercontent/sandbox/ClaudeCompletionError;", "anthropic.claude.usercontent.sandbox.ClaudeCompletionError#ADAPTER", "newBuilder", "Lkotlin/Deprecated;", "message", "Shouldn't be used in Kotlin", "level", "Lkotlin/DeprecationLevel;", "HIDDEN", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "Claude:protos"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
public final class SandboxError extends Message {
    public static final ProtoAdapter<SandboxError> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "anthropic.claude.usercontent.sandbox.ClaudeCompletionError#ADAPTER", oneofName = "error", schemaIndex = 3, tag = 4)
    private final ClaudeCompletionError claude_completion_error;

    @WireField(adapter = "anthropic.claude.usercontent.sandbox.FileNotFoundError#ADAPTER", oneofName = "error", schemaIndex = 2, tag = 3)
    private final FileNotFoundError file_not_found;

    @WireField(adapter = "anthropic.claude.usercontent.sandbox.RuntimeError#ADAPTER", oneofName = "error", schemaIndex = 1, tag = 2)
    private final RuntimeError runtime_error;

    @WireField(adapter = "anthropic.claude.usercontent.sandbox.UnsupportedImportsError#ADAPTER", oneofName = "error", schemaIndex = 0, tag = 1)
    private final UnsupportedImportsError unsupported_imports;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final pl9 pl9VarB = jce.a.b(SandboxError.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SandboxError>(fieldEncoding, pl9VarB, syntax) { // from class: anthropic.claude.usercontent.sandbox.SandboxError$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public SandboxError decode(ProtoReader reader) {
                reader.getClass();
                long jBeginMessage = reader.beginMessage();
                UnsupportedImportsError unsupportedImportsErrorDecode = null;
                RuntimeError runtimeErrorDecode = null;
                FileNotFoundError fileNotFoundErrorDecode = null;
                ClaudeCompletionError claudeCompletionErrorDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new SandboxError(unsupportedImportsErrorDecode, runtimeErrorDecode, fileNotFoundErrorDecode, claudeCompletionErrorDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        unsupportedImportsErrorDecode = UnsupportedImportsError.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        runtimeErrorDecode = RuntimeError.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        fileNotFoundErrorDecode = FileNotFoundError.ADAPTER.decode(reader);
                    } else if (iNextTag != 4) {
                        reader.readUnknownField(iNextTag);
                    } else {
                        claudeCompletionErrorDecode = ClaudeCompletionError.ADAPTER.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SandboxError value) {
                writer.getClass();
                value.getClass();
                UnsupportedImportsError.ADAPTER.encodeWithTag(writer, 1, value.getUnsupported_imports());
                RuntimeError.ADAPTER.encodeWithTag(writer, 2, value.getRuntime_error());
                FileNotFoundError.ADAPTER.encodeWithTag(writer, 3, value.getFile_not_found());
                ClaudeCompletionError.ADAPTER.encodeWithTag(writer, 4, value.getClaude_completion_error());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SandboxError value) {
                value.getClass();
                return ClaudeCompletionError.ADAPTER.encodedSizeWithTag(4, value.getClaude_completion_error()) + FileNotFoundError.ADAPTER.encodedSizeWithTag(3, value.getFile_not_found()) + RuntimeError.ADAPTER.encodedSizeWithTag(2, value.getRuntime_error()) + UnsupportedImportsError.ADAPTER.encodedSizeWithTag(1, value.getUnsupported_imports()) + value.unknownFields().e();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SandboxError redact(SandboxError value) {
                value.getClass();
                UnsupportedImportsError unsupported_imports = value.getUnsupported_imports();
                UnsupportedImportsError unsupportedImportsErrorRedact = unsupported_imports != null ? UnsupportedImportsError.ADAPTER.redact(unsupported_imports) : null;
                RuntimeError runtime_error = value.getRuntime_error();
                RuntimeError runtimeErrorRedact = runtime_error != null ? RuntimeError.ADAPTER.redact(runtime_error) : null;
                FileNotFoundError file_not_found = value.getFile_not_found();
                FileNotFoundError fileNotFoundErrorRedact = file_not_found != null ? FileNotFoundError.ADAPTER.redact(file_not_found) : null;
                ClaudeCompletionError claude_completion_error = value.getClaude_completion_error();
                return value.copy(unsupportedImportsErrorRedact, runtimeErrorRedact, fileNotFoundErrorRedact, claude_completion_error != null ? ClaudeCompletionError.ADAPTER.redact(claude_completion_error) : null, ByteString.H);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SandboxError value) throws EOFException {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ClaudeCompletionError.ADAPTER.encodeWithTag(writer, 4, value.getClaude_completion_error());
                FileNotFoundError.ADAPTER.encodeWithTag(writer, 3, value.getFile_not_found());
                RuntimeError.ADAPTER.encodeWithTag(writer, 2, value.getRuntime_error());
                UnsupportedImportsError.ADAPTER.encodeWithTag(writer, 1, value.getUnsupported_imports());
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SandboxError(UnsupportedImportsError unsupportedImportsError, RuntimeError runtimeError, FileNotFoundError fileNotFoundError, ClaudeCompletionError claudeCompletionError, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.unsupported_imports = unsupportedImportsError;
        this.runtime_error = runtimeError;
        this.file_not_found = fileNotFoundError;
        this.claude_completion_error = claudeCompletionError;
        if (Internal.countNonNull(unsupportedImportsError, runtimeError, fileNotFoundError, claudeCompletionError, new Object[0]) <= 1) {
            return;
        }
        sz6.p("At most one of unsupported_imports, runtime_error, file_not_found, claude_completion_error may be non-null");
        throw null;
    }

    public static /* synthetic */ SandboxError copy$default(SandboxError sandboxError, UnsupportedImportsError unsupportedImportsError, RuntimeError runtimeError, FileNotFoundError fileNotFoundError, ClaudeCompletionError claudeCompletionError, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            unsupportedImportsError = sandboxError.unsupported_imports;
        }
        if ((i & 2) != 0) {
            runtimeError = sandboxError.runtime_error;
        }
        if ((i & 4) != 0) {
            fileNotFoundError = sandboxError.file_not_found;
        }
        if ((i & 8) != 0) {
            claudeCompletionError = sandboxError.claude_completion_error;
        }
        if ((i & 16) != 0) {
            byteString = sandboxError.unknownFields();
        }
        ByteString byteString2 = byteString;
        FileNotFoundError fileNotFoundError2 = fileNotFoundError;
        return sandboxError.copy(unsupportedImportsError, runtimeError, fileNotFoundError2, claudeCompletionError, byteString2);
    }

    public final SandboxError copy(UnsupportedImportsError unsupported_imports, RuntimeError runtime_error, FileNotFoundError file_not_found, ClaudeCompletionError claude_completion_error, ByteString unknownFields) {
        unknownFields.getClass();
        return new SandboxError(unsupported_imports, runtime_error, file_not_found, claude_completion_error, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SandboxError)) {
            return false;
        }
        SandboxError sandboxError = (SandboxError) other;
        return x44.r(unknownFields(), sandboxError.unknownFields()) && x44.r(this.unsupported_imports, sandboxError.unsupported_imports) && x44.r(this.runtime_error, sandboxError.runtime_error) && x44.r(this.file_not_found, sandboxError.file_not_found) && x44.r(this.claude_completion_error, sandboxError.claude_completion_error);
    }

    public final ClaudeCompletionError getClaude_completion_error() {
        return this.claude_completion_error;
    }

    public final FileNotFoundError getFile_not_found() {
        return this.file_not_found;
    }

    public final RuntimeError getRuntime_error() {
        return this.runtime_error;
    }

    public final UnsupportedImportsError getUnsupported_imports() {
        return this.unsupported_imports;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        UnsupportedImportsError unsupportedImportsError = this.unsupported_imports;
        int iHashCode2 = (iHashCode + (unsupportedImportsError != null ? unsupportedImportsError.hashCode() : 0)) * 37;
        RuntimeError runtimeError = this.runtime_error;
        int iHashCode3 = (iHashCode2 + (runtimeError != null ? runtimeError.hashCode() : 0)) * 37;
        FileNotFoundError fileNotFoundError = this.file_not_found;
        int iHashCode4 = (iHashCode3 + (fileNotFoundError != null ? fileNotFoundError.hashCode() : 0)) * 37;
        ClaudeCompletionError claudeCompletionError = this.claude_completion_error;
        int iHashCode5 = iHashCode4 + (claudeCompletionError != null ? claudeCompletionError.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @lz5
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m88newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        UnsupportedImportsError unsupportedImportsError = this.unsupported_imports;
        if (unsupportedImportsError != null) {
            arrayList.add("unsupported_imports=" + unsupportedImportsError);
        }
        RuntimeError runtimeError = this.runtime_error;
        if (runtimeError != null) {
            arrayList.add("runtime_error=" + runtimeError);
        }
        FileNotFoundError fileNotFoundError = this.file_not_found;
        if (fileNotFoundError != null) {
            arrayList.add("file_not_found=" + fileNotFoundError);
        }
        ClaudeCompletionError claudeCompletionError = this.claude_completion_error;
        if (claudeCompletionError != null) {
            arrayList.add("claude_completion_error=" + claudeCompletionError);
        }
        return w44.S0(arrayList, ", ", "SandboxError{", "}", null, 56);
    }

    @Override // com.squareup.wire.Message
    @lz5
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m88newBuilder();
    }

    public /* synthetic */ SandboxError(UnsupportedImportsError unsupportedImportsError, RuntimeError runtimeError, FileNotFoundError fileNotFoundError, ClaudeCompletionError claudeCompletionError, ByteString byteString, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : unsupportedImportsError, (i & 2) != 0 ? null : runtimeError, (i & 4) != 0 ? null : fileNotFoundError, (i & 8) != 0 ? null : claudeCompletionError, (i & 16) != 0 ? ByteString.H : byteString);
    }

    public SandboxError() {
        this(null, null, null, null, null, 31, null);
    }
}
