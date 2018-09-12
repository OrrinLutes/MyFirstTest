var productId=window.SymBfw?window.SymBfw.extensionAdapter.getExtensionId():chrome.runtime.id,theEvent=new CustomEvent("NSSSInstallSuccess",{detail:productId});document.dispatchEvent(theEvent);
