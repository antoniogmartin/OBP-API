package code.api.builder.CommonServicesApi
import java.util.UUID

import code.api.builder.{APIBuilder_Connector, CreateTemplateJson, JsonFactory_APIBuilder}
import code.api.builder.JsonFactory_APIBuilder._
import code.api.util.APIUtil._
import code.api.util.ApiTag._
import code.api.util.ApiVersion
import code.api.util.ErrorMessages._
import net.liftweb.common.Full
import net.liftweb.http.rest.RestHelper
import net.liftweb.json
import net.liftweb.json.Extraction._
import net.liftweb.json._
import net.liftweb.mapper.By
import net.liftweb.util.Helpers.tryo

import scala.collection.immutable.Nil
import scala.collection.mutable.ArrayBuffer
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

trait APIMethods_CommonServicesApi { self: RestHelper =>
  val ImplementationsCommonServicesApi = new Object() {
    val apiVersion: ApiVersion = ApiVersion.berlinGroupV1_3
    val resourceDocs = ArrayBuffer[ResourceDoc]()
    val apiRelations = ArrayBuffer[ApiRelation]()
    val codeContext = CodeContext(resourceDocs, apiRelations)
    implicit val formats = net.liftweb.json.DefaultFormats
    val endpoints =
      deleteSigningBasket ::
      getConsentScaStatus ::
      getPaymentCancellationScaStatus ::
      getPaymentInitiationAuthorisation ::
      getPaymentInitiationScaStatus ::
      getSigningBasketAuthorisation ::
      getSigningBasketScaStatus ::
      getSigningBasketStatus ::
      startConsentAuthorisation ::
      startPaymentAuthorisation ::
      startPaymentInitiationCancellationAuthorisation ::
      startSigningBasketAuthorisation ::
      updateConsentsPsuData ::
      updatePaymentCancellationPsuData ::
      updatePaymentPsuData ::
      updateSigningBasketPsuData ::
      Nil

            
     resourceDocs += ResourceDoc(
       deleteSigningBasket, 
       apiVersion, 
       "deleteSigningBasket",
       "DELETE", 
       "/v1/signing-baskets/BASKETID", 
       "Delete the signing basket",
       "", 
       emptyObjectJson, 
       emptyObjectJson,
       List(UserNotLoggedIn, UnknownError), 
       Catalogs(notCore, notPSD2, notOBWG), 
       CommonServicesApi :: Nil
     )

     lazy val deleteSigningBasket : OBPEndpoint = {
       case "v1":: "signing-baskets" :: basketid :: Nil JsonDelete _ => {
         cc =>
           for {
             (Full(u), callContext) <- authorizeEndpoint(UserNotLoggedIn, cc)
             } yield {
             (NotImplemented, callContext)
           }
         }
       }
            
     resourceDocs += ResourceDoc(
       getConsentScaStatus, 
       apiVersion, 
       "getConsentScaStatus",
       "GET", 
       "/v1/consents/CONSENTID/authorisations/AUTHORISATIONID", 
       "Read the SCA status of the consent authorisation.",
       "", 
       emptyObjectJson, 
       emptyObjectJson,
       List(UserNotLoggedIn, UnknownError), 
       Catalogs(notCore, notPSD2, notOBWG), 
       CommonServicesApi :: Nil
     )

     lazy val getConsentScaStatus : OBPEndpoint = {
       case "v1":: "consents" :: consentid:: "authorisations" :: authorisationid :: Nil JsonGet _ => {
         cc =>
           for {
             (Full(u), callContext) <- authorizeEndpoint(UserNotLoggedIn, cc)
             } yield {
             (NotImplemented, callContext)
           }
         }
       }
            
     resourceDocs += ResourceDoc(
       getPaymentCancellationScaStatus, 
       apiVersion, 
       "getPaymentCancellationScaStatus",
       "GET", 
       "/v1/PAYMENT_SERVICE/PAYMENT_PRODUCT/PAYMENTID/cancellation-authorisations/CANCELLATIONID", 
       "Read the SCA status of the payment cancellation's authorisation.",
       "", 
       emptyObjectJson, 
       emptyObjectJson,
       List(UserNotLoggedIn, UnknownError), 
       Catalogs(notCore, notPSD2, notOBWG), 
       CommonServicesApi :: Nil
     )

     lazy val getPaymentCancellationScaStatus : OBPEndpoint = {
       case "v1" :: payment_service :: payment_product :: paymentid:: "cancellation-authorisations" :: cancellationid :: Nil JsonGet _ => {
         cc =>
           for {
             (Full(u), callContext) <- authorizeEndpoint(UserNotLoggedIn, cc)
             } yield {
             (NotImplemented, callContext)
           }
         }
       }
            
     resourceDocs += ResourceDoc(
       getPaymentInitiationAuthorisation, 
       apiVersion, 
       "getPaymentInitiationAuthorisation",
       "GET", 
       "/v1/PAYMENT_SERVICE/PAYMENT_PRODUCT/PAYMENTID/authorisations", 
       "Get Payment Initiation Authorisation Sub-Resources Request",
       "", 
       emptyObjectJson, 
       emptyObjectJson,
       List(UserNotLoggedIn, UnknownError), 
       Catalogs(notCore, notPSD2, notOBWG), 
       CommonServicesApi :: Nil
     )

     lazy val getPaymentInitiationAuthorisation : OBPEndpoint = {
       case "v1" :: payment_service :: payment_product :: paymentid:: "authorisations" :: Nil JsonGet _ => {
         cc =>
           for {
             (Full(u), callContext) <- authorizeEndpoint(UserNotLoggedIn, cc)
             } yield {
             (NotImplemented, callContext)
           }
         }
       }
            
     resourceDocs += ResourceDoc(
       getPaymentInitiationScaStatus, 
       apiVersion, 
       "getPaymentInitiationScaStatus",
       "GET", 
       "/v1/PAYMENT_SERVICE/PAYMENT_PRODUCT/PAYMENTID/authorisations/AUTHORISATIONID", 
       "Read the SCA Status of the payment authorisation",
       "", 
       emptyObjectJson, 
       emptyObjectJson,
       List(UserNotLoggedIn, UnknownError), 
       Catalogs(notCore, notPSD2, notOBWG), 
       CommonServicesApi :: Nil
     )

     lazy val getPaymentInitiationScaStatus : OBPEndpoint = {
       case "v1" :: payment_service :: payment_product :: paymentid:: "authorisations" :: authorisationid :: Nil JsonGet _ => {
         cc =>
           for {
             (Full(u), callContext) <- authorizeEndpoint(UserNotLoggedIn, cc)
             } yield {
             (NotImplemented, callContext)
           }
         }
       }
            
     resourceDocs += ResourceDoc(
       getSigningBasketAuthorisation, 
       apiVersion, 
       "getSigningBasketAuthorisation",
       "GET", 
       "/v1/signing-baskets/BASKETID/authorisations", 
       "Get Signing Basket Authorisation Sub-Resources Request",
       "", 
       emptyObjectJson, 
       emptyObjectJson,
       List(UserNotLoggedIn, UnknownError), 
       Catalogs(notCore, notPSD2, notOBWG), 
       CommonServicesApi :: Nil
     )

     lazy val getSigningBasketAuthorisation : OBPEndpoint = {
       case "v1":: "signing-baskets" :: basketid:: "authorisations" :: Nil JsonGet _ => {
         cc =>
           for {
             (Full(u), callContext) <- authorizeEndpoint(UserNotLoggedIn, cc)
             } yield {
             (NotImplemented, callContext)
           }
         }
       }
            
     resourceDocs += ResourceDoc(
       getSigningBasketScaStatus, 
       apiVersion, 
       "getSigningBasketScaStatus",
       "GET", 
       "/v1/signing-baskets/BASKETID/authorisations/AUTHORISATIONID", 
       "Read the SCA status of the signing basket authorisation",
       "", 
       emptyObjectJson, 
       emptyObjectJson,
       List(UserNotLoggedIn, UnknownError), 
       Catalogs(notCore, notPSD2, notOBWG), 
       CommonServicesApi :: Nil
     )

     lazy val getSigningBasketScaStatus : OBPEndpoint = {
       case "v1":: "signing-baskets" :: basketid:: "authorisations" :: authorisationid :: Nil JsonGet _ => {
         cc =>
           for {
             (Full(u), callContext) <- authorizeEndpoint(UserNotLoggedIn, cc)
             } yield {
             (NotImplemented, callContext)
           }
         }
       }
            
     resourceDocs += ResourceDoc(
       getSigningBasketStatus, 
       apiVersion, 
       "getSigningBasketStatus",
       "GET", 
       "/v1/signing-baskets/BASKETID/status", 
       "Read the status of the signing basket",
       "", 
       emptyObjectJson, 
       emptyObjectJson,
       List(UserNotLoggedIn, UnknownError), 
       Catalogs(notCore, notPSD2, notOBWG), 
       CommonServicesApi :: Nil
     )

     lazy val getSigningBasketStatus : OBPEndpoint = {
       case "v1":: "signing-baskets" :: basketid:: "status" :: Nil JsonGet _ => {
         cc =>
           for {
             (Full(u), callContext) <- authorizeEndpoint(UserNotLoggedIn, cc)
             } yield {
             (NotImplemented, callContext)
           }
         }
       }
            
     resourceDocs += ResourceDoc(
       startConsentAuthorisation, 
       apiVersion, 
       "startConsentAuthorisation",
       "POST", 
       "/v1/consents/CONSENTID/authorisations", 
       "Start the authorisation process for a consent",
       "", 
       emptyObjectJson, 
       emptyObjectJson,
       List(UserNotLoggedIn, UnknownError), 
       Catalogs(notCore, notPSD2, notOBWG), 
       CommonServicesApi :: Nil
     )

     lazy val startConsentAuthorisation : OBPEndpoint = {
       case "v1":: "consents" :: consentid:: "authorisations" :: Nil JsonPost _ => {
         cc =>
           for {
             (Full(u), callContext) <- authorizeEndpoint(UserNotLoggedIn, cc)
             } yield {
             (NotImplemented, callContext)
           }
         }
       }
            
     resourceDocs += ResourceDoc(
       startPaymentAuthorisation, 
       apiVersion, 
       "startPaymentAuthorisation",
       "POST", 
       "/v1/PAYMENT_SERVICE/PAYMENT_PRODUCT/PAYMENTID/authorisations", 
       "Start the authorisation process for a payment initiation",
       "", 
       emptyObjectJson, 
       emptyObjectJson,
       List(UserNotLoggedIn, UnknownError), 
       Catalogs(notCore, notPSD2, notOBWG), 
       CommonServicesApi :: Nil
     )

     lazy val startPaymentAuthorisation : OBPEndpoint = {
       case "v1" :: payment_service :: payment_product :: paymentid:: "authorisations" :: Nil JsonPost _ => {
         cc =>
           for {
             (Full(u), callContext) <- authorizeEndpoint(UserNotLoggedIn, cc)
             } yield {
             (NotImplemented, callContext)
           }
         }
       }
            
     resourceDocs += ResourceDoc(
       startPaymentInitiationCancellationAuthorisation, 
       apiVersion, 
       "startPaymentInitiationCancellationAuthorisation",
       "POST", 
       "/v1/PAYMENT_SERVICE/PAYMENT_PRODUCT/PAYMENTID/cancellation-authorisations", 
       "Start the authorisation process for the cancellation of the addressed payment",
       "", 
       emptyObjectJson, 
       emptyObjectJson,
       List(UserNotLoggedIn, UnknownError), 
       Catalogs(notCore, notPSD2, notOBWG), 
       CommonServicesApi :: Nil
     )

     lazy val startPaymentInitiationCancellationAuthorisation : OBPEndpoint = {
       case "v1" :: payment_service :: payment_product :: paymentid:: "cancellation-authorisations" :: Nil JsonPost _ => {
         cc =>
           for {
             (Full(u), callContext) <- authorizeEndpoint(UserNotLoggedIn, cc)
             } yield {
             (NotImplemented, callContext)
           }
         }
       }
            
     resourceDocs += ResourceDoc(
       startSigningBasketAuthorisation, 
       apiVersion, 
       "startSigningBasketAuthorisation",
       "POST", 
       "/v1/signing-baskets/BASKETID/authorisations", 
       "Start the authorisation process for a signing basket",
       "", 
       emptyObjectJson, 
       emptyObjectJson,
       List(UserNotLoggedIn, UnknownError), 
       Catalogs(notCore, notPSD2, notOBWG), 
       CommonServicesApi :: Nil
     )

     lazy val startSigningBasketAuthorisation : OBPEndpoint = {
       case "v1":: "signing-baskets" :: basketid:: "authorisations" :: Nil JsonPost _ => {
         cc =>
           for {
             (Full(u), callContext) <- authorizeEndpoint(UserNotLoggedIn, cc)
             } yield {
             (NotImplemented, callContext)
           }
         }
       }
            
     resourceDocs += ResourceDoc(
       updateConsentsPsuData, 
       apiVersion, 
       "updateConsentsPsuData",
       "PUT", 
       "/v1/consents/CONSENTID/authorisations/AUTHORISATIONID", 
       "Update PSU Data for consents",
       "", 
       emptyObjectJson, 
       emptyObjectJson,
       List(UserNotLoggedIn, UnknownError), 
       Catalogs(notCore, notPSD2, notOBWG), 
       CommonServicesApi :: Nil
     )

     lazy val updateConsentsPsuData : OBPEndpoint = {
       case "v1":: "consents" :: consentid:: "authorisations" :: authorisationid :: Nil JsonPut _ => {
         cc =>
           for {
             (Full(u), callContext) <- authorizeEndpoint(UserNotLoggedIn, cc)
             } yield {
             (NotImplemented, callContext)
           }
         }
       }
            
     resourceDocs += ResourceDoc(
       updatePaymentCancellationPsuData, 
       apiVersion, 
       "updatePaymentCancellationPsuData",
       "PUT", 
       "/v1/PAYMENT_SERVICE/PAYMENT_PRODUCT/PAYMENTID/cancellation-authorisations/CANCELLATIONID", 
       "Update PSU Data for payment initiation cancellation",
       "", 
       emptyObjectJson, 
       emptyObjectJson,
       List(UserNotLoggedIn, UnknownError), 
       Catalogs(notCore, notPSD2, notOBWG), 
       CommonServicesApi :: Nil
     )

     lazy val updatePaymentCancellationPsuData : OBPEndpoint = {
       case "v1" :: payment_service :: payment_product :: paymentid:: "cancellation-authorisations" :: cancellationid :: Nil JsonPut _ => {
         cc =>
           for {
             (Full(u), callContext) <- authorizeEndpoint(UserNotLoggedIn, cc)
             } yield {
             (NotImplemented, callContext)
           }
         }
       }
            
     resourceDocs += ResourceDoc(
       updatePaymentPsuData, 
       apiVersion, 
       "updatePaymentPsuData",
       "PUT", 
       "/v1/PAYMENT_SERVICE/PAYMENT_PRODUCT/PAYMENTID/authorisations/AUTHORISATIONID", 
       "Update PSU data for payment initiation",
       "", 
       emptyObjectJson, 
       emptyObjectJson,
       List(UserNotLoggedIn, UnknownError), 
       Catalogs(notCore, notPSD2, notOBWG), 
       CommonServicesApi :: Nil
     )

     lazy val updatePaymentPsuData : OBPEndpoint = {
       case "v1" :: payment_service :: payment_product :: paymentid:: "authorisations" :: authorisationid :: Nil JsonPut _ => {
         cc =>
           for {
             (Full(u), callContext) <- authorizeEndpoint(UserNotLoggedIn, cc)
             } yield {
             (NotImplemented, callContext)
           }
         }
       }
            
     resourceDocs += ResourceDoc(
       updateSigningBasketPsuData, 
       apiVersion, 
       "updateSigningBasketPsuData",
       "PUT", 
       "/v1/signing-baskets/BASKETID/authorisations/AUTHORISATIONID", 
       "Update PSU Data for signing basket",
       "", 
       emptyObjectJson, 
       emptyObjectJson,
       List(UserNotLoggedIn, UnknownError), 
       Catalogs(notCore, notPSD2, notOBWG), 
       CommonServicesApi :: Nil
     )

     lazy val updateSigningBasketPsuData : OBPEndpoint = {
       case "v1":: "signing-baskets" :: basketid:: "authorisations" :: authorisationid :: Nil JsonPut _ => {
         cc =>
           for {
             (Full(u), callContext) <- authorizeEndpoint(UserNotLoggedIn, cc)
             } yield {
             (NotImplemented, callContext)
           }
         }
       }

  }
}



