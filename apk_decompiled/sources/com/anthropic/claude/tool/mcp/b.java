package com.anthropic.claude.tool.mcp;

import com.anthropic.claude.api.mcp.McpAuthStatus;
import com.anthropic.claude.api.mcp.McpPrompt;
import com.anthropic.claude.api.mcp.McpResource;
import com.anthropic.claude.api.mcp.McpServer;
import com.anthropic.claude.api.mcp.McpTool;
import com.anthropic.claude.tool.mcp.ServerListFrame;
import com.anthropic.claude.types.strings.McpServerId;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.bg9;
import defpackage.cpc;
import defpackage.dqh;
import defpackage.f0b;
import defpackage.g0b;
import defpackage.i0b;
import defpackage.iei;
import defpackage.l0b;
import defpackage.lm6;
import defpackage.lp7;
import defpackage.m45;
import defpackage.mq5;
import defpackage.n30;
import defpackage.ozf;
import defpackage.sfa;
import defpackage.sq6;
import defpackage.tp4;
import defpackage.uh6;
import defpackage.w44;
import defpackage.x44;
import defpackage.xah;
import defpackage.yfa;
import defpackage.z9e;
import defpackage.zfa;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes.dex */
public final class b implements lp7 {
    public final /* synthetic */ l0b E;
    public final /* synthetic */ z9e F;
    public final /* synthetic */ LinkedHashMap G;
    public final /* synthetic */ lp7 H;
    public final /* synthetic */ long I;

    public b(l0b l0bVar, z9e z9eVar, LinkedHashMap linkedHashMap, lp7 lp7Var, long j) {
        this.E = l0bVar;
        this.F = z9eVar;
        this.G = linkedHashMap;
        this.H = lp7Var;
        this.I = j;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.lp7
    public final Object g(Object obj, tp4 tp4Var) {
        Object objB;
        Object objG;
        Object objB2;
        Object objG2;
        List<McpResource> resources;
        List<McpPrompt> prompts;
        List<McpTool> tools;
        Object objB3;
        Object objB4;
        Object objG3;
        Object objB5;
        Object objG4;
        cpc cpcVar = (cpc) obj;
        bg9 bg9Var = this.E.c;
        String str = (String) cpcVar.E;
        String str2 = (String) cpcVar.F;
        if (str != null) {
            int iHashCode = str.hashCode();
            sfa sfaVar = sfa.DEBUG;
            m45 m45Var = m45.E;
            ozf ozfVar = ozf.F;
            long j = this.I;
            LinkedHashMap linkedHashMap = this.G;
            lp7 lp7Var = this.H;
            switch (iHashCode) {
                case -1983070683:
                    if (str.equals("resources")) {
                        try {
                            bg9Var.getClass();
                            objB = bg9Var.b(str2, ResourcesFrame.Companion.serializer());
                        } catch (SerializationException e) {
                            List list = xah.a;
                            xah.f(e, "Failed to parse MCP bootstrap SSE frame", ozfVar, null, 24);
                            objB = null;
                        }
                        ResourcesFrame resourcesFrame = (ResourcesFrame) objB;
                        if (resourcesFrame != null) {
                            String strM926getServer_uuidowoRr7k = resourcesFrame.m926getServer_uuidowoRr7k();
                            McpServer mcpServer = (McpServer) linkedHashMap.get(McpServerId.m1029boximpl(strM926getServer_uuidowoRr7k));
                            McpServer mcpServerM343copyIgoRxQ$default = McpServer.m343copyIgoRxQ$default(mcpServer == null ? new McpServer(strM926getServer_uuidowoRr7k, "", (String) null, (String) null, (Boolean) null, (Boolean) null, (McpAuthStatus) null, (String) null, (List) null, (List) null, (List) null, (List) null, (Set) null, 8188, (mq5) null) : mcpServer, null, null, null, null, null, null, null, null, null, null, resourcesFrame.getResources(), null, null, 7167, null);
                            linkedHashMap.put(McpServerId.m1029boximpl(strM926getServer_uuidowoRr7k), mcpServerM343copyIgoRxQ$default);
                            if (mcpServerM343copyIgoRxQ$default.getName().length() > 0 && (objG = lp7Var.g(new g0b(mcpServerM343copyIgoRxQ$default), tp4Var)) == m45Var) {
                                return objG;
                            }
                        }
                    }
                    break;
                case -1402931637:
                    if (str.equals("completed")) {
                        this.F.E = true;
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            if (((McpServer) entry.getValue()).getName().length() > 0) {
                                linkedHashMap2.put(entry.getKey(), entry.getValue());
                            }
                        }
                        Set setT1 = w44.t1(linkedHashMap2.keySet());
                        zfa.a.getClass();
                        if (yfa.b()) {
                            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : copyOnWriteArrayList) {
                                ((n30) ((zfa) obj2)).getClass();
                                arrayList.add(obj2);
                            }
                            if (!arrayList.isEmpty()) {
                                zfa.a.getClass();
                                String strU = sq6.u("[", uh6.p(dqh.a(j)), setT1.size(), "] completed: ", " servers seen");
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    ((n30) ((zfa) it.next())).b(sfaVar, "McpBootstrapSse", strU);
                                }
                            }
                        }
                        return lp7Var.g(new f0b(setT1), tp4Var);
                    }
                    break;
                case -759127475:
                    if (str.equals("server_base")) {
                        try {
                            bg9Var.getClass();
                            objB2 = bg9Var.b(str2, ServerBaseFrame.Companion.serializer());
                        } catch (SerializationException e2) {
                            List list2 = xah.a;
                            xah.f(e2, "Failed to parse MCP bootstrap SSE frame", ozfVar, null, 24);
                            objB2 = null;
                        }
                        ServerBaseFrame serverBaseFrame = (ServerBaseFrame) objB2;
                        if (serverBaseFrame != null) {
                            McpServer mcpServer2 = (McpServer) linkedHashMap.get(McpServerId.m1029boximpl(serverBaseFrame.m930getUuidowoRr7k()));
                            String strM930getUuidowoRr7k = serverBaseFrame.m930getUuidowoRr7k();
                            String name = serverBaseFrame.getName();
                            String url = serverBaseFrame.getUrl();
                            String custom_oauth_client_id = serverBaseFrame.getCustom_oauth_client_id();
                            Boolean connected = serverBaseFrame.getConnected();
                            Boolean usedAuthentication = serverBaseFrame.getUsedAuthentication();
                            McpAuthStatus authStatus = serverBaseFrame.getAuthStatus();
                            String iconUrl = serverBaseFrame.getIconUrl();
                            lm6 lm6Var = lm6.E;
                            McpServer mcpServer3 = new McpServer(strM930getUuidowoRr7k, name, url, custom_oauth_client_id, connected, usedAuthentication, authStatus, iconUrl, (mcpServer2 == null || (tools = mcpServer2.getTools()) == null) ? lm6Var : tools, (mcpServer2 == null || (prompts = mcpServer2.getPrompts()) == null) ? lm6Var : prompts, (mcpServer2 == null || (resources = mcpServer2.getResources()) == null) ? lm6Var : resources, (List) null, serverBaseFrame.getCai_flags(), FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM, (mq5) null);
                            linkedHashMap.put(McpServerId.m1029boximpl(serverBaseFrame.m930getUuidowoRr7k()), mcpServer3);
                            if (mcpServer3.getName().length() > 0 && (objG2 = lp7Var.g(new g0b(mcpServer3), tp4Var)) == m45Var) {
                                return objG2;
                            }
                        }
                    }
                    break;
                case -758821862:
                    if (str.equals("server_list")) {
                        try {
                            bg9Var.getClass();
                            objB3 = bg9Var.b(str2, ServerListFrame.Companion.serializer());
                        } catch (SerializationException e3) {
                            List list3 = xah.a;
                            xah.f(e3, "Failed to parse MCP bootstrap SSE frame", ozfVar, null, 24);
                            objB3 = null;
                        }
                        ServerListFrame serverListFrame = (ServerListFrame) objB3;
                        if (serverListFrame != null) {
                            zfa.a.getClass();
                            if (yfa.b()) {
                                CopyOnWriteArrayList copyOnWriteArrayList2 = yfa.b;
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj3 : copyOnWriteArrayList2) {
                                    ((n30) ((zfa) obj3)).getClass();
                                    arrayList2.add(obj3);
                                }
                                if (!arrayList2.isEmpty()) {
                                    zfa.a.getClass();
                                    String strU2 = sq6.u("[", uh6.p(dqh.a(j)), serverListFrame.getServers().size(), "] server_list: ", " stubs");
                                    Iterator it2 = arrayList2.iterator();
                                    while (it2.hasNext()) {
                                        ((n30) ((zfa) it2.next())).b(sfaVar, "McpBootstrapSse", strU2);
                                    }
                                }
                            }
                            List<ServerListFrame.ServerStub> servers = serverListFrame.getServers();
                            ArrayList arrayList3 = new ArrayList(x44.y(servers, 10));
                            for (ServerListFrame.ServerStub serverStub : servers) {
                                McpServer mcpServer4 = new McpServer(serverStub.m934getUuidowoRr7k(), serverStub.getName(), serverStub.getUrl(), (String) null, (Boolean) null, (Boolean) null, (McpAuthStatus) null, (String) null, (List) null, (List) null, (List) null, (List) null, serverStub.getCai_flags(), 4072, (mq5) null);
                                linkedHashMap.put(McpServerId.m1029boximpl(serverStub.m934getUuidowoRr7k()), mcpServer4);
                                arrayList3.add(mcpServer4);
                            }
                            Object objG5 = lp7Var.g(new i0b(arrayList3), tp4Var);
                            if (objG5 == m45Var) {
                                return objG5;
                            }
                        }
                    }
                    break;
                case -309210225:
                    if (str.equals("prompts")) {
                        try {
                            bg9Var.getClass();
                            objB4 = bg9Var.b(str2, PromptsFrame.Companion.serializer());
                        } catch (SerializationException e4) {
                            List list4 = xah.a;
                            xah.f(e4, "Failed to parse MCP bootstrap SSE frame", ozfVar, null, 24);
                            objB4 = null;
                        }
                        PromptsFrame promptsFrame = (PromptsFrame) objB4;
                        if (promptsFrame != null) {
                            String strM922getServer_uuidowoRr7k = promptsFrame.m922getServer_uuidowoRr7k();
                            McpServer mcpServer5 = (McpServer) linkedHashMap.get(McpServerId.m1029boximpl(strM922getServer_uuidowoRr7k));
                            McpServer mcpServerM343copyIgoRxQ$default2 = McpServer.m343copyIgoRxQ$default(mcpServer5 == null ? new McpServer(strM922getServer_uuidowoRr7k, "", (String) null, (String) null, (Boolean) null, (Boolean) null, (McpAuthStatus) null, (String) null, (List) null, (List) null, (List) null, (List) null, (Set) null, 8188, (mq5) null) : mcpServer5, null, null, null, null, null, null, null, null, null, promptsFrame.getPrompts(), null, null, null, 7679, null);
                            linkedHashMap.put(McpServerId.m1029boximpl(strM922getServer_uuidowoRr7k), mcpServerM343copyIgoRxQ$default2);
                            if (mcpServerM343copyIgoRxQ$default2.getName().length() > 0 && (objG3 = lp7Var.g(new g0b(mcpServerM343copyIgoRxQ$default2), tp4Var)) == m45Var) {
                                return objG3;
                            }
                        }
                    }
                    break;
                case 110545371:
                    if (str.equals("tools")) {
                        try {
                            bg9Var.getClass();
                            objB5 = bg9Var.b(str2, ToolsFrame.Companion.serializer());
                        } catch (SerializationException e5) {
                            List list5 = xah.a;
                            xah.f(e5, "Failed to parse MCP bootstrap SSE frame", ozfVar, null, 24);
                            objB5 = null;
                        }
                        ToolsFrame toolsFrame = (ToolsFrame) objB5;
                        if (toolsFrame != null) {
                            String strM938getServer_uuidowoRr7k = toolsFrame.m938getServer_uuidowoRr7k();
                            McpServer mcpServer6 = (McpServer) linkedHashMap.get(McpServerId.m1029boximpl(strM938getServer_uuidowoRr7k));
                            McpServer mcpServerM343copyIgoRxQ$default3 = McpServer.m343copyIgoRxQ$default(mcpServer6 == null ? new McpServer(strM938getServer_uuidowoRr7k, "", (String) null, (String) null, (Boolean) null, (Boolean) null, (McpAuthStatus) null, (String) null, (List) null, (List) null, (List) null, (List) null, (Set) null, 8188, (mq5) null) : mcpServer6, null, null, null, null, null, null, null, null, toolsFrame.getTools(), null, null, null, null, 7935, null);
                            linkedHashMap.put(McpServerId.m1029boximpl(strM938getServer_uuidowoRr7k), mcpServerM343copyIgoRxQ$default3);
                            if (mcpServerM343copyIgoRxQ$default3.getName().length() > 0 && (objG4 = lp7Var.g(new g0b(mcpServerM343copyIgoRxQ$default3), tp4Var)) == m45Var) {
                                return objG4;
                            }
                        }
                    }
                    break;
            }
        }
        return iei.a;
    }
}
