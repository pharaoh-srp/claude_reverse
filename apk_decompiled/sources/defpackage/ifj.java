package defpackage;

import anthropic.claude.usercontent.ErrorResponse;
import anthropic.claude.usercontent.UnknownMessage;
import anthropic.claude.usercontent.mcpapp.JsonRpcEnvelope;
import anthropic.claude.usercontent.mcpapp.RenderMcpAppRequest;
import anthropic.claude.usercontent.mcpapp.RenderMcpAppResponse;
import anthropic.claude.usercontent.sandbox.ClaudeCompletionError;
import anthropic.claude.usercontent.sandbox.ClaudeCompletionRequest;
import anthropic.claude.usercontent.sandbox.ClaudeCompletionResponse;
import anthropic.claude.usercontent.sandbox.ExecuteToolRequest;
import anthropic.claude.usercontent.sandbox.ExecuteToolResponse;
import anthropic.claude.usercontent.sandbox.FileNotFoundError;
import anthropic.claude.usercontent.sandbox.GetFileRequest;
import anthropic.claude.usercontent.sandbox.GetFileResponse;
import anthropic.claude.usercontent.sandbox.OpenExternal;
import anthropic.claude.usercontent.sandbox.RenderPublicArtifactRequest;
import anthropic.claude.usercontent.sandbox.RenderPublicArtifactResponse;
import anthropic.claude.usercontent.sandbox.RenderSharedArtifactRequest;
import anthropic.claude.usercontent.sandbox.RenderSharedArtifactResponse;
import anthropic.claude.usercontent.sandbox.ReportErrorRequest;
import anthropic.claude.usercontent.sandbox.RunCodeRequest;
import anthropic.claude.usercontent.sandbox.RunCodeResponse;
import anthropic.claude.usercontent.sandbox.RuntimeError;
import anthropic.claude.usercontent.sandbox.SandboxContent;
import anthropic.claude.usercontent.sandbox.SandboxError;
import anthropic.claude.usercontent.sandbox.SendConversationMessageRequest;
import anthropic.claude.usercontent.sandbox.UnsupportedImportsError;
import anthropic.claude.usercontent.sandbox.wire_format.Request;
import anthropic.claude.usercontent.sandbox.wire_format.Response;
import com.anthropic.claude.protos.push.ConwayWakeRequest;
import com.anthropic.claude.protos.push.OpenChatRequest;
import com.anthropic.claude.protos.push.OpenCodeSessionRequest;
import com.anthropic.claude.protos.push.OpenCoworkSessionRequest;
import com.anthropic.claude.protos.push.OpenDispatchRequest;
import com.anthropic.claude.protos.push.OpenOrbitRequest;
import com.anthropic.claude.protos.push.OpenTaskRequest;
import com.anthropic.claude.protos.push.PushOperationEnvelope;
import com.squareup.wire.ProtoAdapter;
import google.protobuf.Empty;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
public final class ifj implements Map, mm9 {
    public final lqa E;
    public final Set F;
    public final Set G;
    public final int H;
    public final Collection I;

    public ifj() {
        lqa lqaVar = new lqa();
        for (ProtoAdapter protoAdapter : x44.X(ErrorResponse.ADAPTER, JsonRpcEnvelope.ADAPTER, RenderMcpAppRequest.ADAPTER, RenderMcpAppResponse.ADAPTER, UnknownMessage.ADAPTER, ClaudeCompletionError.ADAPTER, ClaudeCompletionRequest.ADAPTER, ClaudeCompletionResponse.ADAPTER, FileNotFoundError.ADAPTER, GetFileRequest.ADAPTER, GetFileResponse.ADAPTER, OpenExternal.ADAPTER, ReportErrorRequest.ADAPTER, RunCodeRequest.ADAPTER, RunCodeResponse.ADAPTER, RuntimeError.ADAPTER, SandboxContent.ADAPTER, SandboxError.ADAPTER, SendConversationMessageRequest.ADAPTER, UnsupportedImportsError.ADAPTER, Request.ADAPTER, Response.ADAPTER, RenderPublicArtifactRequest.ADAPTER, RenderPublicArtifactResponse.ADAPTER, RenderSharedArtifactRequest.ADAPTER, RenderSharedArtifactResponse.ADAPTER, PushOperationEnvelope.ADAPTER, ConwayWakeRequest.ADAPTER, OpenChatRequest.ADAPTER, OpenCodeSessionRequest.ADAPTER, OpenCoworkSessionRequest.ADAPTER, OpenDispatchRequest.ADAPTER, OpenOrbitRequest.ADAPTER, OpenTaskRequest.ADAPTER, Empty.ADAPTER, ExecuteToolRequest.ADAPTER, ExecuteToolResponse.ADAPTER)) {
            String typeUrl = protoAdapter.getTypeUrl();
            typeUrl.getClass();
            lqaVar.put(typeUrl, protoAdapter);
        }
        lqa lqaVarC = lqaVar.c();
        this.E = lqaVarC;
        this.F = lqaVarC.entrySet();
        this.G = lqaVarC.keySet();
        this.H = lqaVarC.M;
        this.I = lqaVarC.values();
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return this.E.containsKey(rlk.f((String) obj));
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof ProtoAdapter)) {
            return false;
        }
        return this.E.containsValue((ProtoAdapter) obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.F;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj instanceof String) {
            return (ProtoAdapter) this.E.get(rlk.f((String) obj));
        }
        return null;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.E.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.G;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.H;
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.I;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
