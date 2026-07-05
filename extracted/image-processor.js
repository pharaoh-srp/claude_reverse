// @bun @bytecode @bun-cjs
(function(exports, require, module, __filename, __dirname) {// Claude Code is a Beta product per Anthropic's Commercial Terms of Service.
// By using Claude Code, you agree that all code acceptance or rejection decisions you make,
// and the associated conversations in context, constitute Feedback under Anthropic's Commercial Terms,
// and may be used to improve Anthropic's products, including training models.
// You are responsible for reviewing any code suggestions before use.

// (c) Anthropic PBC. All rights reserved. Use is subject to the Legal Agreements outlined here: https://code.claude.com/docs/en/legal-and-compliance.

// Version: 2.1.198
var B=Object.create;var{getPrototypeOf:o,defineProperty:A,getOwnPropertyNames:C,getOwnPropertyDescriptor:O}=Object,D=Object.prototype.hasOwnProperty;function a(T){return this[T]}var y=(T,R,_)=>{var q=C(R);for(let h of q)if(!D.call(T,h)&&h!=="default")A(T,h,{get:a.bind(R,h),enumerable:!0});if(_){for(let h of q)if(!D.call(_,h)&&h!=="default")A(_,h,{get:a.bind(R,h),enumerable:!0});return _}},c,r,l=(T,R,_)=>{var q=T!=null&&typeof T==="object";if(q){var h=R?c??=new WeakMap:r??=new WeakMap,n=h.get(T);if(n)return n}_=T!=null?B(o(T)):{};let i=R||!T||!T.__esModule?A(_,"default",{value:T,enumerable:!0}):_;for(let H of C(T))if(!D.call(i,H))A(i,H,{get:a.bind(T,H),enumerable:!0});if(q)h.set(T,i);return i},I=(T)=>{var R=(e??=new WeakMap).get(T),_;if(R)return R;if(R=A({},"__esModule",{value:!0}),T&&typeof T==="object"||typeof T==="function"){for(var q of C(T))if(!D.call(R,q))A(R,q,{get:a.bind(T,q),enumerable:!(_=O(T,q))||_.enumerable})}return e.set(T,R),R},e,k=(T,R)=>()=>(R||T((R={exports:{}}).exports,R),R.exports);var t=(T)=>T;function N(T,R){this[T]=t.bind(null,R)}var P=(T,R)=>{for(var _ in R)A(T,_,{get:R[_],enumerable:!0,configurable:!0,set:N.bind(R,_)})};var d=(T,R)=>()=>(T&&(R=T(T=0)),R);var J=k((p,s)=>{s.exports=require("/$bunfs/root/image-processor.node")});module.exports=J();})
